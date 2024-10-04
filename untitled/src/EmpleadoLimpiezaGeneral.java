public class EmpleadoLimpiezaGeneral extends EmpleadoLimpieza {

    private Integer cantidadHorasExtras=0;
    private static Double valorHoraExtra=3000.0;

    public EmpleadoLimpiezaGeneral(String nombre, Integer dni, Integer legajo) {
        super(nombre, dni, legajo);
    }

    public Double calcularValorHoraExtra(){

        System.out.println("valor de la hora extra es: "+cantidadHorasExtras*valorHoraExtra);

           return cantidadHorasExtras*valorHoraExtra;

    }
   public void realizarHorasExtras(Integer horasExtras){

          cantidadHorasExtras=this.cantidadHorasExtras+horasExtras;



   }
   @Override  public void calcularSueldoMes(){

     sueldoTotal=sueldoFijo+calcularValorHoraExtra();
       System.out.println("sueldo mes"+sueldoTotal);


   }

}
