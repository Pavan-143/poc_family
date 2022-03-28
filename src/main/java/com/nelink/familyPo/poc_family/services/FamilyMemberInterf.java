package com.nelink.familyPo.poc_family.services;

import com.nelink.familyPo.poc_family.model.FamilyMember;
import org.springframework.stereotype.Service;

@Service
public interface FamilyMemberInterf {
    Boolean saveFamilyMemberInfo(FamilyMember familyMember);

    void deleteFamilyMemberInfo(Integer memberId);
}
