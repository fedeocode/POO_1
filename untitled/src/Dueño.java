import java.util.ArrayList;

public class Dueño {

private String nombre;
private String direccion;
private Integer edad;
private ArrayList<Mascota>mascotas;
private ArrayList<Veterinario>veterinarios;


public Dueño(String nombre,String direccion,Integer edad){

this.nombre=nombre;
this.edad=edad;
this.direccion=direccion;
this.mascotas=new ArrayList<Mascota>();
this.veterinarios=new ArrayList<Veterinario>();
}

public void registroMascota(Mascota mascota){

    this.mascotas.add(mascota);

}

public void programarTurno(Veterinario veterinario){

    this.veterinarios.add(veterinario);

}

public void listarAnimales(){

 for (int i=0; i<this.mascotas.size(); i++){

     System.out.println("Lista de mascotas"+this.mascotas.get(i));



 }



}


}
