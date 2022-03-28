package com.nelink.familyPo.poc_family.services;

import com.nelink.familyPo.poc_family.FamilyRepository.UserLoginRepo;
import com.nelink.familyPo.poc_family.model.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.SchemaOutputResolver;
import java.util.List;

@Service
public class UserLoginImpl implements UserLoginInterf{
   @Autowired
    UserLoginRepo userLoginRepo;

    @Override
    public Boolean isEmailIdPresent(String userEmail) {

       if(userLoginRepo.findByUserEmail(userEmail).size()>0){
           return true;
       }
       else{
           return false;
       }
    }

    @Override
    public Boolean saveUserInfo(UserLogin user) {
        UserLogin save = userLoginRepo.save(user);
        if(save!=null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Boolean loginUserAcc(String userEmail,String userPassword) {
       // System.out.println(userLoginRepo.findByUserEmailAndUserPassword(userEmail,userPassword));
        List<UserLogin> logindata = userLoginRepo.findByUserEmailAndUserPassword(userEmail,userPassword);
       if(logindata !=null && logindata.size()>0){
           return true;
       }
       return false;
    }

    @Override
    public Boolean signUpAcc(UserLogin userSignUp) {
        return null;
    }
}
