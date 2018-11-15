/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.dto;

/**
 *
 * @author user
 */
public class CarDTO extends VehicleDTO{
    private int numDoors;
    private String carColor;
    private String status;

    public CarDTO() {
    }

    public CarDTO(int numDoors, String carColor, String status) {
        this.numDoors = numDoors;
        this.carColor = carColor;
        this.status = status;
    }

    
    
    

    /**
     * @return the numDoors
     */
    public int getNumDoors() {
        return numDoors;
    }

    /**
     * @param numDoors the numDoors to set
     */
    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    /**
     * @return the carColor
     */
    public String getCarColor() {
        return carColor;
    }

    /**
     * @param carColor the carColor to set
     */
    public void setCarColor(String carColor) {
        this.carColor = carColor;
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
    public DateTimeDTO getDateTime() {
        return dateTimeDTO;
    }

    @Override
    public void setDateTime(DateTimeDTO dateTimeDTO) {
        this.dateTimeDTO=dateTimeDTO;
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
