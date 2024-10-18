public class Ave extends Animal implements Oviparo {

    private String plumaje;

    public Ave(Integer edad, String nombre, String plumaje) {
        super(edad, nombre);
        this.plumaje = plumaje;
    }

    @Override
    public void comer(){

        System.out.println("comer Animal");



    }

  public void romperCascaron(){

      System.out.println("AVE ROmpe cascaron");


  }


    @Override
    public void ponerHuevos() {
        System.out.println("nombre del ave: " + this.nombre + "es oviparo");
    }
}
