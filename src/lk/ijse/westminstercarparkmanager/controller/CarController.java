/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.controller;

import java.util.List;
import lk.ijse.westminstercarparkmanager.dto.CarDTO;
import lk.ijse.westminstercarparkmanager.service.ServiceFactory;
import lk.ijse.westminstercarparkmanager.service.custom.CarService;

/**
 *
 * @author user
 */
public class CarController {
    public static boolean saveCar(CarDTO carDTO)throws Exception{
        CarService carService=(CarService)ServiceFactory.getInstance().getConnection(ServiceFactory.servicetype.CAR);
        return carService.addVehicle(carDTO);
     }
    public static List<CarDTO>showAllCars()throws Exception{
        CarService carService=(CarService)ServiceFactory.getInstance().getConnection(ServiceFactory.servicetype.CAR);
        return carService.AllCars();
    }
}
