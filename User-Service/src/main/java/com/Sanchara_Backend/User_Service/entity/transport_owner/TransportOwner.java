package com.Sanchara_Backend.User_Service.entity.transport_owner;

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
@Table(name = "transport_owner")
public class TransportOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tOwnerId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String vehicleName;

    @Column(nullable = false)
    private String vehicleType;

    @Column(nullable = false)
    private String vehicleNumber;

    @Column(nullable = false)
    private String vehicleModel;

    @Column(nullable = false)
    private String vehicleColor;

    @OneToMany(mappedBy = "transportOwner", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<VehicleImage> vehicleImages = new ArrayList<>();

    @Column(nullable = false)
    private String vehicleOwnerName;

    @Column(nullable = false)
    private String vehicleOwnerPhone;

    @Column(nullable = false)
    private String vehicleOwnerEmail;

    @Column(nullable = false)
    private String vehicleOwnerAddress;

    @Column(nullable = false)
    private String vehicleOwnerCity;

    private boolean isApproved;

    private boolean isRejected;

    private boolean isPending;

    private boolean isDeleted;
}
