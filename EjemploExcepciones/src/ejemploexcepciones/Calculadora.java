
package ejemploexcepciones;


public class Calculadora {
 
    public int dividir(int a, int b) throws MiExcepcion{
        if(b==0){
            throw new MiExcepcion("No dividir entre 0");
        }
            
        return a / b;
    }
    
    public int arreglo() throws IndexOutOfBoundsException{
        int miArreglo[] = new int[3];
        miArreglo[10] = 100;
        return miArreglo.length;
    }
    
}
