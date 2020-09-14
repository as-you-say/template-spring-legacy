package org.example.app.user.controller;

import org.example.app.model.AppUser;
import org.example.app.user.service.impl.AppUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppUserController {

    @Autowired
    AppUserServiceImpl appUserService;

    // 홈
    @RequestMapping(name = "/home", method = RequestMethod.GET)
    public String goHome(){
        return "/home";
    }

    // 회원가입 - 요청
    @RequestMapping(name = "/signUp", method = RequestMethod.POST)
    public String signUp(AppUser appUser){
        appUserService.insertAppUser(appUser);
        return "/login";
    }

    // 회원가입 - 화면
    @RequestMapping(name = "/signUp", method = RequestMethod.GET)
    public String goSignUp(){
        return "/signUp";
    }

}
