package com.navneet.elastic.data.model;

import lombok.Data;

/**
 * @author navneetprabhakar
 */
@Data
public class Address {

    private String line1;
    private String line2;
    private String city;
    private String state;
    private String country;
    private Integer pincode;
}
