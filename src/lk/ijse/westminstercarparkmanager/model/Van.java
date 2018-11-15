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
public class Van extends Vehicle{

    private Double cargoVolume;
    private String status;

    public Van() {
    }

    public Van(Double cargoVolume, String status) {
        this.cargoVolume = cargoVolume;
        this.status = status;
    }

    public Van(String Plate_ID, String brand, String type, double cargovolume, String status) {
        this.idPlate=Plate_ID;
        this.vehicleBrand=brand;
        this.vehicleType=type;
        this.cargoVolume=cargovolume;
        this.status=status;
    }
    
    
    
    

    @Override
    public String getIdPlate() {
        return idPlate;
    }

    @Override
    public void setVehicleType(String vehicleType) {
        this.vehicleType=vehicleType;
    }

    @Override
    public void setIdPlate(String idPlate) {
        this.idPlate=idPlate;
    }

    @Override
    public String getVehicleBrand() {
        return vehicleBrand;
    }

    @Override
    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand=vehicleBrand;
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public DateTime getDateTime() {
        return dateTime;
    }

    @Override
    public void setDateTime(DateTime dateTime) {
        this.dateTime=dateTime;
    }

    /**
     * @return the cargoVolume
     */
    public Double getCargoVolume() {
        return cargoVolume;
    }

    /**
     * @param cargoVolume the cargoVolume to set
     */
    public void setCargoVolume(Double cargoVolume) {
        this.cargoVolume = cargoVolume;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
