/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Entidades.Producto;
import Persistencia.PersistenciaMateriales;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel
 */
public class ModificarYEliminarProducto extends javax.swing.JFrame {

    /**
     * Creates new form ModificarYEliminarProducto
     */
    List<Producto> lista = new ArrayList<>();
            
    public ModificarYEliminarProducto() {
        initComponents();
        
        lista = PersistenciaMateriales.getInstance().listaProductos();
        
        Object matris[][] = new String[lista.size()][7];
        
        for(int i=0; i<lista.size(); i++){
            matris[i][0] = lista.get(i).getComponente().getNombre();
            matris[i][1] = lista.get(i).getComentarios();
            matris[i][2] = lista.get(i).getMarca();
            matris[i][3] = Integer.toString(lista.get(i).getPrecio());
            matris[i][4] = Integer.toString(lista.get(i).getValoracion());
            matris[i][5] = Float.toString(lista.get(i).getCantidad());
            
            matris[i][6] = Long.toString(lista.get(i).getId());
        }
       
         jTable1.setModel(new javax.swing.table.DefaultTableModel(
                           matris,
                           new String [] {
                               "Nombre", "Comentarios", "Marca", "Precio", "Valoracion", "Cantidad", "id"
                           }
                       ) {
                           boolean[] canEdit = new boolean [] {
                               false, true, true, true, true, true, false
                           };

                           public boolean isCellEditable(int rowIndex, int columnIndex) {
                               return canEdit [columnIndex];
                           }
                       });
            
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(0); 
        jTable1.getColumnModel().getColumn(6).setMaxWidth(0); 
        jTable1.getColumnModel().getColumn(6).setMinWidth(0);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Modificar.setText("Modifica");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Eliminar)
                .addGap(125, 125, 125))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eliminar)
                    .addComponent(Modificar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
        
        int fila = jTable1.getSelectedRow();
        
        Long id = Long.parseLong(jTable1.getValueAt(fila, 6).toString());
        Float cantidad = Float.parseFloat((String) jTable1.getValueAt(fila, 5));
        
        int valoracion = Integer.parseInt((String) jTable1.getValueAt(fila, 4));
        
        int precio = Integer.parseInt((String) jTable1.getValueAt(fila, 3));
        
        String marca = (String) jTable1.getValueAt(fila, 2);
        
        String comentarios = (String) jTable1.getValueAt(fila, 1);
        
        for(int i = 0; i<lista.size(); i++){
            if(lista.get(i).getId()==id){
                lista.get(i).setComentarios(comentarios);
                lista.get(i).setMarca(marca);
                lista.get(i).setPrecio(precio);
                lista.get(i).setValoracion(valoracion);
                lista.get(i).setCantidad(cantidad);
                PersistenciaMateriales.getInstance().persist(lista.get(i));
            }
        }
        
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        
        
        
         int fila = jTable1.getSelectedRow();
        
        Long id = Long.parseLong(jTable1.getValueAt(fila, 6).toString());
        Float cantidad = Float.parseFloat((String) jTable1.getValueAt(fila, 5));
        
        int valoracion = Integer.parseInt((String) jTable1.getValueAt(fila, 4));
        
        int precio = Integer.parseInt((String) jTable1.getValueAt(fila, 3));
        
        String marca = (String) jTable1.getValueAt(fila, 2);
        
        String comentarios = (String) jTable1.getValueAt(fila, 1);
        Producto pro = null;
        for(int i = 0; i<lista.size(); i++){
            if(lista.get(i).getId()==id){
              pro = lista.get(i);
                
            }
        }
        PersistenciaMateriales.getInstance().delete(pro);
        lista.remove(pro);
        
        
         Object matris[][] = new String[lista.size()][7];
        
        for(int i=0; i<lista.size(); i++){
            matris[i][0] = lista.get(i).getComponente().getNombre();
            matris[i][1] = lista.get(i).getComentarios();
            matris[i][2] = lista.get(i).getMarca();
            matris[i][3] = Integer.toString(lista.get(i).getPrecio());
            matris[i][4] = Integer.toString(lista.get(i).getValoracion());
            matris[i][5] = Float.toString(lista.get(i).getCantidad());
            
            matris[i][6] = Long.toString(lista.get(i).getId());
        }
       
         jTable1.setModel(new javax.swing.table.DefaultTableModel(
                           matris,
                           new String [] {
                               "Nombre", "Comentarios", "Marca", "Precio", "Valoracion", "Cantidad", "id"
                           }
                       ) {
                           boolean[] canEdit = new boolean [] {
                               false, true, true, true, true, true, false
                           };

                           public boolean isCellEditable(int rowIndex, int columnIndex) {
                               return canEdit [columnIndex];
                           }
                       });
            
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(0); 
        jTable1.getColumnModel().getColumn(6).setMaxWidth(0); 
        jTable1.getColumnModel().getColumn(6).setMinWidth(0);
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
            java.util.logging.Logger.getLogger(ModificarYEliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarYEliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarYEliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarYEliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarYEliminarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Modificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
