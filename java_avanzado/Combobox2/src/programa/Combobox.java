
package programa;

import java.awt.event.ItemEvent;
import modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import modelo.Pais;

/**
 *
 * @author ricar
 */
public class Combobox extends javax.swing.JFrame {

    /**
     * Creates new form Combobox
     */
    public Combobox() {
        initComponents();
        Pais pais=new Pais();
        DefaultComboBoxModel modelo= new DefaultComboBoxModel(pais.mostrarPaises());
        combox_paises.setModel(modelo);
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiqueta_paises = new javax.swing.JLabel();
        combox_paises = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_estados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiqueta_paises.setText("Paises:");

        combox_paises.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combox_paisesItemStateChanged(evt);
            }
        });
        combox_paises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combox_paisesActionPerformed(evt);
            }
        });

        tabla_estados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_estados);

        jLabel1.setText("Estados:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiqueta_paises, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(combox_paises, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta_paises)
                    .addComponent(combox_paises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combox_paisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combox_paisesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combox_paisesActionPerformed

    private void combox_paisesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combox_paisesItemStateChanged
       //debemos a instanciar este metodo
       //Sirve si alguno de los paise a sido seleccionado en el combo box
       if(evt.getStateChange()==ItemEvent.SELECTED)//elige cual a sido seleccionada
       {
           Pais pais=(Pais)combox_paises.getSelectedItem();
           
           
            DefaultTableModel modelotabla = new DefaultTableModel();
            tabla_estados.setModel(modelotabla);
             PreparedStatement ps=null;
                ResultSet rs=null;
           
            try {
               
                Conexion con = new Conexion();
                Connection conexion = con.getConexion();
                ps = conexion.prepareStatement("select  idestados,nombreE from estados where idpaisesE="+pais.getIdpais());
                rs = ps.executeQuery();
                modelotabla.addColumn("IDEstados");
                modelotabla.addColumn("Nombre_Estados");
               //Checar bien este´pedo de abajo solo la canitidad de columnas
                int ancho[] = {50, 150,};
                for (int i = 0; i < 2; i++) {
                    tabla_estados.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
                }
                         
                while (rs.next()) {
                    Object fila[] = new Object[4];
                    for (int n = 0; n < 2; n++) {
                        fila[n] = rs.getObject(n + 1);
                    }
                    modelotabla.addRow(fila);
                }

            } catch (Exception ex) {
                System.err.println("Error ," + ex);
            }

        }
    }//GEN-LAST:event_combox_paisesItemStateChanged

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
            java.util.logging.Logger.getLogger(Combobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Combobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Combobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Combobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Combobox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combox_paises;
    private javax.swing.JLabel etiqueta_paises;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_estados;
    // End of variables declaration//GEN-END:variables
}
