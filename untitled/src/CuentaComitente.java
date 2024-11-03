public class CuentaComitente extends Cuenta {


    private String claveAutorizacion;
    public CuentaComitente(Double saldoCuenta, Cliente cliente,String claveAutorizacion) {
        super(saldoCuenta, cliente);
        this.claveAutorizacion=claveAutorizacion;
    }

    @Override
    public void depositar(Double deposito) {
        if(deposito>0) {
            Double depositoSinComision = deposito - deposito * 0.01;
            setSaldoCuenta(getSaldoCuenta() + depositoSinComision);
            System.out.println("El saldo actual es: " + getSaldoCuenta() + " El deposito sin comision es " + depositoSinComision);
        }else{
            System.out.println("El importe debe ser mayor a cero");
        }
    }

    @Override
    public Double extraer(Double monto) {
      if(monto<=(getSaldoCuenta()*0.5)) {
          setSaldoCuenta(getSaldoCuenta()-monto);
          return monto;
        }else{

          System.out.println("Saldo insuficiente");

            return 0.0;
      }

    }

    public Double extraerconClave(Double monto,String clave) {
        if (clave.equals(this.claveAutorizacion)) {
            setSaldoCuenta(getSaldoCuenta() - monto);
            return monto;
        } else {
            System.out.println("Clave incorrecta");
            return null;


        }
    }

   }




