/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.sql.*;

/**
 *
 * @author dacastro
 */
public class ConnectBD {

    Connection conexion;
    Statement st;
    
     public ConnectBD() {
        //conexion
    }
     public Connection getConexion() {
        return conexion;
    }
      /**
     * Método utilizado para establecer la conexión con la base de datos
     *
     * @return estado regresa el estado de la conexión, true si se estableció la
     * conexión, falso en caso contrario
     */
    public boolean crearConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");//"com.mysql.jdbc.Driver");                                      //user  //pass
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ucompleta", "root", "root");
            st = conexion.createStatement();
        } catch (SQLException | ClassNotFoundException ex) {
            return false;
        }

        return true;
    }
   
}