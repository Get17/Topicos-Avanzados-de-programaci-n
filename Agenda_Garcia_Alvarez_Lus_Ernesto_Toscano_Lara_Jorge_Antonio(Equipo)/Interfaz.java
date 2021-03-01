//Luis Ernesto Garcia Alvares
//Jorge Antonio Toscano Lara
package com.mycompany.agenda;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {

        //Creo el modelo
        modelo = new DefaultTableModel();

        initComponents();

        //Le asigno el modelo
        this.tblContactos.setModel(modelo);

        //Le añado dos columnas
        modelo.addColumn("Nombre");
        modelo.addColumn("Telefono");
        modelo.addColumn("Correo");
        modelo.addColumn("Cumple");

        //Creo la agenda
        agenda = new Agenda();
    }

    @SuppressWarnings("unchecked")
                           
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblContactos = new javax.swing.JTable();
        btnAnadir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCumple = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblContactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblContactos);

        btnAnadir.setText("Añadir");
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Telefono:");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel3.setText("Correo:");

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        jLabel4.setText("Cumple:");

        txtCumple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCumpleActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCumple, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNombre)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnAnadir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCumple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAnadir)
                .addGap(22, 22, 22)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }                      

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.exit(0);
    }                                        

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {                                          

        //tomo el nombre y el telefono
        String nombre = this.txtNombre.getText();
        String telefono = this.txtTelefono.getText();
        String correo = this.txtCorreo.getText();
        String cumple = this.txtCumple.getText();

        int tel;
        try {
            
            tel = Integer.parseInt(telefono);

            //Creo el contacto 
            Contacto c = new Contacto(nombre, tel, correo, cumple);

            //Lo añado
            agenda.aniadirContacto(c);
            this.txtNombre.setText(null);
            this.txtTelefono.setText(null);
            this.txtCorreo.setText(null);
            this.txtCumple.setText(null);

            //Rellena la tabla de nuevo
            rellenarTabla();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El telefono debe ser numerico", "Errors", JOptionPane.ERROR_MESSAGE);
        }

    }                                         

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {                                            

        //slecciona la fila
        int fila_seleccionada = this.tblContactos.getSelectedRow();

        //Si no hay una fila seleccionada, devuelve -1
        if (fila_seleccionada == -1) {
            JOptionPane.showMessageDialog(this, "No has seleccionado ninguna fila", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            //Tomo los datos de la fila
            String nombre = (String) modelo.getValueAt(fila_seleccionada, 0);
            int tel = (int) modelo.getValueAt(fila_seleccionada, 1);
            String correo = (String) modelo.getValueAt(fila_seleccionada, 2);
            String cumple = (String) modelo.getValueAt(fila_seleccionada, 3);
            //Creo el contacto
            Contacto aux = new Contacto(nombre, tel, correo, cumple);

            //Le paso el contacto que quiero borrar
            agenda.eliminarContacto(aux);

            //Rellena la tabla de nuevo
            rellenarTabla();

        }
    }                                           
                                     

                                  
        
    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {                                          
       
    }                                         

    private void txtCumpleActionPerformed(java.awt.event.ActionEvent evt) {                                          
            }                                         

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
    }                                         

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String nombre = this.txtNombre.getText();
            agenda.buscarPorNombre(nombre);
    }                                         

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        //slecciona la fila
        int fila_seleccionada = this.tblContactos.getSelectedRow();

        //Si no hay una fila seleccionada, devuelve -1
        if (fila_seleccionada == -1) {
            JOptionPane.showMessageDialog(this, "No has seleccionado ninguna fila", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            //tomo los datos de la fila
            String nombre = (String) modelo.getValueAt(fila_seleccionada, 0);
            int tel = (int) modelo.getValueAt(fila_seleccionada, 1);
            String correo = (String) modelo.getValueAt(fila_seleccionada, 2);
            String cumple = (String) modelo.getValueAt(fila_seleccionada, 3);
            Contacto aux = new Contacto(nombre, tel, correo, cumple);
            agenda.eliminarContacto(aux);
            
            //tomo el nombre y el telefono
        String nombr = this.txtNombre.getText();
        String telefon = this.txtTelefono.getText();
        String corre = this.txtCorreo.getText();
        String cumpl = this.txtCumple.getText();

        int tele;
        try {
            
            tele = Integer.parseInt(telefon);

            //Creo el contacto 
            Contacto c = new Contacto(nombr, tele, corre, cumpl);

            //Lo añado
            agenda.aniadirContacto(c);
            this.txtNombre.setText(null);
            this.txtTelefono.setText(null);
            this.txtCorreo.setText(null);
            this.txtCumple.setText(null);

            //Rellena la tabla de nuevo
            rellenarTabla();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "El telefono debe ser numerico", "Errors", JOptionPane.ERROR_MESSAGE);
        }
        }
    }                                         

    private void rellenarTabla() {

        //Vacia la tabla
        modelo.setRowCount(0);

        //Tomo los contactos
        Contacto contactos[] = agenda.getContactos();

        Object[] fila;
        for (int i = 0; i < contactos.length; i++) {
            //Solo los que existan
            if (contactos[i] != null) {
                //Creo la fila
                fila = new Object[4];
                fila[0] = contactos[i].getNombre();
                fila[1] = contactos[i].getTelefono();
                fila[2] = contactos[i].getCorreo();
                fila[3] = contactos[i].getCumple();
                //Añado la fila a la tabla
                modelo.addRow(fila);
            }
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    //Atributos propios
    private DefaultTableModel modelo;
    private Agenda agenda;

    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblContactos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCumple;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
}
