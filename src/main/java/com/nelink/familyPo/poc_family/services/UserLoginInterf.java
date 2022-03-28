package com.nelink.familyPo.poc_family.services;

import com.nelink.familyPo.poc_family.model.UserLogin;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public interface UserLoginInterf {
   Boolean isEmailIdPresent(String userEmail);
    Boolean saveUserInfo(UserLogin user);


    Boolean loginUserAcc(String userEmail, String userPassword);


    Boolean signUpAcc(UserLogin userSignUp);
}
