/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.service.custom;

import java.util.List;
import lk.ijse.westminstercarparkmanager.dto.MotorBikeDTO;
import lk.ijse.westminstercarparkmanager.service.CarParkManagerService;

/**
 *
 * @author user
 */
public interface MotorBikeService extends CarParkManagerService<MotorBikeDTO, String>{
    public List<MotorBikeDTO>showAllMotorBike()throws Exception;
}
