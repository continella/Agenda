
package agendafinal;

import formulario.Logear;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

   
public class AGENDAFINAL {

    public static int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //para conectar a xammp
    String bd="bd";
    String url = "jdbc:mysql://localhost:3306/bd";
    String user ="root";
    String pasw = "";
    String driver="com.myssql.cj.jdbc.Driver";
    Connection conect;
    //*************************************************
    
        public Connection conexion(){
        
        System.out.println("ingresa");
        try{
            //cargamos driver my sql
            Class.forName(driver);
            try {
                conect = (Connection) DriverManager.getConnection(url,user,pasw);
                JOptionPane.showMessageDialog(null,"CONECTADO CORRECTAMENTE");
            } catch (SQLException ex) {
                //Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "SIN CONEXION " + e);
    }
        return conect;
    }
    
    
    
    
    
     public static void main(String[] args) {
        int opc;
        String PASW;
        Logear L = new Logear();
        L.setVisible(true);
        L.setLocationRelativeTo(null);
        PASW = Logear.PASW;

     }
    
     public static boolean ValidarContraseña(String PASW) {
         
        // Expresión regular para verificar la contraseña
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{6,}$";

        // Compila la expresión regular en un patrón
        Pattern pattern = Pattern.compile(regex);

        // Crea un matcher para la contraseña dada
        Matcher matcher = pattern.matcher(PASW);
       // Devuelve verdadero si la contraseña cumple con la expresión regular
        return matcher.matches();
    }   


   
        //coneccion base de datos
        // AGENDAFINAL CC =new AGENDAFINAL();
           // CC.conexion();
        
        //*********************************
    

}
    
