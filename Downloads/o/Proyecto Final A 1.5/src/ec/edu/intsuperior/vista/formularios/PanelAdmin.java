package ec.edu.intsuperior.vista.formularios;


import ec.edu.intsuperior.controlador.Controlador;
import ec.edu.intsuperior.modelo.Consultas;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

public class PanelAdmin extends javax.swing.JFrame {

    Controlador controlador;
     
    Consultas con = new Consultas();
    public PanelAdmin(Controlador controlador) {
        this.controlador=controlador;
        initComponents();
        this.setLocationRelativeTo(this);
        con.LeerEmpleados("empleados", jTable_Empleados);
        con.LeerClientes("clientes", jTable_Clientes);
        con.LeerProductos("productos", jTable_Productos);
        con.LeerInventario("inventario", jTable_Inventario);
        con.LeerProveedores("proveedores", jTable_Proveedores);
        
        
        jTable_Empleados.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent Mouse_evt)
                {
                    JTable table = (JTable) Mouse_evt.getSource();
                    Point point = Mouse_evt.getPoint();
                    int row = table.rowAtPoint(point);
                    if(Mouse_evt.getClickCount() == 1)
               
                {
                    jtxtempLoggin.setText(jTable_Empleados.getValueAt(jTable_Empleados.getSelectedRow(), 1).toString());
                    jtxtempCedula.setText(jTable_Empleados.getValueAt(jTable_Empleados.getSelectedRow(), 2).toString());
                    jtxtempApellido1.setText(jTable_Empleados.getValueAt(jTable_Empleados.getSelectedRow(), 3).toString());
                    jtxtempApellido2.setText(jTable_Empleados.getValueAt(jTable_Empleados.getSelectedRow(), 4).toString());
                    jtxtempNombre1.setText(jTable_Empleados.getValueAt(jTable_Empleados.getSelectedRow(), 5).toString());
                    jtxtempNombre2.setText(jTable_Empleados.getValueAt(jTable_Empleados.getSelectedRow(), 6).toString());
                    jtxtempDireccion.setText(jTable_Empleados.getValueAt(jTable_Empleados.getSelectedRow(), 7).toString());
                    jtxtempTelefono.setText(jTable_Empleados.getValueAt(jTable_Empleados.getSelectedRow(), 8).toString());
                    jtxtempCorreo.setText(jTable_Empleados.getValueAt(jTable_Empleados.getSelectedRow(), 9).toString());
                    jtxtempSeguro.setText(jTable_Empleados.getValueAt(jTable_Empleados.getSelectedRow(), 10).toString());
                    jtxtempCargo.setText(jTable_Empleados.getValueAt(jTable_Empleados.getSelectedRow(), 11).toString());
                }
                }
        });
        
        
        jTable_Clientes.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent Mouse_evt)
                {
                    JTable table = (JTable) Mouse_evt.getSource();
                    Point point = Mouse_evt.getPoint();
                    int row = table.rowAtPoint(point);
                    if(Mouse_evt.getClickCount() == 1)
               
                {
                    jtxtcliCedula.setText(jTable_Clientes.getValueAt(jTable_Clientes.getSelectedRow(), 1).toString());
                    jtxtcliApellido1.setText(jTable_Clientes.getValueAt(jTable_Clientes.getSelectedRow(), 2).toString());
                    jtxtcliApellido2.setText(jTable_Clientes.getValueAt(jTable_Clientes.getSelectedRow(), 3).toString());
                    jtxtcliNombre1.setText(jTable_Clientes.getValueAt(jTable_Clientes.getSelectedRow(), 4).toString());
                    jtxtcliNombre2.setText(jTable_Clientes.getValueAt(jTable_Clientes.getSelectedRow(), 5).toString());
                    jtxtcliDireccion.setText(jTable_Clientes.getValueAt(jTable_Clientes.getSelectedRow(), 6).toString());
                    jtxtcliTelefono.setText(jTable_Clientes.getValueAt(jTable_Clientes.getSelectedRow(), 7).toString());
                    jtxtcliCorreo.setText(jTable_Clientes.getValueAt(jTable_Clientes.getSelectedRow(), 8).toString());
                }
                }
        });
        
        jTable_Productos.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent Mouse_evt)
                {
                    JTable table = (JTable) Mouse_evt.getSource();
                    Point point = Mouse_evt.getPoint();
                    int row = table.rowAtPoint(point);
                    if(Mouse_evt.getClickCount() == 1)
               
                {
                    jtxtprodNombre.setText(jTable_Productos.getValueAt(jTable_Productos.getSelectedRow(), 1).toString());
                    jtxtprodPrecio.setText(jTable_Productos.getValueAt(jTable_Productos.getSelectedRow(), 2).toString());
                    jtxtprodSabor.setText(jTable_Productos.getValueAt(jTable_Productos.getSelectedRow(), 3).toString());
                    jtxtprodPorcentaje.setText(jTable_Productos.getValueAt(jTable_Productos.getSelectedRow(), 4).toString());
                }
                }
        });
        
                jTable_Inventario.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent Mouse_evt)
                {
                    JTable table = (JTable) Mouse_evt.getSource();
                    Point point = Mouse_evt.getPoint();
                    int row = table.rowAtPoint(point);
                    if(Mouse_evt.getClickCount() == 1)
               
                {
                    jtxtinvStock.setText(jTable_Inventario.getValueAt(jTable_Inventario.getSelectedRow(), 3).toString());
                    jtxtinvFecha.setText(jTable_Inventario.getValueAt(jTable_Inventario.getSelectedRow(), 4).toString());
                }
                }
        });
                
               jTable_Proveedores.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent Mouse_evt)
                {
                    JTable table = (JTable) Mouse_evt.getSource();
                    Point point = Mouse_evt.getPoint();
                    int row = table.rowAtPoint(point);
                    if(Mouse_evt.getClickCount() == 1)
               
                {
                    jtxtproCedula.setText(jTable_Proveedores.getValueAt(jTable_Proveedores.getSelectedRow(), 1).toString());
                    jtxtproApellido1.setText(jTable_Proveedores.getValueAt(jTable_Proveedores.getSelectedRow(), 2).toString());
                    jtxtproApellido2.setText(jTable_Proveedores.getValueAt(jTable_Proveedores.getSelectedRow(), 3).toString());
                    jtxtproNombre1.setText(jTable_Proveedores.getValueAt(jTable_Proveedores.getSelectedRow(), 4).toString());
                    jtxtproNombre2.setText(jTable_Proveedores.getValueAt(jTable_Proveedores.getSelectedRow(), 5).toString());
                    jtxtproDireccion.setText(jTable_Proveedores.getValueAt(jTable_Proveedores.getSelectedRow(), 6).toString());
                    jtxtproTelefono.setText(jTable_Proveedores.getValueAt(jTable_Proveedores.getSelectedRow(), 7).toString());
                    jtxtproCorreo.setText(jTable_Proveedores.getValueAt(jTable_Proveedores.getSelectedRow(), 8).toString());
                    jtxtproRuc.setText(jTable_Proveedores.getValueAt(jTable_Proveedores.getSelectedRow(), 9).toString());
                }
                }
        }); 
                
                
        
        
        
    }

    private PanelAdmin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTbdFormulas = new javax.swing.JTabbedPane();
        jPnlFormulaGeneral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jFrtLiteralB = new javax.swing.JFormattedTextField();
        jFrtLiteralC = new javax.swing.JFormattedTextField();
        jFrtLiteralA = new javax.swing.JFormattedTextField();
        jLblLiteralA = new javax.swing.JLabel();
        jLblLiteralB = new javax.swing.JLabel();
        jLblLiteralC = new javax.swing.JLabel();
        Separator = new javax.swing.JSeparator();
        jLblX1 = new javax.swing.JLabel();
        jLblX2 = new javax.swing.JLabel();
        jPnlMiFormula = new javax.swing.JPanel();
        Jbtn_guardar2 = new java.awt.Button();
        jTxtTitulo2 = new java.awt.TextField();
        jTxtNombre2 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPaneAdmin = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Empleados = new javax.swing.JTable();
        jPanel_prop = new javax.swing.JPanel();
        jLbl_titulo = new java.awt.Label();
        jLbl_editorial = new java.awt.Label();
        jLbl_anio = new java.awt.Label();
        JlblDatos = new java.awt.Label();
        jtxtempLoggin = new javax.swing.JTextField();
        jtxtempCedula = new javax.swing.JTextField();
        jtxtempApellido1 = new javax.swing.JTextField();
        jLbl_titulo1 = new java.awt.Label();
        jLbl_editorial1 = new java.awt.Label();
        jLbl_anio1 = new java.awt.Label();
        jLbl_anio2 = new java.awt.Label();
        jLbl_anio3 = new java.awt.Label();
        jtxtempNombre1 = new javax.swing.JTextField();
        Seguro = new java.awt.Label();
        jtxtempNombre2 = new javax.swing.JTextField();
        jtxtempTelefono = new javax.swing.JTextField();
        jLbl_anio5 = new java.awt.Label();
        jtxtempDireccion = new javax.swing.JTextField();
        jtxtempCorreo = new javax.swing.JTextField();
        jtxtempSeguro = new javax.swing.JTextField();
        jLbl_titulo2 = new java.awt.Label();
        jtxtempCargo = new javax.swing.JTextField();
        jtxtempApellido2 = new javax.swing.JTextField();
        cbxIdEmpleado = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Clientes = new javax.swing.JTable();
        jPanelDatosUsuario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLblNombre = new javax.swing.JLabel();
        jLblTelefono = new javax.swing.JLabel();
        jLblDireccion = new javax.swing.JLabel();
        jLblCiudad = new javax.swing.JLabel();
        jLblCorreo = new javax.swing.JLabel();
        jtxtcliApellido1 = new javax.swing.JTextField();
        jtxtcliCedula = new javax.swing.JTextField();
        jtxtcliNombre1 = new javax.swing.JTextField();
        jtxtcliApellido2 = new javax.swing.JTextField();
        jtxtcliNombre2 = new javax.swing.JTextField();
        jLblCorreo1 = new javax.swing.JLabel();
        jLblCorreo2 = new javax.swing.JLabel();
        jLblCorreo3 = new javax.swing.JLabel();
        jtxtcliDireccion = new javax.swing.JTextField();
        jtxtcliTelefono = new javax.swing.JTextField();
        jtxtcliCorreo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_Productos = new javax.swing.JTable();
        jPanelDatosUsuario5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLblNombre5 = new javax.swing.JLabel();
        jLblTelefono5 = new javax.swing.JLabel();
        jLblDireccion5 = new javax.swing.JLabel();
        jLblCiudad5 = new javax.swing.JLabel();
        jtxtprodPrecio = new javax.swing.JTextField();
        jtxtprodNombre = new javax.swing.JTextField();
        jtxtprodPorcentaje = new javax.swing.JTextField();
        jtxtprodSabor = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable_Inventario = new javax.swing.JTable();
        jPanelDatosUsuario6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLblNombre6 = new javax.swing.JLabel();
        jLblDireccion6 = new javax.swing.JLabel();
        jtxtinvFecha = new javax.swing.JTextField();
        jtxtinvStock = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_Proveedores = new javax.swing.JTable();
        jPanel_prop1 = new javax.swing.JPanel();
        jLbl_titulo3 = new java.awt.Label();
        jLbl_editorial2 = new java.awt.Label();
        jLbl_anio4 = new java.awt.Label();
        JlblDatos1 = new java.awt.Label();
        jtxtproCedula = new javax.swing.JTextField();
        jtxtproApellido1 = new javax.swing.JTextField();
        jtxtproApellido2 = new javax.swing.JTextField();
        jLbl_titulo4 = new java.awt.Label();
        jLbl_editorial3 = new java.awt.Label();
        jLbl_anio7 = new java.awt.Label();
        jtxtproNombre2 = new javax.swing.JTextField();
        Seguro1 = new java.awt.Label();
        jtxtproDireccion = new javax.swing.JTextField();
        jtxtproCorreo = new javax.swing.JTextField();
        jLbl_anio9 = new java.awt.Label();
        jtxtproTelefono = new javax.swing.JTextField();
        jtxtproRuc = new javax.swing.JTextField();
        jLbl_titulo5 = new java.awt.Label();
        jtxtproNombre1 = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        jPanel_buttons = new javax.swing.JPanel();
        Jbtn_actualizar = new javax.swing.JButton();
        Jbtn_guardar = new javax.swing.JButton();
        Jbtn_eliminar = new javax.swing.JButton();
        Jbtn_nuevo = new javax.swing.JButton();
        Jbtn_nuevo1 = new javax.swing.JButton();

        jPnlFormulaGeneral.setBackground(new java.awt.Color(255, 204, 0));
        jPnlFormulaGeneral.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Ingresa la literales y resuelve la fórmula");

        jFrtLiteralB.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFrtLiteralB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFrtLiteralBActionPerformed(evt);
            }
        });

        jFrtLiteralC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFrtLiteralC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFrtLiteralCActionPerformed(evt);
            }
        });

        jFrtLiteralA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFrtLiteralA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFrtLiteralAActionPerformed(evt);
            }
        });

        jLblLiteralA.setText("a:");

        jLblLiteralB.setText("b:");

        jLblLiteralC.setText("c:");

        Separator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLblX1.setText("X1:");

        jLblX2.setText("x2:");

        javax.swing.GroupLayout jPnlFormulaGeneralLayout = new javax.swing.GroupLayout(jPnlFormulaGeneral);
        jPnlFormulaGeneral.setLayout(jPnlFormulaGeneralLayout);
        jPnlFormulaGeneralLayout.setHorizontalGroup(
            jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlFormulaGeneralLayout.createSequentialGroup()
                .addGroup(jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlFormulaGeneralLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1))
                    .addGroup(jPnlFormulaGeneralLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblLiteralA)
                            .addComponent(jLblLiteralB)
                            .addComponent(jLblLiteralC))
                        .addGap(27, 27, 27)
                        .addGroup(jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFrtLiteralA, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFrtLiteralC, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFrtLiteralB, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblX1)
                            .addComponent(jLblX2))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPnlFormulaGeneralLayout.setVerticalGroup(
            jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnlFormulaGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnlFormulaGeneralLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnlFormulaGeneralLayout.createSequentialGroup()
                                .addGap(0, 14, Short.MAX_VALUE)
                                .addGroup(jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jFrtLiteralA, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblLiteralA))
                                .addGap(18, 18, 18)
                                .addGroup(jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jFrtLiteralB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblLiteralB))
                                .addGap(18, 18, 18)
                                .addGroup(jPnlFormulaGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jFrtLiteralC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLblLiteralC)))
                            .addComponent(Separator))
                        .addGap(19, 19, 19))
                    .addGroup(jPnlFormulaGeneralLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLblX1)
                        .addGap(52, 52, 52)
                        .addComponent(jLblX2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTbdFormulas.addTab("Fórmula General", jPnlFormulaGeneral);

        javax.swing.GroupLayout jPnlMiFormulaLayout = new javax.swing.GroupLayout(jPnlMiFormula);
        jPnlMiFormula.setLayout(jPnlMiFormulaLayout);
        jPnlMiFormulaLayout.setHorizontalGroup(
            jPnlMiFormulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );
        jPnlMiFormulaLayout.setVerticalGroup(
            jPnlMiFormulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );

        jTbdFormulas.addTab("Mi Fórmula", jPnlMiFormula);

        Jbtn_guardar2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        Jbtn_guardar2.setLabel("Guardar");

        jTxtTitulo2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jTxtNombre2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jTable_Empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable_Empleados);

        jPanel_prop.setBackground(new java.awt.Color(255, 51, 51));

        jLbl_titulo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_titulo.setText("Cedula");

        jLbl_editorial.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLbl_editorial.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_editorial.setText("Nombre1");

        jLbl_anio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLbl_anio.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_anio.setText("Nombre2");

        JlblDatos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JlblDatos.setForeground(new java.awt.Color(255, 255, 255));
        JlblDatos.setText("id Empleado");

        jtxtempLoggin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxtempLoggin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtempLogginActionPerformed(evt);
            }
        });

        jtxtempCedula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jtxtempApellido1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxtempApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtempApellido1ActionPerformed(evt);
            }
        });

        jLbl_titulo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLbl_titulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_titulo1.setText("Apellido 1");

        jLbl_editorial1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLbl_editorial1.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_editorial1.setText("Apellido2");

        jLbl_anio1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLbl_anio1.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_anio1.setText("Telefono");

        jLbl_anio2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLbl_anio2.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_anio2.setText("Seguro");

        jLbl_anio3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLbl_anio3.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_anio3.setText("Cargo");

        jtxtempNombre1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxtempNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtempNombre1ActionPerformed(evt);
            }
        });

        Seguro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Seguro.setForeground(new java.awt.Color(255, 255, 255));
        Seguro.setText("Direccion");

        jtxtempNombre2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxtempNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtempNombre2ActionPerformed(evt);
            }
        });

        jtxtempTelefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxtempTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtempTelefonoActionPerformed(evt);
            }
        });

        jLbl_anio5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLbl_anio5.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_anio5.setText("Correo");

        jtxtempDireccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxtempDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtempDireccionActionPerformed(evt);
            }
        });

        jtxtempCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtempCorreoActionPerformed(evt);
            }
        });

        jLbl_titulo2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLbl_titulo2.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_titulo2.setText("idLoggin");

        jtxtempApellido2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxtempApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtempApellido2ActionPerformed(evt);
            }
        });

        cbxIdEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        javax.swing.GroupLayout jPanel_propLayout = new javax.swing.GroupLayout(jPanel_prop);
        jPanel_prop.setLayout(jPanel_propLayout);
        jPanel_propLayout.setHorizontalGroup(
            jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_propLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_propLayout.createSequentialGroup()
                        .addGroup(jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbl_anio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_anio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtempTelefono)
                            .addComponent(jtxtempCorreo)))
                    .addGroup(jPanel_propLayout.createSequentialGroup()
                        .addGroup(jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbl_editorial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLbl_editorial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLbl_titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Seguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtempNombre2)
                            .addComponent(jtxtempCedula)
                            .addComponent(jtxtempApellido1)
                            .addComponent(jtxtempNombre1)
                            .addComponent(jtxtempDireccion)
                            .addComponent(jtxtempApellido2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbxIdEmpleado, 0, 201, Short.MAX_VALUE)))
                    .addGroup(jPanel_propLayout.createSequentialGroup()
                        .addGroup(jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbl_anio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_anio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtempSeguro)
                            .addComponent(jtxtempCargo)))
                    .addGroup(jPanel_propLayout.createSequentialGroup()
                        .addComponent(JlblDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtempLoggin)))
                .addContainerGap())
        );
        jPanel_propLayout.setVerticalGroup(
            jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_propLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_propLayout.createSequentialGroup()
                        .addGroup(jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JlblDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtempLoggin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLbl_titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtempCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtempApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_titulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtempApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_editorial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbl_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtempNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtempNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtempDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Seguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtempTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_anio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtempCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLbl_anio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtempSeguro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbl_anio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_propLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtempCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbl_anio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JlblDatos.getAccessibleContext().setAccessibleDescription("");
        JlblDatos.getAccessibleContext().setAccessibleParent(jPanel_prop);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1014, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_prop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel_prop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneAdmin.addTab("Empleados", jPanel2);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jTable_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable_Clientes);

        jPanelDatosUsuario.setBackground(new java.awt.Color(255, 51, 51));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Datos de Cliente");

        jLblNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLblNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLblNombre.setText("Cedula");

        jLblTelefono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jLblTelefono.setText("Apellido2");

        jLblDireccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jLblDireccion.setText("Apellido1");

        jLblCiudad.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLblCiudad.setForeground(new java.awt.Color(255, 255, 255));
        jLblCiudad.setText("Nombre1");

        jLblCorreo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jLblCorreo.setText("Nombre2");

        jtxtcliApellido1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jtxtcliCedula.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jtxtcliNombre1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jtxtcliApellido2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jtxtcliNombre2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLblCorreo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLblCorreo1.setForeground(new java.awt.Color(255, 255, 255));
        jLblCorreo1.setText("Direccion");

        jLblCorreo2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLblCorreo2.setForeground(new java.awt.Color(255, 255, 255));
        jLblCorreo2.setText("Telefono");

        jLblCorreo3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLblCorreo3.setForeground(new java.awt.Color(255, 255, 255));
        jLblCorreo3.setText("Correo");

        jtxtcliDireccion.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jtxtcliTelefono.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jtxtcliCorreo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanelDatosUsuarioLayout = new javax.swing.GroupLayout(jPanelDatosUsuario);
        jPanelDatosUsuario.setLayout(jPanelDatosUsuarioLayout);
        jPanelDatosUsuarioLayout.setHorizontalGroup(
            jPanelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosUsuarioLayout.createSequentialGroup()
                        .addGroup(jPanelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblDireccion)
                            .addComponent(jLblNombre))
                        .addGap(23, 23, 23)
                        .addGroup(jPanelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtcliApellido1)
                            .addComponent(jtxtcliCedula)))
                    .addGroup(jPanelDatosUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 280, Short.MAX_VALUE))
                    .addGroup(jPanelDatosUsuarioLayout.createSequentialGroup()
                        .addGroup(jPanelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblTelefono)
                            .addComponent(jLblCiudad)
                            .addComponent(jLblCorreo)
                            .addComponent(jLblCorreo1)
                            .addComponent(jLblCorreo2)
                            .addComponent(jLblCorreo3))
                        .addGap(21, 21, 21)
                        .addGroup(jPanelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtcliCorreo)
                            .addComponent(jtxtcliTelefono)
                            .addComponent(jtxtcliDireccion)
                            .addComponent(jtxtcliNombre1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtcliApellido2)
                            .addComponent(jtxtcliNombre2))))
                .addContainerGap())
        );
        jPanelDatosUsuarioLayout.setVerticalGroup(
            jPanelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNombre)
                    .addComponent(jtxtcliCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblDireccion)
                    .addComponent(jtxtcliApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblTelefono)
                    .addComponent(jtxtcliApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCiudad)
                    .addComponent(jtxtcliNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCorreo)
                    .addComponent(jtxtcliNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCorreo1)
                    .addComponent(jtxtcliDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCorreo2)
                    .addComponent(jtxtcliTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblCorreo3)
                    .addComponent(jtxtcliCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelDatosUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDatosUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneAdmin.addTab("Clientes", jPanel3);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jTable_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTable_Productos);

        jPanelDatosUsuario5.setBackground(new java.awt.Color(255, 51, 51));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Datos de Productos");

        jLblNombre5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLblNombre5.setForeground(new java.awt.Color(255, 255, 255));
        jLblNombre5.setText("Nombre");

        jLblTelefono5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLblTelefono5.setForeground(new java.awt.Color(255, 255, 255));
        jLblTelefono5.setText("Sabor");

        jLblDireccion5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLblDireccion5.setForeground(new java.awt.Color(255, 255, 255));
        jLblDireccion5.setText("Precio");

        jLblCiudad5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLblCiudad5.setForeground(new java.awt.Color(255, 255, 255));
        jLblCiudad5.setText("Porcentaje");

        jtxtprodPrecio.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jtxtprodNombre.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jtxtprodNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtprodNombreActionPerformed(evt);
            }
        });

        jtxtprodPorcentaje.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jtxtprodSabor.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanelDatosUsuario5Layout = new javax.swing.GroupLayout(jPanelDatosUsuario5);
        jPanelDatosUsuario5.setLayout(jPanelDatosUsuario5Layout);
        jPanelDatosUsuario5Layout.setHorizontalGroup(
            jPanelDatosUsuario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosUsuario5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosUsuario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDatosUsuario5Layout.createSequentialGroup()
                        .addGroup(jPanelDatosUsuario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDatosUsuario5Layout.createSequentialGroup()
                                .addGroup(jPanelDatosUsuario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelDatosUsuario5Layout.createSequentialGroup()
                                        .addComponent(jLblCiudad5)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosUsuario5Layout.createSequentialGroup()
                                        .addComponent(jLblTelefono5)
                                        .addGap(46, 46, 46)))
                                .addGroup(jPanelDatosUsuario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtxtprodSabor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtprodPorcentaje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosUsuario5Layout.createSequentialGroup()
                                .addGroup(jPanelDatosUsuario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLblNombre5)
                                    .addComponent(jLblDireccion5))
                                .addGap(35, 35, 35)
                                .addGroup(jPanelDatosUsuario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtprodPrecio)
                                    .addComponent(jtxtprodNombre))))
                        .addGap(23, 23, 23))))
        );
        jPanelDatosUsuario5Layout.setVerticalGroup(
            jPanelDatosUsuario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosUsuario5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanelDatosUsuario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNombre5)
                    .addComponent(jtxtprodNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanelDatosUsuario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblDireccion5)
                    .addComponent(jtxtprodPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanelDatosUsuario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblTelefono5)
                    .addComponent(jtxtprodSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDatosUsuario5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLblCiudad5)
                    .addComponent(jtxtprodPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanelDatosUsuario5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDatosUsuario5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneAdmin.addTab("Productos", jPanel4);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        jTable_Inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jTable_Inventario);

        jPanelDatosUsuario6.setBackground(new java.awt.Color(255, 51, 51));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Datos de Inventario");

        jLblNombre6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLblNombre6.setForeground(new java.awt.Color(255, 255, 255));
        jLblNombre6.setText("Stock");

        jLblDireccion6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLblDireccion6.setForeground(new java.awt.Color(255, 255, 255));
        jLblDireccion6.setText("Fecha");

        jtxtinvFecha.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jtxtinvStock.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanelDatosUsuario6Layout = new javax.swing.GroupLayout(jPanelDatosUsuario6);
        jPanelDatosUsuario6.setLayout(jPanelDatosUsuario6Layout);
        jPanelDatosUsuario6Layout.setHorizontalGroup(
            jPanelDatosUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosUsuario6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosUsuario6Layout.createSequentialGroup()
                        .addGroup(jPanelDatosUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblDireccion6)
                            .addComponent(jLblNombre6))
                        .addGap(23, 23, 23)
                        .addGroup(jPanelDatosUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtinvStock, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jtxtinvFecha)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanelDatosUsuario6Layout.setVerticalGroup(
            jPanelDatosUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosUsuario6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNombre6)
                    .addComponent(jtxtinvStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanelDatosUsuario6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblDireccion6)
                    .addComponent(jtxtinvFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(305, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanelDatosUsuario6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDatosUsuario6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneAdmin.addTab("Inventario", jPanel6);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jTable_Proveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTable_Proveedores);

        jPanel_prop1.setBackground(new java.awt.Color(255, 51, 51));

        jLbl_titulo3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLbl_titulo3.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_titulo3.setText("Apellido1");

        jLbl_editorial2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLbl_editorial2.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_editorial2.setText("Nombre2");

        jLbl_anio4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLbl_anio4.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_anio4.setText("Direccion");

        JlblDatos1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JlblDatos1.setForeground(new java.awt.Color(255, 255, 255));
        JlblDatos1.setText("Datos de Proveedor");

        jtxtproCedula.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxtproCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtproCedulaActionPerformed(evt);
            }
        });

        jtxtproApellido1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jtxtproApellido2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxtproApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtproApellido2ActionPerformed(evt);
            }
        });

        jLbl_titulo4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLbl_titulo4.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_titulo4.setText("Apellido 2");

        jLbl_editorial3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLbl_editorial3.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_editorial3.setText("Nombre1");

        jLbl_anio7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLbl_anio7.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_anio7.setText("RUC");

        jtxtproNombre2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxtproNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtproNombre2ActionPerformed(evt);
            }
        });

        Seguro1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Seguro1.setForeground(new java.awt.Color(255, 255, 255));
        Seguro1.setText("Telefono");

        jtxtproDireccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxtproDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtproDireccionActionPerformed(evt);
            }
        });

        jtxtproCorreo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxtproCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtproCorreoActionPerformed(evt);
            }
        });

        jLbl_anio9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLbl_anio9.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_anio9.setText("Correo");

        jtxtproTelefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxtproTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtproTelefonoActionPerformed(evt);
            }
        });

        jtxtproRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtproRucActionPerformed(evt);
            }
        });

        jLbl_titulo5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLbl_titulo5.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_titulo5.setText("Cedula");

        jtxtproNombre1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtxtproNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtproNombre1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_prop1Layout = new javax.swing.GroupLayout(jPanel_prop1);
        jPanel_prop1.setLayout(jPanel_prop1Layout);
        jPanel_prop1Layout.setHorizontalGroup(
            jPanel_prop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_prop1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_prop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_prop1Layout.createSequentialGroup()
                        .addGroup(jPanel_prop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbl_anio9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_anio7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel_prop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtproCorreo)
                            .addComponent(jtxtproRuc)))
                    .addGroup(jPanel_prop1Layout.createSequentialGroup()
                        .addGroup(jPanel_prop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbl_editorial3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_titulo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_prop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLbl_editorial2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLbl_titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLbl_titulo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_anio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Seguro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_prop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtproCedula, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxtproDireccion)
                            .addComponent(jtxtproApellido1)
                            .addComponent(jtxtproApellido2)
                            .addComponent(jtxtproNombre2)
                            .addComponent(jtxtproTelefono)
                            .addComponent(jtxtproNombre1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel_prop1Layout.createSequentialGroup()
                        .addComponent(JlblDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 204, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_prop1Layout.setVerticalGroup(
            jPanel_prop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_prop1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JlblDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_prop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLbl_titulo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtproCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_prop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtproApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbl_titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel_prop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtproApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbl_titulo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel_prop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtproNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbl_editorial3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_prop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbl_editorial2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtproNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_prop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtproDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbl_anio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_prop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtproTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Seguro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel_prop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtproCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbl_anio9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_prop1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtproRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbl_anio7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_prop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_prop1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneAdmin.addTab("Proveedores", jPanel5);

        label1.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Panel de administración");

        jPanel_buttons.setBackground(new java.awt.Color(51, 51, 51));

        Jbtn_actualizar.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        Jbtn_actualizar.setText("ACTUALIZAR");
        Jbtn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_actualizarActionPerformed(evt);
            }
        });

        Jbtn_guardar.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        Jbtn_guardar.setText("GUARDAR");
        Jbtn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_guardarActionPerformed(evt);
            }
        });

        Jbtn_eliminar.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        Jbtn_eliminar.setText("ELIMINAR");
        Jbtn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_eliminarActionPerformed(evt);
            }
        });

        Jbtn_nuevo.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        Jbtn_nuevo.setText(" LIMPIAR CAMPOS");
        Jbtn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_nuevoActionPerformed(evt);
            }
        });

        Jbtn_nuevo1.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        Jbtn_nuevo1.setText("REGRESAR");
        Jbtn_nuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_nuevo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_buttonsLayout = new javax.swing.GroupLayout(jPanel_buttons);
        jPanel_buttons.setLayout(jPanel_buttonsLayout);
        jPanel_buttonsLayout.setHorizontalGroup(
            jPanel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_buttonsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Jbtn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Jbtn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Jbtn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Jbtn_nuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Jbtn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel_buttonsLayout.setVerticalGroup(
            jPanel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_buttonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jbtn_nuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel_buttons, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTabbedPaneAdmin)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFrtLiteralBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFrtLiteralBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrtLiteralBActionPerformed

    private void jFrtLiteralCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFrtLiteralCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrtLiteralCActionPerformed

    private void jFrtLiteralAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFrtLiteralAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrtLiteralAActionPerformed

    private void Jbtn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_guardarActionPerformed
 
        int indexSelect = jTabbedPaneAdmin.getSelectedIndex();
        switch(indexSelect){
            case 0:
                con.InsertarEmpleado(jtxtempLoggin,cbxIdEmpleado, jtxtempCedula, jtxtempApellido1,
                        jtxtempApellido2, jtxtempNombre1, jtxtempNombre2, jtxtempDireccion,
                        jtxtempTelefono, jtxtempCorreo, jtxtempSeguro, jtxtempCargo); 
                
                con.LeerClientes("empleados", jTable_Clientes);
            case 1:
                con.InsertarCliente(jtxtcliCedula, jtxtcliApellido1, jtxtcliApellido2,
                        jtxtcliNombre1, jtxtcliNombre2,jtxtcliDireccion,jtxtcliTelefono,
                        jtxtcliCorreo);
                con.LeerClientes("clientes", jTable_Clientes);
        }
    }//GEN-LAST:event_Jbtn_guardarActionPerformed

    private void Jbtn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_actualizarActionPerformed
        // TODO add your handling code here:
        
        
        int indexSelect = jTabbedPaneAdmin.getSelectedIndex();
        switch(indexSelect){
            case 0:
                String idempleado = jTable_Empleados.getValueAt(jTable_Empleados.getSelectedRow(), 0).toString();
                con.ActualizarEmpleado(jtxtempLoggin, jtxtempCedula,jtxtempApellido1,jtxtempApellido2,
                        jtxtempNombre1,jtxtempNombre2,jtxtempDireccion,jtxtempTelefono,jtxtempCorreo,
                        jtxtempSeguro,jtxtempCargo,idempleado);
                con.LeerEmpleados("empleados", jTable_Empleados);
            case 1:
                String idcliente = jTable_Clientes.getValueAt(jTable_Clientes.getSelectedRow(), 0).toString();
                con.ActualizarCliente(jtxtcliCedula, jtxtcliApellido1, jtxtcliApellido2, jtxtcliNombre1,
                        jtxtcliNombre2,jtxtcliDireccion,jtxtcliTelefono,jtxtcliCorreo, idcliente);
                con.LeerClientes("clientes", jTable_Clientes);
            case 2:
                String idproducto = jTable_Productos.getValueAt(jTable_Productos.getSelectedRow(), 0).toString();
                con.ActualizarProducto(jtxtprodNombre, jtxtprodPrecio,jtxtprodSabor,jtxtprodPorcentaje,idproducto);
                con.LeerProductos("productos", jTable_Productos);
            case 3:
                String idinventario = jTable_Inventario.getValueAt(jTable_Inventario.getSelectedRow(), 0).toString();
                con.ActualizarInventario(jtxtinvStock, jtxtinvFecha,idinventario);
                con.LeerInventario("inventario", jTable_Inventario);
            case 4:    
                String idproveedor = jTable_Proveedores.getValueAt(jTable_Proveedores.getSelectedRow(), 0).toString();
                con.ActualizarProveedor(jtxtproCedula, jtxtproApellido1, jtxtproApellido2, jtxtproNombre1,
                        jtxtproNombre2,jtxtproDireccion,jtxtproTelefono,jtxtproCorreo,jtxtproRuc, idproveedor);
                con.LeerProveedores("proveedores", jTable_Proveedores);
        }

    }//GEN-LAST:event_Jbtn_actualizarActionPerformed

    private void Jbtn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_eliminarActionPerformed
        // TODO add your handling code here:
        
        int indexSelect = jTabbedPaneAdmin.getSelectedIndex();
        switch(indexSelect){
            case 0:
                String id = jTable_Empleados.getValueAt(jTable_Empleados.getSelectedRow(), 0).toString();
                con.EliminaRegistro("idempleado", "empleados", id);
                con.LeerEmpleados("empleados", jTable_Empleados);
            case 1:
                String idcliente = jTable_Clientes.getValueAt(jTable_Clientes.getSelectedRow(), 0).toString();
                con.EliminaRegistro("idcliente", "clientes", idcliente);
                con.LeerClientes("clientes", jTable_Clientes);
            case 2:
                String idproducto = jTable_Productos.getValueAt(jTable_Productos.getSelectedRow(), 0).toString();
                con.EliminaRegistro("idproducto", "productos", idproducto);
                con.LeerProductos("productos", jTable_Productos);
            case 3:
                String idinventario = jTable_Inventario.getValueAt(jTable_Inventario.getSelectedRow(), 0).toString();
                con.EliminaRegistro("idinventario", "inventario", idinventario);
                con.LeerInventario("inventario", jTable_Inventario);    
            case 4:
                String idproveedor = jTable_Proveedores.getValueAt(jTable_Proveedores.getSelectedRow(), 0).toString();
                con.EliminaRegistro("idproveedor", "proveedores", idproveedor);
                con.LeerProveedores("provedores", jTable_Proveedores);    
        }
    }//GEN-LAST:event_Jbtn_eliminarActionPerformed

    private void Jbtn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_nuevoActionPerformed
        // TODO add your handling code here:
        jtxtempLoggin.setText("");
        jtxtempCedula.setText("");
        jtxtempApellido1.setText("");
        jtxtempApellido2.setText("");
        jtxtempNombre1.setText("");
        jtxtempNombre2.setText("");
        jtxtempDireccion.setText("");
        jtxtempTelefono.setText("");
        jtxtempCorreo.setText("");
        jtxtempSeguro.setText("");
        jtxtempCargo.setText("");
        
        jtxtcliCedula.setText("");
        jtxtcliApellido1.setText("");
        jtxtcliApellido2.setText("");
        jtxtcliNombre1.setText("");
        jtxtcliNombre2.setText("");
        jtxtcliDireccion.setText("");
        jtxtcliTelefono.setText("");
        jtxtcliCorreo.setText("");
        
        jtxtprodNombre.setText("");
        jtxtprodSabor.setText("");
        jtxtprodPorcentaje.setText("");
  
        jtxtinvStock.setText("");
        jtxtinvFecha.setText("");
        
        jtxtproCedula.setText("");
        jtxtproApellido1.setText("");
        jtxtproApellido2.setText("");
        jtxtproNombre1.setText("");
        jtxtproNombre2.setText("");
        jtxtproDireccion.setText("");
        jtxtproTelefono.setText("");
        jtxtproCorreo.setText("");
       
        
    }//GEN-LAST:event_Jbtn_nuevoActionPerformed

    private void jtxtempCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtempCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtempCorreoActionPerformed

    private void jtxtempDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtempDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtempDireccionActionPerformed

    private void jtxtempTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtempTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtempTelefonoActionPerformed

    private void jtxtempNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtempNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtempNombre2ActionPerformed

    private void jtxtempNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtempNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtempNombre1ActionPerformed

    private void jtxtempApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtempApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtempApellido1ActionPerformed

    private void jtxtempLogginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtempLogginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtempLogginActionPerformed

    private void jtxtempApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtempApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtempApellido2ActionPerformed

    private void Jbtn_nuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_nuevo1ActionPerformed
      controlador.closePanelAdmin();
      controlador.showLoggin();
    }//GEN-LAST:event_Jbtn_nuevo1ActionPerformed

    private void jtxtprodNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtprodNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtprodNombreActionPerformed

    private void jtxtproCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtproCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtproCedulaActionPerformed

    private void jtxtproApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtproApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtproApellido2ActionPerformed

    private void jtxtproNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtproNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtproNombre2ActionPerformed

    private void jtxtproDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtproDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtproDireccionActionPerformed

    private void jtxtproCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtproCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtproCorreoActionPerformed

    private void jtxtproTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtproTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtproTelefonoActionPerformed

    private void jtxtproRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtproRucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtproRucActionPerformed

    private void jtxtproNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtproNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtproNombre1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(PanelAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new PanelAdmin().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_actualizar;
    private javax.swing.JButton Jbtn_eliminar;
    private javax.swing.JButton Jbtn_guardar;
    private java.awt.Button Jbtn_guardar2;
    private javax.swing.JButton Jbtn_nuevo;
    private javax.swing.JButton Jbtn_nuevo1;
    private java.awt.Label JlblDatos;
    private java.awt.Label JlblDatos1;
    private java.awt.Label Seguro;
    private java.awt.Label Seguro1;
    private javax.swing.JSeparator Separator;
    private javax.swing.JComboBox<String> cbxIdEmpleado;
    private javax.swing.JFormattedTextField jFrtLiteralA;
    private javax.swing.JFormattedTextField jFrtLiteralB;
    private javax.swing.JFormattedTextField jFrtLiteralC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLblCiudad;
    private javax.swing.JLabel jLblCiudad5;
    private javax.swing.JLabel jLblCorreo;
    private javax.swing.JLabel jLblCorreo1;
    private javax.swing.JLabel jLblCorreo2;
    private javax.swing.JLabel jLblCorreo3;
    private javax.swing.JLabel jLblDireccion;
    private javax.swing.JLabel jLblDireccion5;
    private javax.swing.JLabel jLblDireccion6;
    private javax.swing.JLabel jLblLiteralA;
    private javax.swing.JLabel jLblLiteralB;
    private javax.swing.JLabel jLblLiteralC;
    private javax.swing.JLabel jLblNombre;
    private javax.swing.JLabel jLblNombre5;
    private javax.swing.JLabel jLblNombre6;
    private javax.swing.JLabel jLblTelefono;
    private javax.swing.JLabel jLblTelefono5;
    private javax.swing.JLabel jLblX1;
    private javax.swing.JLabel jLblX2;
    private java.awt.Label jLbl_anio;
    private java.awt.Label jLbl_anio1;
    private java.awt.Label jLbl_anio2;
    private java.awt.Label jLbl_anio3;
    private java.awt.Label jLbl_anio4;
    private java.awt.Label jLbl_anio5;
    private java.awt.Label jLbl_anio7;
    private java.awt.Label jLbl_anio9;
    private java.awt.Label jLbl_editorial;
    private java.awt.Label jLbl_editorial1;
    private java.awt.Label jLbl_editorial2;
    private java.awt.Label jLbl_editorial3;
    private java.awt.Label jLbl_titulo;
    private java.awt.Label jLbl_titulo1;
    private java.awt.Label jLbl_titulo2;
    private java.awt.Label jLbl_titulo3;
    private java.awt.Label jLbl_titulo4;
    private java.awt.Label jLbl_titulo5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelDatosUsuario;
    private javax.swing.JPanel jPanelDatosUsuario5;
    private javax.swing.JPanel jPanelDatosUsuario6;
    private javax.swing.JPanel jPanel_buttons;
    private javax.swing.JPanel jPanel_prop;
    private javax.swing.JPanel jPanel_prop1;
    private javax.swing.JPanel jPnlFormulaGeneral;
    private javax.swing.JPanel jPnlMiFormula;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPaneAdmin;
    private javax.swing.JTable jTable_Clientes;
    private javax.swing.JTable jTable_Empleados;
    private javax.swing.JTable jTable_Inventario;
    private javax.swing.JTable jTable_Productos;
    private javax.swing.JTable jTable_Proveedores;
    private javax.swing.JTabbedPane jTbdFormulas;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField jTxtNombre2;
    private java.awt.TextField jTxtTitulo2;
    private javax.swing.JTextField jtxtcliApellido1;
    private javax.swing.JTextField jtxtcliApellido2;
    private javax.swing.JTextField jtxtcliCedula;
    private javax.swing.JTextField jtxtcliCorreo;
    private javax.swing.JTextField jtxtcliDireccion;
    private javax.swing.JTextField jtxtcliNombre1;
    private javax.swing.JTextField jtxtcliNombre2;
    private javax.swing.JTextField jtxtcliTelefono;
    private javax.swing.JTextField jtxtempApellido1;
    private javax.swing.JTextField jtxtempApellido2;
    private javax.swing.JTextField jtxtempCargo;
    private javax.swing.JTextField jtxtempCedula;
    private javax.swing.JTextField jtxtempCorreo;
    private javax.swing.JTextField jtxtempDireccion;
    private javax.swing.JTextField jtxtempLoggin;
    private javax.swing.JTextField jtxtempNombre1;
    private javax.swing.JTextField jtxtempNombre2;
    private javax.swing.JTextField jtxtempSeguro;
    private javax.swing.JTextField jtxtempTelefono;
    private javax.swing.JTextField jtxtinvFecha;
    private javax.swing.JTextField jtxtinvStock;
    private javax.swing.JTextField jtxtproApellido1;
    private javax.swing.JTextField jtxtproApellido2;
    private javax.swing.JTextField jtxtproCedula;
    private javax.swing.JTextField jtxtproCorreo;
    private javax.swing.JTextField jtxtproDireccion;
    private javax.swing.JTextField jtxtproNombre1;
    private javax.swing.JTextField jtxtproNombre2;
    private javax.swing.JTextField jtxtproRuc;
    private javax.swing.JTextField jtxtproTelefono;
    private javax.swing.JTextField jtxtprodNombre;
    private javax.swing.JTextField jtxtprodPorcentaje;
    private javax.swing.JTextField jtxtprodPrecio;
    private javax.swing.JTextField jtxtprodSabor;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
