package entidades;
import entidades.Producto;

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
    private Integer idVenta;
    private Producto producto;
    private Double monto;
    private Integer cantidad;
    private static Double comisionModificda = 0.10;


    public Venta(Integer idVenta, Producto nombreProducto,Double monto,Integer cantidad) {
        this.idVenta = idVenta;
        this.producto = nombreProducto;
        this.monto=monto;
        this.cantidad=cantidad;
    }

    public Integer getIdVenta() {

        return idVenta;

    }

    public void setIdVenta(Integer idVenta){

       this.idVenta=idVenta;
    }

    public void ventasIguales(Venta venta){
           if(this.idVenta.equals(venta.idVenta)) {

               System.out.println("Ventas iguales");

           }else{

                   System.out.println("Ventas no iguales");



               }

           }

    public Double calcularMonto(){
        this.monto=this.producto.getPrecioVenta()*this.cantidad;
        return this.monto;

    }

    public Double comisionVenta() {
        return (monto * comisionModificda / 100);

    }

    public Double costoTotal(){
        return producto.getPrecioVenta()*cantidad;
    }

    public void fechaOperacion(LocalDate fechaOperacion) {

        System.out.println("Fecha de operacion");


    }

    public static Double setcomisionModificada(Double comisionCambiada) {

        comisionModificda = comisionCambiada;

        return comisionModificda;

    }


}

