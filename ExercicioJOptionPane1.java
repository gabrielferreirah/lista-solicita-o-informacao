import javax.swing.JOptionPane;

public class ExercicioJOptionPane1{


   public static void main(String[] args){
      
      int valor = Integer.parseInt(JOptionPane.showInputDialog("Valor"));
      
      JOptionPane.showMessageDialog(null,
      "Valor: " + valor +
      "\nAntecessor: " + (valor-1) +
      "\nSucessor: " + (valor+1)
      );
   }

}