/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package operadores;

/**
 *
 * @author Samsung
 */public class OperadoresLogicos {
    public static void main(String[] args) {
        
        int a = 17;
        int b  = 17;
        boolean conE =  a >= b && a == b;
        System.out.println("Valor " + conE);
        int d = 14;
        int e  = 17;
        
        boolean conOuN =  !(d < e || d == e);

        boolean conOu =  (d < e || d == e);
        System.out.println("Valor " + conOu);
                System.out.println("Valor " + conOuN);

    }
    
}