
package estruturaDeSelecaoIf;

import javax.swing.JOptionPane;


public class EstruturaSelecaoIF {
    public static void main(String[] args) {
        // Inserção de dados
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno:"));
        
        // Verificação
        
        if(nota >=70){
            JOptionPane.showMessageDialog(null, "Aprovado com a nota " + nota);
        }
        
    }
    
}
