/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.service.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.westminstercarparkmanager.dao.DAOFactory;
import lk.ijse.westminstercarparkmanager.dao.custom.CarDAO;
import lk.ijse.westminstercarparkmanager.dto.CarDTO;
import lk.ijse.westminstercarparkmanager.dto.DateTimeDTO;
import lk.ijse.westminstercarparkmanager.model.Car;
import lk.ijse.westminstercarparkmanager.model.DateTime;
import lk.ijse.westminstercarparkmanager.service.custom.CarService;

/**
 *
 * @author user
 */
public class CarServiceImpl implements CarService{
    private CarDAO carDAO;

    public CarServiceImpl() {
      carDAO=(CarDAO) DAOFactory.getInstance().getConnection(DAOFactory.getDaoType.CAR);
    }

    @Override
    public boolean addVehicle(CarDTO carDTO) {
       int res=-1;
        Car car=new Car();
        DateTime dateTime=new DateTime();
        DateTimeDTO dateTimeDTO=new DateTimeDTO();
        dateTime.setDate(carDTO.getDateTime().getDate());
        dateTime.setEntryTime(carDTO.getDateTime().getEntryTime());
        System.out.println("menna service eke carDate : "+carDTO.getDateTime().getDate());
        
        car.setIdPlate(carDTO.getIdPlate());
        car.setVehicleBrand(carDTO.getVehicleBrand());
        car.setVehicleType(carDTO.getVehicleType());
        car.setCarColor(carDTO.getCarColor());
        car.setNumDoors(carDTO.getNumDoors());
        car.setDateTime(dateTime);
        car.setStatus(carDTO.getStatus());
        
        res=carDAO.addVehicle(car);
        return (res>0);
        
    }

    @Override
    public boolean deleteVehicle(CarDTO vehicle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CarDTO> displayCurrentList() {
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
    public List<CarDTO> AllCars() throws Exception {
        List<CarDTO>carDTOs=new ArrayList<CarDTO>();
        List<Car>cars=carDAO.AllCars();
        if(cars!=null){
            for (Car car : cars) {
                CarDTO carDTO=new CarDTO();
                DateTimeDTO dateTimeDTO=new DateTimeDTO();
                dateTimeDTO.setDate(car.getDateTime().getDate());
                dateTimeDTO.setEntryTime(car.getDateTime().getEntryTime());
                carDTO.setIdPlate(car.getIdPlate());
                carDTO.setDateTime(dateTimeDTO);
                carDTO.setCarColor(car.getCarColor());
                carDTO.setNumDoors(car.getNumDoors());
                carDTO.setVehicleBrand(car.getVehicleBrand());
                carDTO.setVehicleType(car.getVehicleType());
                carDTO.setStatus(car.getStatus());
                carDTOs.add(carDTO);
                
            }
        }
        return carDTOs;
    }
    
    public CarDTO findById(String id)throws Exception{
        CarDTO carDTO=new CarDTO();
        //Car car=
        return null;
    }

    
    
}
