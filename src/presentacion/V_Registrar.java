package presentacion;
public class V_Registrar extends javax.swing.JFrame implements IV_Registrar{

    public V_Registrar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        aTitulo = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        anombre = new javax.swing.JLabel();
        aapellido = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        adni = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        adireccion = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        acorreo = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        anumero = new javax.swing.JLabel();
        avalidar = new javax.swing.JLabel();
        acontraseña = new javax.swing.JLabel();
        txtverificar = new javax.swing.JPasswordField();
        aexpresion = new javax.swing.JLabel();
        bregistrar = new javax.swing.JButton();
        txtcontra = new javax.swing.JPasswordField();
        txtCompletar = new javax.swing.JLabel();
        txtigualdad = new javax.swing.JLabel();
        bRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        aTitulo.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        aTitulo.setForeground(new java.awt.Color(102, 0, 255));
        aTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aTitulo.setText("REGISTRAR");

        txtnombre.setBackground(new java.awt.Color(255, 255, 255));
        txtnombre.setForeground(new java.awt.Color(51, 51, 51));
        txtnombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        anombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        anombre.setForeground(new java.awt.Color(102, 0, 255));
        anombre.setText("Nombre:");

        aapellido.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        aapellido.setForeground(new java.awt.Color(102, 0, 255));
        aapellido.setText("Apellido:");

        txtapellido.setBackground(new java.awt.Color(255, 255, 255));
        txtapellido.setForeground(new java.awt.Color(51, 51, 51));
        txtapellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtapellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        adni.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        adni.setForeground(new java.awt.Color(102, 0, 255));
        adni.setText("DNI:");

        txtdni.setBackground(new java.awt.Color(255, 255, 255));
        txtdni.setForeground(new java.awt.Color(51, 51, 51));
        txtdni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        adireccion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        adireccion.setForeground(new java.awt.Color(102, 0, 255));
        adireccion.setText("Direccion:");

        txtdireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtdireccion.setForeground(new java.awt.Color(51, 51, 51));
        txtdireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setForeground(new java.awt.Color(51, 51, 51));
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        acorreo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        acorreo.setForeground(new java.awt.Color(102, 0, 255));
        acorreo.setText("Correo:");

        txtnumero.setBackground(new java.awt.Color(255, 255, 255));
        txtnumero.setForeground(new java.awt.Color(51, 51, 51));
        txtnumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        anumero.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        anumero.setForeground(new java.awt.Color(102, 0, 255));
        anumero.setText("Numero Movil:");

        avalidar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        avalidar.setForeground(new java.awt.Color(102, 0, 255));
        avalidar.setText("Verificar Contraseña:");

        acontraseña.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        acontraseña.setForeground(new java.awt.Color(102, 0, 255));
        acontraseña.setText("Contraseña:");

        txtverificar.setBackground(new java.awt.Color(255, 255, 255));
        txtverificar.setForeground(new java.awt.Color(51, 51, 51));
        txtverificar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtverificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        aexpresion.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        aexpresion.setForeground(new java.awt.Color(102, 0, 255));
        aexpresion.setText("Disfruta de una Nueva Experiencia con Nosotros!");

        bregistrar.setBackground(new java.awt.Color(102, 0, 255));
        bregistrar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        bregistrar.setForeground(new java.awt.Color(255, 255, 255));
        bregistrar.setText("REGISTRARSE");
        bregistrar.setBorder(null);
        bregistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bregistrar.setFocusPainted(false);

        txtcontra.setBackground(new java.awt.Color(255, 255, 255));
        txtcontra.setForeground(new java.awt.Color(51, 51, 51));
        txtcontra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcontra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtCompletar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtCompletar.setForeground(new java.awt.Color(255, 102, 102));

        txtigualdad.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtigualdad.setForeground(new java.awt.Color(255, 102, 102));

        bRegresar.setBackground(new java.awt.Color(255, 255, 255));
        bRegresar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        bRegresar.setForeground(new java.awt.Color(102, 0, 255));
        bRegresar.setText("Regresar");
        bRegresar.setBorder(null);
        bRegresar.setBorderPainted(false);
        bRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(aexpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCompletar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtdni, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtapellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(anombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnumero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                                    .addComponent(anumero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(adni, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(aapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(aTitulo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtverificar, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(adireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdireccion)
                                    .addComponent(acorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(avalidar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(bregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bRegresar))
                            .addComponent(acontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtigualdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(aTitulo))
                    .addComponent(bRegresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aexpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(anombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(adireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(aapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(acorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(adni, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(acontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(anumero, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(avalidar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtverificar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCompletar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(bregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtigualdad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
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
    private javax.swing.JLabel aapellido;
    private javax.swing.JLabel acontraseña;
    private javax.swing.JLabel acorreo;
    private javax.swing.JLabel adireccion;
    private javax.swing.JLabel adni;
    private javax.swing.JLabel aexpresion;
    private javax.swing.JLabel anombre;
    private javax.swing.JLabel anumero;
    private javax.swing.JLabel avalidar;
    private javax.swing.JButton bRegresar;
    private javax.swing.JButton bregistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtCompletar;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JPasswordField txtcontra;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdni;
    private javax.swing.JLabel txtigualdad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JPasswordField txtverificar;
    // End of variables declaration//GEN-END:variables
    @Override
    public void setPresentador(P_Registrar p) {
        bregistrar.addActionListener(p);
        bRegresar.addActionListener(p);
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
    public void setInformar(String s) {
        txtCompletar.setText(s);
    }

    @Override
    public void setClaveInfo(String s) {
        txtigualdad.setText(s);
    }
    @Override
    public boolean VerificacionDeCampos(){
        boolean correo = txtCorreo.getText().isEmpty();
        boolean apell = txtapellido.getText().isEmpty();
        boolean contra = txtcontra.getText().isEmpty();
        boolean direc = txtdireccion.getText().isEmpty();
        boolean dni = txtdni.getText().isEmpty();
        boolean nombre = txtnombre.getText().isEmpty();
        boolean num = txtnumero.getText().isEmpty();
        boolean verif= txtverificar.getText().isEmpty();
        
        return correo || apell || contra || direc || dni || nombre || num || verif;
    }
    
    @Override
    public boolean VerificacionDeClave(){
        return txtcontra.getText().equals(txtverificar.getText());
    }

    @Override
    public String getNombre() {
        return txtnombre.getText();
    }

    @Override
    public String getApellido() {
        return txtapellido.getText();
    }

    @Override
    public String getCorreo() {
        return txtCorreo.getText();
    }

    @Override
    public String getContraseña() {
        return txtcontra.getText();
    }

    @Override
    public String getDireccion() {
        return txtdireccion.getText();
    }

    @Override
    public String getNumero() {
        return txtnumero.getText();
    }

    @Override
    public String getDNI() {
        return txtdni.getText();
    }

}
