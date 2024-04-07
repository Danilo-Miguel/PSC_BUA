
package estruturaDeSelecaoIf;

import javax.swing.JOptionPane;

public class EstruturaDeSelecaoIfElse {
    
    public static void main(String[] args) {
        // Inserção de dados
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno:"));
        
        // Verificação
        
        if(nota >=70){
            JOptionPane.showMessageDialog(null, "Aprovado com a nota " + nota + "Conceito C");
        } else if(nota>=80){
           JOptionPane.showMessageDialog(null, "Aprovado com a nota " + nota + "Conceito B");
        }else if(nota>=90){
           JOptionPane.showMessageDialog(null, "Aprovado com a nota " + nota + "Conceito A");
        }else{
                   
           JOptionPane.showMessageDialog(null, "Reprovado com a nota " + nota + "Conceito D");
   
        
    }
    }
 
}
