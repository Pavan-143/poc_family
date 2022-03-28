package com.nelink.familyPo.poc_family.Controller;


import com.nelink.familyPo.poc_family.model.OwnerPoc;
import com.nelink.familyPo.poc_family.model.UserLogin;
import com.nelink.familyPo.poc_family.services.OwnerePocInterf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnerPocController {
     @Autowired
     OwnerePocInterf ownerePocInterf;
    @PutMapping("/addOwnerDetails")
    public boolean saveOwnerDetails(@RequestBody OwnerPoc ownerPoc){

        Boolean persist;
        persist = ownerePocInterf.saveOwnerInfo(ownerPoc);

        if (persist != null) {
            return true;
        } else {
            return false;
        }
    }
}
