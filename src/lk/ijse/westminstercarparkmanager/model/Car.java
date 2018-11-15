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
public class Car extends Vehicle{
   private int numDoors;
   private String carColor; 
   private String status;
   

    public Car() {
    }

    public Car(int numDoors, String carColor, String status) {
        this.numDoors = numDoors;
        this.carColor = carColor;
        this.status = status;
    }
  

   

    public Car(String plateId, String Brand, String Type, String Colour, int noOfDoor, String date, String entryTime,String status) {
        this.idPlate=plateId;
        this.vehicleBrand=Brand;
        this.vehicleType=Type;
        System.out.println("type : "+this.vehicleType);
        this.carColor=Colour;
        this.numDoors=noOfDoor;
        this.dateTime.setDate(date);
        this.dateTime.setEntryTime(entryTime);
        this.status=status;
        
    }

    public Car(String plateId, String Brand, String Type, String Colour, int noOfDoor, String status) {
        this.idPlate=plateId;
        this.vehicleBrand=Brand;
        this.vehicleType=Type;
        this.carColor=Colour;
        this.numDoors=noOfDoor;
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
