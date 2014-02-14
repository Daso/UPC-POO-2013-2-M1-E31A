package excepciones2;


public abstract class Calculadora {
    
    public static double dividir(double a, double b) {
        return a / b;
    }
    
    public static int dividirEntero(int a, int b) throws ArithmeticException{
        return a / b;
    }
    
    public static void arreglo()throws ArrayIndexOutOfBoundsException{
        int[] miArreglo = new int[10];
        miArreglo[12] = 20;
    }
    
    public static double puntos(int puntaje)throws MyException{
        if (puntaje >= 100){
          throw new MyException("TRAMPA!!!");
        }
        return puntaje;
    }
    
}
