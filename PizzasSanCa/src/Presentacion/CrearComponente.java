/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Entidades.Cantidad;
import Entidades.Componente;
import Persistencia.PersistenciaMateriales;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class CrearComponente extends javax.swing.JFrame {

    /**
     * Creates new form Componentes
     */
    List<Componente> lista= new ArrayList<>();
    public CrearComponente() {
        initComponents();
        
        lista = PersistenciaMateriales.getInstance().listaComponentes();
        Object matris[][] = new String[lista.size()][4];
        
        for(int i=0; i<lista.size(); i++){
            matris[i][0] = lista.get(i).getNombre();
            matris[i][1] = lista.get(i).getUnidadDeMedida();
            matris[i][2] = Integer.toString(lista.get(i).getCantidadDeAlerta());
            matris[i][3] = Long.toString(lista.get(i).getId());
            
        }
       
         jTable3.setModel(new javax.swing.table.DefaultTableModel(
                           matris,
                           new String [] {
                               "Nombre", "Unidad de Medida", "Cantidad de alerta", "id"
                           }
                       ) {
                           boolean[] canEdit = new boolean [] {
                               true, true, true, false
                           };

                           public boolean isCellEditable(int rowIndex, int columnIndex) {
                               return canEdit [columnIndex];
                           }
                       });
            
        jTable3.getColumnModel().getColumn(3).setPreferredWidth(0); 
        jTable3.getColumnModel().getColumn(3).setMaxWidth(0); 
        jTable3.getColumnModel().getColumn(3).setMinWidth(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nombreComponente = new javax.swing.JTextField();
        unidadDeMedida = new javax.swing.JTextField();
        cantidadAlerta = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        crearComponente = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Componente");

        nombreComponente.setText("Cebolla");

        unidadDeMedida.setText("KG");

        jLabel2.setText("Nombre");

        jLabel3.setText("Canridad de Alerta");

        jLabel4.setText("Unidad de medida");

        crearComponente.setText("Crear");
        crearComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearComponenteActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreComponente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unidadDeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(cantidadAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(crearComponente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Modificar)
                .addGap(67, 67, 67)
                .addComponent(Eliminar)
                .addGap(93, 93, 93))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel4)
                    .addContainerGap(576, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(24, 24, 24)
                        .addComponent(unidadDeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantidadAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(crearComponente)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eliminar)
                    .addComponent(Modificar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(jLabel4)
                    .addContainerGap(154, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearComponenteActionPerformed
        // TODO add your handling code here:
        
        
        Componente componente = new Componente(nombreComponente.getText(), unidadDeMedida.getText(), Integer.parseInt(cantidadAlerta.getValue().toString()));
        PersistenciaMateriales.getInstance().persist(componente);
        
                lista.add(componente);
        Object matris[][] = new String[lista.size()][4];
        
        for(int i=0; i<lista.size(); i++){
            matris[i][0] = lista.get(i).getNombre();
            matris[i][1] = lista.get(i).getUnidadDeMedida();
            matris[i][2] = Integer.toString(lista.get(i).getCantidadDeAlerta());
            matris[i][3] = Long.toString(lista.get(i).getId());
            
        }
       
         jTable3.setModel(new javax.swing.table.DefaultTableModel(
                           matris,
                           new String [] {
                               "Nombre", "Unidad de Medida", "Cantidad de alerta", "id"
                           }
                       ) {
                           boolean[] canEdit = new boolean [] {
                               true, true, true, false
                           };

                           public boolean isCellEditable(int rowIndex, int columnIndex) {
                               return canEdit [columnIndex];
                           }
                       });
            
        jTable3.getColumnModel().getColumn(3).setPreferredWidth(0); 
        jTable3.getColumnModel().getColumn(3).setMaxWidth(0); 
        jTable3.getColumnModel().getColumn(3).setMinWidth(0);
        
    }//GEN-LAST:event_crearComponenteActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
        
        int fila = jTable3.getSelectedRow();
        
        Long id = Long.parseLong(jTable3.getValueAt(fila, 3).toString());
        String nombre = jTable3.getValueAt(fila, 0).toString();
        String unidadDeMedida = jTable3.getValueAt(fila, 1).toString();
        int cantidad = Integer.parseInt( jTable3.getValueAt(fila, 2).toString());
        
        for(int i=0; i<lista.size(); i++){
            if(id == lista.get(i).getId()){
                lista.get(i).setCantidadDeAlerta(cantidad);
                lista.get(i).setNombre(nombre);
                lista.get(i).setUnidadDeMedida(unidadDeMedida);
                PersistenciaMateriales.getInstance().persist(lista.get(i));
            }
        }
        
        
        Object matris[][] = new String[lista.size()][4];
        
        for(int i=0; i<lista.size(); i++){
            matris[i][0] = lista.get(i).getNombre();
            matris[i][1] = lista.get(i).getUnidadDeMedida();
            matris[i][2] = Integer.toString(lista.get(i).getCantidadDeAlerta());
            matris[i][3] = Long.toString(lista.get(i).getId());
            
        }
       
         jTable3.setModel(new javax.swing.table.DefaultTableModel(
                           matris,
                           new String [] {
                               "Nombre", "Unidad de Medida", "Cantidad de alerta", "id"
                           }
                       ) {
                           boolean[] canEdit = new boolean [] {
                               true, true, true, false
                           };

                           public boolean isCellEditable(int rowIndex, int columnIndex) {
                               return canEdit [columnIndex];
                           }
                       });
            
        jTable3.getColumnModel().getColumn(3).setPreferredWidth(0); 
        jTable3.getColumnModel().getColumn(3).setMaxWidth(0); 
        jTable3.getColumnModel().getColumn(3).setMinWidth(0);
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        
        
         int fila = jTable3.getSelectedRow();
        
        Long id = Long.parseLong(jTable3.getValueAt(fila, 3).toString());
        Componente compa = null;
        for(int i=0; i<lista.size(); i++){
            if(id == lista.get(i).getId()){
                 compa = lista.get(i);
                
            }
        }
        PersistenciaMateriales.getInstance().delete(compa);
        lista.remove(compa);
        
        
        Object matris[][] = new String[lista.size()][4];
        
        for(int i=0; i<lista.size(); i++){
            matris[i][0] = lista.get(i).getNombre();
            matris[i][1] = lista.get(i).getUnidadDeMedida();
            matris[i][2] = Integer.toString(lista.get(i).getCantidadDeAlerta());
            matris[i][3] = lista.get(i).getId().toString();
            
        }
       
         jTable3.setModel(new javax.swing.table.DefaultTableModel(
                           matris,
                           new String [] {
                               "Nombre", "Unidad de Medida", "Cantidad de alerta", "id"
                           }
                       ) {
                           boolean[] canEdit = new boolean [] {
                               true, true, true, false
                           };

                           public boolean isCellEditable(int rowIndex, int columnIndex) {
                               return canEdit [columnIndex];
                           }
                       });
            
        jTable3.getColumnModel().getColumn(3).setPreferredWidth(0); 
        jTable3.getColumnModel().getColumn(3).setMaxWidth(0); 
        jTable3.getColumnModel().getColumn(3).setMinWidth(0);
        
        
    }//GEN-LAST:event_EliminarActionPerformed

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
            java.util.logging.Logger.getLogger(CrearComponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearComponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearComponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearComponente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearComponente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Modificar;
    private javax.swing.JSpinner cantidadAlerta;
    private javax.swing.JButton crearComponente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField nombreComponente;
    private javax.swing.JTextField unidadDeMedida;
    // End of variables declaration//GEN-END:variables
}
