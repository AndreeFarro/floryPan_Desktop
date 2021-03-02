package presentacion;

import dominio.ItemsPedido;
import dominio.Pedido;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class V_AdminPedidos extends javax.swing.JFrame implements IV_AdminPedidos{
    private P_AdminPedidos p;
    public V_AdminPedidos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        binicio = new javax.swing.JButton();
        bcerrar = new javax.swing.JButton();
        bpedido = new javax.swing.JButton();
        aTitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPedidos = new javax.swing.JTable();
        bAprobar = new javax.swing.JButton();
        bPendientes = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaItems = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        binicio.setBackground(new java.awt.Color(102, 0, 255));
        binicio.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        binicio.setForeground(new java.awt.Color(255, 255, 255));
        binicio.setText("Inicio");
        binicio.setBorder(null);
        binicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        binicio.setDefaultCapable(false);
        binicio.setFocusPainted(false);
        binicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binicioActionPerformed(evt);
            }
        });

        bcerrar.setBackground(new java.awt.Color(102, 0, 255));
        bcerrar.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bcerrar.setForeground(new java.awt.Color(255, 255, 255));
        bcerrar.setText("Cerrar");
        bcerrar.setBorder(null);
        bcerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bcerrar.setFocusPainted(false);
        bcerrar.setFocusable(false);
        bcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcerrarActionPerformed(evt);
            }
        });

        bpedido.setBackground(new java.awt.Color(102, 0, 255));
        bpedido.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bpedido.setForeground(new java.awt.Color(255, 255, 255));
        bpedido.setText("Pedidos");
        bpedido.setBorder(null);
        bpedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bpedido.setDefaultCapable(false);
        bpedido.setFocusPainted(false);

        aTitulo.setFont(new java.awt.Font("Calibri", 1, 32)); // NOI18N
        aTitulo.setForeground(new java.awt.Color(102, 0, 255));
        aTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo.setText("Administrar Pedidos");

        listaPedidos.setBackground(new java.awt.Color(255, 255, 255));
        listaPedidos.setForeground(new java.awt.Color(51, 51, 51));
        listaPedidos.setModel(new javax.swing.table.DefaultTableModel(
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
        listaPedidos.setToolTipText("1,1");
        listaPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaPedidos.setFocusable(false);
        listaPedidos.setGridColor(new java.awt.Color(255, 255, 255));
        listaPedidos.setRowHeight(20);
        listaPedidos.setSelectionBackground(new java.awt.Color(102, 0, 255));
        listaPedidos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        listaPedidos.setShowHorizontalLines(false);
        listaPedidos.setShowVerticalLines(false);
        listaPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPedidosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listaPedidos);

        bAprobar.setBackground(new java.awt.Color(0, 204, 102));
        bAprobar.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bAprobar.setForeground(new java.awt.Color(255, 255, 255));
        bAprobar.setText("Aprobar Pedido");
        bAprobar.setBorder(null);
        bAprobar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAprobar.setFocusPainted(false);
        bAprobar.setFocusable(false);
        bAprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAprobarActionPerformed(evt);
            }
        });

        bPendientes.setBackground(new java.awt.Color(0, 204, 102));
        bPendientes.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bPendientes.setForeground(new java.awt.Color(255, 255, 255));
        bPendientes.setText("Pedidos Pendientes");
        bPendientes.setBorder(null);
        bPendientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bPendientes.setFocusPainted(false);
        bPendientes.setFocusable(false);
        bPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPendientesActionPerformed(evt);
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
        jScrollPane3.setViewportView(listaItems);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bAprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(aTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                                .addComponent(binicio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aTitulo)
                    .addComponent(bpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(binicio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bAprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
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

    private void bcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcerrarActionPerformed
        p.CerrarVentana();
    }//GEN-LAST:event_bcerrarActionPerformed

    private void bAprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAprobarActionPerformed
        p.aprobarPedido();
    }//GEN-LAST:event_bAprobarActionPerformed

    private void bPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPendientesActionPerformed
        p.listarPedidosPendientes();
    }//GEN-LAST:event_bPendientesActionPerformed

    private void listaPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPedidosMouseClicked
        p.listarItems();
    }//GEN-LAST:event_listaPedidosMouseClicked

    private void binicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binicioActionPerformed
        p.CambiarVistaAdmin();
    }//GEN-LAST:event_binicioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aTitulo;
    private javax.swing.JButton bAprobar;
    private javax.swing.JButton bPendientes;
    private javax.swing.JButton bcerrar;
    private javax.swing.JButton binicio;
    private javax.swing.JButton bpedido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable listaItems;
    private javax.swing.JTable listaPedidos;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setPresentador(P_AdminPedidos p) {
        this.p = p;
    }

    @Override
    public void iniciar() {
        pack();
        setLocationRelativeTo(null);
        p.listarPedidos();
        setVisible(true);
    }

    @Override
    public void close() {
        setVisible(false);
    }
    
    @Override
    public void setPedidos(ArrayList<Pedido> pedidos){
        DefaultTableModel model = new DefaultTableModel();        
        model.addColumn("Id");
        model.addColumn("Direccion");
        model.addColumn("Fecha");
        model.addColumn("Estado");
        for (Pedido p: pedidos) {
            model.addRow(new Object[]{
                p.getId(),
                p.getDireccion(),
                p.getFecha(),
                p.getEstado()
            });
        }        
        listaPedidos.setModel(model);
    }
    @Override
    public void setItems(ArrayList<ItemsPedido> items){
        DefaultTableModel model = new DefaultTableModel();        
        model.addColumn("Id");
        model.addColumn("Producto");
        model.addColumn("Precio");
        model.addColumn("Cantidad");
        model.addColumn("Total");
        Double total = 0.0;
        int Contador = items.size();
        int i =0;
        for (ItemsPedido p: items) {
            i++;
            total += p.getProducto().getPrecio()*p.getCantidad();
            model.addRow(new Object[]{
                p.getId(),
                p.getProducto().getNombre(),
                p.getProducto().getPrecio(),
                p.getCantidad(),
                p.getProducto().getPrecio()*p.getCantidad()
            });
            if (Contador==i) {
                model.addRow(new Object[]{
                    "",
                    "",
                    "",
                    "Total",
                    total
                });
            }
        }        
        listaItems.setModel(model);
    }
    @Override
    public int getIdPedido(){
        int i = this.listaPedidos.getSelectedRow();              
        String id = String.valueOf(this.listaPedidos.getValueAt(i, 0));
        return Integer.valueOf(id);
        
    }
}
