/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dostojic.climbers.common.dto;

import java.io.Serializable;

/**
 *
 * @author Dejan.Ostojic
 */
public class CompetitionSearchCriteriaDto implements Serializable{
    
    private String name;

    public CompetitionSearchCriteriaDto() {
    }

    public CompetitionSearchCriteriaDto(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
