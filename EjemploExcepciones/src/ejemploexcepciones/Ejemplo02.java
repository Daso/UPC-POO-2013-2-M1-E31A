
package ejemploexcepciones;


public class Ejemplo02 {

    
    public static void main(String[] args) {
        try {
            System.in.read();
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        
    }
}
