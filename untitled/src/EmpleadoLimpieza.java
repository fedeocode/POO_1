public class EmpleadoLimpieza extends Empleado {


  //Propiedades
  protected static Double sueldoFijo=600000.0;
  protected  Double sueldoTotal;

  //constructor
  public EmpleadoLimpieza(String nombre, Integer dni, Integer legajo) {
    super(nombre, dni, legajo);
    this.sueldoTotal = sueldoFijo;
  }

  public void calcularSueldoMes() {
    System.out.println("aca se calcula el sueldo");

  }

}
