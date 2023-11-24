package com.mock.SimulatoreMock.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AxleWimCross {
    private int number;
    private int overhang;
    private int speedLeft;
    private int speedRight;
    private int tires;
    private int tireWidth;
    private int trackWidth;
    private int weightLeft;
    private int weightRight;
    private int weight;
    private int wheelbase;
}