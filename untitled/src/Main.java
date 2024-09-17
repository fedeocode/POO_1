import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        String[] peliculas=new String[4];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese dos peliculas con ,");
        String pelicula1 = scanner.nextLine();

        System.out.println("ingrese primera pelicula");
        String pelicula2 = scanner.nextLine();


        System.out.println("ingrese segunda pelicula");
        String pelicula3=scanner.nextLine();

        System.out.println("ingrese tercera pelicula");
        String pelicula4=scanner.nextLine();

        String[] pelicularecibidas = new String[4];
        String[] peliculasrecibidas = pelicula1.split(",");

        peliculas[0]=pelicularecibidas[1];
        peliculas[1]=pelicularecibidas[2];
        peliculas[2]=pelicularecibidas[3];
        peliculas[3]=pelicularecibidas[4];

       for (int i = 1; i <= peliculas.length ; i++) {

           System.out.printf(peliculas[i]);
        }
    }
}