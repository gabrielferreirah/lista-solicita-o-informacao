import javax.swing.JOptionPane;

public class ExercicioJOptionPane2{

    public static void main(String[] args) {
        
        int litros = Integer.parseInt(JOptionPane.showInputDialog(null, "Litros de água por dia"));
        int periodo = Integer.parseInt(JOptionPane.showInputDialog(null, "Periodo consumido(em anos)"));
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Preço por litro"));

        
     }
}