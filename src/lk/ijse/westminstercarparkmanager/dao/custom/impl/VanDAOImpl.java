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
import lk.ijse.westminstercarparkmanager.dao.custom.VanDAO;
import lk.ijse.westminstercarparkmanager.model.Car;
import lk.ijse.westminstercarparkmanager.model.DateTime;
import lk.ijse.westminstercarparkmanager.model.Van;

/**
 *
 * @author user
 */
public class VanDAOImpl implements VanDAO{
    
    private Connection connection;

    public VanDAOImpl() {
        connection=DBFactory.getInstance().getConnection(DBFactory.dbType.DBCONNECTION).getConnection();
    }

    @Override
    public int addVehicle(Van van) {
        int res=-1;
        try {
            Statement stm= connection.createStatement();
            res=stm.executeUpdate("insert into van values('"+van.getIdPlate()+"','"+van.getVehicleBrand()+"','"+van.getVehicleType()+"',"+van.getCargoVolume()+",'"+van.getDateTime().getDate()+"','"+van.getDateTime().getEntryTime()+"','"+van.getStatus()+"')");
            
                    } catch (SQLException ex) {
            Logger.getLogger(VanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    @Override
    public boolean deleteVehicle(Van van) {
        int res=-1;
        try {
            Statement stm=connection.createStatement();
            res=stm.executeUpdate("delete from van where Plate_ID='"+van.getIdPlate()+"'");
        } catch (SQLException ex) {
            Logger.getLogger(VanDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (0<res);
    }

    @Override
    public List<Van> displayCurrentList() {
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
    public List<Van> getAllVanDetails() throws Exception {
        List<Van>vans=new ArrayList<Van>();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("select *from van");
        while(rst.next()){
            
            DateTime dateTime=new DateTime();
            dateTime.setDate(rst.getString("DATE"));
            dateTime.setEntryTime(rst.getString("ENTRY_TIME"));
            
            
            Van van=new Van(
                  
               rst.getString("Plate_ID"),
               rst.getString("Brand"),
               rst.getString("Type"),
               rst.getDouble("CARGOVOLUME"),
               rst.getString("STATUS")
                    
               
            );
            van.setDateTime(dateTime);
            
            vans.add(van);
            
        }
        return vans;
    }
    
    

  
    
}
