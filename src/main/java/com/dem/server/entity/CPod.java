package com.dem.server.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Entity(name = "com.dem.server.entity.CPod")
@Table(name = "C_POD")
public class CPod {

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
    @Column(name = "Person_conducting_survey", nullable = true)
    private String personConductingSurvey;
    @Column(name = "Survey_date", nullable = true)
    private Timestamp surveyDate;
    @Column(name = "C_POD_Type", nullable = true)
    private String cPodType;
    @Column(name = "Pedestrian_Use", nullable = true)
    private String pedestrianUse;
    @Column(name = "Vehicular_Use", nullable = true)
    private String vehicularUse;
    @Column(name = "Listed_as_Shelter", nullable = true)
    private String listedAsShelter;
    @Column(name = "Site_Length", nullable = true)
    private Integer siteLength;
    @Column(name = "Site_Width", nullable = true)
    private Integer siteWidth;
    @Column(name = "Site_Area", nullable = true)
    private Integer siteArea;
    @Column(name = "Entrance_for_tractor_trailer", nullable = true)
    private String entranceForTractorTrailer;
    @Column(name = "Maneuver_for_tractor_trailer", nullable = true)
    private String maneuverForTractorTrailer;
    @Column(name = "Tractor_trailer_comments", nullable = true)
    private Integer tractorTrailerComments;
    @Column(name = "Surface_Paved", nullable = true)
    private Integer surfacePaved;
    @Column(name = "Surface_Concrete", nullable = true)
    private Integer surfaceConcrete;
    @Column(name = "Surface_Hard_Rubber", nullable = true)
    private Integer surfaceHardRubber;
    @Column(name = "Surface_Gravel", nullable = true)
    private Integer surfaceGravel;
    @Column(name = "Surface_Dirt", nullable = true)
    private Integer surfaceDirt;
    @Column(name = "Surface_Grass", nullable = true)
    private Integer surfaceGrass;
    @Column(name = "Ingress", nullable = true)
    private String ingress;
    @Column(name = "Egress", nullable = true)
    private String egress;
    @Column(name = "Ingress_Egress_Instructions", nullable = true)
    private Integer ingressEgressInstructions;
    @Column(name = "Primary_street_for_delivery", nullable = true)
    private String primaryStreetForDelivery;
    @Column(name = "Ped_access_secondary_loc", nullable = true)
    private String pedAccessSecondaryLoc;
    @Column(name = "Ped_aaccess_comments", nullable = true)
    private Integer pedAaccessComments;
    @Column(name = "Specified_entrance_deliveries", nullable = true)
    private String specifiedEntranceDeliveries;
    @Column(name = "Deliveries_comments", nullable = true)
    private Integer deliveriesComments;
    @Column(name = "Automated_gate", nullable = true)
    private String automatedGate;
    @Column(name = "Spike_strips_in_driveways", nullable = true)
    private String spikeStripsInDriveways;
    @Column(name = "Perimeter_fencing", nullable = true)
    private String perimeterFencing;
    @Column(name = "Lighting_surrounding_site", nullable = true)
    private String lightingSurroundingSite;
    @Column(name = "Closed_circuit_TV_cameras", nullable = true)
    private String closedCircuitTvCameras;
    @Column(name = "Public_address_system", nullable = true)
    private String publicAddressSystem;
    @Column(name = "Covered_areas_on_site", nullable = true)
    private String coveredAreasOnSite;
    @Column(name = "Fixed_objects_within_site", nullable = true)
    private Integer fixedObjectsWithinSite;
    @Column(name = "Objects_comments", nullable = true)
    private Integer objectsComments;
    @Column(name = "Additional_space_attached", nullable = true)
    private String additionalSpaceAttached;
    @Column(name = "Additional_space_comments", nullable = true)
    private Integer additionalSpaceComments;
    @Column(name = "Separate_Staff_Parking", nullable = true)
    private String separateStaffParking;
    @Column(name = "Staff_Parking_Comments", nullable = true)
    private Integer staffParkingComments;
    @Column(name = "Nearest_MUNI_line", nullable = true)
    private Integer nearestMuniLine;
    @Column(name = "Nearest_MUNI_station", nullable = true)
    private Integer nearestMuniStation;
    @Column(name = "Other_nearby_MUNI_lines", nullable = true)
    private Integer otherNearbyMuniLines;
    @Column(name = "Sidewalk_wheelchair_access", nullable = true)
    private String sidewalkWheelchairAccess;
    @Column(name = "Uneven_surfaces_in_access", nullable = true)
    private String unevenSurfacesInAccess;
    @Column(name = "Restrooms_available", nullable = true)
    private String restroomsAvailable;
    @Column(name = "Tables_and_chairs_available", nullable = true)
    private String tablesAndChairsAvailable;
    @Column(name = "Pallet_jacks_available", nullable = true)
    private String palletJacksAvailable;
    @Column(name = "Barricades_available", nullable = true)
    private String barricadesAvailable;
    @Column(name = "General_comments", nullable = true)
    private Integer generalComments;
}