/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.dao.custom;

import java.util.List;
import lk.ijse.westminstercarparkmanager.dao.CarParkManagerDAO;
import lk.ijse.westminstercarparkmanager.model.Car;

/**
 *
 * @author user
 */
public interface CarDAO extends CarParkManagerDAO<Car, String>{
    public List<Car>AllCars()throws Exception;
}
