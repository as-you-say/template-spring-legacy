package org.example.app.security;

import org.example.app.user.mapper.AppUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomSecurityUserDetailsService implements UserDetailsService {

    @Autowired
    AppUserMapper appUserMapper;

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
        return new CustomSecurityUser(appUserMapper.getAppUserById(id));
    }
}
