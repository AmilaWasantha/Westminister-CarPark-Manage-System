/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.service.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.westminstercarparkmanager.dao.DAOFactory;
import lk.ijse.westminstercarparkmanager.dao.custom.MotorBykeDAO;
import lk.ijse.westminstercarparkmanager.dto.DateTimeDTO;
import lk.ijse.westminstercarparkmanager.dto.MotorBikeDTO;
import lk.ijse.westminstercarparkmanager.model.DateTime;
import lk.ijse.westminstercarparkmanager.model.MotorBike;
import lk.ijse.westminstercarparkmanager.service.custom.MotorBikeService;

/**
 *
 * @author user
 */
public class MotorBikeServiceImpl implements MotorBikeService{
    private MotorBykeDAO motorBykeDAO;

    public MotorBikeServiceImpl() {
        motorBykeDAO=(MotorBykeDAO) DAOFactory.getInstance().getConnection(DAOFactory.getDaoType.MOTORBIKE);
        
    }
    
    

    


    @Override
    public boolean addVehicle(MotorBikeDTO motorBikeDTO) {
        int res=-1;
        MotorBike motorBike=new MotorBike();
        
        DateTime dateTime=new DateTime();
        dateTime.setDate(motorBikeDTO.getDateTime().getDate());
        dateTime.setEntryTime(motorBikeDTO.getDateTime().getEntryTime());
        
        motorBike.setIdPlate(motorBikeDTO.getIdPlate());
        motorBike.setVehicleBrand(motorBikeDTO.getVehicleBrand());
        motorBike.setVehicleType(motorBikeDTO.getVehicleType());
        motorBike.setEngineCapacity(motorBikeDTO.getEngineCapacity());
        motorBike.setStatus(motorBikeDTO.getStatus());
        motorBike.setStatus(motorBikeDTO.getStatus());
        motorBike.setDateTime(dateTime);
        
        res=motorBykeDAO.addVehicle(motorBike);
        return (0<res);
    }

    @Override
    public boolean deleteVehicle(MotorBikeDTO vehicle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MotorBikeDTO> displayCurrentList() {
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
    public List<MotorBikeDTO> showAllMotorBike() throws Exception {
        List<MotorBikeDTO>motorBikeDTOs=new ArrayList<MotorBikeDTO>();
        List<MotorBike>motorBikes=motorBykeDAO.showAllMotorBike();
        if(motorBikes!=null){
            for (MotorBike motorBike : motorBikes) {
                MotorBikeDTO motorBikeDTO=new MotorBikeDTO();
                DateTimeDTO dateTimeDTO=new DateTimeDTO();
                dateTimeDTO.setDate(motorBike.getDateTime().getDate());
                dateTimeDTO.setEntryTime(motorBike.getDateTime().getEntryTime());
                motorBikeDTO.setIdPlate(motorBike.getIdPlate());
                motorBikeDTO.setDateTime(dateTimeDTO);
                motorBikeDTO.setEngineCapacity(motorBike.getEngineCapacity());
                motorBikeDTO.setVehicleBrand(motorBike.getVehicleBrand());
                motorBikeDTO.setVehicleType(motorBike.getVehicleType());
                motorBikeDTO.setStatus(motorBike.getStatus());
                motorBikeDTOs.add(motorBikeDTO);
                
            }
        }
        return motorBikeDTOs;
    }
}
