package com.mock.simulatore_mock.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Violation {
    private String type;
    private List<RuleWIMCROSS> rules;
}