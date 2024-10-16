import java.util.ArrayList;

public class Cliente {

  private Integer id;
  private String apellido;
  private Integer cuit;
  private Integer dni;
  private ArrayList<Cuenta>cuentas

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


}