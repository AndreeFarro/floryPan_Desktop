package presentacion;

import dominio.Cliente;
import dominio.Pedido;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class V_Pedidos extends javax.swing.JFrame implements IV_Pedido{

    private P_Pedido p;
    public V_Pedidos() {
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
        listaPedidos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        panelDate = new javax.swing.JPanel();
        titulo0 = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        txtResponsable = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JLabel();
        titulo4 = new javax.swing.JLabel();
        txtdni = new javax.swing.JLabel();
        titulo3 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JLabel();
        titulo5 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JLabel();
        txtPago = new javax.swing.JLabel();
        titulo6 = new javax.swing.JLabel();
        titulo7 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaItems = new javax.swing.JTable();
        titulo8 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JLabel();
        txttotal = new javax.swing.JLabel();
        titulo9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        aTitulo.setFont(new java.awt.Font("Calibri", 1, 32)); // NOI18N
        aTitulo.setForeground(new java.awt.Color(102, 0, 255));
        aTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo.setText("Pedidos Realizados");

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.setMaximumSize(new java.awt.Dimension(580, 362));
        jPanel3.setMinimumSize(new java.awt.Dimension(580, 362));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDate.setBackground(new java.awt.Color(255, 255, 255));

        titulo0.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        titulo0.setForeground(new java.awt.Color(51, 51, 51));
        titulo0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo0.setText("PEDIDO");

        titulo1.setBackground(new java.awt.Color(0, 153, 0));
        titulo1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        titulo1.setForeground(new java.awt.Color(51, 51, 51));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("Responsable:");

        titulo2.setBackground(new java.awt.Color(0, 153, 0));
        titulo2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        titulo2.setForeground(new java.awt.Color(51, 51, 51));
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("Direccion:");

        txtResponsable.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtResponsable.setForeground(new java.awt.Color(51, 51, 51));
        txtResponsable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtResponsable.setText("Andree Farro");
        txtResponsable.setToolTipText("");

        txtDireccion.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(51, 51, 51));
        txtDireccion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDireccion.setText("Av. Miraflores P2 lt3 301 Mz C");
        txtDireccion.setToolTipText("");

        titulo4.setBackground(new java.awt.Color(0, 153, 0));
        titulo4.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        titulo4.setForeground(new java.awt.Color(51, 51, 51));
        titulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo4.setText("DNI:");

        txtdni.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtdni.setForeground(new java.awt.Color(51, 51, 51));
        txtdni.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtdni.setText("75866485");
        txtdni.setToolTipText("");

        titulo3.setBackground(new java.awt.Color(0, 153, 0));
        titulo3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        titulo3.setForeground(new java.awt.Color(51, 51, 51));
        titulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo3.setText("Numero:");

        txtnumero.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtnumero.setForeground(new java.awt.Color(51, 51, 51));
        txtnumero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtnumero.setText("938624374");
        txtnumero.setToolTipText("");

        titulo5.setBackground(new java.awt.Color(0, 153, 0));
        titulo5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        titulo5.setForeground(new java.awt.Color(51, 51, 51));
        titulo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo5.setText("Fecha:");

        txtfecha.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtfecha.setForeground(new java.awt.Color(51, 51, 51));
        txtfecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtfecha.setText("2020/1/12");
        txtfecha.setToolTipText("");

        txtPago.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtPago.setForeground(new java.awt.Color(51, 51, 51));
        txtPago.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtPago.setText("YAPE, 98192742");
        txtPago.setToolTipText("");

        titulo6.setBackground(new java.awt.Color(0, 153, 0));
        titulo6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        titulo6.setForeground(new java.awt.Color(51, 51, 51));
        titulo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo6.setText("Metodo de Pago:");

        titulo7.setBackground(new java.awt.Color(0, 153, 0));
        titulo7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        titulo7.setForeground(new java.awt.Color(51, 51, 51));
        titulo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo7.setText("Estado:");

        txtEstado.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(51, 51, 51));
        txtEstado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtEstado.setText("PENDIENTE");
        txtEstado.setToolTipText("");

        listaItems.setBackground(new java.awt.Color(255, 255, 255));
        listaItems.setForeground(new java.awt.Color(51, 51, 51));
        listaItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
        listaItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaItemsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listaItems);

        titulo8.setBackground(new java.awt.Color(0, 153, 0));
        titulo8.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        titulo8.setForeground(new java.awt.Color(51, 51, 51));
        titulo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo8.setText("Correo:");

        txtCorreo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(51, 51, 51));
        txtCorreo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCorreo.setText("andreefarro758@gmail.com");
        txtCorreo.setToolTipText("");

        txttotal.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txttotal.setForeground(new java.awt.Color(51, 51, 51));
        txttotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txttotal.setText("75866485");
        txttotal.setToolTipText("");
        txttotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        titulo9.setBackground(new java.awt.Color(0, 153, 0));
        titulo9.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        titulo9.setForeground(new java.awt.Color(51, 51, 51));
        titulo9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo9.setText("Total:");

        javax.swing.GroupLayout panelDateLayout = new javax.swing.GroupLayout(panelDate);
        panelDate.setLayout(panelDateLayout);
        panelDateLayout.setHorizontalGroup(
            panelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDateLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDateLayout.createSequentialGroup()
                        .addComponent(titulo0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelDateLayout.createSequentialGroup()
                            .addComponent(titulo9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txttotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDateLayout.createSequentialGroup()
                            .addGroup(panelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(titulo1)
                                .addComponent(titulo2)
                                .addComponent(titulo3)
                                .addComponent(titulo4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtnumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtResponsable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(titulo6)
                                .addComponent(titulo7)
                                .addComponent(titulo8)
                                .addComponent(titulo5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPago, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 26, 26))
        );
        panelDateLayout.setVerticalGroup(
            panelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDateLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titulo0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDateLayout.createSequentialGroup()
                        .addGroup(panelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titulo1)
                            .addComponent(txtResponsable)
                            .addComponent(titulo5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titulo2)
                            .addComponent(txtDireccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titulo3)
                            .addComponent(txtnumero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titulo4)
                            .addComponent(txtdni)))
                    .addGroup(panelDateLayout.createSequentialGroup()
                        .addComponent(txtfecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPago)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreo))
                    .addGroup(panelDateLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(titulo6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo8)))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txttotal, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(titulo9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(panelDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, 566, 346));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aTitulo)
                            .addComponent(aTitulo1))
                        .addGap(57, 57, 57)
                        .addComponent(bInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bcarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(aTitulo1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bsalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bpedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bcarrito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(aTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(453, 453, 453))))
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
        p.salir();
    }//GEN-LAST:event_bsalirActionPerformed

    private void bpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpedidoActionPerformed

    }//GEN-LAST:event_bpedidoActionPerformed

    private void bcarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcarritoActionPerformed
        p.Carrito();
    }//GEN-LAST:event_bcarritoActionPerformed

    private void bInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInicioActionPerformed
        p.inicio();
    }//GEN-LAST:event_bInicioActionPerformed

    private void listaPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPedidosMouseClicked
        p.iniciarDatos();
    }//GEN-LAST:event_listaPedidosMouseClicked

    private void listaItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaItemsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listaItemsMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aTitulo;
    private javax.swing.JLabel aTitulo1;
    private javax.swing.JButton bInicio;
    private javax.swing.JButton bcarrito;
    private javax.swing.JButton bpedido;
    private javax.swing.JButton bsalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable listaItems;
    private javax.swing.JTable listaPedidos;
    private javax.swing.JPanel panelDate;
    private javax.swing.JLabel titulo0;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    private javax.swing.JLabel titulo5;
    private javax.swing.JLabel titulo6;
    private javax.swing.JLabel titulo7;
    private javax.swing.JLabel titulo8;
    private javax.swing.JLabel titulo9;
    private javax.swing.JLabel txtCorreo;
    private javax.swing.JLabel txtDireccion;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtPago;
    private javax.swing.JLabel txtResponsable;
    private javax.swing.JLabel txtdni;
    private javax.swing.JLabel txtfecha;
    private javax.swing.JLabel txtnumero;
    private javax.swing.JLabel txttotal;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setPresentador(P_Pedido p) {
        this.p = p;
    }

    @Override
    public void iniciar() {
        pack();
        setLocationRelativeTo(null);
        p.listarPedidos();
        setVisible(true);
        panelDate.setVisible(false);
        jPanel3.setSize(580, 362);
    }

    @Override
    public void close() {
        setVisible(false);
    }
    
    @Override
    public void setPedidos(Cliente cliente){
        DefaultTableModel model = new DefaultTableModel();        
        model.addColumn("Id");
        model.addColumn("Fecha");
        model.addColumn("Estado");
        cliente.getPedidos().forEach((p) -> {
            model.addRow(new Object[]{
                p.getId(),
                new SimpleDateFormat("dd-MM-yyyy").format(p.getFecha()),
                p.getEstado()
            });
        });        
        listaPedidos.setModel(model);
    }
    
    @Override
    public void setItems(Pedido pedido){
        DefaultTableModel model = new DefaultTableModel();        
        model.addColumn("Id");
        model.addColumn("nombre");
        model.addColumn("Precio");
        model.addColumn("Cantidad");
        model.addColumn("Precio Total");
        pedido.getItems().forEach((item) -> {
            model.addRow(new Object[]{
                item.getId(),
                item.getProducto().getNombre(),
                item.getProducto().getPrecio(),
                item.getCantidad(),
                item.getCantidad()*item.getProducto().getPrecio()
            });
        });        
        listaItems.setModel(model);
    }
    
        @Override
    public int getIdPedido(){
        int i = this.listaPedidos.getSelectedRow();              
        String id = String.valueOf(this.listaPedidos.getValueAt(i, 0));
        panelDate.setVisible(true);
        return Integer.valueOf(id);
        
    }

    @Override public void setResponsable(String s) { txtResponsable.setText(s);}
    @Override public void setDireccion(String s) { txtDireccion.setText(s);}
    @Override public void setCorreo(String s) { txtCorreo.setText(s);}
    @Override public void setNumero(String s) { txtnumero.setText(s);}
    @Override public void setDNI(String s) { txtdni.setText(s);}
    @Override public void setFecha(String s) { txtfecha.setText(s);}
    @Override public void setPago(String s) { txtPago.setText(s);}
    @Override public void setEstado(String s) { txtEstado.setText(s); }
    @Override public void setTotal(String s) { txttotal.setText(s);}
}
