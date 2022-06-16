package com.project.parkingspringboot.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_parking_spot")
public class ParkingSpotModel implements Serializable {
    private static final long seriaversionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String parkingSpotNumber;

    @Column(nullable = false, unique = true)
    private String licensePlateCar;

    @Column(nullable = false)
    private String brandCar;

    @Column(nullable = false)
    private String modelCar;

    @Column(nullable = false)
    private String colorCar;

    @Column(nullable = false)
    private LocalDateTime registrationDate;

    @Column(nullable = false)
    private String responsibleName;

    @Column(nullable = false)
    private String apartment;

    @Column(nullable = false)
    private String block;
}
