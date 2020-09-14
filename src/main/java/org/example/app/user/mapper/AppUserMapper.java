package org.example.app.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.app.model.AppUser;

@Mapper
public interface AppUserMapper {
    AppUser getAppUserById(String id);
    void insertAppUser(AppUser appUser);
}
