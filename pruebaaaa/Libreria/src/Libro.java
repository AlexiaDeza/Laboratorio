import editorial.Editoriales;
public class Libro {
    private String nombre;
    private double precio;
    private Editoriales editorial;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEditorial(Editoriales editorial) {
        this.editorial = editorial;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Editoriales getEditorial() {
        return editorial;
    }

    public double getPrecio() {
        return precio;
    }

}
