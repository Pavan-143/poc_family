package com.nelink.familyPo.poc_family.services;


import com.nelink.familyPo.poc_family.FamilyRepository.OwnerPocRepo;
import com.nelink.familyPo.poc_family.model.OwnerPoc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerPocImpl implements OwnerePocInterf{
    @Autowired
    OwnerPocRepo ownerPocRepo;
    @Override
    public Boolean saveOwnerInfo(OwnerPoc ownerPoc) {
        OwnerPoc saveOwner = ownerPocRepo.save(ownerPoc);
        if(saveOwner!=null){
            return true;
        }else {
            return false;
        }
    }
}

