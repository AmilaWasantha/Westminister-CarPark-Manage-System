/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.service.custom.impl;

import java.util.List;
import lk.ijse.westminstercarparkmanager.dao.DAOFactory;
import lk.ijse.westminstercarparkmanager.dao.custom.CarDAO;
import lk.ijse.westminstercarparkmanager.dao.custom.MotorBykeDAO;
import lk.ijse.westminstercarparkmanager.dao.custom.PaymentDAO;
import lk.ijse.westminstercarparkmanager.dao.custom.VanDAO;
import lk.ijse.westminstercarparkmanager.dto.PaymentDTO;
import lk.ijse.westminstercarparkmanager.model.Car;
import lk.ijse.westminstercarparkmanager.model.DateTime;
import lk.ijse.westminstercarparkmanager.model.MotorBike;
import lk.ijse.westminstercarparkmanager.model.Payment;
import lk.ijse.westminstercarparkmanager.model.Van;
import lk.ijse.westminstercarparkmanager.service.custom.PaymentService;

/**
 *
 * @author user
 */
public class PaymentServiceImpl implements PaymentService{
    private PaymentDAO paymentDAO;
    private CarDAO carDAO;
    private MotorBykeDAO motorBykeDAO;
    private VanDAO vanDAO;

    public PaymentServiceImpl() {
        paymentDAO=(PaymentDAO) DAOFactory.getInstance().getConnection(DAOFactory.getDaoType.PAYMENT);
        carDAO=(CarDAO) DAOFactory.getInstance().getConnection(DAOFactory.getDaoType.CAR);
        motorBykeDAO=(MotorBykeDAO) DAOFactory.getInstance().getConnection(DAOFactory.getDaoType.MOTORBIKE);
        vanDAO=(VanDAO) DAOFactory.getInstance().getConnection(DAOFactory.getDaoType.VAN);
    }
    
    

    @Override
    public boolean addVehicle(PaymentDTO paymentDTO) {
        int res=-1;
        Payment payment=new Payment();
        payment.setIdPlate(paymentDTO.getIdPlate());
        payment.setVehicleBrand(paymentDTO.getVehicleBrand());
        payment.setVehicleType(paymentDTO.getVehicleType());
        payment.setPrice(paymentDTO.getPrice());
        payment.setDuration_of_Time(paymentDTO.getDuration_of_Time());
        
        DateTime dateTime=new DateTime();
        dateTime.setDate(paymentDTO.getDateTime().getDate());
        payment.setDateTime(dateTime);
        res=paymentDAO.addVehicle(payment);
        
        Car car=new Car();
        car.setIdPlate(paymentDTO.getIdPlate());
        carDAO.deleteVehicle(car);
        
        return (res>0);
    }

    @Override
    public boolean deleteVehicle(PaymentDTO vehicle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PaymentDTO> displayCurrentList() {
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
    public boolean motorBikePayment(PaymentDTO paymentDTO) throws Exception {
        int res=-1;
        Payment payment=new Payment();
        payment.setIdPlate(paymentDTO.getIdPlate());
        payment.setVehicleBrand(paymentDTO.getVehicleBrand());
        payment.setVehicleType(paymentDTO.getVehicleType());
        payment.setPrice(paymentDTO.getPrice());
        payment.setDuration_of_Time(paymentDTO.getDuration_of_Time());
        
        DateTime dateTime=new DateTime();
        dateTime.setDate(paymentDTO.getDateTime().getDate());
        payment.setDateTime(dateTime);
        res=paymentDAO.addVehicle(payment);
        
        MotorBike motorBike=new MotorBike();
        motorBike.setIdPlate(paymentDTO.getIdPlate());
        motorBykeDAO.deleteVehicle(motorBike);
        
        return (res>0);
    }

    @Override
    public boolean vanPayment(PaymentDTO paymentDTO) throws Exception {
        int res=-1;
        Payment payment=new Payment();
        payment.setIdPlate(paymentDTO.getIdPlate());
        payment.setVehicleBrand(paymentDTO.getVehicleBrand());
        payment.setVehicleType(paymentDTO.getVehicleType());
        payment.setPrice(paymentDTO.getPrice());
        payment.setDuration_of_Time(paymentDTO.getDuration_of_Time());
        
        DateTime dateTime=new DateTime();
        dateTime.setDate(paymentDTO.getDateTime().getDate());
        payment.setDateTime(dateTime);
        res=paymentDAO.addVehicle(payment);
        
        Van van=new Van();
        van.setIdPlate(paymentDTO.getIdPlate());
        vanDAO.deleteVehicle(van);
        
        return (res>0);
    }
    
}
