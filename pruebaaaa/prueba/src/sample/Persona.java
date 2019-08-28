package sample;

public class Persona{
    private String nombre;
    private int edad;
    private String apellido;
    private int dni;
    private String sexo;
    private String ocupacion;

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getDni(){
        return this.dni;
    }
    public String getSexo(){
        return this.sexo;
    }
    public String getOcupacion(){
        return this.ocupacion;
    }



   public Persona(int edadx, int dnix, String nombrex, String apellidox, String sexox, String ocupacionx){
        edad=edadx;
        dni=dnix;
        nombre=nombrex;
        apellido=apellidox;
        sexo=sexox;
        ocupacion=ocupacionx;
    }
public Persona (){
   edad=15;
   dni=44159247;
   nombre="Alexia";
   apellido="Deza";
   sexo="mujer";
   ocupacion="vendedora";
}

public boolean MayorEdad(){
    return this.edad > 18;
}
public boolean NombreConA(){
        for (int i=0;i<this.nombre.length();i++){
            if(this.nombre.charAt(i)=='a'){
                return true;
            }
        }
        return false;
}
public boolean DniMenor38(){
        return this.dni<38000000;
}
public void printPersona() {
    System.out.println("nombre= "+this.nombre+"edad= "+this.edad+"dni= "+this.dni+"apellido"+this.apellido+"ocupacion"+this.ocupacion+"sexo= "+this.sexo);
    }
}
