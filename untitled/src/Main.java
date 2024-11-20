
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Vendedor vendedor=new Vendedor("Juan","Lopez",32190129,40000.00,"A",1120904939,9);
        Vendedor vendedor1=new Vendedor("fede","Ovejero",32490346,3000.00,"B",1132959506,20);
        Vendedor vendedor2=new Vendedor("katy","nuñez",435968678,900000.00,"C",1143566789,90);
        vendedor.agregarTarea("reponer STock");
        vendedor.listaTareas();
        List<Vendedor> listavendedores=new ArrayList<>();
        listavendedores.add(vendedor);
        listavendedores.add(vendedor1);
        listavendedores.add(vendedor2);

        listavendedores.forEach(v->System.out.println(v));
        Collections.sort(listavendedores);
        //listavendedores.forEach(v->System.out.println(v));





    }
    Set<Vendedor>setvendedor=new HashSet<>();
   public static void buscaDni(){

     Vendedor Abuscador=null;

   for(Vendedor vendedor:


   }



}