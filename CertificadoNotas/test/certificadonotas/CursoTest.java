/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package certificadonotas;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class CursoTest {
    
    public CursoTest() {
    }

    @Test
    public void todoCursoDebeSerCreadoConNombre() {
        Curso curso = new Curso("Lengua");
        Assert.assertEquals("Lengua", curso.getNombre());
    }
}