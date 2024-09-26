public class Veterinario {

private Integer matricula;
private String nombre;
private String especie;


public Veterinario(Integer nummatricula,String nombreVeterinario,String nombreespecie){

this.especie=nombreespecie;
this.matricula=nummatricula;
this.nombre=nombreVeterinario;


}

public void realizarExamen(Mascota mascota){


    System.out.println("Examen de Mascota"+ mascota);


}







}
