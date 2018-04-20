import javax.swing.JOptionPane;

public class ExercicioJOptionPane10{

    public static void main(String[] args){

        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Ano de Nascimento"));

        JOptionPane.showMessageDialog(null, 
        "Idade: " + (2018-anoNascimento)
        );
    }
}