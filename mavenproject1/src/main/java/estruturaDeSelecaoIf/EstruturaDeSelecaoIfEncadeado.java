package estruturaDeSelecaoIf;

import javax.swing.JOptionPane;

public class EstruturaDeSelecaoIfEncadeado {

    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "O numero " + numero + " é positivo");

            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "O numero " + numero + " é par");
            } else {
                JOptionPane.showMessageDialog(null, "O numero " + numero + " é impar");

            }
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "O numero " + numero + " é negativo");
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "O numero " + numero + " é par");
            } else {
                JOptionPane.showMessageDialog(null, "O numero " + numero + " é impar");

            }
        }else{
        JOptionPane.showMessageDialog(null, "O numero " + numero + " é neutro");
   
        }
    }

    }

