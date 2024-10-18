public abstract class Mamifero extends Animal{

    private Integer cantidadDeCrias;

    public Mamifero(Integer edad, String nombre, Integer cantidadDeCrias) {
        super(edad, nombre);
        this.cantidadDeCrias = cantidadDeCrias;
    }


    @Override
    public void comer(){

        System.out.println("el animal come");

    }

    public void amantar(){
       System.out.println("el MAMIFERO MAMANTA ");
   }

}
