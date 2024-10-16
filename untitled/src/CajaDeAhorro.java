public class CajaDeAhorro extends Cuenta {

    private Double tasainteres;

    public CajaDeAhorro(Double saldoCuenta, Cliente cliente, Double tasainteres) {
        super(saldoCuenta, cliente);
        this.tasainteres = tasainteres;
    }

    @Override
    public void depositar(Double deposito) {

    }

    @Override
    public Double extarer(Double monto) {
        return 0.0;
    }
}

