package presentacion;

import dominio.Categoria;
import dominio.Producto;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class V_MenuCliente extends javax.swing.JFrame implements IV_MenuCliente{

    private P_MenuCliente p;
    
    public V_MenuCliente() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        listaProductos = new javax.swing.JTable();
        listaCategorias = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        aTitulo6 = new javax.swing.JLabel();
        aTitulo7 = new javax.swing.JLabel();
        aTitulo19 = new javax.swing.JLabel();
        aTitulo21 = new javax.swing.JLabel();
        aTitulo23 = new javax.swing.JLabel();
        aTitulo24 = new javax.swing.JLabel();
        bactualizar = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        bguardar = new javax.swing.JButton();
        aTitulo25 = new javax.swing.JLabel();
        txtclave = new javax.swing.JPasswordField();
        txtdireccion = new javax.swing.JTextField();
        aTitulo22 = new javax.swing.JLabel();
        bInicio = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();
        panelProducto = new javax.swing.JPanel();
        txtnombrePro = new javax.swing.JLabel();
        txtdescripcion = new javax.swing.JLabel();
        aTitulo5 = new javax.swing.JLabel();
        aTitulo9 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JLabel();
        aTitulo12 = new javax.swing.JLabel();
        txtstock = new javax.swing.JLabel();
        aTitulo11 = new javax.swing.JLabel();
        Dcantidad = new javax.swing.JSpinner();
        aTitulo14 = new javax.swing.JLabel();
        txttotal = new javax.swing.JLabel();
        bAdd = new javax.swing.JButton();
        txtprecio = new javax.swing.JLabel();
        aTitulo17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        aTitulo.setFont(new java.awt.Font("Calibri", 1, 32)); // NOI18N
        aTitulo.setForeground(new java.awt.Color(102, 0, 255));
        aTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo.setText("¿Hambre?");

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

        listaProductos.setBackground(new java.awt.Color(255, 255, 255));
        listaProductos.setForeground(new java.awt.Color(51, 51, 51));
        listaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        listaProductos.setToolTipText("1,1");
        listaProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaProductos.setFocusable(false);
        listaProductos.setGridColor(new java.awt.Color(255, 255, 255));
        listaProductos.setRowHeight(20);
        listaProductos.setSelectionBackground(new java.awt.Color(102, 0, 255));
        listaProductos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        listaProductos.setShowHorizontalLines(false);
        listaProductos.setShowVerticalLines(false);
        listaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listaProductos);

        listaCategorias.setBackground(new java.awt.Color(255, 255, 255));
        listaCategorias.setForeground(new java.awt.Color(51, 51, 51));
        listaCategorias.setBorder(null);
        listaCategorias.setFocusable(false);
        listaCategorias.setRequestFocusEnabled(false);
        listaCategorias.setVerifyInputWhenFocusTarget(false);
        listaCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaCategoriasActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));

        aTitulo6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        aTitulo6.setForeground(new java.awt.Color(51, 51, 51));
        aTitulo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo6.setText("PERFIL");

        aTitulo7.setBackground(new java.awt.Color(0, 153, 0));
        aTitulo7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo7.setForeground(new java.awt.Color(51, 51, 51));
        aTitulo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo7.setText("Nombre:");

        aTitulo19.setBackground(new java.awt.Color(0, 153, 0));
        aTitulo19.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo19.setForeground(new java.awt.Color(51, 51, 51));
        aTitulo19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo19.setText("Apellido:");

        aTitulo21.setBackground(new java.awt.Color(0, 153, 0));
        aTitulo21.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo21.setForeground(new java.awt.Color(51, 51, 51));
        aTitulo21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo21.setText("Numero:");

        aTitulo23.setBackground(new java.awt.Color(0, 153, 0));
        aTitulo23.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo23.setForeground(new java.awt.Color(51, 51, 51));
        aTitulo23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo23.setText("Correo:");

        aTitulo24.setBackground(new java.awt.Color(0, 153, 0));
        aTitulo24.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo24.setForeground(new java.awt.Color(51, 51, 51));
        aTitulo24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo24.setText("DNI:");

        bactualizar.setBackground(new java.awt.Color(102, 0, 255));
        bactualizar.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bactualizar.setForeground(new java.awt.Color(255, 255, 255));
        bactualizar.setText("Actualizar");
        bactualizar.setBorder(null);
        bactualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bactualizar.setFocusPainted(false);
        bactualizar.setFocusable(false);
        bactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bactualizarActionPerformed(evt);
            }
        });

        txtnombre.setBackground(new java.awt.Color(255, 255, 255));
        txtnombre.setForeground(new java.awt.Color(51, 51, 51));

        txtapellido.setBackground(new java.awt.Color(255, 255, 255));
        txtapellido.setForeground(new java.awt.Color(51, 51, 51));

        txtnumero.setBackground(new java.awt.Color(255, 255, 255));
        txtnumero.setForeground(new java.awt.Color(51, 51, 51));

        txtcorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtcorreo.setForeground(new java.awt.Color(51, 51, 51));

        txtdni.setBackground(new java.awt.Color(255, 255, 255));
        txtdni.setForeground(new java.awt.Color(51, 51, 51));

        bguardar.setBackground(new java.awt.Color(102, 0, 255));
        bguardar.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bguardar.setForeground(new java.awt.Color(255, 255, 255));
        bguardar.setText("Resetear");
        bguardar.setBorder(null);
        bguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bguardar.setFocusPainted(false);
        bguardar.setFocusable(false);
        bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bguardarActionPerformed(evt);
            }
        });

        aTitulo25.setBackground(new java.awt.Color(0, 153, 0));
        aTitulo25.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo25.setForeground(new java.awt.Color(51, 51, 51));
        aTitulo25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo25.setText("Clave:");

        txtclave.setBackground(new java.awt.Color(255, 255, 255));
        txtclave.setForeground(new java.awt.Color(51, 51, 51));

        txtdireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtdireccion.setForeground(new java.awt.Color(51, 51, 51));

        aTitulo22.setBackground(new java.awt.Color(0, 153, 0));
        aTitulo22.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo22.setForeground(new java.awt.Color(51, 51, 51));
        aTitulo22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo22.setText("Direccion:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aTitulo6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aTitulo7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aTitulo19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aTitulo21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(aTitulo22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtnumero, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                .addComponent(txtapellido, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(aTitulo25))
                            .addComponent(aTitulo23)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(aTitulo24)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(bguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(aTitulo6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aTitulo23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(aTitulo7)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aTitulo24)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(aTitulo19)
                        .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aTitulo21)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aTitulo25)
                    .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bguardar)
                        .addComponent(bactualizar)
                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(aTitulo22))
                .addGap(14, 14, 14))
        );

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

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        panelProducto.setBackground(new java.awt.Color(255, 255, 255));
        panelProducto.setForeground(new java.awt.Color(153, 153, 153));
        panelProducto.setMinimumSize(new java.awt.Dimension(491, 210));

        txtnombrePro.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        txtnombrePro.setForeground(new java.awt.Color(51, 51, 51));
        txtnombrePro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtnombrePro.setText("Nombre de Producto");

        txtdescripcion.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtdescripcion.setForeground(new java.awt.Color(51, 51, 51));
        txtdescripcion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtdescripcion.setText("   Nombre de Producto");
        txtdescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        aTitulo5.setBackground(new java.awt.Color(0, 153, 0));
        aTitulo5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo5.setForeground(new java.awt.Color(51, 51, 51));
        aTitulo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo5.setText("Descripcion:");

        aTitulo9.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo9.setForeground(new java.awt.Color(51, 51, 51));
        aTitulo9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        aTitulo9.setText("Categoria:");

        txtCategoria.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtCategoria.setForeground(new java.awt.Color(51, 51, 51));
        txtCategoria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCategoria.setText("   Nombre de Producto");
        txtCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtCategoria.setPreferredSize(new java.awt.Dimension(128, 23));

        aTitulo12.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo12.setForeground(new java.awt.Color(51, 51, 51));
        aTitulo12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        aTitulo12.setText("Existencias:");

        txtstock.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtstock.setForeground(new java.awt.Color(51, 51, 51));
        txtstock.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtstock.setText("   32 Unidades");
        txtstock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        aTitulo11.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo11.setForeground(new java.awt.Color(51, 51, 51));
        aTitulo11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        aTitulo11.setText("Cantidad:");

        Dcantidad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        Dcantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        Dcantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DcantidadStateChanged(evt);
            }
        });

        aTitulo14.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo14.setForeground(new java.awt.Color(51, 51, 51));
        aTitulo14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        aTitulo14.setText("Precio Total:");

        txttotal.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        txttotal.setForeground(new java.awt.Color(51, 51, 51));
        txttotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txttotal.setText("S/ 20123");
        txttotal.setPreferredSize(new java.awt.Dimension(79, 18));

        bAdd.setBackground(new java.awt.Color(0, 204, 102));
        bAdd.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bAdd.setForeground(new java.awt.Color(255, 255, 255));
        bAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agregarCarrito.png"))); // NOI18N
        bAdd.setText("Agregar");
        bAdd.setBorder(null);
        bAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bAdd.setFocusPainted(false);
        bAdd.setFocusable(false);
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        txtprecio.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtprecio.setForeground(new java.awt.Color(51, 51, 51));
        txtprecio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtprecio.setText("   S/ 12.12");
        txtprecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtprecio.setPreferredSize(new java.awt.Dimension(128, 23));

        aTitulo17.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo17.setForeground(new java.awt.Color(51, 51, 51));
        aTitulo17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        aTitulo17.setText("Precio:");

        javax.swing.GroupLayout panelProductoLayout = new javax.swing.GroupLayout(panelProducto);
        panelProducto.setLayout(panelProductoLayout);
        panelProductoLayout.setHorizontalGroup(
            panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductoLayout.createSequentialGroup()
                        .addGroup(panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProductoLayout.createSequentialGroup()
                                .addComponent(aTitulo11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Dcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelProductoLayout.createSequentialGroup()
                                .addComponent(aTitulo14, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductoLayout.createSequentialGroup()
                        .addComponent(aTitulo5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProductoLayout.createSequentialGroup()
                        .addComponent(txtnombrePro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelProductoLayout.createSequentialGroup()
                        .addGroup(panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelProductoLayout.createSequentialGroup()
                                .addComponent(aTitulo17, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelProductoLayout.createSequentialGroup()
                                .addComponent(aTitulo9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aTitulo12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtstock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );
        panelProductoLayout.setVerticalGroup(
            panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtnombrePro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aTitulo5)
                    .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aTitulo9)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aTitulo12)
                    .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductoLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(bAdd))
                    .addGroup(panelProductoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aTitulo17)
                            .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aTitulo11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aTitulo14)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addComponent(panelProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addComponent(panelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(aTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                        .addComponent(bInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bcarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(aTitulo1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(listaCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(listaCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        p.Pedidos();
    }//GEN-LAST:event_bpedidoActionPerformed

    private void bcarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcarritoActionPerformed
        p.Carrito();
    }//GEN-LAST:event_bcarritoActionPerformed

    private void listaCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaCategoriasActionPerformed
        p.listarProductos();
    }//GEN-LAST:event_listaCategoriasActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        p.agregarCarrito();
    }//GEN-LAST:event_bAddActionPerformed

    private void bactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bactualizarActionPerformed
        p.actualizarCliente();
    }//GEN-LAST:event_bactualizarActionPerformed

    private void bguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bguardarActionPerformed
        p.DefinirInformacionPerfil();
    }//GEN-LAST:event_bguardarActionPerformed

    private void listaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProductosMouseClicked
        try {
            panelProducto.setVisible(true);            
            p.DefinirInformacionProducto();
        } catch (Exception e) {
            panelProducto.setVisible(false);
            System.out.println("Error: "+e);            
        }
    }//GEN-LAST:event_listaProductosMouseClicked

    private void DcantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DcantidadStateChanged
        Double value = Double.valueOf(Dcantidad.getValue().toString());
        Double precio = Double.valueOf(txtprecio.getText());
        Double resultado = value*precio;
        txttotal.setText("S/ "+String.valueOf(resultado));
    }//GEN-LAST:event_DcantidadStateChanged

    private void bInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInicioActionPerformed
        p.inicio();
    }//GEN-LAST:event_bInicioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Dcantidad;
    private javax.swing.JLabel aTitulo;
    private javax.swing.JLabel aTitulo1;
    private javax.swing.JLabel aTitulo11;
    private javax.swing.JLabel aTitulo12;
    private javax.swing.JLabel aTitulo14;
    private javax.swing.JLabel aTitulo17;
    private javax.swing.JLabel aTitulo19;
    private javax.swing.JLabel aTitulo21;
    private javax.swing.JLabel aTitulo22;
    private javax.swing.JLabel aTitulo23;
    private javax.swing.JLabel aTitulo24;
    private javax.swing.JLabel aTitulo25;
    private javax.swing.JLabel aTitulo5;
    private javax.swing.JLabel aTitulo6;
    private javax.swing.JLabel aTitulo7;
    private javax.swing.JLabel aTitulo9;
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bInicio;
    private javax.swing.JButton bactualizar;
    private javax.swing.JButton bcarrito;
    private javax.swing.JButton bguardar;
    private javax.swing.JButton bpedido;
    private javax.swing.JButton bsalir;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> listaCategorias;
    private javax.swing.JTable listaProductos;
    private javax.swing.JPanel panelProducto;
    private javax.swing.JLabel txtCategoria;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JPasswordField txtclave;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JLabel txtdescripcion;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JLabel txtnombrePro;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JLabel txtprecio;
    private javax.swing.JLabel txtstock;
    private javax.swing.JLabel txttotal;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setPresentador(P_MenuCliente p) {
        this.p = p;
    }

    @Override
    public void iniciar() {
        pack();
        setLocationRelativeTo(null);
        p.llenarCategorias();
        p.DefinirInformacionPerfil();
        panelProducto.setVisible(false);
        setVisible(true);
    }

    @Override
    public void close() {
        setVisible(false);
    }
    
    @Override
    public String getCategoria() {
        return String.valueOf(listaCategorias.getSelectedItem());  
    }

    @Override
    public void setProductos(Categoria lista) {
        panelProducto.setVisible(false);
        DefaultTableModel model = new DefaultTableModel();        
        model.addColumn("Id");
        model.addColumn("Nombre");
        for (Producto p: lista.getProductos()) {
            model.addRow(new Object[]{p.getId(),p.getNombre()});
        }        
        listaProductos.setModel(model);
    }

    @Override
    public void setCategorias(List<String> lista) {
        listaCategorias.removeAllItems();
        for(String s : lista){
            listaCategorias.addItem(s);
        }
    }

    @Override public void setNombre(String nombre) {txtnombre.setText(nombre);}
    @Override public void setCorreo(String correo) {txtcorreo.setText(correo); }
    @Override public void setContraseña(String clave) {txtclave.setText(clave);}
    @Override public void setDireccion(String direccion) {txtdireccion.setText(direccion);}
    @Override public void setNumero(String numero) {txtnumero.setText(numero);}
    @Override public void setDNI(String dni) {txtdni.setText(dni);}
   
    @Override public void setNombrePro(String nombre) {txtnombrePro.setText(nombre); }
    @Override public void setPrecio(String precio) {txtprecio.setText(precio);}
    @Override public void setStock(String stock) {txtstock.setText(stock);}
    @Override public void setDescripcion(String descripcion) {txtdescripcion.setText(descripcion);}
    @Override public void setCategoria(String categoria) {txtCategoria.setText(categoria);}
    @Override public void setTotal(String total) { txttotal.setText(total);}
    @Override public void setApellido(String apellido) {txtapellido.setText(apellido);}

    @Override public String getNombre() {return txtnombre.getText(); }
    @Override public String getCorreo() {return txtcorreo.getText();}
    @Override public String getApellido() {return txtapellido.getText();}
    @Override public String getContraseña() {return txtclave.getText();}
    @Override public String getDireccion() {return txtdireccion.getText();}
    @Override public String getNumero() {return txtnumero.getText();}
    @Override public String getDNI() {return txtdni.getText();}

    @Override
    public int getCantidadProducto() {
        return Integer.valueOf(Dcantidad.getValue().toString());
    }
    
    @Override
    public int getIdProducto(){
        int i = this.listaProductos.getSelectedRow();          
        String id = String.valueOf(this.listaProductos.getValueAt(i, 0));
        return Integer.valueOf(id);
    }
}
