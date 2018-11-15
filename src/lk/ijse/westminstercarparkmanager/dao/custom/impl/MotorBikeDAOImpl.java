/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.dao.custom.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.westminstercarparkmanager.connection.DBFactory;
import lk.ijse.westminstercarparkmanager.dao.custom.MotorBykeDAO;
import lk.ijse.westminstercarparkmanager.model.DateTime;
import lk.ijse.westminstercarparkmanager.model.MotorBike;

/**
 *
 * @author user
 */
public class MotorBikeDAOImpl implements MotorBykeDAO{
    private Connection connection;

    public MotorBikeDAOImpl() {
        connection=DBFactory.getInstance().getConnection(DBFactory.dbType.DBCONNECTION).getConnection();
    }
    
    
    @Override
    public int addVehicle(MotorBike motorBike) {
        int res=-1;
        try {
            Statement stm= connection.createStatement();
            res=stm.executeUpdate("insert into motorbike values('"+motorBike.getIdPlate()+"','"+motorBike.getVehicleBrand()+"','"+motorBike.getVehicleType()+"','"+motorBike.getEngineCapacity()+"','"+motorBike.getDateTime().getDate()+"','"+motorBike.getDateTime().getEntryTime()+"','"+motorBike.getStatus()+"')");
            
        } catch (SQLException ex) {
            Logger.getLogger(MotorBikeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    @Override
    public boolean deleteVehicle(MotorBike motorBike) {
        int res=-1;
        try {
            Statement stm=connection.createStatement();
            res=stm.executeUpdate("delete from  motorbike where Plate_ID='"+motorBike.getIdPlate()+"'");
        } catch (SQLException ex) {
            Logger.getLogger(MotorBikeDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (0<res);
    }

    @Override
    public List<MotorBike> displayCurrentList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printStatistics() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displayPerDayList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displayParkingCharges() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MotorBike> showAllMotorBike() throws Exception {
         List<MotorBike>motorBikes=new ArrayList<MotorBike>();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("select *from motorbike");
        while(rst.next()){
            
            DateTime dateTime=new DateTime();
            dateTime.setDate(rst.getString("DATE"));
            dateTime.setEntryTime(rst.getString("ENTRY_TIME"));
            
            
            MotorBike motorBike=new MotorBike(
                  
               rst.getString("Plate_ID"),
               rst.getString("Brand"),
               rst.getString("Type"),
               rst.getString("ENGINE_CAPACITY"),
               rst.getString("STATUS")
                    
               
            );
            motorBike.setDateTime(dateTime);
            
            motorBikes.add(motorBike);
            
        }
        return motorBikes;
    }
    
}
