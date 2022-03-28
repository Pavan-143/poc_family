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
@Table(name="poc_owner")
public class OwnerPoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="owner_id")
    private Integer ownerId;
    @Column(name="owner_name")
    private String ownerName;
    @Column(name="house_number")
    private Integer houseNumber;
    @Column(name="dob")
    private Date dateOfBirth;
    @Column(name="mobile_number")
    private Long mobileNumber;
    @Column(name="address")
    private String address;

}
