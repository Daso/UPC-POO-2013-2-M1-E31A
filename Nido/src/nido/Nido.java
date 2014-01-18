
package nido;


public class Nido {

    
    public static void main(String[] args) {
       
        Ninho ninho = new Ninho("Carlos", "rabito");
       
        Ninho ninho2 = new Ninho("Sandra","rambo");
        
        
        System.out.println(ninho.tocarOreja());
        System.out.println(ninho2.tocarOreja());
        System.out.println(ninho.tocarOreja());
        System.out.println(ninho2.tocarOreja());
    }
}
