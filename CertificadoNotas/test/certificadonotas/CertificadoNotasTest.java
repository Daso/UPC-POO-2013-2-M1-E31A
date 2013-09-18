package certificadonotas;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class CertificadoNotasTest {
    
    private CertificadoNotas certificadoNotas;
            
    public CertificadoNotasTest() {
        certificadoNotas = new CertificadoNotas();
    }

    @Test
    public void deboPoderCrearUnCursoConNombre() {
     Assert.assertEquals("POO", certificadoNotas.crearCurso("POO"));
    }
}