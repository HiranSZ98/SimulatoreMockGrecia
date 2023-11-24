package com.mock.SimulatoreMock.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleWIMCross {
    private int allowance;
    private List<AxleWimCross> axles;
    private List<Object> axlesAfterAllowance; // (OBSOLETE) – not used –
    private int axlesCount;
    private String direction;
    private int cost323;
    private int eur13;
    private List<UserClass> userClasses;
    private int gap;
    private int gvw;
    private int gvwAfterAllowance;
    private String hash;
    private int height;
    private int id;
    private List<Image> images;
    private String lane;
    private String laneDescription;
    private int length;
    private List<Object> limits; //(OBSOLETE) – not used –
    private String measureStatus;
    private List<Plate> plates;
    private List<Object> adr;
    private int speed;
    private Date stamp;
    private Date timestamp;
    private Station station;
    private int ucid;
    private boolean valid;
    private int validity;
    private List<ViolationData> violations;
    private List<Report> reports;
    private List<Flag> flags;
    private int width;
    private int violation;
    private int busy;
}