import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Vendedor implements Comparable<Vendedor>{


    private String nombre;
    private String apellido;
    private Integer dni;
    private Double sueldo;
    private String sector;
    private Integer telefono;
    private Integer cantidadVenta=0;
    protected List<String> listatareas=new ArrayList<>();

    public Vendedor(String nombre, String apellido, Integer dni, Double sueldo, String sector, Integer telefono, Integer cantidadVenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldo = sueldo;
        this.sector = sector;
        this.telefono = telefono;
        this.cantidadVenta = cantidadVenta;
        this.listatareas =new ArrayList<>();
    }

    public void listaTareas() {

        for (int i = 0; i < listatareas.size(); i++) {

            System.out.println("La tarea " + listatareas.get(i));

        }

    }

    public void agregarTarea(String tarea){

    listatareas.add(tarea);


      }

   public void eliminarTarea( String tarea){

        if(!listatareas.contains(tarea)){

            System.out.println("No esta en la lista");
        }else{
            listatareas.remove(tarea);
        }
      }


    public void vender(){



    }

   public void reponerStock(){}




   public Double cobrarSueldo(){



    return 0.0;
   }

   public Integer cantidadVentas(){



   return 0;

    }

 public void CompararSueldo(){




 }

    public String getNombre() {
        return nombre;
    }

    public Integer getDni() {
        return dni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public boolean equals(Object obj) {
      Boolean resultado;
        if(obj==null || !obj.getClass().equals(this.getClass())){

        resultado=false;

        }else{
              Vendedor compararVendedor= (Vendedor)obj;
              resultado=compararVendedor.equals(this.dni);
        }
        return resultado;
    }

    @Override
    public int compareTo(Vendedor o) {
       return this.sueldo.compareTo(o.sueldo);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", sueldo=" + sueldo +
                ", sector='" + sector + '\'' +
                ", telefono=" + telefono +
                ", cantidadVenta=" + cantidadVenta +
                '}';
    }
}
