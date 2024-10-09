public class Empleado {
    private String nombre;
    protected Integer dni;
    private Integer legajo;

public Empleado(String nombre,Integer dni,Integer legajo){

  this.nombre=nombre;
  this.dni=dni;
  this.legajo=legajo;

}

public void guardarDatos(String datos){

this.nombre=nombre;


}

    @Override
    public int hashCode() {
      int hash=17;

      hash=hash*nombre.hashCode()*dni.hashCode();

      return hash;

    }

    @Override
    public boolean equals(Object obj) {

        if (obj==null ||!( obj instanceof Empleado)) {

            return false;
        }
        return ((Empleado)obj).dni.equals(this.dni);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", legajo=" + legajo +
                '}';
    }
}
