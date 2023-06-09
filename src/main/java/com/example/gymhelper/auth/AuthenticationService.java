package com.example.gymhelper.auth;

import com.example.gymhelper.config.JwtService;
import com.example.gymhelper.model.UserCredentials;
import com.example.gymhelper.repo.UserCredentialsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserCredentialsRepository userCredentialsRepository;
    private final JwtService jwtService;
    private final AuthenticationManager authManager;

    public AuthenticationResponse authenticate(AuthenticationRequest request) {

        setAuthentication(request.getUsername(), request.getPassword());

        UserCredentials userCredentials = userCredentialsRepository.findByUsername(request.getUsername())
                .orElseThrow();

        String jwtToken = jwtService.generateToken(userCredentials);

        return AuthenticationResponse.builder()
                .token(jwtToken)
                .role(userCredentials.getRole())
                .build();
    }

    private void setAuthentication(String username, String password) {
        Authentication authentication = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        username,
                        password
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
    }


}
