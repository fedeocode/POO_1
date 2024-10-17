public class CajaDeAhorro extends Cuenta {

    private Double tasainteres;

    public CajaDeAhorro(Double saldoCuenta, Cliente cliente, Double tasainteres) {
        super(saldoCuenta, cliente);
        this.tasainteres = tasainteres;
    }

    @Override
public void depositar (Double deposito){
         if(deposito<=0) {
             System.out.println("Ingrese monto Valido");
         }
          else{
                 Double nuevoSaldo = getSaldoCuenta() + deposito;
                 this.setSaldoCuenta(nuevoSaldo);
             }
         }
@Override
public Double extraer (Double monto){

    if(monto<=0){
        System.out.println("Ingrese un Monto mayor a cero");
        return null;
    }else {
        if (getSaldoCuenta() >= monto) {

            Double nuevoSaldo = getSaldoCuenta() - monto;
            System.out.println("su saldo es" + nuevoSaldo);
            this.setSaldoCuenta(nuevoSaldo);
            return monto;

        }
    }
    System.out.println("Su monto no es valido");
     return null;
}


}

