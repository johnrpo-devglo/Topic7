package com.challenge.topic7.web.entities;

import lombok.Data;

import java.util.Date;

@Data
public class Weather {

    private Date createAt;
    private String temperature;

}
