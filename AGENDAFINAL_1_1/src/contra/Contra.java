
package contra;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class Contra {

    
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        //System.out.println("INGRESE UNA CONTRASEÑA");
        //System.out.println("DEBE TENER: 1 MAYUSCULA, 1 MNUSCULA1 NUMERO,1 CARACTER");
        
        //String contraseña = sc.nextLine();
       
 
        
        // Solicita al usuario que ingrese una contraseña
        //JOptionPane.showMessageDialog(null,"\"ingrese una contraseña con 1 mayuscula, 1 minuscula,1 caracter, 1 numero\"");
       // String contraseña = JOptionPane.showInputDialog("Introduce una contraseña:");

        // Valida la contraseña utilizando expresiones regulares
      /*  if (ValidarContraseña(contraseña1)) {
            JOptionPane.showMessageDialog(null, "Contraseña válida. ¡Bien hecho!");
        } else {
            JOptionPane.showMessageDialog(null, "Contraseña no válida. Debe cumplir con los criterios.");
        }
    }*/
    }
    // Método para validar la contraseña
    public static boolean ValidarContraseña(String contraseña1) {
        // Expresión regular para verificar la contraseña
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{6,}$";

        // Compila la expresión regular en un patrón
        Pattern pattern = Pattern.compile(regex);

        // Crea un matcher para la contraseña dada
        Matcher matcher = pattern.matcher(contraseña1);
       // Devuelve verdadero si la contraseña cumple con la expresión regular
        return matcher.matches();
    }
}
