//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente juan=new Cliente(3,"fernandez",30,32345876);
        CajaDeAhorro cajadeahorro=new CajaDeAhorro(5000.00,juan,20.01);
        CajaCorriente cajacorriente=new CajaCorriente(10.00,juan);
        System.out.println("Saldo de su Cuenta"+cajadeahorro.getSaldoCuenta());
        cajadeahorro.setSaldoCuenta(200.00);
        cajadeahorro.extraer(10000.00);
        cajadeahorro.depositar(00.00);
        cajacorriente.extraer(20.00);
        System.out.println("saldo de Caja Corriente"+cajacorriente.getSaldoCuenta());
        System.out.println("Extraccion de Cuenta"+cajacorriente.extraer(210.00));
        cajacorriente.depositar(20.00);
        System.out.println("Saldo cuenta corriente");
        cajacorriente.depositar(200.00);
        System.out.println("");
        cajadeahorro.informarsaldo();

            }
}