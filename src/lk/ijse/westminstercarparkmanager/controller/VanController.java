/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.controller;

import java.util.List;
import lk.ijse.westminstercarparkmanager.dto.VanDTO;
import lk.ijse.westminstercarparkmanager.service.ServiceFactory;
import lk.ijse.westminstercarparkmanager.service.custom.VanService;

/**
 *
 * @author user
 */
public class VanController {
    public static boolean saveVan(VanDTO vanDTO)throws Exception{
        VanService vanService=(VanService) ServiceFactory.getInstance().getConnection(ServiceFactory.servicetype.VAN);
        return vanService.addVehicle(vanDTO);
    }
    public static List<VanDTO>showAllVans()throws Exception{
        VanService vanService=(VanService) ServiceFactory.getInstance().getConnection(ServiceFactory.servicetype.VAN);
        return vanService.getAllVanDetails();
    }
}
