/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.service.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.westminstercarparkmanager.dao.DAOFactory;
import lk.ijse.westminstercarparkmanager.dao.custom.VanDAO;
import lk.ijse.westminstercarparkmanager.dto.DateTimeDTO;
import lk.ijse.westminstercarparkmanager.dto.VanDTO;
import lk.ijse.westminstercarparkmanager.model.DateTime;
import lk.ijse.westminstercarparkmanager.model.Van;
import lk.ijse.westminstercarparkmanager.service.custom.VanService;

/**
 *
 * @author user
 */
public class VanServiceImpl implements VanService{
    private VanDAO vanDAO;

    public VanServiceImpl() {
        vanDAO=(VanDAO) DAOFactory.getInstance().getConnection(DAOFactory.getDaoType.VAN);
    }
    
    
    @Override
    public boolean addVehicle(VanDTO vanDTO) {
        int res=-1;
        Van van=new Van();
        DateTime dateTime=new DateTime();
        DateTimeDTO dateTimeDTO=new DateTimeDTO();
        dateTime.setDate(vanDTO.getDateTime().getDate());
        dateTime.setEntryTime(vanDTO.getDateTime().getEntryTime());
        System.out.println("menna service eke carDate : "+vanDTO.getDateTime().getDate());
        
        van.setIdPlate(vanDTO.getIdPlate());
        van.setVehicleBrand(vanDTO.getVehicleBrand());
        van.setVehicleType(vanDTO.getVehicleType());
        van.setCargoVolume(vanDTO.getCargoVolume());
        van.setStatus(vanDTO.getStatus());
        
        van.setDateTime(dateTime);
        
        res=vanDAO.addVehicle(van);
        return (0<res);
    }

    @Override
    public boolean deleteVehicle(VanDTO vehicle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<VanDTO> displayCurrentList() {
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
    public List<VanDTO> getAllVanDetails() throws Exception {
        List<VanDTO>vanDTOs=new ArrayList<VanDTO>();
        List<Van>vans=vanDAO.getAllVanDetails();
        if(vans!=null){
            for (Van van : vans) {
                VanDTO vanDTO=new VanDTO();
                DateTimeDTO dateTimeDTO=new DateTimeDTO();
                dateTimeDTO.setDate(van.getDateTime().getDate());
                dateTimeDTO.setEntryTime(van.getDateTime().getEntryTime());
                vanDTO.setIdPlate(van.getIdPlate());
                vanDTO.setDateTime(dateTimeDTO);
                vanDTO.setCargoVolume(van.getCargoVolume());
                vanDTO.setVehicleBrand(van.getVehicleBrand());
                vanDTO.setVehicleType(van.getVehicleType());
                vanDTO.setStatus(van.getStatus());
                vanDTOs.add(vanDTO);
                
            }
        }
        return vanDTOs;
    }

   
    
}
