/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOS;

//import FRONTERA.Informes;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Map;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Carlos
 */
public class DaoInformes {

    @SuppressWarnings("empty-statement")
    public void informe1() throws Exception {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Parqueadero", "administrador", "1234");
            JasperReport reporte = null;
            String report = "C:\\Users\\Carlos.DESKTOP-O8HV065\\Documents\\NetBeansProjects\\POS_Parqueadero\\src\\Reporte\\UsuarioReporte.jasper";
            reporte = (JasperReport) JRLoader.loadObjectFromFile(report);
            JasperPrint jp = JasperFillManager.fillReport(report, null, con);
            //JasperViewer.viewReport(jp);
            JasperViewer view = new JasperViewer(jp, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            view.setTitle("INFORME");
            Toolkit t = Toolkit.getDefaultToolkit();
            view.setIconImage(t.getImage(getClass().getResource("/FRONTERA/favicon.png")));;
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar informe");
            //Logger.getLogger(Informes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("empty-statement")
    public void informe2(String fechaEntrada) throws Exception {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Parqueadero", "administrador", "1234");
            JasperReport reporte = null;
            String report = "C:\\Users\\Carlos.DESKTOP-O8HV065\\Documents\\NetBeansProjects\\POS_Parqueadero\\src\\Reporte\\Informe2.jasper";
            Map parametro = new HashMap();
            parametro.put("fechaEntrada", fechaEntrada);
            reporte = (JasperReport) JRLoader.loadObjectFromFile(report);
            JasperPrint jp = JasperFillManager.fillReport(report, parametro, con);
            //JasperViewer.viewReport(jp);
            JasperViewer view = new JasperViewer(jp, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            view.setTitle("INFORME");
            Toolkit t = Toolkit.getDefaultToolkit();
            view.setIconImage(t.getImage(getClass().getResource("/FRONTERA/favicon.png")));;
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese una fecha válida");
            //Logger.getLogger(Informes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("empty-statement")
    public void informe3(String fechaSalida) throws Exception {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Parqueadero", "administrador", "1234");
            JasperReport reporte = null;
            String report = "C:\\Users\\Carlos.DESKTOP-O8HV065\\Documents\\NetBeansProjects\\POS_Parqueadero\\src\\Reporte\\Informe3.jasper";
            Map parametro = new HashMap();
            parametro.put("fechaSalida", fechaSalida);
            reporte = (JasperReport) JRLoader.loadObjectFromFile(report);
            JasperPrint jp = JasperFillManager.fillReport(report, parametro, con);
            //JasperViewer.viewReport(jp);
            JasperViewer view = new JasperViewer(jp, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            view.setTitle("INFORME");
            Toolkit t = Toolkit.getDefaultToolkit();
            view.setIconImage(t.getImage(getClass().getResource("/FRONTERA/favicon.png")));;
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese una fecha válida");
            //Logger.getLogger(Informes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("empty-statement")
    public void informe4() throws Exception {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Parqueadero", "administrador", "1234");
            JasperReport reporte = null;
            String report = "C:\\Users\\Carlos.DESKTOP-O8HV065\\Documents\\NetBeansProjects\\POS_Parqueadero\\src\\Reporte\\Informe4.jasper";
            reporte = (JasperReport) JRLoader.loadObjectFromFile(report);
            JasperPrint jp = JasperFillManager.fillReport(report, null, con);
            //JasperViewer.viewReport(jp);
            JasperViewer view = new JasperViewer(jp, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            view.setTitle("INFORME");
            Toolkit t = Toolkit.getDefaultToolkit();
            view.setIconImage(t.getImage(getClass().getResource("/FRONTERA/favicon.png")));;
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar informe");
            //Logger.getLogger(Informes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("empty-statement")
    public void informe5(String fechaEntrada, int cod) throws Exception {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Parqueadero", "administrador", "1234");
            JasperReport reporte = null;
            String report = "C:\\Users\\Carlos.DESKTOP-O8HV065\\Documents\\NetBeansProjects\\POS_Parqueadero\\src\\Reporte\\Informe5.jasper";
            Map parametro = new HashMap();
            parametro.put("fechaEntrada", fechaEntrada);
            parametro.put("cod", cod);
            reporte = (JasperReport) JRLoader.loadObjectFromFile(report);
            JasperPrint jp = JasperFillManager.fillReport(report, parametro, con);
            //JasperViewer.viewReport(jp);
            JasperViewer view = new JasperViewer(jp, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            view.setTitle("INFORME");
            Toolkit t = Toolkit.getDefaultToolkit();
            view.setIconImage(t.getImage(getClass().getResource("/FRONTERA/favicon.png")));;
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese una fecha o código válido");
            //Logger.getLogger(Informes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("empty-statement")
    public void informe6(String fechaSalida, int cod) throws Exception {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Parqueadero", "administrador", "1234");
            JasperReport reporte = null;
            String report = "C:\\Users\\Carlos.DESKTOP-O8HV065\\Documents\\NetBeansProjects\\POS_Parqueadero\\src\\Reporte\\Informe6.jasper";
            Map parametro = new HashMap();
            parametro.put("fechaSalida", fechaSalida);
            parametro.put("cod", cod);
            reporte = (JasperReport) JRLoader.loadObjectFromFile(report);
            JasperPrint jp = JasperFillManager.fillReport(report, parametro, con);
            //JasperViewer.viewReport(jp);
            JasperViewer view = new JasperViewer(jp, false);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
            view.setTitle("INFORME");
            Toolkit t = Toolkit.getDefaultToolkit();
            view.setIconImage(t.getImage(getClass().getResource("/FRONTERA/favicon.png")));;
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar informe");
            //Logger.getLogger(Informes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
