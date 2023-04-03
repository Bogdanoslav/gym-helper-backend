package com.example.gymhelper.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserRoleRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        String currentUserRole = SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream().findFirst().toString();
        return currentUserRole;
    }
}
