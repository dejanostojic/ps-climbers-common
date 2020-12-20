/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dostojic.climbers.common.communication;

import java.io.Serializable;

/**
 *
 * @author planina
 */
public enum Operation implements Serializable{
    LOGIN,
    GET_ALL_CLIMBERS,
    FIND_CLIMBER,
    DELETE_CLIMBER,
    UPDATE_CLIMBER,
    SAVE_CLIMBER
}
