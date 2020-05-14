package com.dem.server.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity(name = "com.dem.server.entity.AdaInfo")
@Table(name = "ADA_INFO")
public class AdaInfo {

    @Id
    @Column(name = "Site_ID", nullable = false)
    private Integer siteId;
    @Column(name = "Site_Name", nullable = false)
    private String siteName;
    @Column(name = "ADA", nullable = false)
    private String ada;
    @Column(name = "Parking_and_Drop_Off", nullable = true)
    private String parkingAndDropOff;
    @Column(name = "Path_to_Entrance", nullable = true)
    private String pathToEntrance;
    @Column(name = "Entrance", nullable = true)
    private String entrance;
    @Column(name = "Path_to_Interior_Locations", nullable = true)
    private String pathToInteriorLocations;
    @Column(name = "Rest_Room_1", nullable = true)
    private String restRoom1;
    @Column(name = "Rest_Room_2", nullable = true)
    private String restRoom2;
    @Column(name = "Rest_Room_3", nullable = true)
    private String restRoom3;
    @Column(name = "Shower", nullable = true)
    private String shower;
    @Column(name = "Other_ADA_Comments", nullable = true)
    private String otherAdaComments;
}