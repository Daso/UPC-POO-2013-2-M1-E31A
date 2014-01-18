package casoconejo;

public class CasoConejo {

    
    public static void main(String[] args) {
        Infante infante01 = new Infante("Pedro");
        Conejo conejo01 = new Conejo("Colita");
        
        System.out.println(infante01.mostrarZanahoria(conejo01));
        System.out.println(infante01.tocarOreja(conejo01));
        
    }
}
