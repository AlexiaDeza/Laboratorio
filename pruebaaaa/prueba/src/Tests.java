import org.junit.Test;
import sample.Persona;

import static org.junit.jupiter.api.Assertions.*;
public class Tests {
    @Test
    public void MayorEdadTrue(){
        Persona p7 = new Persona(22,39000000,"Jorge","Ramirez","Hombre","Vendedor");
        boolean valorEsperado=true;
        boolean valorObtenido=p7.MayorEdad();

        assertEquals(valorEsperado,valorObtenido);
    }
    @Test
    public void MayorEdadFalse(){
        Persona p7 = new Persona(17,39000000,"Jorge","Ramirez","Hombre","Vendedor");
        boolean valorEsperado=false;
        boolean valorObtenido=p7.MayorEdad();

        assertEquals(valorEsperado,valorObtenido);
    }

    @Test
    public void DniMenorFalse(){
        Persona p8 = new Persona(22,39000000,"Jorge","Ramirez","Hombre","Vendedor");
        boolean valorEsperado=false;
        boolean valorObtenido=p8.DniMenor38();

        assertEquals(valorEsperado,valorObtenido);
    }

    @Test
    public void DniMenorTrue(){
        Persona p8 = new Persona(22,36000000,"Jorge","Ramirez","Hombre","Vendedor");
        boolean valorEsperado=true;
        boolean valorObtenido=p8.DniMenor38();

        assertEquals(valorEsperado,valorObtenido);
    }

    @Test
    public void NombreConATrue(){
        Persona p10 = new Persona(22,39000000,"Alan","Ramirez","Hombre","Vendedor");
        boolean valorEsperado=true;
        boolean valorObtenido=p10.NombreConA();

        assertEquals(valorEsperado,valorObtenido);
    }

    @Test
    public void NombreConAFalse(){
        Persona p10 = new Persona(22,39000000,"Alan","Ramirez","Hombre","Vendedor");
        boolean valorEsperado=false;
        boolean valorObtenido=p10.NombreConA();

        assertEquals(valorEsperado,valorObtenido);
    }
}
