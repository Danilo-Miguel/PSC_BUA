
public class Calculadora {
    
    public int soma(int a, int b){
        int resultado =  a + b;
        System.out.println(resultado);
        return resultado;
        
    }
    
    
    public int soma(int a, int b, int c){
       int resultado = a + b;
       return resultado;
    }
            
    
     public int soma(int a, String b){
        int b1 = Integer.parseInt(b);
        int resultado  = a + b1;
        
        return resultado;
        
    }
     
       public int soma(String a, int b){
        int a1 = Integer.parseInt(a);
        int resultado  = a1 + b;
        
        return resultado;
        
    }
     
     
 
}
