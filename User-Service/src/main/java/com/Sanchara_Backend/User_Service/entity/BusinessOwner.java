package com.Sanchara_Backend.User_Service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "business_owner")
public class BusinessOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ownerId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String businessName;

    @Column(nullable = false)
    private String businessType;

    @Column(nullable = false)
    private String businessDescription;

    private String businessAddress;

    @Column(nullable = false)
    private String businessCity;

    private String businessPhone;

    private String businessWebsite;

    private String businessLogo;

    private String businessImages;

}
