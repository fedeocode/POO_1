

public class CajaCorriente extends Cuenta {

    private static Double limitedeMontoDescubierto=50000.0;
    private Double descubiertoDisponible=limitedeMontoDescubierto;

    public CajaCorriente(Double saldoCuenta, Cliente cliente) {
        super(saldoCuenta, cliente);
        this.limitedeMontoDescubierto = limitedeMontoDescubierto;

    }
    @Override
    public void depositar (Double deposito) {
        if (deposito <= 0) {
            System.out.println("Ingrese Monto Valido");
        } else {
            if (!limitedeMontoDescubierto.equals(descubiertoDisponible)) {
                Double diferencia =descubiertoDisponible-limitedeMontoDescubierto;
                descubiertoDisponible=descubiertoDisponible+diferencia;
                deposito=deposito-diferencia;
                setSaldoCuenta(getSaldoCuenta()+deposito);
                System.out.println("saldo Actualizado"+getSaldoCuenta()+ "monto descubierto"+ descubiertoDisponible);
              }
            else{
                   setSaldoCuenta(getSaldoCuenta()+deposito);
                System.out.println("Saldo actual"+ getSaldoCuenta());
            }

        }


    }
    @Override
    public Double extraer (Double monto){
      if(monto<=0){

     return null;
     }
        else{
             if(monto<=getSaldoCuenta()){
             Double nuevoSaldo=getSaldoCuenta()-monto;
               this.setSaldoCuenta(nuevoSaldo);
                 System.out.println("Saldo Cuenta"+getSaldoCuenta());
               return monto;
    }
        if(descubiertoDisponible+getSaldoCuenta()>=monto){
          Double decubiertoSolicitado=monto-getSaldoCuenta();
            this.setSaldoCuenta(0.0);
            descubiertoDisponible=descubiertoDisponible-decubiertoSolicitado;
            System.out.println("Saldo prestado caja corriente"+getSaldoCuenta()+ " Descubierto disponible"+ descubiertoDisponible);
            return monto;
   }
     }
       System.out.println("Su monto no es valido");
        return null;
    }
}
