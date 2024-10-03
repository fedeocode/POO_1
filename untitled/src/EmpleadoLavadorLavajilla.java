public class EmpleadoLavadorLavajilla extends EmpleadoLimpieza{

    private Integer cantidadVajillarota;
    private Double costoAcumuladoVajillarota;


    public EmpleadoLavadorLavajilla(String nombre, Integer dni, Integer legajo, Double sueldoTotal) {
        super(nombre, dni, legajo, sueldoTotal);
    }

   public void romper(Integer cantidadvajilla,Double costovajilla){

        this.cantidadVajillarota=cantidadVajillarota+cantidadvajilla;
         this.costoAcumuladoVajillarota=this.costoAcumuladoVajillarota+(costovajilla*cantidadvajilla);
     }
 public void descontarSueldo(){

    this.sueldoTotal=sueldoTotal-costoAcumuladoVajillarota;

 }

    @Override
    public void calcularSueldoMes() {
        this.sueldoTotal=sueldoFijo-costoAcumuladoVajillarota;
    }
}
