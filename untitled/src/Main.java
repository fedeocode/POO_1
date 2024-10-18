//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Ave aguila =new Ave(20,"indio","blanco");
        Mamifero ornitorrinco=new Ornitorrinco(10,"perri",22);
        ornitorrinco.comer();
        ((Oviparo)ornitorrinco).ponerHuevos();

    }
}

