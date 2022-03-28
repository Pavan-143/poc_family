package com.nelink.familyPo.poc_family.Controller;

import com.nelink.familyPo.poc_family.model.UserLogin;
import com.nelink.familyPo.poc_family.services.UserLoginInterf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("*")
@RestController
public class UserLoginController {
       @Autowired
    UserLoginInterf userLoginInterf;

    @GetMapping("/welcome")
    public String welcomeSpring() {
        return "Hello Pavan ";
    }

        @PostMapping("/SignUpUserLogin")
        public boolean saveuserLogin(@RequestBody UserLogin user){

            Boolean persist;
            persist = userLoginInterf.saveUserInfo(user);

            if (persist != null) {
                return true;
            } else {
                return false;
            }
        }
    @PostMapping("/UserLoginAcc")
    public boolean loginUser(@RequestBody String userEmail,String userPassword){

        Boolean persist1;
        persist1 = userLoginInterf.loginUserAcc(userEmail,userPassword);
        return persist1;
    }

    @PostMapping("/email-present/{userEmail}")
    public boolean emailPresent(@PathVariable("userEmail")  String userEmail){
            return userLoginInterf.isEmailIdPresent(userEmail);
    }

}

