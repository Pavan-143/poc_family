package com.nelink.familyPo.poc_family.services;

import com.nelink.familyPo.poc_family.model.OwnerPoc;
import org.springframework.stereotype.Service;

@Service
public interface OwnerePocInterf {
    Boolean saveOwnerInfo(OwnerPoc ownerPoc);
}
