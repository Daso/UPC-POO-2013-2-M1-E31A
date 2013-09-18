/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinariatdd;


import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author pcsidsub
 */
public class PerroTest {
    private Perro perro;
    public PerroTest() {
        perro = new Perro("Rambo");
    }

    @Test
    public void todoPerroDebeTenerUnTamanho(){
        perro.setTamanho(1);
        int tamanho = perro.getTamanho();
        
        boolean valor = true;
        if (tamanho == 0){            
            valor = false;
        }
        Assert.assertTrue(valor);
    }
    
    @Test
    public void deboPoderCalcularElCostoDelBanhoDeUnPerroMini() {
        perro.setTamanho(1);        
        Assert.assertEquals(15.0, perro.costoBanho(),0.0);
        
    }
    
    @Test
    public void deboPoderCalcularElCostoDelBanhoDeUnPerroMediano(){
        perro.setTamanho(2);
        Assert.assertEquals(30.0, perro.costoBanho(),0.0);
    }
    
    @Test
    public void deboPoderCalcularElCostoDelBanhoDeUnPerroGrande(){
        perro.setTamanho(3);
        Assert.assertEquals(45.0, perro.costoBanho(),0.0);
    }
}