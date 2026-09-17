package Model;

import static View.Cadastro_GUI.*;
import View.Iniciar_GUI;
import javax.swing.JOptionPane;

public class Funcoes_DAO {

    static String nomeCliente, cpfCliente;

    public static void cadastrarCliente() {
        nomeCliente = String.valueOf(nomeCliente_txt.getText());
        cpfCliente = String.valueOf(cpfCliente_txt.getText());

        if (cpfCliente.equals(null) || cpfCliente.equals("")) {
            cpfCliente = "Não informado";
        }

        System.out.println("Nome: " + nomeCliente + "\nCPF: " + cpfCliente);
    }

    public static void confirmacaoSaida() {
        int a = 0;
        while (a < 1) {
            String x = JOptionPane.showInputDialog(null, "Deseja mesmo cancelar o pedido?\n\nDigite 's' para Sim e 'n' para Não");
            if (x.equals("s")) {
                a = 1;
                JOptionPane.showMessageDialog(null, "Ok!");
                new Iniciar_GUI().setVisible(true);
            } else if (x.equals("n")) {
                JOptionPane.showMessageDialog(null, "Ok!");
                a = 1;
            } else {
                JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        }
    }
}
