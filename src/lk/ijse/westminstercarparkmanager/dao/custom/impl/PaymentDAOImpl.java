/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.dao.custom.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.westminstercarparkmanager.connection.DBFactory;
import lk.ijse.westminstercarparkmanager.dao.custom.PaymentDAO;
import lk.ijse.westminstercarparkmanager.model.Payment;

/**
 *
 * @author user
 */
public class PaymentDAOImpl implements PaymentDAO{
    private Connection connection;

    public PaymentDAOImpl() {
        connection=DBFactory.getInstance().getConnection(DBFactory.dbType.DBCONNECTION).getConnection();
    }
    
    
    
    @Override
    public int addVehicle(Payment payment) {
        int res=-1;
        try {
            Statement stm=connection.createStatement();
            res=stm.executeUpdate("insert into payment values('"+payment.getIdPlate()+"','"+payment.getVehicleBrand()+"','"+payment.getVehicleType()+"','"+payment.getDateTime().getDate()+"','"+payment.getDuration_of_Time()+"','"+payment.getPrice()+"')");
        } catch (SQLException ex) {
            Logger.getLogger(PaymentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    @Override
    public boolean deleteVehicle(Payment payment) {
           throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }

    @Override
    public List<Payment> displayCurrentList() {
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

    

    
    
}
