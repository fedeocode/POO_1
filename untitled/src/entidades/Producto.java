package entidades;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Producto {
    //Necesitamos diseñar un sistema que permita a un vendedor consultar por un
    //producto. Los productos tienen nombre,precio de compra, precio de venta y
    //stock disponibles. Se espera que los
    //productos puedan informar si hay stock
    //disponible y cuál es la ganancia
    //obtenida por cada venta, según los
    //precios disponibles.>
    private String nombre;
    private Double precioCompra;
    private Double precioVenta;
    private Integer stockDisponible;


    /*Constructor*/
    public Producto(String nombre, Double precioCompra, Double precioVenta, Integer stockDisponible) {
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stockDisponible = stockDisponible;

    }

    public Integer stockDisponible() {
        return this.stockDisponible;


    }

    public Double calcularGanancia() {

        return this.precioVenta - this.precioCompra;

    }
}

/*El primer enunciado decía así:
        “ Necesitamos diseñar un sistema que permita a un
vendedor consultar por un producto. Los productos tienen
nombre, precio de compra, precio de venta y stock
disponibles. Se espera que los productos puedan informar
si hay stock disponible y cuál es la ganancia obtenida por
        cada venta, según los precios disponibles. ”

Podríamos desarrollarlo un poco más para calcular las ventas....
Para registrar una venta por el momento se necesita incluir el id de
la venta,(una lista de productos con su precio y cantidad*) un
producto , el empleado que realizó la venta y la fecha de
operación(Podríamos más adelante incluir la forma de pago).
Por cada venta se aplica una comisión del 10% fija, al menos por este
semestre pero puede modificarse más adelante a nivel general.

También se requiere poder comparar productos en base al stock,
verificar si dos ventas son iguales, calcular el costo total y la comisión
de cada venta y visualizar toda la información de la operación como
un texto.*/




    public class Venta {

        private Integer idVenta;
        private static Double comision=0.10;


        public Venta(Integer idVenta, Double comision) {

            this.idVenta = idVenta;
            this.comision = comision;

        }

        public Double precioTotal(){

            return this.precioVenta * this.stockDisponible;



        }

        public static void fechaOperacion(LocalDate fechaOperacion) {

              fechaOperacion(LocalDate.now());

        }

        public static Double setcomisionModificada(Double comisionCambiada) {

            comisionModificda=comisionCambiada;

        }

        public static void compararStock(Double comparaStock){

             comparaStock.compareTo(comparaStock);


        }

       public static void ventasIguales(Double ventasIguales){

           ventasIguales.equals(ventasIguales);

       }

      public static void getinfoperacion(String infoperacion){
          System.out.println(infoperacion);


    }


}