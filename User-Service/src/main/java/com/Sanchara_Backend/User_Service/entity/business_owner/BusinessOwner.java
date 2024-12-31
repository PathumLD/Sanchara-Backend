package com.Sanchara_Backend.User_Service.entity.business_owner;

import com.Sanchara_Backend.User_Service.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "business_owner")
public class BusinessOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bOwnerId;

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

    @OneToMany(mappedBy = "businessOwner", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BusinessImage> businessImages = new ArrayList<>();

}
