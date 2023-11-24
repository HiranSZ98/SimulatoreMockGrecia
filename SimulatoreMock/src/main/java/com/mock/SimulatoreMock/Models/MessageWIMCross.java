package com.mock.SimulatoreMock.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageWIMCross {
    private String protocol;
    private String version;
    private String entity;
    private String operation;
    private String status;
    private String message;
    private DataWIMCross data;
}