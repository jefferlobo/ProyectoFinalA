/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Consultas {
    // Declaramos la conexion a mysql
    public static Connection con;
    // Declaramos los datos de conexion a la bd
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="root";
    private static final String url="jdbc:mysql://localhost:3306/dbequatorial2a";
    
    PreparedStatement ps;
    ResultSet rs;
    
    public Connection conectar(){
      con = null;
      try{
          con = (Connection) DriverManager.getConnection(url, user, pass);
          if(con!=null){
          }
      }
      catch(SQLException e)
      {
          JOptionPane.showMessageDialog(null,"Error" + e.toString());
      }
      return con;
    }
    public void LeerEmpleados(String tabla, JTable visor)
    {
        String sql = "Select * from " + tabla;
        Statement st;
        Connection conexion = conectar();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("idempleados");
        model.addColumn("idloggin");
        model.addColumn("empcedula");
        model.addColumn("empapellido1");
        model.addColumn("empapellido2");
        model.addColumn("empnombre1");
        model.addColumn("empnombre2");
        model.addColumn("empdireccion");
        model.addColumn("emptelefono");
        model.addColumn("empcorreo");
        model.addColumn("empseguro");
        model.addColumn("empcargo");
        
        
        visor.setModel(model);
        String [] dato = new String[12];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {      
                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                dato[2] = rs.getString(3);
                dato[3] = rs.getString(4);
                dato[4] = rs.getString(5);
                dato[5] = rs.getString(6);
                dato[6] = rs.getString(7);
                dato[7] = rs.getString(8);
                dato[8] = rs.getString(9);
                dato[9] = rs.getString(10);
                dato[10] = rs.getString(11);
                dato[11] = rs.getString(12);
                
                model.addRow(dato);
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void LeerClientes(String tabla, JTable visor)
    {
        String sql = "Select * from " + tabla;
        Statement st;
        Connection conexion = conectar();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("idcliente");
        model.addColumn("clicedula");
        model.addColumn("cliapellido1");
        model.addColumn("cliapellido2");
        model.addColumn("clinombre1");
        model.addColumn("clinombre2");
        model.addColumn("clidireccion");
        model.addColumn("clitelefono");
        model.addColumn("clicorreo");
        visor.setModel(model);
        String [] dato = new String[9];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {      
                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                dato[2] = rs.getString(3);
                dato[3] = rs.getString(4);
                dato[4] = rs.getString(5);
                dato[5] = rs.getString(6);
                dato[6] = rs.getString(7);
                dato[7] = rs.getString(8);
                dato[8] = rs.getString(9);
                model.addRow(dato);
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void LeerProductos(String tabla, JTable visor)
    {
        String sql = "Select * from " + tabla;
        Statement st;
        Connection conexion = conectar();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("idproducto");
        model.addColumn("prodnombre");
        model.addColumn("prodpreciounitario");
        model.addColumn("prodsabor");
        model.addColumn("prodporcentaje");
        visor.setModel(model);
        String [] dato = new String[5];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {      
                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                dato[2] = rs.getString(3);
                dato[3] = rs.getString(4);
                dato[4] = rs.getString(5);
                model.addRow(dato);
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void LeerInventario(String tabla, JTable visor)
    {
        String sql = "Select * from " + tabla;
        Statement st;
        Connection conexion = conectar();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("idinventario");
        model.addColumn("idproveedor");
        model.addColumn("idproducto");
        model.addColumn("idstock");
        model.addColumn("invfecha");
        visor.setModel(model);
        String [] dato = new String[5];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {      
                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                dato[2] = rs.getString(3);
                dato[3] = rs.getString(4);
                dato[4] = rs.getString(5);
                model.addRow(dato);
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void LeerProveedores(String tabla, JTable visor)
    {
        String sql = "Select * from " + tabla;
        Statement st;
        Connection conexion = conectar();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("idproveedor");
        model.addColumn("procedula");
        model.addColumn("proapellido1");
        model.addColumn("proapellido2");
        model.addColumn("pronombre1");
        model.addColumn("pronombre2");
        model.addColumn("prodireccion");
        model.addColumn("protelefono");
        model.addColumn("procorreo");
        model.addColumn("proruc");
        visor.setModel(model);
        String [] dato = new String[10];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {      
                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                dato[2] = rs.getString(3);
                dato[3] = rs.getString(4);
                dato[4] = rs.getString(5);
                dato[5] = rs.getString(6);
                dato[6] = rs.getString(7);
                dato[7] = rs.getString(8);
                dato[8] = rs.getString(9);
                dato[9] = rs.getString(10);
                model.addRow(dato);
            }
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
      
    public void InsertarEmpleado(JTextField idEmpleado, JComboBox idLoggin,JTextField empCedula, JTextField empApellido1,
            JTextField empApellido2, JTextField empNombre1, JTextField empNombre2, JTextField empDireccion,
            JTextField empTelefono, JTextField empCorreo, JTextField empSeguro, JTextField empCargo)
    {
       try{
            Connection conecta = conectar();
            ps = conecta.prepareStatement("INSERT INTO empleados(IDEMPLEADO,IDLOGGIN,"
                    + "EMPCEDULA,EMPAPELLIDO1,EMPAPELLIDO2,EMPNOMBRE1,EMPNOMBRE2,"
                    + "EMPDIRECCION,EMPTELEFONO,EMPCORREO,EMPSEGURO,EMPCARGO) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?");
          
            ps.setInt(1, Integer.parseInt(idEmpleado.getText())); 
            ps.setInt(2, Integer.parseInt(idLoggin.getSelectedItem().toString())); 
            ps.setString(3, empCedula.getText());
            ps.setString(4, empApellido1.getText());
            ps.setString(5, empApellido2.getText());
            ps.setString(6, empNombre1.getText());
            ps.setString(7, empNombre2.getText());
            ps.setString(8, empDireccion.getText());
            ps.setString(9, empTelefono.getText());
            ps.setString(10, empCorreo.getText());
            ps.setString(11, empSeguro.getText());
            ps.setString(12, empCargo.getText());
           
            ps.execute();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public void InsertarCliente(JTextField cliCedula, JTextField cliApellido1, JTextField cliApellido2,
            JTextField cliNombre1, JTextField cliNombre2, JTextField cliDireccion, JTextField cliTelefono,
            JTextField cliCorreo)
    {
        try{
            Connection conecta = conectar();
            CallableStatement proc = conecta.prepareCall(" CALL empleados(?,?,?,?,?,?,?,?)");
            proc.setString(1, cliCedula.getText());
            proc.setString(2, cliApellido1.getText());
            proc.setString(3, cliApellido2.getText());
            proc.setString(4, cliNombre1.getText());
            proc.setString(5, cliNombre2.getText());
            proc.setString(6, cliDireccion.getText());
            proc.setString(7, cliTelefono.getText());
            proc.setString(8, cliCorreo.getText());
            proc.execute();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void EliminaRegistro(String id, String tabla, String id_name)
    {
        String sql = "delete from " + tabla + " where " + id_name + " = " + id;
        Statement st;
        Connection conexion = conectar();
        try
        {
            st = conexion.createStatement();
            int rs = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
        }catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    public void ActualizarEmpleado(JTextField empLoggin, JTextField empCedula, JTextField empApellido1,
            JTextField empApellido2,JTextField empNombre1,JTextField empNombre2,JTextField empDireccion,
            JTextField empTelefono, JTextField empCorreo,JTextField empSeguro, JTextField empCargo, String id)
    {
        String sql = "update empleados set idloggin = '" + empLoggin.getText()
                +"', empcedula = '" + empCedula.getText()+"', empapellido1 = '" + empApellido1.getText()
                +"', empapellido2 = '"+empApellido2.getText()+"', empnombre1 = '"+ empNombre1.getText()
                +"', empnombre2 = '"+ empNombre2.getText()+"', empdireccion = '"+ empDireccion.getText()
                +"', emptelefono = '"+ empTelefono.getText()+"',empcorreo  = '"+ empCorreo.getText()
                +"', empseguro = '"+empSeguro.getText()+ "', empcargo = '"+ empCargo.getText()
                +"' where idempleado = " + id;
        
        Statement st;
        Connection conexion = conectar();
        try
        {
            st = conexion.createStatement();
            int rs = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Empleado Actualizado");
        }catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    public void ActualizarCliente(JTextField cliCedula, JTextField cliApellido1, JTextField cliApellido2,
            JTextField cliNombre1,JTextField cliNombre2, JTextField cliDireccion,
            JTextField cliTelefono, JTextField cliCorreo, String id)
    {
        String sql = "update clientes set clicedula = '" + cliCedula.getText() +"', cliapellido1 = '"
                + cliApellido1.getText()+"', cliapellido2 = '" + cliApellido2.getText() +"', clinombre1 = '" 
                + cliNombre1.getText()+ "', clinombre2 = '" + cliNombre2.getText() +"', clidireccion = '" 
                + cliDireccion.getText()+"', clitelefono = '"+ cliTelefono.getText() + "', clicorreo = '"
                + cliCorreo.getText()+ "' where idcliente = " + id;
        Statement st;
        Connection conexion = conectar();
        try
        {
            st = conexion.createStatement();
            int rs = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Cliente Actualizado");
        }catch(SQLException e)
        {
            System.out.println(e);
        }
    }
     public void ActualizarProducto(JTextField prodNombre, JTextField prodPrecio, JTextField prodSabor, JTextField prodPorcentaje,String id){
         
        String sql = "update productos set prodnombre = '" + prodNombre.getText() +"', prodpreciounitario = '"
                + prodPrecio.getText()+"', prodpreciounitario = '" + prodSabor.getText() + "', prodsabor = '"
                + "' where idproducto = " + id;
        Statement st;
        Connection conexion = conectar();
        try
        {
            st = conexion.createStatement();
            int rs = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Producto Actualizado");
        }catch(SQLException e)
        {
            System.out.println(e);
        }
    }
     
     public void ActualizarInventario(JTextField invStock, JTextField invFecha,String id){
        String sql = "update inventario set invStock = '" + invStock.getText() +"', invfecha = '"
                + invFecha.getText()+"' where idinventario = " + id;
        Statement st;
        Connection conexion = conectar();
        try
        {
            st = conexion.createStatement();
            int rs = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Inventario Actualizado");
        }catch(SQLException e)
        {
            System.out.println(e);
        }
        }
     
     public void ActualizarProveedor(JTextField proCedula, JTextField proApellido1, JTextField proApellido2,
             JTextField proNombre1, JTextField proNombre2, JTextField proDireccion, JTextField proTelefono,
             JTextField proCorreo, JTextField proRuc,String id){
        String sql = "update proveedores set procedula = '" + proCedula.getText() +"', proapellido1 = '"
                + proApellido1.getText() + "', proapellido2= '" + proApellido2.getText()+ "', prodireccion = '"
                + proDireccion.getText() + "', protelefono= '" + proTelefono.getText()+ "', procorreo= '"
                + proCorreo.getText()+ "', proruc = '"+ proRuc.getText()+"' where idinventario = " + id;
        Statement st;
        Connection conexion = conectar();
        try
        {
            st = conexion.createStatement();
            int rs = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Inventario Actualizado");
        }catch(SQLException e)
        {
            System.out.println(e);
        }
        }
     
     
     
    }
   
