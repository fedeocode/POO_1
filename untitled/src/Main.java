import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Vendedor vendedor=new Vendedor("Juan","Lopez",32190129,200.00,"a",1120904939,9);
        Vendedor vendedor1=new Vendedor("fede","ibanez",43954098,3000.00,"B",112267909,4);
        vendedor.agregarTarea("reponer STock");
        vendedor.agregarTarea("atencion al publico");
        vendedor.listaTareas();
        vendedor.eliminarTarea("reponer STock");
        System.out.println("asi queda la colleccion despues de eliminar una tarea");
        vendedor.listaTareas();
        Set<Vendedor> vendedores  = new HashSet<>();
        agregarVendedores(vendedores,vendedor);
        eliminarVendedores(vendedores,vendedor1);
        agregarVendedores(vendedores,vendedor);
        buscarDni(32190129,vendedores);
    }




    public static void agregarVendedores (Set<Vendedor> lista,Vendedor nuevovendedor) {
        lista.add(nuevovendedor);
        for(Vendedor v: lista){
            System.out.println(" Vendedores "+ v);
        }


    }

    public static void eliminarVendedores(Set<Vendedor>lista,Vendedor eliminarvendedor){
        if(!lista.contains(eliminarvendedor)){
            System.out.println("no esta el vendedor");
        }else{
            lista.remove(eliminarvendedor);
            for(Vendedor v:lista){
                System.out.println(" Vendedores actuales" + v );

            }


        }

   }
    public static void buscarDni(Integer dni,Set<Vendedor>vendedores){
        Vendedor Buscado=null;

        if( dni==null){
            System.out.println("Ingrese dni valido");

                  }else{
            for(Vendedor vendedor:vendedores){
                vendedor.getDni().equals(dni);
                System.out.println("  Vendedor encontrado  "  +  vendedor.toString());
            }

        }
    }

}