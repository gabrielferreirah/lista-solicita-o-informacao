import javax.swing.JOptionPane;

public class ExercicioJOptionPane2{

    public static void main(String[] args) {
        
        int litrosDia = Integer.parseInt(JOptionPane.showInputDialog(null, "Litros de água por dia"));
        int periodoAnos = Integer.parseInt(JOptionPane.showInputDialog(null, "Periodo consumido(em anos)"));
        double precoLitro = Double.parseDouble(JOptionPane.showInputDialog(null, "Preço por litro"));

        int periodoDias = periodoAnos*365;
        int litrosTotal = litrosDia*periodoDias;
        double valorTotal = litrosTotal*precoLitro;

        JOptionPane.showMessageDialog(null, "Quantidade de litros por dia: " + litrosDia+
        "\nQuantidade de anos consumidos: " + periodoAnos +
        "\n Valor por Litro: " + precoLitro + "\n " +
        "\nQuantidade de litros consumidos: " + litrosTotal +
        "\nValor Total Pago: " + "R$ " + valorTotal
        );
     }
}