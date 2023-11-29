package com.mock.simulatore_mock.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plate {
    private String number;
    private int confidence;
    private String source;
    private String country;
    private String state;
    private String textColor;
    private String backgroundColor;
}