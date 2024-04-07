
package diarioDeNotas;

import static diarioDeNotas.DiarioDeNotas.nomeAluno;
import javax.swing.JOptionPane;


public class Aluno {
    
   private String nome;
   protected int idade;
    String curso;
    String campus;
    double nota;
    String ra;
    
    public void visualizarNota(){
              double notaA1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da A1"));
             double notaA2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da A2"));
             double notaA3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da A3"));

              double notaFinal = notaA1 + notaA2 + notaA3;   
         JOptionPane.showMessageDialog(null, "A anota final do aluno "+ nomeAluno + notaFinal);   
        
    }
    
    public void gerarBoleto(){
    
}
    
}
