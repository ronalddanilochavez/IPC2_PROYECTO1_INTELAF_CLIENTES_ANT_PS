/*
Ronald Danilo Chávez Calderón
200130586
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.*;
import java.time.temporal.*;
import java.time.*;

public class MainFrameCustomers extends javax.swing.JFrame {
    
    //Global connection
    Connection connection;
    
    ArrayList<Order> orders = new ArrayList<>();
    ArrayList<OrderReceived> ordersReceived = new ArrayList<>();
    ArrayList<Product> products = new ArrayList<>();
    
    ArrayList<String> sold = new ArrayList<>();
    ArrayList<Product> notSold = new ArrayList<>();
    
    ArrayList<String> textLines = new ArrayList<>();

    public MainFrameCustomers() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneMain = new javax.swing.JTabbedPane();
        jPanelInfo = new javax.swing.JPanel();
        jButtonInfoData = new javax.swing.JPanel();
        jLabelInfoLocalhost = new javax.swing.JLabel();
        jTextFieldInfoLocalhost = new javax.swing.JTextField();
        jLabelInfoUser = new javax.swing.JLabel();
        jTextFieldInfoUser = new javax.swing.JTextField();
        jLabelInfoPassword = new javax.swing.JLabel();
        jPasswordFieldInfoPassword = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaListados = new javax.swing.JTextArea();
        jButtonInfoConnect = new javax.swing.JButton();
        jLabelInfoCode = new javax.swing.JLabel();
        jTextFieldInfoCode = new javax.swing.JTextField();
        jLabelInfoName = new javax.swing.JLabel();
        jTextFieldInfoName = new javax.swing.JTextField();
        jLabelInfoMaker = new javax.swing.JLabel();
        jTextFieldInfoMaker = new javax.swing.JTextField();
        jLabelInfoSortUpDown = new javax.swing.JLabel();
        jComboBoxSortUpDown = new javax.swing.JComboBox<>();
        jLabelInfoSortCategory = new javax.swing.JLabel();
        jComboBoxSortCategory = new javax.swing.JComboBox<>();
        jButtonSearch = new javax.swing.JButton();
        jPanelIntro = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaOrders = new javax.swing.JTextArea();
        jLabelOrderCode = new javax.swing.JLabel();
        jTextFieldOrderCode = new javax.swing.JTextField();
        jButtonOrderSearch = new javax.swing.JButton();
        jLabelOrderActualDate = new javax.swing.JLabel();
        jComboBoxOrderDate1 = new javax.swing.JComboBox<>();
        jComboBoxOrderDate2 = new javax.swing.JComboBox<>();
        jComboBoxOrderDate3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INTELAF CLIENTES - 200130586_Ronald Danilo Chávez");
        setResizable(false);

        jLabelInfoLocalhost.setText("Host");

        jTextFieldInfoLocalhost.setText("jdbc:mysql://localhost:3306");

        jLabelInfoUser.setText("Usuario");

        jTextFieldInfoUser.setText("root");

        jLabelInfoPassword.setText("Contraseña");

        jTextAreaListados.setEditable(false);
        jTextAreaListados.setColumns(20);
        jTextAreaListados.setRows(5);
        jScrollPane1.setViewportView(jTextAreaListados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
        );

        jButtonInfoConnect.setText("CONECTARSE CON LA BASE DE DATOS");
        jButtonInfoConnect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonInfoConnectMouseClicked(evt);
            }
        });

        jLabelInfoCode.setText("Código del Producto");

        jLabelInfoName.setText("Nombre del Producto");

        jLabelInfoMaker.setText("Fabricante del Producto");

        jLabelInfoSortUpDown.setText("Ordenar Ascendente o Descendente");

        jComboBoxSortUpDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascendente", "Descendente" }));

        jLabelInfoSortCategory.setText("Ordenar por Categoría");

        jComboBoxSortCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Fabricante", "Codigo", "Cantidad", "Precio" }));

        jButtonSearch.setText("Buscar");
        jButtonSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSearchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jButtonInfoDataLayout = new javax.swing.GroupLayout(jButtonInfoData);
        jButtonInfoData.setLayout(jButtonInfoDataLayout);
        jButtonInfoDataLayout.setHorizontalGroup(
            jButtonInfoDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonInfoDataLayout.createSequentialGroup()
                .addGroup(jButtonInfoDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jButtonInfoDataLayout.createSequentialGroup()
                        .addGroup(jButtonInfoDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInfoLocalhost, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldInfoLocalhost, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jButtonInfoDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldInfoUser)
                            .addGroup(jButtonInfoDataLayout.createSequentialGroup()
                                .addComponent(jLabelInfoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 98, Short.MAX_VALUE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonInfoConnect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jButtonInfoDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jButtonInfoDataLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jButtonInfoDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jButtonInfoDataLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPasswordFieldInfoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jButtonInfoDataLayout.createSequentialGroup()
                                .addComponent(jLabelInfoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jButtonInfoDataLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabelInfoCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jButtonInfoDataLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jButtonInfoDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldInfoName, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldInfoCode, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldInfoMaker, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jButtonInfoDataLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jButtonInfoDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelInfoName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelInfoMaker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelInfoSortUpDown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jButtonInfoDataLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jButtonInfoDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jButtonInfoDataLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabelInfoSortCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jButtonInfoDataLayout.createSequentialGroup()
                                .addGroup(jButtonInfoDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxSortCategory, 0, 328, Short.MAX_VALUE)
                                    .addComponent(jComboBoxSortUpDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jButtonInfoDataLayout.setVerticalGroup(
            jButtonInfoDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jButtonInfoDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jButtonInfoDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInfoUser)
                    .addComponent(jLabelInfoPassword)
                    .addComponent(jLabelInfoLocalhost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jButtonInfoDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldInfoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInfoLocalhost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldInfoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonInfoConnect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jButtonInfoDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jButtonInfoDataLayout.createSequentialGroup()
                        .addComponent(jLabelInfoCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldInfoCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelInfoName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldInfoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelInfoMaker)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldInfoMaker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelInfoSortUpDown)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxSortUpDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelInfoSortCategory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxSortCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSearch)))
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(jPanelInfo);
        jPanelInfo.setLayout(jPanelInfoLayout);
        jPanelInfoLayout.setHorizontalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonInfoData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelInfoLayout.setVerticalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonInfoData, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneMain.addTab("Catálogo de Productos", jPanelInfo);

        jTextAreaOrders.setEditable(false);
        jTextAreaOrders.setColumns(20);
        jTextAreaOrders.setRows(5);
        jScrollPane2.setViewportView(jTextAreaOrders);

        jLabelOrderCode.setText("Código del Pedido");

        jButtonOrderSearch.setText("Buscar");
        jButtonOrderSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonOrderSearchMouseClicked(evt);
            }
        });

        jLabelOrderActualDate.setText("Fecha de hoy (día, mes,año)");

        jComboBoxOrderDate1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBoxOrderDate2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jComboBoxOrderDate3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));

        javax.swing.GroupLayout jPanelIntroLayout = new javax.swing.GroupLayout(jPanelIntro);
        jPanelIntro.setLayout(jPanelIntroLayout);
        jPanelIntroLayout.setHorizontalGroup(
            jPanelIntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelIntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOrderCode, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(jTextFieldOrderCode)
                    .addComponent(jButtonOrderSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelIntroLayout.createSequentialGroup()
                        .addGroup(jPanelIntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelOrderActualDate, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelIntroLayout.createSequentialGroup()
                                .addComponent(jComboBoxOrderDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxOrderDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxOrderDate3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelIntroLayout.setVerticalGroup(
            jPanelIntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelIntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelIntroLayout.createSequentialGroup()
                        .addComponent(jLabelOrderCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldOrderCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelOrderActualDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelIntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxOrderDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxOrderDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxOrderDate3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonOrderSearch)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPaneMain.addTab("Rastreo de Pedidos", jPanelIntro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneMain)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneMain)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /***
     * To connect to the mySQL server
     * @param evt 
     */
    
    private void jButtonInfoConnectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInfoConnectMouseClicked
        try {
            jTextAreaListados.setText("");
            jTextAreaListados.append("\nConectando con la base de datos, por favor espere un momento");            

            // To find the password converted to String
            String myPassword = "";
            char[] myPasswordArray = jPasswordFieldInfoPassword.getPassword();
            for (int i = 0; i < myPasswordArray.length; i++) {
                myPassword += myPasswordArray[i];
            }

            // creating our mysql database connection
            String myDriver = "com.mysql.cj.jdbc.Driver";
            // it appears it is not necessary this "jdbc:mysql://localhost/mysql"
            // it is recommended "jdbc:mysql://localhost:3306"
            //String myUrl = "jdbc:mysql://localhost:3306";
            Class.forName(myDriver);
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "123456789");
            connection = DriverManager.getConnection(jTextFieldInfoLocalhost.getText(),jTextFieldInfoUser.getText(),myPassword);
            System.out.println("CONNECTION ESTABLISHED!");

            Statement st = connection.createStatement();

            jTextAreaListados.append("\nCONEXIÓN ESTABLECIDA CON LA BASE DE DATOS");
            System.out.println("DATABASE CREATED");
            
            st.close();
        }
        catch (Exception e){
            System.err.println("Exception!");
            System.err.println(e.getMessage());
            jTextAreaListados.append("\nPor favor ingrese correctamente la información del servidor");
        }
    }//GEN-LAST:event_jButtonInfoConnectMouseClicked

    /***
     * To search the available products
     * @param evt 
     */
    
    private void jButtonSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSearchMouseClicked
        try {
            // We clear the arrays
            clearDatabaseArrays();           
            
            /*
            // create the java statement
            Statement st = connection.createStatement();
            
            // To select by code, name or makeer
            String property = "";
            String byCode = "";
            String byName = "";
            String byMaker = "";
            
            if ( jTextFieldInfoCode.getText().isBlank() || jTextFieldInfoCode.getText().isEmpty() ) {
                if ( jTextFieldInfoName.getText().isBlank() || jTextFieldInfoName.getText().isEmpty() ) {
                    if ( jTextFieldInfoMaker.getText().isBlank() || jTextFieldInfoMaker.getText().isEmpty() ) {
                        property = "";
                    }
                    else {
                        property = "WHERE `maker` LIKE '%" + jTextFieldInfoMaker.getText() + "%'";
                    }
                }
                else {
                    if ( jTextFieldInfoMaker.getText().isBlank() || jTextFieldInfoMaker.getText().isEmpty() ) {
                        property = "WHERE `name` LIKE '%" + jTextFieldInfoName.getText() + "%'";
                    }
                    else {
                        property = "WHERE `name` LIKE '%" + jTextFieldInfoName.getText() + "%' AND `maker` LIKE '%" + jTextFieldInfoMaker.getText() + "%'";
                    }                    
                }
            }
            else {
                if ( jTextFieldInfoName.getText().isBlank() || jTextFieldInfoName.getText().isEmpty() ) {
                    if ( jTextFieldInfoMaker.getText().isBlank() || jTextFieldInfoMaker.getText().isEmpty() ) {
                        property = "WHERE `code` LIKE '%" + jTextFieldInfoCode.getText() + "%'";
                    }
                    else {
                        property = "WHERE `code` LIKE '%" + jTextFieldInfoCode.getText() + "%' AND `maker` LIKE '%" + jTextFieldInfoMaker.getText() + "%'";
                    }
                }
                else {
                    if ( jTextFieldInfoMaker.getText().isBlank() || jTextFieldInfoMaker.getText().isEmpty() ) {
                        property = "WHERE `code` LIKE '%" + jTextFieldInfoCode.getText() + "%' AND `name` LIKE '%" + jTextFieldInfoName.getText() + "%'";
                    }
                    else {
                        property = "WHERE `code` LIKE '%" + jTextFieldInfoCode.getText() + "%' AND `name` LIKE '%" + jTextFieldInfoName.getText() + "%' AND `maker` LIKE '%" + jTextFieldInfoMaker.getText() + "%'";
                    }
                }
            }
            
            if ( jTextFieldInfoCode.getText().isBlank() ) {
                byCode = "";
            }
            else {
                byCode = "";
            }
            
            // To sort by UpDown or Category
            String orderUpDown = "";
            String orderCategory = "";
            if ( jComboBoxSortUpDown.getSelectedItem().toString().equalsIgnoreCase("Ascendente") ) {
                orderUpDown = "ASC";
            }
            else {
                orderUpDown = "DESC";
            }
            
            if ( jComboBoxSortCategory.getSelectedItem().toString().equalsIgnoreCase("Nombre") ) {
                orderCategory = "name";
            }            
            else if ( jComboBoxSortCategory.getSelectedItem().toString().equalsIgnoreCase("Fabricante") ) {
                orderCategory = "maker";
            }
            else if ( jComboBoxSortCategory.getSelectedItem().toString().equalsIgnoreCase("Codigo") ) {
                orderCategory = "code";
            }
            else if ( jComboBoxSortCategory.getSelectedItem().toString().equalsIgnoreCase("Cantidad") ) {
                orderCategory = "quantity";
            }
            else if ( jComboBoxSortCategory.getSelectedItem().toString().equalsIgnoreCase("Precio") ) {
                orderCategory = "price";
            }            

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery("SELECT * FROM `200130586_ipc2_proyecto1`.`product` " + property + " ORDER BY `" + orderCategory + "` " + orderUpDown + ";");
            
            // iterate through the java resultset
            while (rs.next())
            {   
                Product product = new Product();
                
                String name = rs.getString("name");   
                String maker = rs.getString("maker");
                String code = rs.getString("code");
                String quantity = rs.getString("quantity");
                String price = rs.getString("price");
                String store = rs.getString("store");
                String description = rs.getString("description");
                String warranty = rs.getString("warranty");
                
                product.name = name;
                product.maker = maker;
                product.code = code;
                product.quantity = quantity;
                product.price = price;
                product.store = store;
                product.description = description;
                product.warranty = warranty;
                
                products.add(product);
                
                product = null;

                // print the results
                System.out.format("%s, %s, %s, %s, %s, %s, %s\n", name, maker, code, quantity, price, store, description, warranty);
            }
            
            st.close();
            */
            
            // create the java statement
            Statement st = connection.createStatement();
            
            // To sort by UpDown or Category                      
            if ( jComboBoxSortUpDown.getSelectedItem().toString().equalsIgnoreCase("Ascendente") ) {
                PreparedStatement ps = connection.prepareStatement("USE `200130586_ipc2_proyecto1`;");

                if ( jComboBoxSortCategory.getSelectedItem().toString().equalsIgnoreCase("Nombre") ) {
                    ps = connection.prepareStatement("SELECT * FROM `200130586_ipc2_proyecto1`.`product` WHERE `code` LIKE ? AND `name` LIKE ? AND `maker` LIKE ? ORDER BY `name` ASC;");
                    ps.setString(1, "%" + jTextFieldInfoCode.getText() + "%");
                    ps.setString(2, "%" + jTextFieldInfoName.getText() + "%");
                    ps.setString(3, "%" + jTextFieldInfoMaker.getText() + "%");
                }            
                else if ( jComboBoxSortCategory.getSelectedItem().toString().equalsIgnoreCase("Fabricante") ) {
                    ps = connection.prepareStatement("SELECT * FROM `200130586_ipc2_proyecto1`.`product` WHERE `code` LIKE ? AND `name` LIKE ? AND `maker` LIKE ? ORDER BY `maker` ASC;");
                    ps.setString(1, "%" + jTextFieldInfoCode.getText() + "%");
                    ps.setString(2, "%" + jTextFieldInfoName.getText() + "%");
                    ps.setString(3, "%" + jTextFieldInfoMaker.getText() + "%");
                }
                else if ( jComboBoxSortCategory.getSelectedItem().toString().equalsIgnoreCase("Codigo") ) {
                    ps = connection.prepareStatement("SELECT * FROM `200130586_ipc2_proyecto1`.`product` WHERE `code` LIKE ? AND `name` LIKE ? AND `maker` LIKE ? ORDER BY `code` ASC;");
                    ps.setString(1, "%" + jTextFieldInfoCode.getText() + "%");
                    ps.setString(2, "%" + jTextFieldInfoName.getText() + "%");
                    ps.setString(3, "%" + jTextFieldInfoMaker.getText() + "%");
                }
                else if ( jComboBoxSortCategory.getSelectedItem().toString().equalsIgnoreCase("Cantidad") ) {
                    ps = connection.prepareStatement("SELECT * FROM `200130586_ipc2_proyecto1`.`product` WHERE `code` LIKE ? AND `name` LIKE ? AND `maker` LIKE ? ORDER BY `quantity` ASC;");
                    ps.setString(1, "%" + jTextFieldInfoCode.getText() + "%");
                    ps.setString(2, "%" + jTextFieldInfoName.getText() + "%");
                    ps.setString(3, "%" + jTextFieldInfoMaker.getText() + "%");
                }
                else if ( jComboBoxSortCategory.getSelectedItem().toString().equalsIgnoreCase("Precio") ) {
                    ps = connection.prepareStatement("SELECT * FROM `200130586_ipc2_proyecto1`.`product` WHERE `code` LIKE ? AND `name` LIKE ? AND `maker` LIKE ? ORDER BY `price` ASC;");
                    ps.setString(1, "%" + jTextFieldInfoCode.getText() + "%");
                    ps.setString(2, "%" + jTextFieldInfoName.getText() + "%");
                    ps.setString(3, "%" + jTextFieldInfoMaker.getText() + "%");
                } 
                
                ResultSet rs = ps.executeQuery();;

                // iterate through the java resultset
                while (rs.next())
                {   
                    Product product = new Product();

                    String name = rs.getString("name");   
                    String maker = rs.getString("maker");
                    String code = rs.getString("code");
                    String quantity = rs.getString("quantity");
                    String price = rs.getString("price");
                    String store = rs.getString("store");
                    String description = rs.getString("description");
                    String warranty = rs.getString("warranty");

                    product.name = name;
                    product.maker = maker;
                    product.code = code;
                    product.quantity = quantity;
                    product.price = price;
                    product.store = store;
                    product.description = description;
                    product.warranty = warranty;

                    products.add(product);

                    product = null;

                    // print the results
                    System.out.format("%s, %s, %s, %s, %s, %s, %s\n", name, maker, code, quantity, price, store, description, warranty);
                }

                ps.close();  
            }
            else {
                PreparedStatement ps = connection.prepareStatement("USE `200130586_ipc2_proyecto1`;");

                if ( jComboBoxSortCategory.getSelectedItem().toString().equalsIgnoreCase("Nombre") ) {
                    ps = connection.prepareStatement("SELECT * FROM `200130586_ipc2_proyecto1`.`product` WHERE `code` LIKE ? AND `name` LIKE ? AND `maker` LIKE ? ORDER BY `name` DESC;");
                    ps.setString(1, "%" + jTextFieldInfoCode.getText() + "%");
                    ps.setString(2, "%" + jTextFieldInfoName.getText() + "%");
                    ps.setString(3, "%" + jTextFieldInfoMaker.getText() + "%");
                }            
                else if ( jComboBoxSortCategory.getSelectedItem().toString().equalsIgnoreCase("Fabricante") ) {
                    ps = connection.prepareStatement("SELECT * FROM `200130586_ipc2_proyecto1`.`product` WHERE `code` LIKE ? AND `name` LIKE ? AND `maker` LIKE ? ORDER BY `maker` DESC;");
                    ps.setString(1, "%" + jTextFieldInfoCode.getText() + "%");
                    ps.setString(2, "%" + jTextFieldInfoName.getText() + "%");
                    ps.setString(3, "%" + jTextFieldInfoMaker.getText() + "%");
                }
                else if ( jComboBoxSortCategory.getSelectedItem().toString().equalsIgnoreCase("Codigo") ) {
                    ps = connection.prepareStatement("SELECT * FROM `200130586_ipc2_proyecto1`.`product` WHERE `code` LIKE ? AND `name` LIKE ? AND `maker` LIKE ? ORDER BY `code` DESC;");
                    ps.setString(1, "%" + jTextFieldInfoCode.getText() + "%");
                    ps.setString(2, "%" + jTextFieldInfoName.getText() + "%");
                    ps.setString(3, "%" + jTextFieldInfoMaker.getText() + "%");
                }
                else if ( jComboBoxSortCategory.getSelectedItem().toString().equalsIgnoreCase("Cantidad") ) {
                    ps = connection.prepareStatement("SELECT * FROM `200130586_ipc2_proyecto1`.`product` WHERE `code` LIKE ? AND `name` LIKE ? AND `maker` LIKE ? ORDER BY `quantity` DESC;");
                    ps.setString(1, "%" + jTextFieldInfoCode.getText() + "%");
                    ps.setString(2, "%" + jTextFieldInfoName.getText() + "%");
                    ps.setString(3, "%" + jTextFieldInfoMaker.getText() + "%");
                }
                else if ( jComboBoxSortCategory.getSelectedItem().toString().equalsIgnoreCase("Precio") ) {
                    ps = connection.prepareStatement("SELECT * FROM `200130586_ipc2_proyecto1`.`product` WHERE `code` LIKE ? AND `name` LIKE ? AND `maker` LIKE ? ORDER BY `price` DESC;");
                    ps.setString(1, "%" + jTextFieldInfoCode.getText() + "%");
                    ps.setString(2, "%" + jTextFieldInfoName.getText() + "%");
                    ps.setString(3, "%" + jTextFieldInfoMaker.getText() + "%");
                }
                
                ResultSet rs = ps.executeQuery();

                // iterate through the java resultset
                while (rs.next())
                {   
                    Product product = new Product();

                    String name = rs.getString("name");   
                    String maker = rs.getString("maker");
                    String code = rs.getString("code");
                    String quantity = rs.getString("quantity");
                    String price = rs.getString("price");
                    String store = rs.getString("store");
                    String description = rs.getString("description");
                    String warranty = rs.getString("warranty");

                    product.name = name;
                    product.maker = maker;
                    product.code = code;
                    product.quantity = quantity;
                    product.price = price;
                    product.store = store;
                    product.description = description;
                    product.warranty = warranty;

                    products.add(product);

                    product = null;

                    // print the results
                    System.out.format("%s, %s, %s, %s, %s, %s, %s\n", name, maker, code, quantity, price, store, description, warranty);
                }

                ps.close();              
            }
            
            // Prints orders we are waiting for
            printOnScreen("PRODUCTOS DISPONIBLES", true, false, false);
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_jButtonSearchMouseClicked

    /***
     * To search orders in process
     * @param evt 
     */
    
    private void jButtonOrderSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOrderSearchMouseClicked
        try {
            // We clear the arrays
            clearDatabaseArrays();           
            
            // create the java statement
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM `200130586_ipc2_proyecto1`.`order` WHERE `code` LIKE ? ORDER BY `code`;");    
            ps.setString(1, "%" + jTextFieldOrderCode.getText() + "%");

            ResultSet rs = ps.executeQuery();
            
            // iterate through the java resultset
            while (rs.next())
            {   
                Order order = new Order();
                
                String code = rs.getString("code");   
                String store1 = rs.getString("store1");
                String store2 = rs.getString("store2");
                String date = rs.getString("date");
                String customer = rs.getString("customer");
                String product = rs.getString("product");
                String quantity = rs.getString("quantity");
                String payment = rs.getString("payment");
                String advance = rs.getString("advance");
                String creditUsed = rs.getString("creditused");
                String remainingDays;
                
                order.code = code;
                order.store1 = store1;
                order.store2 = store2;
                order.date = date;
                order.customer = customer;
                order.product = product;
                order.quantity = quantity;
                order.payment = payment;
                order.advance = advance;
                order.creditUsed = creditUsed;
                
                // To calculate the time difference
                // execute the query, and get a java resultset
                PreparedStatement ps1 = connection.prepareStatement("SELECT DATEDIFF(?,(SELECT `date` FROM `200130586_ipc2_proyecto1`.`order` WHERE `200130586_ipc2_proyecto1`.`order`.`code` = ?));"); 
                ps1.setString(1, jComboBoxOrderDate3.getSelectedItem().toString() + "-" + jComboBoxOrderDate2.getSelectedItem().toString() + "-" + jComboBoxOrderDate1.getSelectedItem().toString());
                ps1.setString(2, order.code);
                
                ResultSet rs1 = ps1.executeQuery();
                
                int timeDifference = 0;
                while ( rs1.next() ) {
                    //order.remainingDays = rs1.getString(1);
                    timeDifference = Integer.parseInt(rs1.getString(1));
                }
                                
                ps1 = connection.prepareStatement("SELECT `time` FROM `200130586_ipc2_proyecto1`.`time` WHERE `store1` = ? AND `store2` = ?;");
                ps1.setString(1, order.store1);
                ps1.setString(2, order.store2);
                
                rs1 = ps1.executeQuery();
                
                int timeStores = 0;
                while (rs1.next()) {
                    timeStores = Integer.parseInt(rs1.getString("time"));
                }
                order.remainingDays = String.valueOf(timeStores - timeDifference);
                
                ps1.close();
                
                orders.add(order);
                
                order = null;

                // print the results
                System.out.format("%s, %s, %s, %s, %s, %s, %s\n", code, store1, store2, date, customer, product, quantity, payment, advance);
            }
            
            //*********************************************************
            ps = connection.prepareStatement("SELECT * FROM `200130586_ipc2_proyecto1`.`orderreceived` WHERE `code` LIKE ? ORDER BY `code`;");
            ps.setString(1, "%" + jTextFieldOrderCode.getText() + "%");
            
            rs = ps.executeQuery();
            
            // iterate through the java resultset
            while (rs.next())
            {   
                OrderReceived orderReceived = new OrderReceived();
                
                String code = rs.getString("code");   
                String store1 = rs.getString("store1");
                String store2 = rs.getString("store2");
                String date = rs.getString("date");
                String customer = rs.getString("customer");
                String product = rs.getString("product");
                String quantity = rs.getString("quantity");
                String payment = rs.getString("payment");
                String advance = rs.getString("advance");
                String creditUsed = rs.getString("creditused");
                
                orderReceived.code = code;
                orderReceived.store1 = store1;
                orderReceived.store2 = store2;
                orderReceived.date = date;
                orderReceived.customer = customer;
                orderReceived.product = product;
                orderReceived.quantity = quantity;
                orderReceived.payment = payment;
                orderReceived.advance = advance;
                orderReceived.creditUsed = creditUsed;
                
                ordersReceived.add(orderReceived);
                
                product = null;

                // print the results
                System.out.format("%s, %s, %s, %s, %s, %s, %s\n", code, store1, store2, date, customer, product, quantity, payment, advance);
            }            
            
            //*********************************************************
            
            ps.close();
            
            // Prints orders we are waiting for
            printOnScreen("PEDIDOS DISPONIBLES", false, true, true);
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_jButtonOrderSearchMouseClicked


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrameCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrameCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrameCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrameCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrameCustomers().setVisible(true);
            }
        });      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInfoConnect;
    private javax.swing.JPanel jButtonInfoData;
    private javax.swing.JButton jButtonOrderSearch;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox<String> jComboBoxOrderDate1;
    private javax.swing.JComboBox<String> jComboBoxOrderDate2;
    private javax.swing.JComboBox<String> jComboBoxOrderDate3;
    private javax.swing.JComboBox<String> jComboBoxSortCategory;
    private javax.swing.JComboBox<String> jComboBoxSortUpDown;
    private javax.swing.JLabel jLabelInfoCode;
    private javax.swing.JLabel jLabelInfoLocalhost;
    private javax.swing.JLabel jLabelInfoMaker;
    private javax.swing.JLabel jLabelInfoName;
    private javax.swing.JLabel jLabelInfoPassword;
    private javax.swing.JLabel jLabelInfoSortCategory;
    private javax.swing.JLabel jLabelInfoSortUpDown;
    private javax.swing.JLabel jLabelInfoUser;
    private javax.swing.JLabel jLabelOrderActualDate;
    private javax.swing.JLabel jLabelOrderCode;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelInfo;
    private javax.swing.JPanel jPanelIntro;
    private javax.swing.JPasswordField jPasswordFieldInfoPassword;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPaneMain;
    private javax.swing.JTextArea jTextAreaListados;
    private javax.swing.JTextArea jTextAreaOrders;
    private javax.swing.JTextField jTextFieldInfoCode;
    private javax.swing.JTextField jTextFieldInfoLocalhost;
    private javax.swing.JTextField jTextFieldInfoMaker;
    private javax.swing.JTextField jTextFieldInfoName;
    private javax.swing.JTextField jTextFieldInfoUser;
    private javax.swing.JTextField jTextFieldOrderCode;
    // End of variables declaration//GEN-END:variables

  
    //****************************************************       
    
    /***
     * To print on screen the information required
     * @param product information about products
     * @param order information about orders
     * @param orderReceived information about orders received
     */
    
    public void printOnScreen(String title, boolean product,  boolean order, boolean orderReceived) {
        // Here we prints the result on screen
        jTextAreaListados.setText("");
        jTextAreaOrders.setText("");
        textLines.clear();
        
        jTextAreaListados.append("\n******************************************");
        jTextAreaListados.append("\n******************************************");
        textLines.add("");
        textLines.add("******************************************");
        textLines.add("******************************************"); 
        
        jTextAreaListados.append("\n" + title);
        textLines.add(title);

        if ( product == true ) {

            jTextAreaListados.append("\n******************************************");
            jTextAreaListados.append("\n******************************************");
            textLines.add("");
            textLines.add("******************************************");
            textLines.add("******************************************");

            for (int i = 0; i < products.size(); i++) {
                jTextAreaListados.append("\nPRODUCTO " + (i + 1) );
                jTextAreaListados.append("\nNombre = " + products.get(i).name + "\nFabricante = " + products.get(i).maker + "\nCódigo = " + products.get(i).code + "\nCantidad = " + products.get(i).quantity + "\nPrecio = " + products.get(i).price + "\nTienda = " + products.get(i).store + "\nDescripción = " + products.get(i).description  + "\nGarantía = " + products.get(i).warranty);
                jTextAreaListados.append("\n");
                textLines.add("*******");
                textLines.add("PRODUCTO " + (i + 1));
                textLines.add("Nombre = " + products.get(i).name);
                textLines.add("Fabricante = " + products.get(i).maker);
                textLines.add("Codigo = " + products.get(i).code);
                textLines.add("Cantidad = " + products.get(i).quantity); 
                textLines.add("Precio = " + products.get(i).price);
                textLines.add("Tienda = " + products.get(i).store);
                textLines.add("Descripcion = " + products.get(i).description);
                textLines.add("Garantia = " + products.get(i).warranty); 
                textLines.add("*******");
            }    
        }

        if ( order == true ) {

            jTextAreaOrders.append("\n******************************************");
            jTextAreaOrders.append("\n******************************************");
            textLines.add("");
            textLines.add("******************************************");
            textLines.add("******************************************");

            for (int i = 0; i < orders.size(); i++) {
                jTextAreaOrders.append("\nPEDIDO " + (i + 1) );
                jTextAreaOrders.append("\nCódigo = " + orders.get(i).code + "\nTienda 1 = " + orders.get(i).store1 + "\nTienda 2 = " + orders.get(i).store2 + "\nFecha = " + orders.get(i).date + "\nCliente = " + orders.get(i).customer + "\nProducto = " + orders.get(i).product + "\nCantidad = " + orders.get(i).quantity + "\nPago = " + orders.get(i).payment + "\nAnticipo = " + orders.get(i).advance + "\nCrédito Utilizado = " + orders.get(i).creditUsed + "\nDías que faltan para llegar a la tienda  = " + orders.get(i).remainingDays);
                jTextAreaOrders.append("\n");
                textLines.add("*******");
                textLines.add("PEDIDO " + (i + 1));
                textLines.add("Codigo = " + orders.get(i).code);
                textLines.add("Tienda 1 = " + orders.get(i).store1);
                textLines.add("Tienda 2 = " + orders.get(i).store2);
                textLines.add("Fecha = " + orders.get(i).date); 
                textLines.add("Cliente = " + orders.get(i).customer);
                textLines.add("Producto = " + orders.get(i).product);
                textLines.add("Cantidad = " + orders.get(i).quantity);
                textLines.add("Pago = " + orders.get(i).payment); 
                textLines.add("Anticipo = " + orders.get(i).advance);
                textLines.add("Credito Utilizado = " + orders.get(i).creditUsed);
                textLines.add("Días que faltan para llegar a la tienda = " + orders.get(i).remainingDays);
                textLines.add("*******");
            }
        }

        if ( orderReceived == true ) {

            jTextAreaOrders.append("\n******************************************");
            jTextAreaOrders.append("\n******************************************");
            textLines.add("");
            textLines.add("******************************************");
            textLines.add("******************************************");

            for (int i = 0; i < ordersReceived.size(); i++) {
                jTextAreaOrders.append("\nPEDIDO RECIBIDO EN TIENDA " + (i + 1) );
                jTextAreaOrders.append("\nCódigo = " + ordersReceived.get(i).code + "\nTienda 1 = " + ordersReceived.get(i).store1 + "\nTienda 2 = " + ordersReceived.get(i).store2 + "\nFecha = " + ordersReceived.get(i).date + "\nCliente = " + ordersReceived.get(i).customer + "\nProducto = " + ordersReceived.get(i).product + "\nCantidad = " + ordersReceived.get(i).quantity + "\nPago = " + ordersReceived.get(i).payment + "\nAnticipo = " + ordersReceived.get(i).advance + "\nCrédito Utilizado = " + ordersReceived.get(i).creditUsed);
                jTextAreaOrders.append("\n");
                textLines.add("*******");
                textLines.add("PEDIDO RECIBIDO " + (i + 1));
                textLines.add("Codigo = " + ordersReceived.get(i).code);
                textLines.add("Tienda 1 = " + ordersReceived.get(i).store1);
                textLines.add("Tienda 2 = " + ordersReceived.get(i).store2);
                textLines.add("Fecha = " + ordersReceived.get(i).date);
                textLines.add("Cliente = " + ordersReceived.get(i).customer);
                textLines.add("Producto = " + ordersReceived.get(i).product);
                textLines.add("Cantidad = " + ordersReceived.get(i).quantity);
                textLines.add("Pago = " + ordersReceived.get(i).payment); 
                textLines.add("Anticipo = " + ordersReceived.get(i).advance); 
                textLines.add("Credito Utilizado = " + ordersReceived.get(i).creditUsed);
                textLines.add("*******");
            }  
        }

    }
    
    //*******************************
    
    /***
     * To clear the main arrays
     */
    
    public void clearDatabaseArrays() {
        // We clear the arrays
        orders.clear();
        ordersReceived.clear();
        products.clear();
    }
}
