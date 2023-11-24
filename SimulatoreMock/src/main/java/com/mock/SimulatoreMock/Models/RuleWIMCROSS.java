package com.mock.SimulatoreMock.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RuleWIMCROSS {
    private String axleGroup;
    private int allowance;
    private int limit;
    private int measured;
}

