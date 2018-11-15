/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.controller;

import lk.ijse.westminstercarparkmanager.dto.PaymentDTO;
import lk.ijse.westminstercarparkmanager.dto.VanDTO;
import lk.ijse.westminstercarparkmanager.service.ServiceFactory;
import lk.ijse.westminstercarparkmanager.service.custom.PaymentService;

/**
 *
 * @author user
 */
public class PaymentController {
    public static boolean savePayment(PaymentDTO paymentDTO)throws Exception{
        
        
        PaymentService paymentService=(PaymentService) ServiceFactory.getInstance().getConnection(ServiceFactory.servicetype.PAYMENT);
        
        return paymentService.addVehicle(paymentDTO);
        
    }
    
    public static boolean saveMotorBikePayment(PaymentDTO paymentDTO)throws Exception{
         PaymentService paymentService=(PaymentService) ServiceFactory.getInstance().getConnection(ServiceFactory.servicetype.PAYMENT);
         return paymentService.motorBikePayment(paymentDTO);
    }
    
    public static boolean saveVanPayment(PaymentDTO paymentDTO)throws Exception{
         PaymentService paymentService=(PaymentService) ServiceFactory.getInstance().getConnection(ServiceFactory.servicetype.PAYMENT);
         return paymentService.vanPayment(paymentDTO);
    }
}
