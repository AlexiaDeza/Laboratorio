import sample.Persona;

import java.util.HashSet;

public class Madre extends Persona {
private String empresa;
HashSet<String>h1=new HashSet<String>();

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setH1(HashSet<String> h1) {
        this.h1 = h1;
    }

    public HashSet<String> getH1() {
        return h1;
    }

    public String getEmpresa() {
        return empresa;
    }

    public Madre () {
        empresa="Ferrari";
        h1.add("pepito");
    }
    public Madre (String empresax,String hijito){
        empresa=empresax;
        h1.add(hijito);
    }
}
