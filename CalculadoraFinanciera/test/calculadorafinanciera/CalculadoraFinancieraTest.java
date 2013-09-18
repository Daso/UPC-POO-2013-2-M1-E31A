
package calculadorafinanciera;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculadoraFinancieraTest {
    
    private CalculadoraFinanciera miCalculadora;
    
    public CalculadoraFinancieraTest() {
        miCalculadora = new CalculadoraFinanciera();
    }

    @Test
    public void siEnvioCienDebeDevolverDiezYOcho(){       
        Assert.assertEquals(18.00, miCalculadora.igv(100.00),0.0);
    }
    
    @Test
    public void siEnvioCienDebeDevolverTreintaDeImpuestoALaRenta(){        
        Assert.assertEquals(30.00, miCalculadora.renta(100.00),0.0);
    }
}