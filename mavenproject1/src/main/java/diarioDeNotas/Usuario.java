/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diarioDeNotas;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Usuario {

    
    
        Scanner scanner = new Scanner(System.in);

    private String nome;
    private String email;
    private int idade;
    
    public void identificarUsuario(){
        System.out.println("Digte o seu nome");
        setNome(scanner.nextLine());
        
        System.out.println("Digte o seu email");
        setEmail(scanner.nextLine());
    
        System.out.println("Digte a sua idade");
        setIdade(scanner.nextInt());
        scanner.nextLine();
        
        
    }
    
  


public void lerLivro(String livro) {
System.out.println(nome + " está lendo o livro: " + livro);
// Aqui você pode adicionar a lógica específica para ler um livro
}
    
    public void visualizarNota(){
        
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.nome = Nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
