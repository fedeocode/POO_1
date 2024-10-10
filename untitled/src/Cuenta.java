public abstract class Cuenta {
    private Double saldoCuenta;
    private Cliente cliente;

   public abstract void depositar (Double deposito);
   public abstract Double extarer (Double monto);

   public void informarsaldo(){

       System.out.println("Su saldo es:"+ saldoCuenta);

    }

   }






