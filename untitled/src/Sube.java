public class Sube {

    private final Integer CODIGO;
    private Double saldoDisponible;
    private static Double LimiteSaldoNegativo = 400.0;


    public Sube(Integer CODIGO, Double saldoDisponible) {

        this.CODIGO = CODIGO;
        this.saldoDisponible = saldoDisponible;


    }

    public static void setLimiteSaldoNegativo(Double nuevoSaldo) {

        LimiteSaldoNegativo = nuevoSaldo;


    }

    public Double getLimiteSaldoNegativo() {

        return LimiteSaldoNegativo;


    }
public Double getSaldoDisponible(){


      return saldoDisponible;


}

public void setSaldoDisponible(Double nuevoSaldo){

      saldoDisponible=nuevoSaldo;


}

    @Override
    public String toString() {
        return "Sube{" +
                "CODIGO=" + CODIGO +
                ", saldoDisponible=" + saldoDisponible +
                '}';
    }
}


