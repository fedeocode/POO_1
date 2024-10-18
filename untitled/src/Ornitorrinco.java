public class Ornitorrinco extends Mamifero implements Oviparo {

    public Ornitorrinco(Integer edad, String nombre, Integer cantidadDeCrias) {
        super(edad, nombre, cantidadDeCrias);
    }

    @Override
    public void ponerHuevos() {
                System.out.println(" pone huevos"  +  this.nombre  +  "es Oviparo");
    }
}
