/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.Grafos;

/**
 *
 * @author SebasCarlosama
 */
public class Interfaz_Grafos extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz_Grafos
     */
    public Interfaz_Grafos() {
        initComponents();
        this.setLocationRelativeTo(null);
        cmbx_desde.removeAllItems();
        cmbx_hasta.removeAllItems();
        cmbx_dijkstra.removeAllItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnl_inputs = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_numero_vertices = new javax.swing.JTextField();
        btn_generar_vertice = new javax.swing.JButton();
        cmbx_desde = new javax.swing.JComboBox<>();
        cmbx_hasta = new javax.swing.JComboBox<>();
        txt_nombre_vertice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_peso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_crear_arista = new javax.swing.JButton();
        btn_iniciar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_respuesta = new javax.swing.JTextArea();
        btn_ver_vertices = new javax.swing.JButton();
        btn_ver_aristas = new javax.swing.JButton();
        btn_ver_matriz_adyacencia = new javax.swing.JButton();
        btn_ver_matriz_peso = new javax.swing.JButton();
        btn_dijkstra = new javax.swing.JButton();
        cmbx_dijkstra = new javax.swing.JComboBox<>();
        btn_FloydWarshall = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Grafos dirigidos con peso");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("N??mero de v??rtices/nodos");

        txt_numero_vertices.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_numero_vertices.setText("8");

        btn_generar_vertice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_generar_vertice.setText("Crear");
        btn_generar_vertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generar_verticeActionPerformed(evt);
            }
        });

        cmbx_desde.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbx_desde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbx_hasta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbx_hasta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txt_nombre_vertice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_nombre_vertice.setText("A");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Nombre v??rtice");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("----------------->");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Desde:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Hasta:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Crear aristas");

        txt_peso.setText("1");

        jLabel9.setText("Peso");

        btn_crear_arista.setText("Crear");
        btn_crear_arista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_aristaActionPerformed(evt);
            }
        });

        btn_iniciar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_iniciar.setText("Iniciar");
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_inputsLayout = new javax.swing.GroupLayout(pnl_inputs);
        pnl_inputs.setLayout(pnl_inputsLayout);
        pnl_inputsLayout.setHorizontalGroup(
            pnl_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_inputsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
            .addGroup(pnl_inputsLayout.createSequentialGroup()
                .addGroup(pnl_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_inputsLayout.createSequentialGroup()
                        .addGroup(pnl_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_inputsLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel6))
                            .addComponent(cmbx_desde, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_inputsLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbx_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_inputsLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(btn_crear_arista)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel7))))
                    .addGroup(pnl_inputsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_inputsLayout.createSequentialGroup()
                                .addComponent(txt_nombre_vertice, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(btn_generar_vertice, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_inputsLayout.createSequentialGroup()
                                .addComponent(txt_numero_vertices, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnl_inputsLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel8)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pnl_inputsLayout.setVerticalGroup(
            pnl_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_inputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_numero_vertices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_iniciar))
                .addGap(18, 18, 18)
                .addGroup(pnl_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_generar_vertice)
                    .addComponent(txt_nombre_vertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7))
                    .addComponent(btn_crear_arista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbx_desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbx_hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_inputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(54, 54, 54))
        );

        txt_respuesta.setColumns(20);
        txt_respuesta.setRows(5);
        jScrollPane1.setViewportView(txt_respuesta);

        btn_ver_vertices.setText("Ver v??rtices");
        btn_ver_vertices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ver_verticesActionPerformed(evt);
            }
        });

        btn_ver_aristas.setText("Ver aristas");
        btn_ver_aristas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ver_aristasActionPerformed(evt);
            }
        });

        btn_ver_matriz_adyacencia.setText("Ver matriz de adyacencia");
        btn_ver_matriz_adyacencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ver_matriz_adyacenciaActionPerformed(evt);
            }
        });

        btn_ver_matriz_peso.setText("Ver matriz de pesos");
        btn_ver_matriz_peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ver_matriz_pesoActionPerformed(evt);
            }
        });

        btn_dijkstra.setText("Dijkstra");
        btn_dijkstra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dijkstraActionPerformed(evt);
            }
        });

        cmbx_dijkstra.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbx_dijkstra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_FloydWarshall.setText("Floyd-Warshall");
        btn_FloydWarshall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FloydWarshallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(pnl_inputs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_ver_vertices)
                                        .addGap(46, 46, 46)
                                        .addComponent(btn_ver_aristas))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_ver_matriz_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_ver_matriz_adyacencia, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_dijkstra)
                                        .addGap(26, 26, 26))
                                    .addComponent(cmbx_dijkstra, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_FloydWarshall))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(297, 297, 297))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(pnl_inputs, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ver_vertices)
                            .addComponent(btn_ver_aristas))
                        .addGap(14, 14, 14)
                        .addComponent(btn_ver_matriz_adyacencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_ver_matriz_peso)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(cmbx_dijkstra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_dijkstra))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(btn_FloydWarshall)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Grafo grafo;
    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
        // TODO add your handling code here:
        try {
            int numero_vertices = Integer.parseInt(txt_numero_vertices.getText());

            if (numero_vertices > 0) {
                grafo = new Grafo(numero_vertices);
                txt_respuesta.setText("Todo listo....\nPor favor cree todos los vertices");
            }

        } catch (NumberFormatException e) {
            txt_respuesta.setText("Ingrese un numero entero.\n" + e.getMessage());
        } catch (Exception e) {
            txt_respuesta.setText(e.getMessage());
        }


    }//GEN-LAST:event_btn_iniciarActionPerformed

    private void btn_generar_verticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generar_verticeActionPerformed
        // TODO add your handling code here:
        //try {
        txt_respuesta.setText(grafo.Agregar_vertice(txt_nombre_vertice.getText().toUpperCase()));
        cmbx_desde.removeAllItems();
        cmbx_hasta.removeAllItems();
        cmbx_dijkstra.removeAllItems();
        for (int i = 0; i < grafo.getNumero_vertices(); i++) {
            cmbx_desde.addItem(grafo.getLista_vertices().get(i).getNombre());
            cmbx_hasta.addItem(grafo.getLista_vertices().get(i).getNombre());
            cmbx_dijkstra.addItem(grafo.getLista_vertices().get(i).getNombre());
        }

        /* } catch (Exception e) {
            txt_respuesta.setText("Ocurrio un error: " + e.getMessage());
        }*/

    }//GEN-LAST:event_btn_generar_verticeActionPerformed

    private void btn_ver_verticesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ver_verticesActionPerformed
        // TODO add your handling code here:
        txt_respuesta.setText(grafo.Visitar_vertices());
    }//GEN-LAST:event_btn_ver_verticesActionPerformed

    private void btn_ver_aristasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ver_aristasActionPerformed
        // TODO add your handling code here:
        txt_respuesta.setText(grafo.Visitar_aristas());
    }//GEN-LAST:event_btn_ver_aristasActionPerformed

    private void btn_crear_aristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_aristaActionPerformed
        txt_respuesta.setText(grafo.Agregar_arista(cmbx_desde.getSelectedItem().toString(), cmbx_hasta.getSelectedItem().toString(), Double.parseDouble(txt_peso.getText())));
    }//GEN-LAST:event_btn_crear_aristaActionPerformed

    private void btn_ver_matriz_adyacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ver_matriz_adyacenciaActionPerformed
        // TODO add your handling code here:
        txt_respuesta.setText(grafo.Visitar_matriz_adyacencia());
    }//GEN-LAST:event_btn_ver_matriz_adyacenciaActionPerformed

    private void btn_ver_matriz_pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ver_matriz_pesoActionPerformed
        // TODO add your handling code here:
        txt_respuesta.setText(grafo.Visitar_matriz_peso());
    }//GEN-LAST:event_btn_ver_matriz_pesoActionPerformed

    private void btn_dijkstraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dijkstraActionPerformed
        // TODO add your handling code here:
        //Dijkstra d = new Dijkstra(grafo);
        txt_respuesta.setText(grafo.Algoritmo_dijkstra(grafo.Buscar_vertice(cmbx_dijkstra.getSelectedItem().toString())));
    }//GEN-LAST:event_btn_dijkstraActionPerformed

    private void btn_FloydWarshallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FloydWarshallActionPerformed

        txt_respuesta.setText(grafo.Algoritmo_FloydWarshall());
    }//GEN-LAST:event_btn_FloydWarshallActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_Grafos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Grafos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Grafos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Grafos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Grafos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_FloydWarshall;
    private javax.swing.JButton btn_crear_arista;
    private javax.swing.JButton btn_dijkstra;
    private javax.swing.JButton btn_generar_vertice;
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JButton btn_ver_aristas;
    private javax.swing.JButton btn_ver_matriz_adyacencia;
    private javax.swing.JButton btn_ver_matriz_peso;
    private javax.swing.JButton btn_ver_vertices;
    private javax.swing.JComboBox<String> cmbx_desde;
    private javax.swing.JComboBox<String> cmbx_dijkstra;
    private javax.swing.JComboBox<String> cmbx_hasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnl_inputs;
    private javax.swing.JTextField txt_nombre_vertice;
    private javax.swing.JTextField txt_numero_vertices;
    private javax.swing.JTextField txt_peso;
    private javax.swing.JTextArea txt_respuesta;
    // End of variables declaration//GEN-END:variables
}
