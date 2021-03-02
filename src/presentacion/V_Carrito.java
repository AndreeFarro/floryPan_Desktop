package presentacion;

import dominio.Carrito;
import dominio.ItemsPedido;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class V_Carrito extends javax.swing.JFrame implements IV_Carrito{

    private P_Carrito p;
    public V_Carrito() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        aTitulo = new javax.swing.JLabel();
        aTitulo1 = new javax.swing.JLabel();
        bsalir = new javax.swing.JButton();
        bpedido = new javax.swing.JButton();
        bcarrito = new javax.swing.JButton();
        bInicio = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaItems = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        aTitulo6 = new javax.swing.JLabel();
        bRealizarPedido = new javax.swing.JButton();
        aTitulo7 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        aTitulo8 = new javax.swing.JLabel();
        aTitulo9 = new javax.swing.JLabel();
        txtProductos = new javax.swing.JTextField();
        listaPago = new javax.swing.JComboBox<>();
        txtPrecioTotal = new javax.swing.JTextField();
        aTitulo10 = new javax.swing.JLabel();
        txtUnidades = new javax.swing.JTextField();
        aTitulo11 = new javax.swing.JLabel();
        aTitulo12 = new javax.swing.JLabel();
        bVaciarCarrito = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        aTitulo.setFont(new java.awt.Font("Calibri", 1, 32)); // NOI18N
        aTitulo.setForeground(new java.awt.Color(102, 0, 255));
        aTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo.setText("Carrito de Compras");

        aTitulo1.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        aTitulo1.setForeground(new java.awt.Color(102, 0, 255));
        aTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo1.setText("Ordena y Empieza a Disfrutar!");

        bsalir.setBackground(new java.awt.Color(102, 0, 255));
        bsalir.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bsalir.setForeground(new java.awt.Color(255, 255, 255));
        bsalir.setText("Cerrar");
        bsalir.setBorder(null);
        bsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bsalir.setFocusPainted(false);
        bsalir.setFocusable(false);
        bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalirActionPerformed(evt);
            }
        });

        bpedido.setBackground(new java.awt.Color(102, 0, 255));
        bpedido.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bpedido.setForeground(new java.awt.Color(255, 255, 255));
        bpedido.setText("Pedidos");
        bpedido.setBorder(null);
        bpedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bpedido.setFocusPainted(false);
        bpedido.setFocusable(false);
        bpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpedidoActionPerformed(evt);
            }
        });

        bcarrito.setBackground(new java.awt.Color(102, 0, 255));
        bcarrito.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bcarrito.setForeground(new java.awt.Color(255, 255, 255));
        bcarrito.setText("Carrito");
        bcarrito.setBorder(null);
        bcarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bcarrito.setFocusPainted(false);
        bcarrito.setFocusable(false);
        bcarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcarritoActionPerformed(evt);
            }
        });

        bInicio.setBackground(new java.awt.Color(102, 0, 255));
        bInicio.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bInicio.setForeground(new java.awt.Color(255, 255, 255));
        bInicio.setText("Inicio");
        bInicio.setBorder(null);
        bInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bInicio.setFocusPainted(false);
        bInicio.setFocusable(false);
        bInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInicioActionPerformed(evt);
            }
        });

        listaItems.setBackground(new java.awt.Color(255, 255, 255));
        listaItems.setForeground(new java.awt.Color(51, 51, 51));
        listaItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaItems.setToolTipText("1,1");
        listaItems.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaItems.setFocusable(false);
        listaItems.setGridColor(new java.awt.Color(255, 255, 255));
        listaItems.setRowHeight(20);
        listaItems.setSelectionBackground(new java.awt.Color(102, 0, 255));
        listaItems.setSelectionForeground(new java.awt.Color(255, 255, 255));
        listaItems.setShowHorizontalLines(false);
        listaItems.setShowVerticalLines(false);
        jScrollPane2.setViewportView(listaItems);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        aTitulo6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        aTitulo6.setForeground(new java.awt.Color(51, 51, 51));
        aTitulo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo6.setText("PEDIDO:");

        bRealizarPedido.setBackground(new java.awt.Color(0, 204, 102));
        bRealizarPedido.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bRealizarPedido.setForeground(new java.awt.Color(255, 255, 255));
        bRealizarPedido.setText("Realizar Pedido");
        bRealizarPedido.setBorder(null);
        bRealizarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bRealizarPedido.setFocusPainted(false);
        bRealizarPedido.setFocusable(false);
        bRealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRealizarPedidoActionPerformed(evt);
            }
        });

        aTitulo7.setBackground(new java.awt.Color(0, 153, 0));
        aTitulo7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo7.setForeground(new java.awt.Color(51, 51, 51));
        aTitulo7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        aTitulo7.setText("Direccion:");

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setForeground(new java.awt.Color(51, 51, 51));

        aTitulo8.setBackground(new java.awt.Color(0, 153, 0));
        aTitulo8.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo8.setForeground(new java.awt.Color(51, 51, 51));
        aTitulo8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        aTitulo8.setText("Metodo de Pago:");

        aTitulo9.setBackground(new java.awt.Color(0, 153, 0));
        aTitulo9.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo9.setForeground(new java.awt.Color(51, 51, 51));
        aTitulo9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        aTitulo9.setText("Productos:");

        txtProductos.setEditable(false);
        txtProductos.setBackground(new java.awt.Color(255, 255, 255));
        txtProductos.setForeground(new java.awt.Color(51, 51, 51));
        txtProductos.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        listaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtPrecioTotal.setEditable(false);
        txtPrecioTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecioTotal.setForeground(new java.awt.Color(51, 51, 51));
        txtPrecioTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        aTitulo10.setBackground(new java.awt.Color(0, 153, 0));
        aTitulo10.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo10.setForeground(new java.awt.Color(51, 51, 51));
        aTitulo10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        aTitulo10.setText("Precio Total:");

        txtUnidades.setEditable(false);
        txtUnidades.setBackground(new java.awt.Color(255, 255, 255));
        txtUnidades.setForeground(new java.awt.Color(51, 51, 51));
        txtUnidades.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUnidades.setSelectedTextColor(new java.awt.Color(0, 204, 102));
        txtUnidades.setSelectionColor(new java.awt.Color(153, 153, 153));

        aTitulo11.setBackground(new java.awt.Color(0, 153, 0));
        aTitulo11.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo11.setForeground(new java.awt.Color(51, 51, 51));
        aTitulo11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        aTitulo11.setText("Unidades:");

        aTitulo12.setBackground(new java.awt.Color(0, 153, 0));
        aTitulo12.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo12.setForeground(new java.awt.Color(255, 51, 51));
        aTitulo12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        aTitulo12.setText("NOTA: Simulacion de realizacion de Pedido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aTitulo12, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(aTitulo10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(aTitulo8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aTitulo7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aTitulo6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(bRealizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(listaPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPrecioTotal)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(aTitulo9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUnidades)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(aTitulo11, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(aTitulo6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aTitulo7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aTitulo8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aTitulo9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aTitulo11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aTitulo10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(bRealizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(aTitulo12)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        bVaciarCarrito.setBackground(new java.awt.Color(0, 204, 102));
        bVaciarCarrito.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bVaciarCarrito.setForeground(new java.awt.Color(255, 255, 255));
        bVaciarCarrito.setText("Vaciar Carrito");
        bVaciarCarrito.setBorder(null);
        bVaciarCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bVaciarCarrito.setFocusPainted(false);
        bVaciarCarrito.setFocusable(false);
        bVaciarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVaciarCarritoActionPerformed(evt);
            }
        });

        bEliminar.setBackground(new java.awt.Color(0, 204, 102));
        bEliminar.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bEliminar.setForeground(new java.awt.Color(255, 255, 255));
        bEliminar.setText("Eliminar");
        bEliminar.setBorder(null);
        bEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bEliminar.setFocusPainted(false);
        bEliminar.setFocusable(false);
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bVaciarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(aTitulo1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(aTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bcarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aTitulo1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bVaciarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        p.CerrarVentana();
    }//GEN-LAST:event_bsalirActionPerformed

    private void bpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpedidoActionPerformed
        p.cambiarVistaPedidos();
    }//GEN-LAST:event_bpedidoActionPerformed

    private void bcarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcarritoActionPerformed
    }//GEN-LAST:event_bcarritoActionPerformed

    private void bInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInicioActionPerformed
        p.cambiarVistainicio();
    }//GEN-LAST:event_bInicioActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
        p.eliminarItem();
    }//GEN-LAST:event_bEliminarActionPerformed

    private void bVaciarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVaciarCarritoActionPerformed
        p.vaciarCarrito();
    }//GEN-LAST:event_bVaciarCarritoActionPerformed

    private void bRealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRealizarPedidoActionPerformed
        p.relizarPedido();
    }//GEN-LAST:event_bRealizarPedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aTitulo;
    private javax.swing.JLabel aTitulo1;
    private javax.swing.JLabel aTitulo10;
    private javax.swing.JLabel aTitulo11;
    private javax.swing.JLabel aTitulo12;
    private javax.swing.JLabel aTitulo6;
    private javax.swing.JLabel aTitulo7;
    private javax.swing.JLabel aTitulo8;
    private javax.swing.JLabel aTitulo9;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bInicio;
    private javax.swing.JButton bRealizarPedido;
    private javax.swing.JButton bVaciarCarrito;
    private javax.swing.JButton bcarrito;
    private javax.swing.JButton bpedido;
    private javax.swing.JButton bsalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listaItems;
    private javax.swing.JComboBox<String> listaPago;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtPrecioTotal;
    private javax.swing.JTextField txtProductos;
    private javax.swing.JTextField txtUnidades;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setPresentador(P_Carrito p) {
        this.p = p;
    }

    @Override
    public void iniciar() {
        pack();
        setLocationRelativeTo(null);
        p.ListarItems();
        setVisible(true);
    }

    @Override
    public void close() {
        setVisible(false);
    }
    
    public void setItems(Carrito carrito){
        DefaultTableModel model = new DefaultTableModel();        
        model.addColumn("Id");
        model.addColumn("Producto");
        model.addColumn("Precio");
        model.addColumn("Cantidad");
        model.addColumn("Total");
        for (ItemsPedido p: carrito.getListaItems()) {
            model.addRow(new Object[]{
                p.getId(),
                p.getProducto().getNombre(),
                p.getProducto().getPrecio(),
                p.getCantidad(),
                p.getProducto().getPrecio()*p.getCantidad()
            });
        }        
        listaItems.setModel(model);
    }
    
    @Override
    public int getIdItem(){
        int i = this.listaItems.getSelectedRow();      
        if (i>0) {
            String id = String.valueOf(this.listaItems.getValueAt(i, 0));
            return Integer.valueOf(id);
        }
        return 0;
    }

    @Override
    public void setDireccion(String s) {
        txtDireccion.setText(s);
    }

    @Override
    public void setPagos(List<String> lista) {
        listaPago.removeAllItems();
        for(String s : lista){
            listaPago.addItem(s);
        }
    }

    @Override public void setProductos(String s) {txtProductos.setText(s); }
    @Override public void setUnidades(String s) {txtUnidades.setText(s); }
    @Override public void setPrecioTotal(String s) {txtPrecioTotal.setText(s); }

    @Override public String getDireccion() {return txtDireccion.getText();}
    @Override public String getPago() { return String.valueOf(listaPago.getSelectedItem());}
    
}
