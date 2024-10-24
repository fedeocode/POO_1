import java.util.ArrayList;
import java.util.List;

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
