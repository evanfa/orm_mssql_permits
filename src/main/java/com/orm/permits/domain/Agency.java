package com.orm.permits.domain;

import javax.persistence.*;

@Entity
@Table(name="agency_db")
public class Agency {
    /*Maping
    * - xml file config (old school)
    * - annotations (Consider Hibernate (org.hibernate.anotations) or JPA (javax.persistence.Entity))
    * */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_agency", nullable = false)
    private Long id_agency;
    @Column(name="agency_details")
    private String agencyDetails;
    @Column(name="agency_address")
    private String agencyAdress;
    @Column(name="id_city")
    private int idCity;
    @Column(name="id_state")
    private int idState;
    @Column(name="office_days")
    private String officeDays;
    @Column(name="office_hours")
    private String officeHours;
    @Column(name="agency_notes")
    private String agencyNotes;
    @Column(name="id_permit")
    private String idPermit;

    public String getAgencyDetails() {
        return agencyDetails;
    }

    public void setAgencyDetails(String agencyDetails) {
        this.agencyDetails = agencyDetails;
    }

    public String getAgencyAdress() {
        return agencyAdress;
    }

    public void setAgencyAdress(String agencyAdress) {
        this.agencyAdress = agencyAdress;
    }

    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    public int getIdState() {
        return idState;
    }

    public void setIdState(int idState) {
        this.idState = idState;
    }

    public String getOfficeDays() {
        return officeDays;
    }

    public void setOfficeDays(String officeDays) {
        this.officeDays = officeDays;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getAgencyNotes() {
        return agencyNotes;
    }

    public void setAgencyNotes(String agencyNotes) {
        this.agencyNotes = agencyNotes;
    }

    public String getIdPermit() {
        return idPermit;
    }

    public void setIdPermit(String idPermit) {
        this.idPermit = idPermit;
    }
}
