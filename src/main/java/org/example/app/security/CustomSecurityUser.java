package org.example.app.security;

import org.example.app.model.AppUser;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

public class CustomSecurityUser extends User {
    public CustomSecurityUser(AppUser flowerShopUser) {
        super(flowerShopUser.getId(), flowerShopUser.getPassword(), AuthorityUtils.createAuthorityList(flowerShopUser.getRole()));
    }
}
