package excepciones2;


public class Excepciones2 {
    
    public static void imprimir(double dato){
        System.out.println(dato);
    }
    
    
    public static void main(String[] args) {
      imprimir(Calculadora.dividir(23, 2));
      imprimir(Calculadora.dividir(3, 0)); 
      
      
        try {
            
        /* Calculadora.arreglo();
         Esto no se ejecuta!!!
         imprimir(Calculadora.dividirEntero(3, 0));*/
         Calculadora.puntos(80);
        } catch (ArrayIndexOutOfBoundsException aex){
            System.out.println("Arreglo excedido!!!");
            System.out.println(aex.getMessage());            
        } catch(ArithmeticException x){
            System.out.println("No se debe dividir entre 0");
            System.out.println("Y el error es: ");
            System.out.println(x.getMessage());       
        }catch(MyException miEx){
            System.out.println("AJJJJAAAAAAAAAAAA!!!");
            System.out.println(miEx.getMessage());
        }catch (Exception ex) {
           System.out.println("Error misterioso y desconocido");            
        } finally{
            System.out.println("Chau");
        }
    
}
}