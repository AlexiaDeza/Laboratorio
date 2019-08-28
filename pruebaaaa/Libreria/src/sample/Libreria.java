package sample;
import com.sun.istack.internal.NotNull;
import java.util.*;
import editorial.Editoriales;

public class Libreria {


    private HashMap<Editoriales, Integer> h1;

    public Libreria(HashMap<Editoriales,Integer> h2){
        h1 = h2;
    }

    public void setH1(HashMap<Editoriales, Integer> h1) {
        this.h1 = h1;
    }

    public HashMap<Editoriales, Integer> getH1() {
        return h1;
    }


    public Editoriales EditorialMasVendidos(){
        int mayor=0;
        Editoriales editorial= null;

        for (Map.Entry<Editoriales,Integer> valor : h1.entrySet()) {
           if(valor.getValue() > mayor){
               mayor=valor.getValue();
               editorial=valor.getKey();
           }

        }
        return editorial;
    }

    public void ImprimirValor(HashMap<Editoriales,Integer> h3){
        System.out.print(h3.values());
    }
}
