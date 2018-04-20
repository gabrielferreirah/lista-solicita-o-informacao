import javax.swing.JOptionPane;

public class ExercicioJOptionPane08{

    public static void main(String[] args){

        double contaLuz = Double.parseDouble(JOptionPane.showInputDialog("Valor da Conta de Luz"));
        double contaAgua = Double.parseDouble(JOptionPane.showInputDialog("Valor da conta de Agua"));
        double net = Double.parseDouble(JOptionPane.showInputDialog("Valor da Conta da NET"));
        double vivo = Double.parseDouble(JOptionPane.showInputDialog("Valor da Conta da Vivo"));
        double oi = Double.parseDouble(JOptionPane.showInputDialog("Valor da Conta da Oi"));
        double iptu = Double.parseDouble(JOptionPane.showInputDialog("Valor do IPTU"));
        double ipva = Double.parseDouble(JOptionPane.showInputDialog("Valor do IPVA"));
        double seguroCarro = Double.parseDouble(JOptionPane.showInputDialog("Valor do Seguro do Carro"));
        
        double totalContaTelefone = net+vivo+oi ;
        double totalImpostos = iptu+ipva ;
        double totalRestante = contaAgua+contaLuz+seguroCarro ;
        double totalContas = totalContaTelefone+totalImpostos+totalRestante;
        
        JOptionPane.showMessageDialog(null, "Resumo de Contas"+ 
        "\nValor das contas de telefone: "+ totalContaTelefone +
        "\nValor dos Impostos: "+ totalImpostos +
        "\nValor do restante das contas: "+ totalRestante +
        "\nValor total das contas: "+ totalContas
        
        );
    }
}