package org.example.app.user.service.impl;

import org.example.app.model.AppUser;
import org.example.app.user.mapper.AppUserMapper;
import org.example.app.user.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    AppUserMapper appUserMapper;

    @Override
    public void insertAppUser(AppUser appUser) {
        appUserMapper.insertAppUser(appUser);
    }
}
