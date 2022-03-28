package com.nelink.familyPo.poc_family.FamilyRepository;

import com.nelink.familyPo.poc_family.model.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserLoginRepo  extends JpaRepository<UserLogin,Integer> {

   List<UserLogin> findByUserEmail(String userEmail);

    List<UserLogin> findByUserEmailAndUserPassword(String userEmail, String userPassword);
}
