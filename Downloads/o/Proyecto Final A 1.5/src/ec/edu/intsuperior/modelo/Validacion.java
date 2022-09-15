/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author R083R7
 */
public class Validacion {
    public static Connection con;
    // Declaramos los datos de conexion a la bd
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="root";
    private static final String url="jdbc:mysql://localhost:3306/dbequatorial2a";
    
    public boolean Login(){
        PreparedStatement ps = null;
        ResultSet rs = null;
       
        
        return false;
        
        
        
    }
    

}
