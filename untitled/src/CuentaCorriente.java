public class CuentaCorriente extends Cuenta {

    private Double limiteMontoDescubierto;
    private Double descubiertoDisponible;

    public CuentaCorriente(Double saldoCuenta, Cliente cliente, Double limiteMontoDescubierto, Double descubiertoDisponible) {
        super(saldoCuenta, cliente);
        this.limiteMontoDescubierto = limiteMontoDescubierto;
        this.descubiertoDisponible = descubiertoDisponible;
    }

    public void depositarCheque(){




    }



}
