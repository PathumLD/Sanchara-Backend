package com.Sanchara_Backend.User_Service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "guide")
public class Guide {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long guideId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String experience;

    @Column(nullable = false)
    private String languages;

    @Column(nullable = false)
    private String license;

    @Column(nullable = false)
    private String description;

}
