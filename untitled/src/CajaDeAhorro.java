public class CajaDeAhorro extends Cuenta {

    private Double tasainteres;

    public CajaDeAhorro(Double tasainteres) {
        this.tasainteres = tasainteres;
    }
}

    @Override
public void depositar (Double deposito){
saldoCuenta=saldocuenta+deposito;

        System.out.println("Deposito" + deposito );



}

@Override
public Double extraer (Double monto){


}


}

