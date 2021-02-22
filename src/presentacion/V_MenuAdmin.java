package presentacion;
import dominio.Categoria;
import dominio.Producto;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class V_MenuAdmin extends javax.swing.JFrame implements IV_MenuAdmin{

    private P_MenuAdmin p;
    private String id;
    public V_MenuAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        aTitulo = new javax.swing.JLabel();
        txtnameCat = new javax.swing.JTextField();
        aTitulo1 = new javax.swing.JLabel();
        txtnameProd = new javax.swing.JTextField();
        aTitulo2 = new javax.swing.JLabel();
        crearCategoria = new javax.swing.JButton();
        txtPrecio = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        aTitulo3 = new javax.swing.JLabel();
        aTitulo5 = new javax.swing.JLabel();
        aTitulo6 = new javax.swing.JLabel();
        aTitulo7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        aTitulo8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaProductos = new javax.swing.JTable();
        listaCategorias = new javax.swing.JComboBox<>();
        aTitulo9 = new javax.swing.JLabel();
        binsert = new javax.swing.JButton();
        bpedido = new javax.swing.JButton();
        bupdate = new javax.swing.JButton();
        bdelete = new javax.swing.JButton();
        bdelete1 = new javax.swing.JButton();
        txtMsm = new javax.swing.JLabel();
        bSaveupdate = new javax.swing.JButton();
        bperfil = new javax.swing.JButton();
        bcerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        aTitulo.setFont(new java.awt.Font("Calibri", 1, 32)); // NOI18N
        aTitulo.setForeground(new java.awt.Color(102, 0, 255));
        aTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo.setText("Administrador");

        txtnameCat.setBackground(new java.awt.Color(255, 255, 255));
        txtnameCat.setForeground(new java.awt.Color(51, 51, 51));
        txtnameCat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnameCat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        aTitulo1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        aTitulo1.setForeground(new java.awt.Color(102, 0, 255));
        aTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo1.setText("CATEGORIA:");

        txtnameProd.setBackground(new java.awt.Color(255, 255, 255));
        txtnameProd.setForeground(new java.awt.Color(51, 51, 51));
        txtnameProd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnameProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        aTitulo2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        aTitulo2.setForeground(new java.awt.Color(102, 0, 255));
        aTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo2.setText("PRODUCTO:");

        crearCategoria.setBackground(new java.awt.Color(102, 0, 255));
        crearCategoria.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        crearCategoria.setForeground(new java.awt.Color(255, 255, 255));
        crearCategoria.setText("Add");
        crearCategoria.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 255)));
        crearCategoria.setBorderPainted(false);
        crearCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCategoriaActionPerformed(evt);
            }
        });

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setForeground(new java.awt.Color(51, 51, 51));
        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtStock.setBackground(new java.awt.Color(255, 255, 255));
        txtStock.setForeground(new java.awt.Color(51, 51, 51));
        txtStock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        aTitulo3.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo3.setForeground(new java.awt.Color(102, 0, 255));
        aTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo3.setText("Nombre:");

        aTitulo5.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo5.setForeground(new java.awt.Color(102, 0, 255));
        aTitulo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo5.setText("Stock:");

        aTitulo6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo6.setForeground(new java.awt.Color(102, 0, 255));
        aTitulo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo6.setText("Precio:");

        aTitulo7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo7.setForeground(new java.awt.Color(102, 0, 255));
        aTitulo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo7.setText("Descripcion:");

        txtSalida.setBackground(new java.awt.Color(255, 255, 255));
        txtSalida.setColumns(20);
        txtSalida.setForeground(new java.awt.Color(51, 51, 51));
        txtSalida.setRows(5);
        txtSalida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jScrollPane1.setViewportView(txtSalida);

        aTitulo8.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo8.setForeground(new java.awt.Color(102, 0, 255));
        aTitulo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo8.setText("Nombre:");

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

        aTitulo9.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        aTitulo9.setForeground(new java.awt.Color(102, 0, 255));
        aTitulo9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo9.setText("Categoria:");

        binsert.setBackground(new java.awt.Color(102, 0, 255));
        binsert.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        binsert.setForeground(new java.awt.Color(255, 255, 255));
        binsert.setText("Insert");
        binsert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 255)));
        binsert.setBorderPainted(false);
        binsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        binsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binsertActionPerformed(evt);
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

        bupdate.setBackground(new java.awt.Color(102, 0, 255));
        bupdate.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bupdate.setForeground(new java.awt.Color(255, 255, 255));
        bupdate.setText("Update");
        bupdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 255)));
        bupdate.setBorderPainted(false);
        bupdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupdateActionPerformed(evt);
            }
        });

        bdelete.setBackground(new java.awt.Color(102, 0, 255));
        bdelete.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bdelete.setForeground(new java.awt.Color(255, 255, 255));
        bdelete.setText("Delete");
        bdelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 255)));
        bdelete.setBorderPainted(false);
        bdelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });

        bdelete1.setBackground(new java.awt.Color(102, 0, 255));
        bdelete1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bdelete1.setForeground(new java.awt.Color(255, 255, 255));
        bdelete1.setText("Delete");
        bdelete1.setBorder(null);
        bdelete1.setBorderPainted(false);
        bdelete1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bdelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdelete1ActionPerformed(evt);
            }
        });

        txtMsm.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        txtMsm.setForeground(new java.awt.Color(255, 102, 102));
        txtMsm.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtMsm.setText("Porfavor seleccione un producto...");

        bSaveupdate.setBackground(new java.awt.Color(102, 0, 255));
        bSaveupdate.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bSaveupdate.setForeground(new java.awt.Color(255, 255, 255));
        bSaveupdate.setText("Save");
        bSaveupdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 255)));
        bSaveupdate.setBorderPainted(false);
        bSaveupdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bSaveupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveupdateActionPerformed(evt);
            }
        });

        bperfil.setBackground(new java.awt.Color(102, 0, 255));
        bperfil.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        bperfil.setForeground(new java.awt.Color(255, 255, 255));
        bperfil.setText("Perfil");
        bperfil.setBorder(null);
        bperfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bperfil.setDefaultCapable(false);
        bperfil.setFocusPainted(false);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aTitulo3)
                            .addComponent(aTitulo6)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(aTitulo5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtStock)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(binsert, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bSaveupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtnameProd)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtnameCat, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crearCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aTitulo8)
                            .addComponent(aTitulo1)
                            .addComponent(aTitulo7)
                            .addComponent(aTitulo2)
                            .addComponent(aTitulo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txtMsm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(aTitulo9)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(listaCategorias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bdelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aTitulo)
                    .addComponent(bpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(aTitulo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aTitulo8)
                            .addComponent(aTitulo9))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnameCat, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crearCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listaCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bdelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(304, 304, 304))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(aTitulo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(aTitulo3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnameProd, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(aTitulo6)
                                    .addComponent(aTitulo5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aTitulo7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(binsert, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMsm)
                        .addComponent(bSaveupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
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

    private void crearCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCategoriaActionPerformed
        p.crearCategoria();
        reset();
    }//GEN-LAST:event_crearCategoriaActionPerformed

    private void listaCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaCategoriasActionPerformed
        p.listarProductos();
    }//GEN-LAST:event_listaCategoriasActionPerformed

    private void binsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binsertActionPerformed
        p.crearProducto();
        reset();
        p.listarProductos();
    }//GEN-LAST:event_binsertActionPerformed

    private void bupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdateActionPerformed
        try {
            txtMsm.setVisible(false);
            bSaveupdate.setVisible(true);
            int i = this.listaProductos.getSelectedRow();            
            id =String.valueOf(this.listaProductos.getValueAt(i, 0));
            txtnameProd.setText(String.valueOf(this.listaProductos.getValueAt(i, 1)));
            txtPrecio.setText(String.valueOf(this.listaProductos.getValueAt(i, 2)));
            txtStock.setText(String.valueOf(this.listaProductos.getValueAt(i, 3)));
            txtSalida.setText(String.valueOf(this.listaProductos.getValueAt(i, 4)));
            binsert.setVisible(false);
        } catch (Exception e) {
            txtMsm.setVisible(true);
            bSaveupdate.setVisible(false);
        }
            
    }//GEN-LAST:event_bupdateActionPerformed

    private void bSaveupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveupdateActionPerformed
       binsert.setVisible(true);
       bSaveupdate.setVisible(false);
       p.actualizarProducto(id);
       reset();
       p.listarProductos();
    }//GEN-LAST:event_bSaveupdateActionPerformed

    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
        try {
            txtMsm.setVisible(false);
            int i = this.listaProductos.getSelectedRow();            
            p.eliminarProducto(String.valueOf(this.listaProductos.getValueAt(i, 0)));
            p.listarProductos();
        } catch (Exception e) {
            txtMsm.setVisible(true);
        }
    }//GEN-LAST:event_bdeleteActionPerformed

    private void bdelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdelete1ActionPerformed
        p.eliminarCategoria();
        p.llenarCategorias();
    }//GEN-LAST:event_bdelete1ActionPerformed

    private void bcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcerrarActionPerformed
        p.cerrar();
    }//GEN-LAST:event_bcerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aTitulo;
    private javax.swing.JLabel aTitulo1;
    private javax.swing.JLabel aTitulo2;
    private javax.swing.JLabel aTitulo3;
    private javax.swing.JLabel aTitulo5;
    private javax.swing.JLabel aTitulo6;
    private javax.swing.JLabel aTitulo7;
    private javax.swing.JLabel aTitulo8;
    private javax.swing.JLabel aTitulo9;
    private javax.swing.JButton bSaveupdate;
    private javax.swing.JButton bcerrar;
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bdelete1;
    private javax.swing.JButton binsert;
    private javax.swing.JButton bpedido;
    private javax.swing.JButton bperfil;
    private javax.swing.JButton bupdate;
    private javax.swing.JButton crearCategoria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> listaCategorias;
    private javax.swing.JTable listaProductos;
    private javax.swing.JLabel txtMsm;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextArea txtSalida;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtnameCat;
    private javax.swing.JTextField txtnameProd;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setPresentador(P_MenuAdmin p) {
        this.p = p;
    }

    @Override
    public void iniciar() {
        pack();
        setLocationRelativeTo(null);
        p.llenarCategorias();
        setVisible(true);     
        txtMsm.setVisible(false);
        bSaveupdate.setVisible(false);
    }

    @Override
    public void close() {
        setVisible(false);
    }

    @Override
    public String getNameCat() {
        return txtnameCat.getText();
    }

    @Override
    public String getNameProd() {
        return txtnameProd.getText();
    }

    @Override
    public String getPrecio() {
        return txtPrecio.getText();
    }

    @Override
    public String getStock() {
        return txtStock.getText();
    }

    @Override
    public String getDescripcion() {
        return txtSalida.getText();
    }

    @Override
    public void setCategorias(List<String> lista) {
        listaCategorias.removeAllItems();
        for(String s : lista){
            listaCategorias.addItem(s);
        }
    }

    @Override
    public String getCategoria() {
        return String.valueOf(listaCategorias.getSelectedItem());  
    }
    public void reset(){
        txtPrecio.setText("");
        txtSalida.setText("");
        txtStock.setText("");
        txtnameCat.setText("");
        txtnameProd.setText("");
    }
    
    @Override
    public void setProductos(Categoria lista){
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Precio");
        model.addColumn("stock");
        model.addColumn("descripcion");

        for (Producto p: lista.getProductos()) {
            model.addRow(new Object[]{p.getId(),p.getNombre(),p.getPrecio(),p.getStock(),p.getDescripcion()});
        }        
        listaProductos.setModel(model);
    }
}
