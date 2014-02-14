package ejemploexcepciones;

public class EjemploExcepciones {

    
    public static void main(String[] args) {
        
        
        
        try {
            Calculadora calculadora = new Calculadora();
            System.out.println(calculadora.dividir(6, 0));
            System.out.println(calculadora.arreglo());
            
        }catch(MiExcepcion miEx){
            System.out.println(miEx.getMessage());
        }catch (ArithmeticException aex){ 
            System.out.println("Excepción Aritmética!!!");
        }catch(IndexOutOfBoundsException iex){
            System.out.println("Error de índice de arreglo");
        } catch (Exception pepito) {
            System.out.println("DIOS!! ¡qué hiciste?");
        }
         
        
    }
}
