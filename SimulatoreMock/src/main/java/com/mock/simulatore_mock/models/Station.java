package com.mock.simulatore_mock.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Station {
    private Object city;
    private double latitude;
    private double longitude;
    private boolean legallyVerified;
    private Object roadNumber;
    private Object roadOwner;
    private String deviceSerialNumber;
    private Object street;
    private String version;
}
