//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente juan=new Cliente(3,"fernandez",30,32345876);
        CajaDeAhorro cuenta=new CajaDeAhorro(5000.00,juan,20.01);
        CajaCorriente cuenta1=new CajaCorriente(10.00,juan);
        System.out.println("Saldo de su Cuenta"+cuenta.getSaldoCuenta());
        cuenta.setSaldoCuenta(200.00);
        cuenta.extraer(10000.00);
        cuenta.depositar(00.00);
        cuenta1.extraer(20.00);
        System.out.println("saldo de Caja Corriente"+cuenta1.getSaldoCuenta());
        System.out.println("Extraccion de Cuenta"+cuenta1.extraer(210.00));
        cuenta1.depositar(20.00);
        System.out.println("Saldo cuenta corriente");
        cuenta1.depositar(200.00);
        System.out.println("");
        cuenta.informarsaldo();

            }
}