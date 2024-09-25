import entidades.Producto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*Instanciando un objeto de la clase producto en el paquete */



        Producto motoUno=new Producto("g22",20.55,90.000,30);

        System.out.println("Motos disponibles "+'\n'+motoUno.stockDisponible());
        System.out.println("ganacias motos"+'\n'+motoUno.calcularGanancia());


        ArrayList<Producto> listadeProductos=new ArrayList<>();


        /*  motoUno es la clase que esta arriba seria motoUno */

        listadeProductos.add(motoUno);
        for(int i=0;i<listadeProductos.size();i++){

            System.out.println("lista de Productos"+listadeProductos.get(i));

       }

        listadeProductos.remove(motoUno);




    }

}

