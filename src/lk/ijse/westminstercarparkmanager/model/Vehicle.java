/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.model;

/**
 *
 * @author user
 */
public abstract class Vehicle {
    protected String idPlate;
    protected String vehicleBrand;
    protected String vehicleType;
    protected DateTime dateTime;

    public abstract String getIdPlate();

    public abstract void setVehicleType(String vehicleType);

    public abstract void setIdPlate(String idPlate);

    public abstract String getVehicleBrand();
    
    public abstract void setVehicleBrand(String vehicleBrand);

    public abstract String getVehicleType();

    public abstract DateTime getDateTime();

    public abstract void setDateTime(DateTime dateTimeDTO);
}
