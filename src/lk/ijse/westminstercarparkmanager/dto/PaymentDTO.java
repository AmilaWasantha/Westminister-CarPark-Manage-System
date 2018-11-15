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
public class PaymentDTO extends VehicleDTO{
   
    private double price;
    private long duration_of_Time;

    public PaymentDTO() {
    }

    public PaymentDTO(double price, long duration_of_Time) {
        this.price = price;
        this.duration_of_Time = duration_of_Time;
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
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the duration_of_Time
     */
    public long getDuration_of_Time() {
        return duration_of_Time;
    }

    /**
     * @param duration_of_Time the duration_of_Time to set
     */
    public void setDuration_of_Time(long duration_of_Time) {
        this.duration_of_Time = duration_of_Time;
    }

    /**
     * @return the price
     */
   

   

 
    
}
