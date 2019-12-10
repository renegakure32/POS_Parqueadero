/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRONTERA;

import CONTROLADOR.ControlOperarios;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class LoginOperario extends javax.swing.JFrame {

    /**
     * Creates new form LoginOperario
     */
    private int x;
    private int y;
    
    private ControlOperarios odao = new ControlOperarios();
    public LoginOperario() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Login Operario");
        Toolkit t= Toolkit.getDefaultToolkit();
        setIconImage(t.getImage(getClass().getResource("/FRONTERA/favicon.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtOperario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        btnIniciarSesionOperario = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblIconAdmin = new javax.swing.JLabel();
        lblicono = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lblSuperior = new javax.swing.JLabel();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 110, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Operario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 90, -1));

        txtOperario.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jPanel1.add(txtOperario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 150, -1));

        txtContrasena.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jPanel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 150, -1));

        btnIniciarSesionOperario.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnIniciarSesionOperario.setText("Iniciar Sesión");
        btnIniciarSesionOperario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIniciarSesionOperario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarSesionOperarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarSesionOperarioMouseExited(evt);
            }
        });
        btnIniciarSesionOperario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionOperarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarSesionOperario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 160, 30));

        btnSalir.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnSalir.setText("Atrás");
        btnSalir.setBorder(null);
        btnSalir.setMaximumSize(new java.awt.Dimension(33, 21));
        btnSalir.setMinimumSize(new java.awt.Dimension(33, 21));
        btnSalir.setPreferredSize(new java.awt.Dimension(20, 20));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 373, 50, 30));

        lblIconAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FRONTERA/administrador.png"))); // NOI18N
        lblIconAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblIconAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 150, 140));

        lblicono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FRONTERA/logotipo.png"))); // NOI18N
        jPanel1.add(lblicono, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 420, 100, -1));

        btnMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FRONTERA/btnminimizar.png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinimizar.setOpaque(false);
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseExited(evt);
            }
        });
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        btnMinimizar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                btnMinimizarPropertyChange(evt);
            }
        });
        jPanel1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 11, 20, 20));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FRONTERA/btncerrar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setOpaque(false);
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 20, -1));

        lblSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblSuperiorMouseDragged(evt);
            }
        });
        lblSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSuperiorMousePressed(evt);
            }
        });
        jPanel1.add(lblSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 30));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FRONTERA/fondo.png"))); // NOI18N
        jPanel1.add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionOperarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionOperarioActionPerformed
        if(txtOperario.getText().equals("")|| txtContrasena.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Los campos están vacíos");
        }else{
            boolean valor = odao.loginOperario(txtOperario.getText(),txtContrasena.getText());
            if(valor == true){
                Operario o = new Operario();
                o.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Error con el usuario o la contraseña");
            }
        }       
    }//GEN-LAST:event_btnIniciarSesionOperarioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        FramePrincipal fp = new FramePrincipal();
        fp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        btnMinimizar.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        btnMinimizar.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void btnMinimizarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_btnMinimizarPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinimizarPropertyChange

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        btnCerrar.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        btnCerrar.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_btnCerrarMouseExited

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void lblSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuperiorMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_lblSuperiorMouseDragged

    private void lblSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuperiorMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_lblSuperiorMousePressed

    private void btnIniciarSesionOperarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionOperarioMouseEntered
        btnIniciarSesionOperario.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_btnIniciarSesionOperarioMouseEntered

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnIniciarSesionOperarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionOperarioMouseExited
        btnIniciarSesionOperario.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_btnIniciarSesionOperarioMouseExited

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_btnSalirMouseExited

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
            java.util.logging.Logger.getLogger(LoginOperario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginOperario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginOperario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginOperario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginOperario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnIniciarSesionOperario;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIconAdmin;
    private javax.swing.JLabel lblSuperior;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JLabel lblicono;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtOperario;
    // End of variables declaration//GEN-END:variables
}
