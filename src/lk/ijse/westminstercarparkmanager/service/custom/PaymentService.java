/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.service.custom;

import lk.ijse.westminstercarparkmanager.dto.PaymentDTO;
import lk.ijse.westminstercarparkmanager.service.CarParkManagerService;

/**
 *
 * @author user
 */
public interface PaymentService extends CarParkManagerService<PaymentDTO, String>{
    public boolean motorBikePayment(PaymentDTO paymentDTO)throws Exception;
    public boolean vanPayment(PaymentDTO paymentDTO)throws Exception;
}
