package com.dem.server.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity(name = "com.dem.server.entity.ContactInfo")
@Table(name = "CONTACT_INFO")
public class ContactInfo {

    @Id
    @Column(name = "Site_ID", nullable = false)
    private Integer siteId;
    @Column(name = "Site_Name", nullable = true)
    private String siteName;
    @Column(name = "Address", nullable = true)
    private String address;
    @Column(name = "Cross_Street", nullable = true)
    private String crossStreet;
    @Column(name = "City", nullable = true)
    private String city;
    @Column(name = "Zip", nullable = true)
    private Integer zip;
    @Column(name = "District_Neighborhood", nullable = true)
    private String districtNeighborhood;
    @Column(name = "Mailing_Address_if_different", nullable = true)
    private String mailingAddressIfDifferent;
    @Column(name = "Facility_Type", nullable = true)
    private String facilityType;
    @Column(name = "Phone_Number", nullable = true)
    private String phoneNumber;
    @Column(name = "Fax_Number", nullable = true)
    private String faxNumber;
    @Column(name = "Battalion_District", nullable = true)
    private String battalionDistrict;
    @Column(name = "Police_District", nullable = true)
    private String policeDistrict;
    @Column(name = "POC_Title", nullable = true)
    private String pocTitle;
    @Column(name = "POC_Name", nullable = true)
    private String pocName;
    @Column(name = "POC_Email_Address", nullable = true)
    private String pocEmailAddress;
    @Column(name = "POC_Phone", nullable = true)
    private String pocPhone;
    @Column(name = "POC_Cell_Phone", nullable = true)
    private String pocCellPhone;
    @Column(name = "GPS_Longitude", nullable = true)
    private java.math.BigDecimal gpsLongitude;
    @Column(name = "GPS_Latitude", nullable = true)
    private java.math.BigDecimal gpsLatitude;
    @Column(name = "Name_to_Authorize_Fac_Use_FU", nullable = true)
    private String nameToAuthorizeFacUseFu;
    @Column(name = "FU_Title", nullable = true)
    private String fuTitle;
    @Column(name = "FU_Daytime_Phone_Number", nullable = true)
    private String fuDaytimePhoneNumber;
    @Column(name = "FU_Alternate_Phone_Number", nullable = true)
    private String fuAlternatePhoneNumber;
    @Column(name = "FU_After_hours_emergency_phone", nullable = true)
    private String fuAfterHoursEmergencyPhone;
    @Column(name = "FU_After_hours_emergency_email", nullable = true)
    private Integer fuAfterHoursEmergencyEmail;
    @Column(name = "Name_To_open_facility_OF", nullable = true)
    private String nameToOpenFacilityOf;
    @Column(name = "OF_Title", nullable = true)
    private String ofTitle;
    @Column(name = "OF_Daytime_Phone_Number", nullable = true)
    private String ofDaytimePhoneNumber;
    @Column(name = "OF_Alternate_Phone_Number", nullable = true)
    private String ofAlternatePhoneNumber;
    @Column(name = "OF_After_hours_emergency_phone", nullable = true)
    private String ofAfterHoursEmergencyPhone;
    @Column(name = "OF_After_hours_emergency_email", nullable = true)
    private String ofAfterHoursEmergencyEmail;
    @Column(name = "Alternate_Name_to_open_fac_AO", nullable = true)
    private String alternateNameToOpenFacAo;
    @Column(name = "AO_Title", nullable = true)
    private String aoTitle;
    @Column(name = "AO_Daytime_Phone_Number", nullable = true)
    private String aoDaytimePhoneNumber;
    @Column(name = "AO_Alternate_Phone_Number", nullable = true)
    private String aoAlternatePhoneNumber;
    @Column(name = "AO_After_hours_emergency_phone", nullable = true)
    private String aoAfterHoursEmergencyPhone;
    @Column(name = "AO_After_hours_emergency_email", nullable = true)
    private String aoAfterHoursEmergencyEmail;
    @Column(name = "Name_Pre_Occupancy_Insp_POI", nullable = true)
    private String namePreOccupancyInspPoi;
    @Column(name = "POI_Title", nullable = true)
    private String poiTitle;
    @Column(name = "POI_Daytime_Phone_Number", nullable = true)
    private String poiDaytimePhoneNumber;
    @Column(name = "POI_Cell_Phone_Number", nullable = true)
    private String poiCellPhoneNumber;
    @Column(name = "POI_After_hours_emerg_phone", nullable = true)
    private String poiAfterHoursEmergPhone;
    @Column(name = "POI_Email", nullable = true)
    private Integer poiEmail;
    @Column(name = "Representatives_req_for_fac_use", nullable = true)
    private String representativesReqForFacUse;
    @Column(name = "Name_of_representative", nullable = true)
    private String nameOfRepresentative;
    @Column(name = "Shelter_Sleeping_Capacity", nullable = true)
    private Integer shelterSleepingCapacity;
}