
package estruturaDeSelecao;

import javax.swing.JOptionPane;

public class EsrtuturaDeSelecaoIfElse {
    
    public static void main(String[] args) {
        // Inserção de dados
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno:"));
        
        // Verificação
        
        if(nota >=70){
            JOptionPane.showMessageDialog(null, "Aprovado com a nota " + nota);
        }else{
           JOptionPane.showMessageDialog(null, "Reprovado com a nota " + nota);

        }
        
    }
    
    
}
