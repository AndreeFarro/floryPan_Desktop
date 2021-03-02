package presentacion;
public class V_Login extends javax.swing.JFrame implements IV_Login{
    public V_Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        aTitulo = new javax.swing.JLabel();
        acorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        acontra = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        bingresar = new javax.swing.JButton();
        txtMensaje = new javax.swing.JLabel();
        bregistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        aTitulo.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        aTitulo.setForeground(new java.awt.Color(102, 0, 255));
        aTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo.setText("INICIAR SESION");

        acorreo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        acorreo.setForeground(new java.awt.Color(102, 0, 255));
        acorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acorreo.setText("Correo:");

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setForeground(new java.awt.Color(51, 51, 51));
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtContra.setBackground(new java.awt.Color(255, 255, 255));
        txtContra.setForeground(new java.awt.Color(51, 51, 51));
        txtContra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        acontra.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        acontra.setForeground(new java.awt.Color(102, 0, 255));
        acontra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acontra.setText("Constraseña:");

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N

        bingresar.setBackground(new java.awt.Color(102, 0, 255));
        bingresar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        bingresar.setForeground(new java.awt.Color(255, 255, 255));
        bingresar.setText("INGRESAR");
        bingresar.setBorder(null);
        bingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bingresar.setFocusPainted(false);

        txtMensaje.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtMensaje.setForeground(new java.awt.Color(255, 102, 102));
        txtMensaje.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtMensaje.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        bregistrar.setBackground(new java.awt.Color(255, 255, 255));
        bregistrar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        bregistrar.setForeground(new java.awt.Color(102, 0, 255));
        bregistrar.setText("Registrarse");
        bregistrar.setBorder(null);
        bregistrar.setBorderPainted(false);
        bregistrar.setContentAreaFilled(false);
        bregistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(278, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(acorreo)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(acontra, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtContra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bregistrar)))
                        .addGap(269, 269, 269))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(364, 364, 364))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(aTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(acorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(acontra, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bregistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aTitulo;
    private javax.swing.JLabel acontra;
    private javax.swing.JLabel acorreo;
    private javax.swing.JButton bingresar;
    private javax.swing.JButton bregistrar;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JLabel txtMensaje;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setPresentador(P_Login p) {
        bingresar.addActionListener(p);
        bregistrar.addActionListener(p);
    }

    @Override
    public void iniciar() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void close() {
        setVisible(false);
    }

    @Override
    public void setMsm(String s) {
        txtMensaje.setText(s);
    }

    @Override
    public String getCorreo() {
        return txtCorreo.getText();
    }

    @Override
    public String getClave() {
        return txtContra.getText();
    }
}
