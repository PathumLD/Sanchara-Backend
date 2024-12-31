package com.Sanchara_Backend.User_Service.entity.business_owner;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "business_images")
public class BusinessImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long businessImageId;

    @ManyToOne
    @JoinColumn(name = "bOwnerId")
    private BusinessOwner businessOwner;

    @Column(nullable = false)
    private String businessImage;
}
