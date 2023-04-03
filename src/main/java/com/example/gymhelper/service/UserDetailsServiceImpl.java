package com.example.gymhelper.service;

import com.example.gymhelper.model.UserCredentials;
import com.example.gymhelper.repo.UserCredentialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserCredentialsRepository userRepository;

    @Autowired
    public UserDetailsServiceImpl(UserCredentialsRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserCredentials user = userRepository.findByUsername(username).
                orElseThrow(()->new UsernameNotFoundException("User " + username + " not found."));
        return user;
    }
}
