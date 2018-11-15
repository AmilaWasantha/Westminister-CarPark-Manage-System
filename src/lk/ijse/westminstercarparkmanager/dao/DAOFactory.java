/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.dao;

import lk.ijse.westminstercarparkmanager.dao.custom.impl.CarDAOIMpl;
import lk.ijse.westminstercarparkmanager.dao.custom.impl.MotorBikeDAOImpl;
import lk.ijse.westminstercarparkmanager.dao.custom.impl.PaymentDAOImpl;
import lk.ijse.westminstercarparkmanager.dao.custom.impl.VanDAOImpl;

/**
 *
 * @author user
 */
public class DAOFactory {
    public enum  getDaoType{
        CAR,VAN,MOTORBIKE,PAYMENT;
    }
    
    private static DAOFactory doAOFactory;

    public DAOFactory() {
    }
    
    public static DAOFactory getInstance(){
        if(doAOFactory ==null){
            doAOFactory=new DAOFactory();
        }
        return doAOFactory;
    }
    
    public CarParkManagerDAO getConnection(getDaoType type){
        switch(type){
            case CAR:
                return new CarDAOIMpl();
            case VAN:
                return new VanDAOImpl();
            case MOTORBIKE:
                return new MotorBikeDAOImpl();
            case PAYMENT:
                return new PaymentDAOImpl();
            default :
                return null;
        }
    }
    
}
