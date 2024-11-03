package entidades;

import java.time.LocalDate;

public class Producto {
    //Necesitamos diseñar un sistema que permita a un vendedor consultar por un
    //producto. Los productos tienen nombre,precio de compra, precio de venta y
    //stock disponibles. Se espera que los
    //productos puedan informar si hay stock
    //disponible y cuál es la ganancia
    //obtenida por cada venta, según los
    //precios disponibles.>
    private String nombreProducto;
    private Double precioCompra;
    private Double precioVenta;
    private Integer stockDisponible;


    /*Constructor*/
    public Producto(String nombreProducto, Double precioCompra, Double precioVenta, Integer stockDisponible) {
        this.nombreProducto =nombreProducto;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stockDisponible = stockDisponible;

    }

   public Double getPrecioVenta(){

      return precioVenta;

   }



    public Integer getStockDisponible(){

        return stockDisponible;

          }

    public void setStockDisponible(Integer stockDisponible){

        this.stockDisponible=stockDisponible;
    }

    public Boolean stockDisponible() {
        if (stockDisponible <= 0) {
            System.out.println("Stock vacio");

            return false;
        } else {

            System.out.println("Stock disponible" + stockDisponible);

            return true;
        }

    }

    public void compararStock(Producto producto){

          if(this.stockDisponible>producto.getStockDisponible()) {

              System.out.println("Producto esta disponible, mas Stock");

          } else if (this.stockDisponible<producto.getStockDisponible()) {
              System.out.println("Producto no tiene, menos Stock");

          }else{

              System.out.println("Producto igual en Stock");
          }


        }

      public Double calcularGanacia() {

        return precioVenta - precioCompra;

    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", precioCompra=" + precioCompra +
                ", precioVenta=" + precioVenta +
                ", stockDisponible=" + stockDisponible +
                '}';
    }
}

