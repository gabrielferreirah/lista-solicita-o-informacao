import javax.swing.JOptionPane;

public class ExercicioJOptionPane3{


   public static void main(String[] args){
      
    int valor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 1", "Calculadora"));
    int valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 2", "Calculadora"));
      
    JOptionPane.showMessageDialog(null,
    "Resultado" +
    "\n"
    );
   }

}