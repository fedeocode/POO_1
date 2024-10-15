//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       agregarMascota();


        Mascota perro=new Mascota("doberman","liLY",20);
    }
      public static void agregarMascota(){

        boolean continuar = true;


        ArrayList<Mascota> mascotas= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (continuar) {
            System.out.println("Ingresa De esta forma:Lili,3,Perro");
            String ingresaMascota = scanner.nextLine();
            //scanner.nextLine();
            String[] arrayinfo = ingresaMascota.split(",");
            String nombre=arrayinfo[0];
            String especie=arrayinfo[2];
            Integer edad=Integer.parseInt(arrayinfo[1]);
            Mascota mascota = new Mascota(especie,nombre,edad);
            mascotas.add(mascota);
// falta esto: sout ("desea continuar?" )-- el espacio vacío es que //está esperando un booleano entiendo
            System.out.println("¿Continuar ingresando info?");

//System.out.println("¿Continuar ingresando info? ");

           continuar = scanner.nextBoolean();
            scanner.nextLine();

       }

        for (int i = 0; i < mascotas.size(); i++) {


            System.out.println("Mascota ingresada  " + mascotas.get(i));
        }
    }





            }
