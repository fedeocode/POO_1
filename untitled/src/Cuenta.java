public abstract class Cuenta {
    private Double saldoCuenta;
    private Cliente cliente;

    public Cuenta(Double saldoCuenta, Cliente cliente) {
        this.saldoCuenta = saldoCuenta;
        this.cliente = cliente;
    }

    public abstract void depositar (Double deposito);
   public abstract Double extarer (Double monto);

   public void informarsaldo(){

       System.out.println("Su saldo es:"+ saldoCuenta);

    }

   }






