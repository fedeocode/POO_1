import entidades.Producto;
import entidades.Venta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*Instanciando un objeto de la clase producto en el paquete */



        Producto motoUno=new Producto("g22",20.55,90.000,30);
        Venta producto=new Venta(3,300.00,200.00,"olla",300);

        System.out.println(producto.getinfoperacion("Informacion de olla precio y venta","olla",299.00,200.00));
        System.out.println(producto.compararStock());
        System.out.println("Estos productos son iguales"+ producto.ventasIguales());
        producto.fechaOperacion(LocalDate.now());
        producto.ventasIguales();
        producto.precioTotal(200.00,20,400.00);
        System.out.println("Motos disponibles "+'\n'+motoUno.stockDisponible());
        System.out.println("ganacias motos"+'\n'+motoUno.calcularGanancia());
        Venta.setcomisionModificada(20.00);

        ArrayList<Producto> listadeProductos=new ArrayList<>();


        /*  motoUno es la clase que esta arriba seria motoUno */

        listadeProductos.add(motoUno);
        for(int i=0;i<listadeProductos.size();i++){

            System.out.println("lista de Productos"+listadeProductos.get(i));

       }

        listadeProductos.remove(motoUno);




    }

}

