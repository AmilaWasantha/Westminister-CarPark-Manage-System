/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.service;

import lk.ijse.westminstercarparkmanager.service.custom.impl.CarServiceImpl;
import lk.ijse.westminstercarparkmanager.service.custom.impl.MotorBikeServiceImpl;
import lk.ijse.westminstercarparkmanager.service.custom.impl.PaymentServiceImpl;
import lk.ijse.westminstercarparkmanager.service.custom.impl.VanServiceImpl;

/**
 *
 * @author user
 */
public class ServiceFactory {
   public enum servicetype{
       CAR, VAN,MOTOBIKE,PAYMENT;
   } 
   private static ServiceFactory serviceFactory;

   private ServiceFactory() {
   }
   
   public static ServiceFactory getInstance(){
       if(serviceFactory==null){
           serviceFactory=new ServiceFactory();
       }
       return serviceFactory;
   }
   
   public CarParkManagerService getConnection(servicetype type){
       switch(type){
           case CAR:
               return new CarServiceImpl();
           case VAN:
               return new VanServiceImpl();
           case MOTOBIKE:
               return new MotorBikeServiceImpl();
           case PAYMENT:
               return new PaymentServiceImpl();
           default :
               return null;
       }
   }
   
}
