package entidades;

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


import java.time.LocalDate;

public class Venta {
    private Producto producto;
    private Integer idVenta;
    private static Double comisionModificda = 0.10;


    public Venta(Integer idVenta) {
        this.producto = producto;
        this.idVenta = idVenta;
    }



    public void fechaOperacion(LocalDate fechaOperacion) {

        System.out.println("Fecha de operacion");


    }

    public static Double setcomisionModificada(Double comisionCambiada) {

        comisionModificda = comisionCambiada;

        return comisionModificda;

    }

    public Integer compararStock() {

        return this.precioCompra.compareTo(this.precioVenta);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
