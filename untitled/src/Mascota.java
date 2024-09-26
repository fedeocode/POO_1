public class Mascota {

    private String nombre;
    private Integer edad;
    private String especie;


    public Mascota(String especie,String nombre,Integer edad) {

       this.edad=edad;
       this.especie=especie;
       this.nombre=nombre;
   }

   public void setinfo(Integer edadNueva,String nombreNuevo){

     this.edad=edadNueva;
     this.nombre=nombreNuevo;

   }
public String getNombre(){


    return this.nombre;


}

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", especie='" + especie + '\'' +
                '}';
    }
}