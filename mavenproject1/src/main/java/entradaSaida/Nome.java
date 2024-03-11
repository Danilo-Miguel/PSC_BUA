/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entradaSaida;

/**
 *
 * @author Samsung
 */
import javax.swing.JOptionPane;

public class Nome {
    public static void main(String[] args) {
        String nome;

        nome = JOptionPane.showInputDialog("Digite seu nome:");
        
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");
    }
}
	