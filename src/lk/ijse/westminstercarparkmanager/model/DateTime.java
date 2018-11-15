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
public class DateTime {
    private String Date;
    private String entryTime;
    private String exitTime;

    public DateTime() {
    }

    public DateTime(String Date, String entryTime, String exitTime) {
        this.Date = Date;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * @return the entryTime
     */
    public String getEntryTime() {
        return entryTime;
    }

    /**
     * @param entryTime the entryTime to set
     */
    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    /**
     * @return the exitTime
     */
    public String getExitTime() {
        return exitTime;
    }

    /**
     * @param exitTime the exitTime to set
     */
    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }
    
    
    
}
