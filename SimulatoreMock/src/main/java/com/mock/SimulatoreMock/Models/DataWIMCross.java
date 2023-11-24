package com.mock.SimulatoreMock.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataWIMCross {
    private int id;
    private String name;
    private List<VehicleWIMCross> vehicles;
}
