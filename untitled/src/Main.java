//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Sube sube1 = new Sube(8934, 20.000);
        System.out.println("saldo negativo " + sube1.getLimiteSaldoNegativo());
        System.out.println("saldo disponible " + sube1.getSaldoDisponible());
        System.out.println("viendo metodo toString " + sube1.toString());

       Sube.setLimiteSaldoNegativo(500.0);
        System.out.println("Saldo negativo actualizado statico "+ sube1.getLimiteSaldoNegativo());


    }
    }
