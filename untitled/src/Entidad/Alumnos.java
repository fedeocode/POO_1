package Entidad;

public class Alumnos {

    private String apellido;
    private String nombre;
    private static Integer edad;

    public Alumnos(Integer edad, String nombre, String apellido) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public Integer setEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public void mayorEdad(Integer edad) throws EdadInvalidaExeption {

        if (edad > 18 && edad < -1) {

            throw new EdadInvalidaExeption("Ingrese una edad a mayor de 18 años");
        }
        this.edad = edad;


    }

    public void setEdad(Integer edad) throws EdadInvalidaExeption {
        this.edad = edad;
        Alumnos.edad = edad;
        if (edad < 1) {

            throw new EdadInvalidaExeption("No puede ser menor edad a 1");


        }


    }

}


