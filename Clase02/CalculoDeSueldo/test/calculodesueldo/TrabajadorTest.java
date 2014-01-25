/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculodesueldo;

import org.junit.Assert;
import org.junit.Test;


public class TrabajadorTest {
    
    private Trabajador trabajador;
    
    public TrabajadorTest() {
        trabajador = new Trabajador("001", "Carlos");
    }

    @Test
    public void necesitoCrearTrabajadorConCodigoYNombre() {      
      Assert.assertEquals("001", trabajador.getCodigo());
      Assert.assertEquals("Carlos", trabajador.getNombre());
    }
    
    @Test
    public void necesitoAsignarElSueldoBaseDeUnTrabajador(){     
      trabajador.setSueldoBase(750.0f);
      Assert.assertEquals(750.0, trabajador.getSueldoBase(),0.0);
    }
    
    @Test
    public void necesitoCalcularElSueldoDeUnTrabajador(){
       trabajador.setSueldoBase(750.0f);
       Assert.assertEquals(850.0, trabajador.calcularSueldo(1000.0),0.0);
    }
}