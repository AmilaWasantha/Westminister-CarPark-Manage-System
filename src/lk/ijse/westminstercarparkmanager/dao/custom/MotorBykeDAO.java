/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.dao.custom;

import java.util.List;
import lk.ijse.westminstercarparkmanager.dao.CarParkManagerDAO;
import lk.ijse.westminstercarparkmanager.model.MotorBike;
import lk.ijse.westminstercarparkmanager.model.Vehicle;

/**
 *
 * @author user
 */
public interface MotorBykeDAO extends CarParkManagerDAO<MotorBike, String>{
    public List<MotorBike>showAllMotorBike()throws Exception;
}
