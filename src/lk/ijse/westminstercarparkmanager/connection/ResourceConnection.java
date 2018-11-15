/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.westminstercarparkmanager.connection;

import java.sql.Connection;

/**
 *
 * @author user
 */
public interface ResourceConnection {
    public Connection getConnection();
}
