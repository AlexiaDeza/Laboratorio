import editorial.Editoriales;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import sample.Libreria;

import java.util.HashMap;

public class Tests {
    @Test
    public void EditorialMasVendidaKapelusz(){
        HashMap<Editoriales,Integer> h2 = new HashMap<Editoriales,Integer>();
        h2.put(Editoriales.KAPELUSZ,170);
        h2.put(Editoriales.ALIANZA,10);
        h2.put(Editoriales.ATLANTIDA,40);
        h2.put(Editoriales.ELATENEO,100);
        h2.put(Editoriales.INTERZONA,120);
        h2.put(Editoriales.SUDAMERICANA,107);
        h2.put(Editoriales.SUR,7);
        Libreria l7 = new Libreria(h2);
        Editoriales valorEsperado= Editoriales.KAPELUSZ;
        Editoriales valorObtenido=l7.EditorialMasVendidos();

        assertEquals(valorEsperado,valorObtenido);
    }
}
