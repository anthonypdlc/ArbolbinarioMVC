package Vista;

import Controlador.Nodo;
import Controlador.Arbol_Cliente;
import Controlador.Archivo;
import Modelo.Cliente;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmCliente extends javax.swing.JFrame {

    Arbol_Cliente objArbol = new Arbol_Cliente();
    DefaultTableModel modTabla;
    String cabecera[] = {"Nombre", "Apellido", "Edad", "DNI", "Sexo", "Colegio"};
    int Operacion;
    Nodo Buscar;
    Archivo archivo = new Archivo();

    public FrmCliente() {
        initComponents();
        this.getContentPane().setBackground(Color.decode("#f2784b"));
        setLocationRelativeTo(null);
        Estado_Controles(false);
        modTabla = new DefaultTableModel(null, cabecera);
        tblDatos.setModel(modTabla);
        cargarArchivo();

    }

    public void Limpiar_Tabla() {
        modTabla.setRowCount(0);
    }

    public void CargarDatos(Nodo Auxiliar) {
        if (Auxiliar != null) {
            txtNombre.setText(Auxiliar.getElemento().getNombre());
            txtApellido.setText(Auxiliar.getElemento().getApellido());
            txtEdad.setText(String.valueOf(Auxiliar.getElemento().getEdad()));
            txtDNI.setText(Auxiliar.getElemento().getDNI());
            cbxSexo.setSelectedItem(Auxiliar.getElemento().getSexo());
            cbxCole.setSelectedItem(Auxiliar.getElemento().getColegio());
        }
    }

    public void cargarArchivo() {
        try {
            archivo.leer();
            for (Cliente c : archivo.listado) {
                Object[] fila = {c.getNombre(), c.getApellido(), c.getEdad(), c.getDNI(), c.getSexo(), c.getColegio()};
                objArbol.setRaiz(objArbol.Agregar(objArbol.getRaiz(), new Cliente(fila)));
            }
            Limpiar_Tabla();
            objArbol.Listar_InOrder(objArbol.getRaiz(), modTabla);
        } catch (Exception e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        cbxSexo = new javax.swing.JComboBox<>();
        txtEdad = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        cbxCole = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 190, 88));

        btnAgregar.setForeground(new java.awt.Color(204, 0, 204));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo cliente.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBuscar.setForeground(new java.awt.Color(153, 0, 153));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNuevo.setForeground(new java.awt.Color(204, 0, 204));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nuevo 2.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setForeground(new java.awt.Color(204, 0, 204));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Delete all.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setForeground(new java.awt.Color(204, 0, 204));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnActualizar.setForeground(new java.awt.Color(204, 0, 204));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnSalir.setForeground(new java.awt.Color(153, 0, 153));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tblDatos.setBackground(new java.awt.Color(92, 151, 191));
        tblDatos.setForeground(new java.awt.Color(153, 0, 204));
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDatos);

        txtApellido.setBackground(new java.awt.Color(92, 151, 191));
        txtApellido.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDOS"));
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(92, 151, 191));
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        cbxSexo.setBackground(new java.awt.Color(92, 151, 191));
        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        cbxSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("SEXO"));

        txtEdad.setBackground(new java.awt.Color(92, 151, 191));
        txtEdad.setBorder(javax.swing.BorderFactory.createTitledBorder("EDAD"));
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        txtDNI.setBackground(new java.awt.Color(92, 151, 191));
        txtDNI.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });

        cbxCole.setBackground(new java.awt.Color(92, 151, 191));
        cbxCole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESTATAL", "PARTICULAR" }));
        cbxCole.setBorder(javax.swing.BorderFactory.createTitledBorder("COLEGIO"));

        jLabel1.setBackground(new java.awt.Color(92, 151, 191));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 3, 48)); // NOI18N
        jLabel1.setText("ALUMNOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(cbxCole, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(718, 718, 718)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCole, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        Object[] Registro = {txtNombre.getText().toUpperCase(),
            txtApellido.getText().toUpperCase(),
            txtEdad.getText().toUpperCase(),
            txtDNI.getText().toUpperCase(),
            cbxSexo.getSelectedItem().toString().toUpperCase(),
            cbxCole.getSelectedItem().toString().toUpperCase()};
        if (ingresarDatos(Registro)) {
            Cliente Elemento = new Cliente(Registro);
            objArbol.setRaiz(objArbol.Agregar(objArbol.getRaiz(), Elemento));
            Limpiar_Tabla();
            objArbol.Listar_InOrder(objArbol.getRaiz(), modTabla);
            Limpiar_Controles();
            Estado_Controles(false);
            archivo.insertar(Elemento);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String Cadena = JOptionPane.showInputDialog("Nombre a Buscar: ");
        Buscar = objArbol.BuscarNombre(Cadena);
        if (Buscar != null) {
            CargarDatos(Buscar);
            txtNombre.setEnabled(true);
            txtApellido.setEnabled(true);
            txtEdad.setEnabled(true);
            txtDNI.setEnabled(true);
            cbxSexo.setEnabled(true);
            cbxCole.setEnabled(true);
            btnCancelar.setEnabled(true);
            btnActualizar.setEnabled(true);
            btnEliminar.setEnabled(false);
            btnNuevo.setEnabled(false);
            btnBuscar.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "El dato buscado no existe");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        btnNuevo.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnAgregar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnActualizar.setEnabled(false);
        Limpiar_Controles();
        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtEdad.setEnabled(true);
        txtDNI.setEnabled(true);
        cbxSexo.setEnabled(true);
        cbxCole.setEnabled(true);
        cbxSexo.setSelectedItem("F");
        cbxCole.setSelectedItem("ESTATAL");
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int Fila = tblDatos.getSelectedRow();
        if (Fila != -1) {
            String Cadena = modTabla.getValueAt(Fila, 0) + " "
                    + modTabla.getValueAt(Fila, 1);
            objArbol.setRaiz(objArbol.Eliminar(objArbol.getRaiz(), Cadena));
            Limpiar_Tabla();
            objArbol.Listar_InOrder(objArbol.getRaiz(), modTabla);
            try {
                ArrayList<Cliente> array = new ArrayList();
                objArbol.Listar(objArbol.getRaiz(), array);
                archivo.actualizar(array);
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un elemento de la tabla o no hay elementos en la tabla");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (Buscar != null) {
            if (validarDNI(txtDNI.getText())) {
                Object[] Registro = {txtNombre.getText().toUpperCase(), txtApellido.getText().toUpperCase(),
                    txtEdad.getText().toUpperCase(), txtDNI.getText().toUpperCase(),
                    cbxSexo.getSelectedItem(), cbxCole.getSelectedItem()};
                Cliente Elemento = new Cliente(Registro);
                Buscar.setElemento(Elemento);
                Estado_Controles(false);
                Limpiar_Tabla();
                Limpiar_Controles();
                objArbol.Listar_InOrder(objArbol.getRaiz(), modTabla);

                try {
                    ArrayList<Cliente> array = new ArrayList();
                    objArbol.Listar(objArbol.getRaiz(), array);
                    archivo.actualizar(array);
                } catch (Exception e) {
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "El dato buscado no existe");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        esLetra(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        esLetra(evt);
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        esNumero(evt);
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        esNumero(evt);
    }//GEN-LAST:event_txtDNIKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Limpiar_Controles();
        Estado_Controles(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxCole;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
 public final void Estado_Controles(boolean Estado) {

        txtNombre.setEnabled(Estado);
        txtApellido.setEnabled(Estado);
        txtEdad.setEnabled(Estado);
        txtDNI.setEnabled(Estado);
        cbxSexo.setEnabled(Estado);
        cbxCole.setEnabled(Estado);
        btnAgregar.setEnabled(Estado);
        btnCancelar.setEnabled(Estado);
        btnEliminar.setEnabled(!Estado);
        btnActualizar.setEnabled(Estado);
        btnBuscar.setEnabled(!Estado);
        btnNuevo.setEnabled(!Estado);
        btnSalir.setEnabled(!Estado);
        tblDatos.setEnabled(!Estado);
    }

    public void Limpiar_Controles() {
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtEdad.setText(null);
        txtDNI.setText(null);
        cbxSexo.setSelectedItem(null);
        cbxCole.setSelectedItem(null);
    }

    public void esNumero(KeyEvent e) {
        char caracter = e.getKeyChar();
        if (Character.isLetter(caracter)) {
            this.getToolkit().beep();
            e.consume();
        }
    }

    public void esLetra(KeyEvent e) {
        char caracter = e.getKeyChar();
        if (Character.isDigit(caracter)) {
            this.getToolkit().beep();
            e.consume();
        }
    }

    private boolean validarDNI(String dni) {
        if (dni.length() == 8) {
            for (Cliente cliente : archivo.listado) {
                if (!cliente.getDNI().equals(dni)) {
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "El dni ya existe");
                    return false;
                }
            }
        } else if (dni.length() < 8) {
            JOptionPane.showMessageDialog(null, "El dni debe tener 8 digitos");
            return false;
        } else {
            JOptionPane.showMessageDialog(null, "El dni debe tener 8 digitos");
            return false;
        }
        return false;
    }

    public boolean ingresarDatos(Object registro []) {
        if (registro[0].toString().length() > 0 && 
            registro[1].toString().length() > 0 && 
            registro[2].toString().length() > 0 && 
            registro[3].toString().length() > 0 && 
            registro[4].toString().length() > 0 && 
            registro[5].toString().length() > 0) {
            if(validarDNI(registro[3].toString())){
            return true;}
        } else {
            JOptionPane.showMessageDialog(null, "Complete los datos");
            return false;
        }
        return false;
    }
}
