import java.util.ArrayList;
import java.util.Objects;

public class Cliente  implements Comparable<Cliente>  {

  private Integer id;
  private String apellido;
  private Integer cuit;
  private Integer dni;
  private ArrayList<Cuenta>cuentas;

  public Cliente(Integer id,String apellido,Integer cuit,Integer dni){
      this.id=id;
      this.apellido=apellido;
      this.cuit=cuit;
      this.dni=dni;
      this.cuentas=new ArrayList<Cuenta>();
   }
   public void depositarAcuenta(Double monto){


  }

  public void agregarCuenta(Cuenta nuevaCuenta){




  }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id) && Objects.equals(apellido, cliente.apellido) && Objects.equals(cuit, cliente.cuit) && Objects.equals(dni, cliente.dni) && Objects.equals(cuentas, cliente.cuentas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, apellido, cuit, dni, cuentas);
    }
}