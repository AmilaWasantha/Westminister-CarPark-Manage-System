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
public class Test {
    private String Plate_ID;
    private String Brand;
    private String Type;
    private String COLOUR;
    private int No_OF_Doors;
    private String  STATUS;

    public Test() {
    }

    public Test(String Plate_ID, String Brand, String Type, String COLOUR, int No_OF_Doors, String STATUS) {
        this.Plate_ID = Plate_ID;
        this.Brand = Brand;
        this.Type = Type;
        this.COLOUR = COLOUR;
        this.No_OF_Doors = No_OF_Doors;
        this.STATUS = STATUS;
    }

    /**
     * @return the Plate_ID
     */
    public String getPlate_ID() {
        return Plate_ID;
    }

    /**
     * @param Plate_ID the Plate_ID to set
     */
    public void setPlate_ID(String Plate_ID) {
        this.Plate_ID = Plate_ID;
    }

    /**
     * @return the Brand
     */
    public String getBrand() {
        return Brand;
    }

    /**
     * @param Brand the Brand to set
     */
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * @return the COLOUR
     */
    public String getCOLOUR() {
        return COLOUR;
    }

    /**
     * @param COLOUR the COLOUR to set
     */
    public void setCOLOUR(String COLOUR) {
        this.COLOUR = COLOUR;
    }

    /**
     * @return the No_OF_Doors
     */
    public int getNo_OF_Doors() {
        return No_OF_Doors;
    }

    /**
     * @param No_OF_Doors the No_OF_Doors to set
     */
    public void setNo_OF_Doors(int No_OF_Doors) {
        this.No_OF_Doors = No_OF_Doors;
    }

    /**
     * @return the STATUS
     */
    public String getSTATUS() {
        return STATUS;
    }

    /**
     * @param STATUS the STATUS to set
     */
    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }
    
    
   
}
