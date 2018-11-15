/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.service;

import java.util.List;
import lk.ijse.westminstercarparkmanager.dto.VehicleDTO;

/**
 *
 * @author user
 */
public interface CarParkManagerService <Vehicle extends VehicleDTO, ID>{
    public  boolean addVehicle(Vehicle vehicle); 

    public  boolean deleteVehicle(Vehicle vehicle);

    public  List<Vehicle> displayCurrentList();

    public  void printStatistics();

    public  void displayPerDayList();

    public  void displayParkingCharges(); 
}
