package com.nelink.familyPo.poc_family.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class FamilyMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="member_id")
    private Integer memberId;
    @Column(name ="member_name")
    private String memberName;
    @Column(name ="date_of_birth")
    private Date dateOfBirth;
    @Column(name ="mobile_number")
    private Long mobileNumber;
    @Column(name ="address")
    private String address;
    @Column(name ="owner_id")
    private Integer ownerId;

}
