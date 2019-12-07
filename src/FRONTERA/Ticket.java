/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRONTERA;

import java.awt.*;
import java.awt.print.*;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Ticket extends javax.swing.JFrame implements Printable {

    /**
     * Creates new form Ticket
     */
    public Ticket() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Ticket Generado");
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
        ticket = new javax.swing.JPanel();
        txtNombreParqueaderoTicket = new javax.swing.JTextField();
        txtNITTicket = new javax.swing.JLabel();
        txtEntradaTicket = new javax.swing.JTextField();
        txtNITticket = new javax.swing.JTextField();
        txtTelTicket = new javax.swing.JTextField();
        txtDireccionTicket = new javax.swing.JTextField();
        txtRegimenTicket = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPolizaTicket = new javax.swing.JTextField();
        txtNoTicket = new javax.swing.JTextField();
        txtMatriculaTicket = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGenerarTicket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ticket.setBackground(new java.awt.Color(255, 255, 255));
        ticket.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreParqueaderoTicket.setEditable(false);
        txtNombreParqueaderoTicket.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombreParqueaderoTicket.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreParqueaderoTicket.setBorder(null);
        ticket.add(txtNombreParqueaderoTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 20));

        txtNITTicket.setText("NIT");
        ticket.add(txtNITTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        txtEntradaTicket.setEditable(false);
        txtEntradaTicket.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtEntradaTicket.setToolTipText("");
        txtEntradaTicket.setBorder(null);
        ticket.add(txtEntradaTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 150, -1));

        txtNITticket.setEditable(false);
        txtNITticket.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNITticket.setToolTipText("");
        txtNITticket.setBorder(null);
        ticket.add(txtNITticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 80, -1));

        txtTelTicket.setEditable(false);
        txtTelTicket.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTelTicket.setToolTipText("");
        txtTelTicket.setBorder(null);
        ticket.add(txtTelTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 80, -1));

        txtDireccionTicket.setEditable(false);
        txtDireccionTicket.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDireccionTicket.setToolTipText("");
        txtDireccionTicket.setBorder(null);
        ticket.add(txtDireccionTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 230, -1));

        txtRegimenTicket.setEditable(false);
        txtRegimenTicket.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtRegimenTicket.setToolTipText("");
        txtRegimenTicket.setBorder(null);
        ticket.add(txtRegimenTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 100, -1));

        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ticket.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 128, 230, 10));

        jLabel1.setText("Poliza");
        ticket.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel2.setText("TEL");
        ticket.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel3.setText("Regimen");
        ticket.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        txtPolizaTicket.setEditable(false);
        txtPolizaTicket.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPolizaTicket.setToolTipText("");
        txtPolizaTicket.setBorder(null);
        ticket.add(txtPolizaTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 100, -1));

        txtNoTicket.setEditable(false);
        txtNoTicket.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNoTicket.setToolTipText("");
        txtNoTicket.setBorder(null);
        ticket.add(txtNoTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 100, -1));

        txtMatriculaTicket.setEditable(false);
        txtMatriculaTicket.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMatriculaTicket.setToolTipText("");
        txtMatriculaTicket.setBorder(null);
        ticket.add(txtMatriculaTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 100, -1));

        jLabel4.setText("Ticket No.");
        ticket.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel5.setText("Entrada:");
        ticket.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel6.setText("Matricula:");
        ticket.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jPanel1.add(ticket, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 220));

        btnGenerarTicket.setText("Imprimir Ticket");
        btnGenerarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarTicketActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerarTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarTicketActionPerformed
        try {
            PrinterJob gap = PrinterJob.getPrinterJob();
            gap.setPrintable(this);
            boolean top = gap.printDialog();
            if(top){
                gap.print();
            }
        } catch (PrinterException pex) {
            JOptionPane.showMessageDialog(null, "ERROR DE PROGRAMA","Error\n"+ pex, JOptionPane.INFORMATION_MESSAGE);
        }
        
        dispose();
    }//GEN-LAST:event_btnGenerarTicketActionPerformed

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
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel ticket;
    public static javax.swing.JTextField txtDireccionTicket;
    public static javax.swing.JTextField txtEntradaTicket;
    public static javax.swing.JTextField txtMatriculaTicket;
    private javax.swing.JLabel txtNITTicket;
    public static javax.swing.JTextField txtNITticket;
    public static javax.swing.JTextField txtNoTicket;
    public static javax.swing.JTextField txtNombreParqueaderoTicket;
    public static javax.swing.JTextField txtPolizaTicket;
    public static javax.swing.JTextField txtRegimenTicket;
    public static javax.swing.JTextField txtTelTicket;
    // End of variables declaration//GEN-END:variables

        @Override
    public int print(Graphics graf, PageFormat pagfor, int index) throws PrinterException {
        if(index>0){
            return NO_SUCH_PAGE; //para hacer una sola impresión
        }
        Graphics2D hub = (Graphics2D) graf;
        hub.translate(pagfor.getImageableX()+30, pagfor.getImageableY()+30);
        hub.scale(1.0,1.0);
        ticket.printAll(graf);
        return PAGE_EXISTS;
    }
}
