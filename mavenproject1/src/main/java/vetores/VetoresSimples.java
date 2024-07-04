package vetores;

import javax.swing.JOptionPane;

public class VetoresSimples {

    public static void main(String[] args) {

        //Declaração de vetores
       // int[] vetorDeInteiros = new int[10];  // Construção direta de um vetor
       
        double[] vetorDeDouble;
        boolean[] vetorDeBoolean;

        //contrução de vetores
        //vetorDeStrings = new String[5];
        vetorDeDouble = new double[7];
        vetorDeBoolean = new boolean[3];

        // Obtendo o tamanho de um vetor
       // int tamanhoVetor = vetorDeInteiros.length;
        // System.out.println("O  tamanho do Vetor de inteiros é:" + tamanhoVetor);
        //System.out.println("O  tamanho do Vetor de inteiros é:" + vetorDeInteiros.length);

        //Acessando elementos do vetor
       // int segundoElemento = vetorDeInteiros[1];
        // System.out.println("Segundo elemento do vetor de inteiros " + segundoElemento );
        /*vetorDeInteiros[0] = 10;
        vetorDeInteiros[1] = 20;
        vetorDeInteiros[2] = 30;
        vetorDeInteiros[3] = 40;
        vetorDeInteiros[4] = 50;
        vetorDeInteiros[5] = 60;
        vetorDeInteiros[6] = 70;
        vetorDeInteiros[7] = 80;
        vetorDeInteiros[8] = 90;
        vetorDeInteiros[9] = 100;*/
        
        //System.out.println(vetorDeInteiros[6]);
        //int[] vetorDeInteiros = new int[5]; 

        String[] vetorDeStrings = new String[5];
        vetorDeStrings = new String[]{"Danilo", "Guilherme", "Carol", "Beatriz", "Felipe"};
         String busca = JOptionPane.showInputDialog("Digite o nome do Aluno");

        for (int i = 0; i < vetorDeStrings.length; i++) {
            if(busca.equalsIgnoreCase(vetorDeStrings[i]))
    
          JOptionPane.showMessageDialog(null, "O valor digitado " + busca + "foi encontrado no indice"+ i);
            //System.out.println("Indice do aluno " + i + " : " + "nome do aluno "+ vetorDeStrings[i]);
        }
        
        

    }
}
