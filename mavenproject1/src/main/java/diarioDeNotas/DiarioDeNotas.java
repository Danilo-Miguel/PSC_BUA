package diarioDeNotas;

import javax.swing.JOptionPane;

public class DiarioDeNotas {

    static String nomeAluno;

    public static void main(String[] args) {

        String usuario = JOptionPane.showInputDialog("Digite Professor se você for professor e aluno se você for aluno");
        if (usuario.equalsIgnoreCase("professor")) {

            Professor professor = new Professor();
            professor.identificarUsuario();
            professor.lerLivro("oi");


        } else if (usuario.equalsIgnoreCase("aluno")) {
            
            Aluno aluno = new Aluno();
            aluno.identificarUsuario();
            
        } else {
            JOptionPane.showMessageDialog(null, "Usuário invaalido");

        }

    }

   
}
