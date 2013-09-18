/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinariatdd;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pcsidsub
 */
public class GatoTest {
    
    private Gato gato;
    
    public GatoTest() {
        gato = new Gato("Belzubú");
    }

    @Test
    public void deboPoderCalcularElCostoDelBanho() {
        Assert.assertEquals(80.00, gato.costoBanho(), 0.0);
        
    }
}