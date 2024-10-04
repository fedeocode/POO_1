public class EmpleadoLavadorLavajilla extends EmpleadoLimpieza{

    private Integer cantidadVajillarota=0;
    private Double costoAcumuladoVajillarota=0.0;


    public EmpleadoLavadorLavajilla(String nombre, Integer dni, Integer legajo) {
        super(nombre, dni, legajo);
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

         this.sueldoTotal=sueldoFijo;
         if(cantidadVajillarota>=2){

          this.descontarSueldo();
           }
        System.out.println("Sueldo del mes"+sueldoTotal);


    }
}
