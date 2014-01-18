package veterinariatdd;


public class Gato extends Mascota{

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public double costoBanho() {
        return 80.00;
    }
  
    
    
}
