package diarioDeNotas;

import javax.swing.JOptionPane;

public class Aluno extends Usuario {

    private int Ra;
    private String telefone;
   private String tipoUsuario;
   
   
   

    @Override
    public void identificarUsuario() {
        super.identificarUsuario();
        setTelefone(JOptionPane.showInputDialog("Digite o seu telefone"));
        setRa(Integer.parseInt(JOptionPane.showInputDialog("Digite o seu Ra")));
        
        
         System.out.println("Bem vindo " + getTipoUsuario()+ " " + getNome());

 

       
   }

    /**
     * @return the nome
     */
  

    /**
     * @return the Ra
     */
    public int getRa() {
        return Ra;
    }

    /**
     * @param Ra the Ra to set
     */
    public void setRa(int Ra) {
        this.Ra = Ra;
    }

    

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the tipoUsuario
     */
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * @return the idade
     */
   
    
 

   
   
    

}
