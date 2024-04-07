/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tipoPrimitivos;

/**
 *
 * @author Samsung
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
        int idade = 30;
        double altura = 1.75;
        float temperatura = 28.5f;
        boolean ehEstudante = true;
        char genero = 'M';
        byte idadeByte = 25;
        short populacao = 15000;
        long populacaoMundial = 7800000000L;

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("É estudante? " + ehEstudante);
        System.out.println("Gênero: " + genero);
        System.out.println("Idade (byte): " + idadeByte);
        System.out.println("População: " + populacao);
        System.out.println("População mundial: " + populacaoMundial);
    }
}
