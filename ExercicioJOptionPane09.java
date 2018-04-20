import javax.swing.JOptionPane;

public class ExercicioJOptionPane09{
    
    public static void main(String[] args) {
        
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        //invertendo os números

        numero1=numero1+numero2;
        numero2=numero1-numero2;
        numero1=numero1-numero2;

        JOptionPane.showMessageDialog(null, "Números invertidos" +
        "\nNúmero 1: " + numero1 +
        "\nNúmero 2: " + numero2
        );
        
    }
}