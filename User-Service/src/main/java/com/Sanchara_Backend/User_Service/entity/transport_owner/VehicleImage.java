package com.Sanchara_Backend.User_Service.entity.transport_owner;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "vehicle_images")
public class VehicleImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleImageId;

    @ManyToOne
    @JoinColumn(name = "tOwnerId")
    private TransportOwner transportOwner;

    @Column(nullable = false)
    private String vehicleImage;

}
