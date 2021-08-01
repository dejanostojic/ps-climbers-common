/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dostojic.climbers.common.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dejan.Ostojic
 */
public class CompetitionDto implements Serializable{

    private Integer id;
    private String name;
    private String description;
    private Date registrationOpen;
    private Date registrationClose;
    private Date eventStart;
    private List<RouteDto> routes;
    private List<RegistrationFeeDto> registrationFees;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRegistrationOpen() {
        return registrationOpen;
    }

    public void setRegistrationOpen(Date registrationOpen) {
        this.registrationOpen = registrationOpen;
    }

    public Date getRegistrationClose() {
        return registrationClose;
    }

    public void setRegistrationClose(Date registrationClose) {
        this.registrationClose = registrationClose;
    }

    public Date getEventStart() {
        return eventStart;
    }

    public void setEventStart(Date eventStart) {
        this.eventStart = eventStart;
    }

    public List<RouteDto> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RouteDto> routes) {
        this.routes = routes;
    }

    public List<RegistrationFeeDto> getRegistrationFees() {
        return registrationFees;
    }

    public void setRegistrationFees(List<RegistrationFeeDto> registrationFees) {
        this.registrationFees = registrationFees;
    }

    @Override
    public String toString() {
        return "CompetitionDto{" + "id=" + id + ", name=" + name + ", description=" + description + ", registrationOpen=" + registrationOpen + ", registrationClose=" + registrationClose + ", eventStart=" + eventStart + ", routes=" + routes + ", registrationFees=" + registrationFees + '}';
    }

}
