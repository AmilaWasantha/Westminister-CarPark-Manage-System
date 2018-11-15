/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.controller;

import java.util.List;
import lk.ijse.westminstercarparkmanager.dto.MotorBikeDTO;
import lk.ijse.westminstercarparkmanager.service.ServiceFactory;
import lk.ijse.westminstercarparkmanager.service.custom.MotorBikeService;

/**
 *
 * @author user
 */
public class MotorBikeController {
    public static boolean saveMotorBike(MotorBikeDTO motorBikeDTO)throws Exception{
        MotorBikeService motorBikeService=(MotorBikeService) ServiceFactory.getInstance().getConnection(ServiceFactory.servicetype.MOTOBIKE);
        return motorBikeService.addVehicle(motorBikeDTO);
    }
    
    public static List<MotorBikeDTO>showAllMotorBike()throws Exception{
         MotorBikeService motorBikeService=(MotorBikeService) ServiceFactory.getInstance().getConnection(ServiceFactory.servicetype.MOTOBIKE);
         return motorBikeService.showAllMotorBike();
         
    }
    
    
}
