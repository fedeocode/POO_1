public class CajaCorriente extends Cuenta {

    private Double limitedeMontoDescubierto;

    public CajaCorriente(Double saldoCuenta, Cliente cliente, Double limitedeMontoDescubierto) {
        super(saldoCuenta, cliente);
        this.limitedeMontoDescubierto = limitedeMontoDescubierto;
    }

    @Override
    public void depositar (Double deposito) {

        if (getSaldoCuenta() >= 0) {
            Double nuevoSaldo = getSaldoCuenta() + deposito;
            this.setSaldoCuenta(nuevoSaldo);
        }
    }
    @Override
    public Double extraer (Double monto){

        if(getSaldoCuenta()<=monto){

            Double nuevoSaldo=getSaldoCuenta()-monto;
            System.out.println("su saldo es");
            this.setSaldoCuenta(nuevoSaldo);
            return monto;

        }

        System.out.println("Su monto no es valido");
        return null;
    }


}
