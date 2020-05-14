package com.dem.server.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity(name = "com.dem.server.entity.FacilityInfo")
@Table(name = "FACILITY_INFO")
public class FacilityInfo {

    @Id
    @Column(name = "Site_ID", nullable = false)
    private Integer siteId;
    @Column(name = "Site_Name", nullable = true)
    private String siteName;
    @Column(name = "Structure_Type", nullable = true)
    private String structureType;
    @Column(name = "Construction_Year", nullable = true)
    private String constructionYear;
    @Column(name = "Retrofit_Yes_No", nullable = true)
    private String retrofitYesNo;
    @Column(name = "Date_of_last_retrofit_Date", nullable = true)
    private String dateOfLastRetrofitDate;
    @Column(name = "Stories", nullable = true)
    private String stories;
    @Column(name = "Elevator_Yes_No", nullable = true)
    private String elevatorYesNo;
    @Column(name = "Column_1_floor_for_sheltering", nullable = true)
    private String column1FloorForSheltering;
    @Column(name = "exterior_space_for_animals", nullable = true)
    private String exteriorSpaceForAnimals;
    @Column(name = "laundry_facilities_Washers", nullable = true)
    private String laundryFacilitiesWashers;
    @Column(name = "Facility_Securable_fenced", nullable = true)
    private String facilitySecurableFenced;
    @Column(name = "dumpster_on_site", nullable = true)
    private String dumpsterOnSite;
    @Column(name = "Pay_Phones", nullable = true)
    private String payPhones;
    @Column(name = "TTY_Phones", nullable = true)
    private String ttyPhones;
    @Column(name = "Closet_startup_kit", nullable = true)
    private String closetStartupKit;
    @Column(name = "Container_Parking", nullable = true)
    private String containerParking;
    @Column(name = "Shelter_Sleeping_Capacity", nullable = true)
    private Integer shelterSleepingCapacity;
}