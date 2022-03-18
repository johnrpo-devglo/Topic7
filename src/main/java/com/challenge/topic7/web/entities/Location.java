package com.challenge.topic7.web.entities;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "location")
public class Location implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String lat;
    private String lon;
    private String city;
    private String state;
    //@Column(name = "create_at")
    //@Temporal(TemporalType.DATE)
    private String create_at;
    private String temperature;


    public String getTemperature() {
        return temperature + "°F";
    }
}
