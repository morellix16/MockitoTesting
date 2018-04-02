package Test;

import Model.Casilla;
import Model.Posicion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class TestCasilla {


    @Test(expected = IllegalArgumentException.class)
    public void testCasillaNoPermiteFichasIncorrecta(){
        Casilla casillaMock = Mockito.mock(Casilla.class);
        casillaMock.setFicha('x');
        when(casillaMock.getFicha()).thenThrow(new IllegalArgumentException());
        casillaMock.getFicha();
    }

    @Test
    public void testCasillaPermiteFichasCorrecta(){
        Casilla casillaMock = Mockito.mock(Casilla.class);
        doThrow(new IllegalArgumentException()).when(casillaMock).setFicha('J');
    }

}
