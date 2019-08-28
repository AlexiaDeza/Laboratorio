import sample.Persona;

public class Hijo extends Persona {
private String escuela;
private String juegoFav;

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public void setJuegoFav(String juegoFav) {
        this.juegoFav = juegoFav;
    }

    public String getEscuela() {
        return escuela;
    }

    public String getJuegoFav() {
        return juegoFav;
    }

    public Hijo () {
        this("politecnico");
        juegoFav="tateti";
    }
    public Hijo (String escuelax,String juegoFavx){
        escuela=escuelax;
        juegoFav=juegoFavx;
    }
}
