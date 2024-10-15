public abstract class Cuenta {
    private Double saldoCuenta;
    private Cliente cliente;

    public Cuenta(Double saldoCuenta, Cliente cliente) {
        this.saldoCuenta = saldoCuenta;
        this.cliente = cliente;
    }

    public abstract Double depositar(Double deposito);

    public abstract Double extraer(Double monto);

    public void informarsaldo() {

        System.out.println("Su saldo es:" + saldoCuenta);

    }

}






