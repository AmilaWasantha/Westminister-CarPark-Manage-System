/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.dao.custom;

import java.util.List;
import lk.ijse.westminstercarparkmanager.dao.CarParkManagerDAO;
import lk.ijse.westminstercarparkmanager.model.Car;
import lk.ijse.westminstercarparkmanager.model.Van;

/**
 *
 * @author user
 */
public interface VanDAO extends CarParkManagerDAO<Van, String>{
    public List<Van>getAllVanDetails()throws Exception;
}
