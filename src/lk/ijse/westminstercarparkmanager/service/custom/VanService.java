/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.service.custom;

import java.util.List;
import lk.ijse.westminstercarparkmanager.dto.VanDTO;
import lk.ijse.westminstercarparkmanager.service.CarParkManagerService;

/**
 *
 * @author user
 */
public interface VanService extends CarParkManagerService<VanDTO, String>{
    public List<VanDTO>getAllVanDetails()throws Exception;
}
