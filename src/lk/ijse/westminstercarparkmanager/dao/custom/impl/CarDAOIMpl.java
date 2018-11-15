/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.dao.custom.impl;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.westminstercarparkmanager.connection.DBFactory;
import lk.ijse.westminstercarparkmanager.dao.custom.CarDAO;
import lk.ijse.westminstercarparkmanager.model.Car;
import lk.ijse.westminstercarparkmanager.model.DateTime;
import lk.ijse.westminstercarparkmanager.model.Test;

/**
 *
 * @author user
 */
public class CarDAOIMpl implements CarDAO{
    private Connection connection;

    public CarDAOIMpl() {
        connection=(Connection)DBFactory.getInstance().getConnection(DBFactory.dbType.DBCONNECTION).getConnection();
    }
    
    

    @Override
    public int addVehicle(Car car) {
        
        int res=-1;
        try {
//            Car car1=findById(car.getIdPlate());
//            System.out.println("menna oyage wade hari : "+car1.getDateTime().getDate());
            Statement stm=connection.createStatement();
            res=stm.executeUpdate("insert into car values('"+car.getIdPlate()+"','"+car.getVehicleBrand()+"','"+car.getVehicleType()+"','"+car.getCarColor()+"',"+car.getNumDoors()+",'"+car.getDateTime().getDate()+"','"+car.getDateTime().getEntryTime()+"','"+car.getStatus()+"')");
        } catch (SQLException ex) {
            Logger.getLogger(CarDAOIMpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CarDAOIMpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
        
    }

    @Override
    public boolean deleteVehicle(Car car) {
        int res=-1;
        try {
            Statement stm=connection.createStatement();
            res=stm.executeUpdate("delete from car where Plate_ID='"+car.getIdPlate()+"'");
        } catch (SQLException ex) {
            Logger.getLogger(CarDAOIMpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (0<res);
    }

    @Override
    public List<Car> displayCurrentList() {
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
    public List<Car> AllCars() throws Exception {
        List<Car>cars=new ArrayList<Car>();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("select *from car");
        while(rst.next()){
            
            DateTime dateTime=new DateTime();
            dateTime.setDate(rst.getString("DATE"));
            dateTime.setEntryTime(rst.getString("ENTRY_TIME"));
            
            
            Car car=new Car(
                  
               rst.getString("Plate_ID"),
               rst.getString("Brand"),
               rst.getString("Type"),
               rst.getString("COLOUR"),
               rst.getInt("No_OF_Doors"),
               rst.getString("STATUS")
                    
               
            );
            car.setDateTime(dateTime);
            System.out.println("car details : "+car.getCarColor());
            System.out.println("car Status :"+car.getStatus());
            cars.add(car);
            
        }
        return cars;
        
    }

    private void loadAllTest() {
        
        try {
            List<Test>tests=new ArrayList<>();
            Statement stm=connection.createStatement();
            ResultSet rst=stm.executeQuery("select *from test");
            while(rst.next()){
                
                Test test=new Test(
                        
                        rst.getString("Plate_ID"),
                        rst.getString("Brand"),
                        rst.getString("Type"),
                        rst.getString("COLOUR"),
                        rst.getInt("No_OF_Doors"),
                        
                        rst.getString("STATUS")
                        
                );
                System.out.println("car details : "+test.getBrand());
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarDAOIMpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Car findById(String id)throws Exception{
        Car car=null;
        Statement stm= connection.createStatement();
        ResultSet rst=stm.executeQuery("select * from car where Plate_ID='"+id+"'");
        while(rst.next()){
            car=new Car();
            DateTime dateTime=new DateTime();
            dateTime.setDate(rst.getString("DATE"));
            car.setDateTime(dateTime);
            
        }
        return car;
    }
    Date d1=null;
    
    
}
