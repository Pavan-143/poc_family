package com.nelink.familyPo.poc_family.FamilyRepository;



import com.nelink.familyPo.poc_family.model.FamilyMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FamilyMemberRepo extends JpaRepository<FamilyMember,Integer> {
}
