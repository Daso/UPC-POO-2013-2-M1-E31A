package veterinariatdd;

public class Perro extends Mascota{
    private int tamanho;

    public Perro(String nombre) {
        super(nombre);
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }        
    
    @Override
     public String identificarse(){
         return super.identificarse() + "del tipo perro y me llamo " + nombre;
     }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public double costoBanho() {
        return 15.0 * tamanho;
    }
    
}
