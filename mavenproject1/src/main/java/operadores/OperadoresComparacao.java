package operadores;

public class OperadoresComparacao {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        boolean comparador = a == b;
        boolean diferente = a != b;
        boolean maior = a > b;
        boolean maiorIgual = a >= b;
        boolean menor = a < b;
        boolean menorIgual = a <= b;

        System.out.println("A comparação entre as variáveis a e b resulta em " + comparador);
        System.out.println("A comparação entre as variáveis a e b resulta em " + diferente);
        System.out.println("A comparação entre as variáveis a e b resulta em " + maior);
        System.out.println("A comparação entre as variáveis a e b resulta em " + maiorIgual);
        System.out.println("A comparação entre as variáveis a e b resulta em " + menor);
        System.out.println("A comparação entre as variáveis a e b resulta em " + menorIgual);

    }

}
