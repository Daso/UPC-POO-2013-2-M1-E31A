
package veterinariatdd;


public class VeterinariaTDD {

    
    public static void main(String[] args) {
       Perro perro = new Perro("Fifi");
       System.out.println(perro.getNombre());
       Gato gato = new Gato("Satán");
       System.out.println(gato.getNombre());
       System.out.println(perro.identificarse());
       
    }
}
