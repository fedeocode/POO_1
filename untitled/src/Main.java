import entidades.Producto;
import entidades.Venta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*Instanciando un objeto de la clase producto en el paquete */



        Producto motoUno=new Producto("yamaha",90.00,30.00,5);
        Producto producto=new Producto("ollas",300.00,200.00,9);
        Venta venta=new Venta(5,producto,300.0,5,new Date(2003,7,3));
        Venta venta1=new Venta(7,producto,399.0,3,new Date(2007,3,7));
       producto.calcularGanacia();
       producto.stockDisponible();
        System.out.println("Monto Total " + venta.calcularMonto());
        System.out.println("Comision de venta"+ venta.comisionVenta());
        venta.ventasIguales(venta1);
        motoUno.compararStock(producto);
        System.out.println("Info de ventas"+ venta.toString());
        System.out.println("Motos disponibles "+'\n'+motoUno.stockDisponible());
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

