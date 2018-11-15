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
public class MotorBike extends Vehicle{

    public MotorBike(String plateId, String brand, String type, String enginecapacity, String status) {
        this.idPlate=plateId;
        this.vehicleBrand=brand;
        this.vehicleType=type;
        this.engineCapacity=enginecapacity;
        this.status=status;
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
    private String engineCapacity;
    private String status;

    public MotorBike() {
    }

    public MotorBike(String engineCapacity, String status) {
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
    public DateTime getDateTime() {
        return dateTime;
    }

    @Override
    public void setDateTime(DateTime dateTime) {
        this.dateTime=dateTime;
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
    
    
}
