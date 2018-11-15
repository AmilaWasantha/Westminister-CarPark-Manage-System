/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.dao;

import java.util.List;
import lk.ijse.westminstercarparkmanager.model.Vehicle;

/**
 *
 * @author user
 */
public interface CarParkManagerDAO <vehicle extends Vehicle,ID>{
        
        public abstract int addVehicle(vehicle vehicle); 

	public abstract boolean deleteVehicle(vehicle vehicle);

	public abstract List<vehicle> displayCurrentList();

	public abstract void printStatistics();

	public abstract void displayPerDayList();

	public abstract void displayParkingCharges();  
}
