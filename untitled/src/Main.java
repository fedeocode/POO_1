//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente juan=new Cliente(3,"fernandez",30,32345876);
        CajaDeAhorro cuenta=new CajaDeAhorro(5000.00,juan,20.01);
        System.out.println("Saldo de su Cuenta"+cuenta.getSaldoCuenta());
        cuenta.setSaldoCuenta(200.00);
        cuenta.extraer(10.00);
        cuenta.depositar(20.00);
        cuenta.setSaldoCuenta(30.00);
        cuenta.informarsaldo();


            }
}