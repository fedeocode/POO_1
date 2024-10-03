public class EmpleadoLimpieza extends Empleado {


  //Propiedades
  protected static Double sueldoFijo;
  protected  Double sueldoTotal;

  //constructor
  public EmpleadoLimpieza(String nombre, Integer dni, Integer legajo, Double sueldoTotal) {
    super(nombre, dni, legajo);
    this.sueldoTotal = sueldoTotal;
  }

  public void calcularSueldoMes() {


  }

}
