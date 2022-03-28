package com.nelink.familyPo.poc_family.services;

import com.nelink.familyPo.poc_family.FamilyRepository.FamilyMemberRepo;
import com.nelink.familyPo.poc_family.model.FamilyMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FamilyMemberImpl implements FamilyMemberInterf{
    @Autowired
    FamilyMemberRepo familyMemberRepo;
    @Override
    public Boolean saveFamilyMemberInfo(FamilyMember familyMember) {
        FamilyMember familyMember1 = familyMemberRepo.save(familyMember);
        if(familyMember!=null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void deleteFamilyMemberInfo(Integer memberId) {
        familyMemberRepo.deleteById(memberId);
    }
}
