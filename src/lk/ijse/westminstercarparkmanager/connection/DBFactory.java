/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.connection;

import lk.ijse.westminstercarparkmanager.connection.impl.ResourceConnectionImpl;

/**
 *
 * @author user
 */
public class DBFactory {
    public enum dbType{
        DBCONNECTION;
    }
    private static DBFactory dBFactory;

    public DBFactory() {
    }
    
    public static DBFactory getInstance(){
        if(dBFactory==null){
            dBFactory=new DBFactory();
        }
        return dBFactory;
    }
    
    public ResourceConnection getConnection(dbType type){
        switch(type){
            case DBCONNECTION:
                return new ResourceConnectionImpl();
            default :
                return null;
        }
    }
    
    
}
