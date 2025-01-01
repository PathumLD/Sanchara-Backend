package com.Sanchara_Backend.User_Service.entity.tourist;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "tourist-images")
public class TouristImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long touristImageId;

    @ManyToOne
    @JoinColumn(name = "touristId")
    private Tourist tourist;

    @Column(nullable = false)
    private String touristImage;
}
