/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Entidades.Componente;
import Entidades.Producto;
import Entidades.Proveedor;
import Persistencia.PersistenciaMateriales;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Manuel
 */
public class CrearProducto extends javax.swing.JFrame {
    String imagen;
    /**
     * Creates new form CrearProducto
     */
    public CrearProducto() {
        initComponents();
        List<Componente> componentes = PersistenciaMateriales.getInstance().listaComponentes();
        
        for(int i = 0; i<componentes.size(); i++)
        {
            comboComponente.addItem(componentes.get(i));
        }
        
        List<Proveedor> Proveedores = PersistenciaMateriales.getInstance().listaProveedores();
        
        
        for(int i = 0; i<Proveedores.size(); i++)
        {
            comboProveedor.addItem(Proveedores.get(i));
        }
        
        Object matris[][] = new String[Proveedores.size()][4];
        
        for(int i=0; i<Proveedores.size(); i++){
            matris[i][0] = Proveedores.get(i).getNombre();
            matris[i][1] = Proveedores.get(i).getDireccion();
            matris[i][2] = Proveedores.get(i).getTelefono();
            matris[i][3] = Proveedores.get(i).getId().toString();
            
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                           matris,
                           new String [] {
                               "Nombre", "Direccion", "Telefono", "id"
                           }
                       ) {
                           boolean[] canEdit = new boolean [] {
                               true, true, true, false
                           };

                           public boolean isCellEditable(int rowIndex, int columnIndex) {
                               return canEdit [columnIndex];
                           }
                       });
        
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(0); 
        jTable1.getColumnModel().getColumn(3).setMaxWidth(0); 
        jTable1.getColumnModel().getColumn(3).setMinWidth(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        comboComponente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboProveedor = new javax.swing.JComboBox<>();
        nombreProveedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        direccionProveedor = new javax.swing.JTextField();
        telefonoProveedor = new javax.swing.JTextField();
        crearProveedor = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        foto = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Marca = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Valoracion = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        Precio = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Comentarios = new javax.swing.JTextArea();
        cantidad = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        modificarProveedor = new javax.swing.JButton();
        EliminarProveedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Producto");

        jLabel2.setText("Componente");

        jLabel3.setText("Proveedor");

        jLabel4.setText("Proveedor");

        nombreProveedor.setText("Tizon");

        jLabel5.setText("Nombre");

        jLabel6.setText("Direccion");

        jLabel7.setText("Telefono");

        direccionProveedor.setText("25 de agosto a finales");

        telefonoProveedor.setText("099016753");

        crearProveedor.setText("Crear Proveedor");
        crearProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearProveedorActionPerformed(evt);
            }
        });

        jButton1.setText("crear producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        foto.setText("abrir");
        foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotoActionPerformed(evt);
            }
        });

        jLabel8.setText("Imagen");

        jLabel9.setText("Marca");

        Marca.setText("jTextField1");

        jLabel10.setText("Comentarios");

        Valoracion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        jLabel11.setText("Valoracion");

        jLabel12.setText("Precio");

        Comentarios.setColumns(20);
        Comentarios.setRows(5);
        jScrollPane1.setViewportView(Comentarios);

        cantidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.000"))));

        jLabel13.setText("Cantidad");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        modificarProveedor.setText("Modificar");
        modificarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarProveedorActionPerformed(evt);
            }
        });

        EliminarProveedor.setText("Eliminar");
        EliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(foto))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboComponente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(telefonoProveedor))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nombreProveedor)
                                            .addComponent(direccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(crearProveedor, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addGap(33, 33, 33)))
                        .addGap(140, 140, 140))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(159, 159, 159)
                                    .addComponent(Valoracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(jLabel9)
                                    .addGap(48, 48, 48)
                                    .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(26, 26, 26)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(modificarProveedor)
                                .addGap(95, 95, 95)
                                .addComponent(EliminarProveedor)
                                .addContainerGap(97, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(comboComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(foto))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel9)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(direccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(telefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(crearProveedor)
                        .addGap(77, 77, 77)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(38, 38, 38))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Valoracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modificarProveedor)
                            .addComponent(EliminarProveedor))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearProveedorActionPerformed
        // TODO add your handling code here:
        
        
        Proveedor provedor = new Proveedor(telefonoProveedor.getText(), direccionProveedor.getText(), nombreProveedor.getText());
        PersistenciaMateriales.getInstance().persist(provedor);
        comboProveedor.addItem(provedor);
        List<Proveedor> Proveedores = new ArrayList<Proveedor> ();
        for(int i=0; i<comboProveedor.getModel().getSize(); i++){
            Proveedores.add(comboProveedor.getItemAt(i));
        }
        
        Object matris[][] = new String[Proveedores.size()][4];
        
        for(int i=0; i<Proveedores.size(); i++){
            matris[i][0] = Proveedores.get(i).getNombre();
            matris[i][1] = Proveedores.get(i).getDireccion();
            matris[i][2] = Proveedores.get(i).getTelefono();
            matris[i][3] = Proveedores.get(i).getId().toString();
            
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                           matris,
                           new String [] {
                               "Nombre", "Direccion", "Telefono", "id"
                           }
                       ) {
                           boolean[] canEdit = new boolean [] {
                               true, true, true, false
                           };

                           public boolean isCellEditable(int rowIndex, int columnIndex) {
                               return canEdit [columnIndex];
                           }
                       });
        
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(0); 
        jTable1.getColumnModel().getColumn(3).setMaxWidth(0); 
        jTable1.getColumnModel().getColumn(3).setMinWidth(0);
        
    }//GEN-LAST:event_crearProveedorActionPerformed

    private void fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotoActionPerformed
        // TODO add your handling code here:
           FileNameExtensionFilter filtro = new FileNameExtensionFilter("Imagenes", "jpg", "png", "gif");
           jFileChooser1.setFileFilter(filtro);
           int returnVal = jFileChooser1.showOpenDialog(this);
           if(returnVal == JFileChooser.APPROVE_OPTION)
           {
                imagen = jFileChooser1.getSelectedFile().getPath();
               Image aux = new ImageIcon(imagen).getImage();
               ImageIcon perfil = new ImageIcon(aux.getScaledInstance(150, 180, Image.SCALE_DEFAULT));
               jLabel8.setIcon(perfil);
           }
           
        
    }//GEN-LAST:event_fotoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


        try {
            byte[] aux = PersistenciaMateriales.getInstance().convertirImagen(imagen);
            
            Producto producto;
            
            // TODO add your handling code here:
            producto = new Producto(aux, Marca.getText(), Comentarios.getText(), Integer.parseInt(Precio.getValue().toString()), Integer.parseInt(Valoracion.getSelectedItem().toString()), Float.parseFloat(cantidad.getText()));
            producto.setComponente((Componente) comboComponente.getSelectedItem());
            producto.setProveedor((Proveedor) comboProveedor.getSelectedItem());
            PersistenciaMateriales.getInstance().persist(producto);
        } catch (IOException ex) {
            Logger.getLogger(CrearProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void modificarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarProveedorActionPerformed
        // TODO add your handling code here:
        
        
        
        int fila = jTable1.getSelectedRow();
        Proveedor proveedor  = (Proveedor) comboProveedor.getSelectedItem(); 
        Long id = Long.parseLong(jTable1.getValueAt(fila, 3).toString());
        String nombre = jTable1.getValueAt(fila, 0).toString();
        String direccion = jTable1.getValueAt(fila, 1).toString();
        String telefono = jTable1.getValueAt(fila, 2).toString();
        
        List<Proveedor> Proveedores = new ArrayList<Proveedor> ();
        for(int i=0; i<comboProveedor.getModel().getSize(); i++){
            if(comboProveedor.getItemAt(i).getId()== id){
                comboProveedor.getItemAt(i).setNombre(nombre);
                comboProveedor.getItemAt(i).setDireccion(direccion);
                comboProveedor.getItemAt(i).setTelefono(telefono);
                PersistenciaMateriales.getInstance().persist(comboProveedor.getItemAt(i));
            }
        }
        
        
        
        
        
        
    }//GEN-LAST:event_modificarProveedorActionPerformed

    private void EliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarProveedorActionPerformed
        // TODO add your handling code here:
        
        
        int fila = jTable1.getSelectedRow();
        Long id = Long.parseLong(jTable1.getValueAt(fila, 3).toString());
        String nombre = jTable1.getValueAt(fila, 0).toString();
        String direccion = jTable1.getValueAt(fila, 1).toString();
        String telefono = jTable1.getValueAt(fila, 2).toString();
        
        Proveedor proveedor = null;
        
        for(int i=0; i<comboProveedor.getModel().getSize(); i++){
            if(comboProveedor.getItemAt(i).getId()== id){
                
                proveedor  = (Proveedor) comboProveedor.getSelectedItem(); 
            }
        }
        
        
         comboProveedor.removeItem(proveedor);
         PersistenciaMateriales.getInstance().delete(proveedor);
        
        
        List<Proveedor> Proveedores = new ArrayList<Proveedor> ();
        for(int i=0; i<comboProveedor.getModel().getSize(); i++){
            Proveedores.add(comboProveedor.getItemAt(i));
        }
        
        Object matris[][] = new String[Proveedores.size()][4];
        
        for(int i=0; i<Proveedores.size(); i++){
            matris[i][0] = Proveedores.get(i).getNombre();
            matris[i][1] = Proveedores.get(i).getDireccion();
            matris[i][2] = Proveedores.get(i).getTelefono();
            matris[i][3] = Proveedores.get(i).getId().toString();
            
        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                           matris,
                           new String [] {
                               "Nombre", "Direccion", "Telefono", "id"
                           }
                       ) {
                           boolean[] canEdit = new boolean [] {
                               true, true, true, false
                           };

                           public boolean isCellEditable(int rowIndex, int columnIndex) {
                               return canEdit [columnIndex];
                           }
                       });
        
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(0); 
        jTable1.getColumnModel().getColumn(3).setMaxWidth(0); 
        jTable1.getColumnModel().getColumn(3).setMinWidth(0);
        
        
        
    }//GEN-LAST:event_EliminarProveedorActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CrearProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Comentarios;
    private javax.swing.JButton EliminarProveedor;
    private javax.swing.JTextField Marca;
    private javax.swing.JSpinner Precio;
    private javax.swing.JComboBox<String> Valoracion;
    private javax.swing.JFormattedTextField cantidad;
    private javax.swing.JComboBox<Componente> comboComponente;
    private javax.swing.JComboBox<Proveedor> comboProveedor;
    private javax.swing.JButton crearProveedor;
    private javax.swing.JTextField direccionProveedor;
    private javax.swing.JButton foto;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modificarProveedor;
    private javax.swing.JTextField nombreProveedor;
    private javax.swing.JTextField telefonoProveedor;
    // End of variables declaration//GEN-END:variables
}
