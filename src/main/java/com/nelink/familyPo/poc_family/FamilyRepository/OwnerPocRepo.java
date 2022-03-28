package com.nelink.familyPo.poc_family.FamilyRepository;


import com.nelink.familyPo.poc_family.model.OwnerPoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerPocRepo  extends JpaRepository<OwnerPoc,Integer> {
}
