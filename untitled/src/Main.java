import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Vendedor vendedor = new Vendedor("Juan", "Lopez", 32190129, 200.00, "a", 1120904939, 9);
        Vendedor vendedor1 = new Vendedor("fede", "ibanez", 43954098, 3000.00, "B", 112267909, 4);
        vendedor.agregarTarea("reponer STock");
        vendedor.agregarTarea("atencion al publico");
        vendedor.listaTareas();
        vendedor.eliminarTarea("Eliminar STock");
        System.out.println("asi queda la colleccion despues de eliminar una tarea");
        vendedor.listaTareas();

        List<Vendedor>vendedores=new ArrayList<>();
        vendedores.add(vendedor);
        vendedores.add(vendedor1);
        mostrarNombresOrdenados(vendedores);

        Set<Vendedor> vendedorset = new HashSet<>();
        agregarVendedores(vendedorset, vendedor);
        eliminarVendedores(vendedorset, vendedor1);
        agregarVendedores(vendedorset, vendedor);
        buscarDni(32190129, vendedorset);

        Producto arroz = new Producto(34, "Arroz integrado");
        Producto fideo = new Producto(22, "Fideos mozctacholiz");
        Map<Integer, Producto> listaProductos = new HashMap<>();
        listaProductos.put(arroz.getClave(), arroz);
        listaProductos.put(fideo.getClave(), fideo);
        buscarProductos(listaProductos,22);
        agregarProductos(listaProductos,fideo);
        agregarProductos(listaProductos,arroz);
        eliminarProductos(listaProductos,fideo);


    }


    public static void agregarVendedores(Set<Vendedor> lista, Vendedor nuevovendedor) {
        lista.add(nuevovendedor);
        for (Vendedor v : lista) {
            System.out.println(" Vendedores " + v);
        }


    }

    public static void eliminarVendedores(Set<Vendedor> lista, Vendedor eliminarvendedor) {
        if (!lista.contains(eliminarvendedor)) {
            System.out.println("no esta el vendedor");
        } else {
            lista.remove(eliminarvendedor);
            for (Vendedor v : lista) {
                System.out.println(" Vendedores actuales" + v);

            }


        }

    }

    public static void buscarDni(Integer dni, Set<Vendedor> vendedores) {
        Vendedor Buscado = null;

        if (dni == null) {
            System.out.println("Ingrese dni valido");

        } else {
            for (Vendedor vendedor : vendedores) {
                vendedor.getDni().equals(dni);
                System.out.println("  Vendedor encontrado  " + vendedor.toString());
            }

        }
    }

    public static void buscarProductos(Map<Integer, Producto> productos, Integer clave) {

        if (clave == null) {
            System.out.println("Ingresar una clave valida");
        } else {
            if (!productos.containsKey(clave)) {

                System.out.println("Esta clave no existe");

            } else {

                System.out.println("Clave del producto" + productos.get(clave));
            }
        }
    }

    public static void mostrarNombresOrdenados(List<Vendedor> vendedores) {
        List<String> nombres = new ArrayList<>();
        for (Vendedor vendedor : vendedores) {
            nombres.add(vendedor.getNombre());
        }
        Collections.sort(nombres);
        {

            for (String nombre : nombres) {
                System.out.println(nombre);

            }
        }
    }

    public static void agregarProductos(Map<Integer,Producto>productos,Producto producto){
         if(productos.containsKey(producto.getClave())) {
             System.out.println(" Producto " + producto + "ya existe");
         }else{
            productos.put(producto.getClave(),producto);
             System.out.println(" Producto " + producto + "Agregado");

         }
      }

   public static void eliminarProductos(Map<Integer,Producto>productos,Producto producto){
        if(!productos.containsKey(producto.getClave())) {
           System.out.println("El producto no existe ");
       }else{
            productos.remove(producto.getClave());
            for(Integer clave: productos.keySet()){

                System.out.println(productos.get(clave));
           }
        }
    }

}
