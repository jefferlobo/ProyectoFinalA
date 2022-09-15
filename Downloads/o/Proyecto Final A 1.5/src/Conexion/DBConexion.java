
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class DBConexion {
   
    private static String DRIVER="com.mysql.jdbc.Driver";    
    private static String USUARIO="root";
    private static String PASSWORD="root";
    private static String URL="jdbc:mysql://localhost:3306/dbequatorial2a";
    
    static{
        try{
            Class.forName(DRIVER);  
        }catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"ERROR EN EL DRIVER:" +e);
        }
    }
    public Connection getConnection(){
        Connection con = null;
        try{
            con=DriverManager.getConnection(URL,USUARIO,PASSWORD);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"ERROR EN LA CONEXION" +e);
        }    
          return con;  
        }

    public Connection conectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
   
             
       
         
     
  

