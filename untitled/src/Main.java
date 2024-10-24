//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Vendedor vendedor=new Vendedor("Juan","Lopez",32190129,200.00,"a",1120904939,9);
        vendedor.agregarTarea("reponer STock");
        vendedor.listaTareas();



    }
}