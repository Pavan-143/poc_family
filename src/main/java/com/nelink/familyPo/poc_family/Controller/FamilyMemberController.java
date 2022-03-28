package com.nelink.familyPo.poc_family.Controller;

import com.nelink.familyPo.poc_family.model.FamilyMember;
import com.nelink.familyPo.poc_family.model.OwnerPoc;
import com.nelink.familyPo.poc_family.services.FamilyMemberInterf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FamilyMemberController {
    @Autowired
    FamilyMemberInterf familyMemberInterf;
    @PutMapping("/addFamilyMembers")
    public boolean saveOwnerDetails(@RequestBody FamilyMember familyMember){

        Boolean persist;
        persist = familyMemberInterf.saveFamilyMemberInfo(familyMember);

        if (persist != null) {
            return true;
        } else {
            return false;
        }
    }
    @DeleteMapping("/deleteFamilyMemberById/{memberId}")
    public void deleteEmployeesById(@PathVariable Integer memberId){
        familyMemberInterf.deleteFamilyMemberInfo(memberId);
    }
}
