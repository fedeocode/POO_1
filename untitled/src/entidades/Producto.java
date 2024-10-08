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
    private String producto;
    private Double precioCompra;
    private Double precioVenta;
    private Integer stockDisponible;


    /*Constructor*/
    public Producto(String producto, Double precioCompra, Double precioVenta, Integer stockDisponible) {
        this.producto = producto;
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

