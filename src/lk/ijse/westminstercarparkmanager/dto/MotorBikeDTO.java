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
public class MotorBikeDTO extends VehicleDTO{
    
    private String engineCapacity;
    private String status;

    public MotorBikeDTO() {
    }

    public MotorBikeDTO(String engineCapacity, String status) {
        this.engineCapacity = engineCapacity;
        this.status = status;
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
     * @return the engineCapacity
     */
    public String getEngineCapacity() {
        return engineCapacity;
    }

    /**
     * @param engineCapacity the engineCapacity to set
     */
    public void setEngineCapacity(String engineCapacity) {
        this.engineCapacity = engineCapacity;
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
