public abstract class Animal {

   protected Integer edad;
   protected String nombre;


    public Animal(Integer edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public abstract void comer();


}
