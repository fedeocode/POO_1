package entidades;

public class Cuenta {

    private String titular;
    private Integer dni;
    private Double saldoInicial;
    private Integer numeroCuenta;
    private String alias;




    public Cuenta(String titular, Integer dni, Double saldoInicial, Integer numeroCuenta, String alias) {

        this.titular = titular;
        this.dni = dni;
        this.saldoInicial = saldoInicial;
        this.numeroCuenta = numeroCuenta;
        this.alias = alias;


    }


    public void depositar(Double monto ) {
        saldoInicial=saldoInicial+monto;
        System.out.println(saldoInicial);

    }

    public void transferir(Integer numeroCuenta,Double monto) {
        if(monto<=saldoInicial){

          saldoInicial=saldoInicial-monto;
            System.out.println("Tranferencia Exitosa"+ saldoInicial);

        }else {

            System.out.println("No se ejecuto la transferencia");



        }




    }


    public void retirar(Double monto) {

        if(monto<=saldoInicial){
           saldoInicial=saldoInicial-monto;
          System.out.println(saldoInicial);
      }else{

        System.out.println("saldo insuficiente");



        }


    }


    public Integer getnumeroCuenta(){

        return this.numeroCuenta;


    }

}
