import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        compararcadena();
        ordernarpeliculas();




        //1. Crea un arrays de cuatro películas e imprimirlas por orden alfabético.
        String[] peliculas = new String[4];
        peliculas[0] = "batman";
        peliculas[1] = "superman";
        peliculas[2] = "gladiador";
        peliculas[3] = "el señor de los anillos romulo";
        Arrays.sort(peliculas);
        for (int i = 0; i < peliculas.length; i++) {
            System.out.println("  peliculas  " + peliculas[i]);

        }

           /*2-Crea un nuevo array que contenga la lista de películas en
            mayúscula.*/


        System.out.println("Peliculas en Mayusculas");
        String[] peliculas2 = new String[4];
        peliculas2[0] = "hackers";
        peliculas2[1] = "intensamente2";
        peliculas2[2] = "tarzan";
        peliculas2[3] = "spiderman";

        for (int i = 0; i < peliculas2.length; i++) {
            peliculas2[i] = peliculas2[i].toUpperCase();
            System.out.println(peliculas2[i]);

        }


        //crea una función que de acuerdo a la edad del
        //usuario( recibe fecha de nacimiento) y si tiene entrada indique
        //si puede o no asistir al evento, debe ser mayor.

        System.out.println(numtexto("100", "50"));


        LocalDate fechadenacimiento = LocalDate.of(2024, 7, 6);
        System.out.println(ingresa(fechadenacimiento, true));

        cantidad_s("eL SOL SALE POR LAS MAÑANAS");


    }


    //Necesitamos crear una función que reciba dos números en
    //formato texto y retorne el cociente de dividir el primero
    //por el segundo.


    public static Integer numtexto(String num1text, String num2text) {
        Integer num1 = Integer.parseInt(num1text);
        Integer num2 = Integer.parseInt(num2text);

        return num1 / num2;

    }

    //  Escribi una funcion que reciba una cadena de texto y cuente la cantidad de "sss" .retorna la
    //    cantidad encontrada.


    public static int cantidad_s(String cantidads) {

        int contador = 0;

        for (int i = 0; i < cantidads.length(); i++) {

            if (cantidads.toLowerCase().charAt(i) == 's') {

                contador = contador + 1;
            }


        }
        System.out.println("    cantidad de sss   " + contador);
        return contador;


    }


    public static Boolean ingresa(LocalDate fechanacimiento, Boolean entrada) {

        int edad = LocalDate.now().getYear() - fechanacimiento.getYear();
        if (entrada && edad >= 18) {

            return true;
        } else {

            return false;

        }

    }
     /*Resolver los ejercicios 1 y 2 implementando dos funciones que
utilicen la clase Scanner.*/

    public static void ordernarpeliculas() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pelis ordenadas");
        String pelisrecibidas = scanner.nextLine();
        String[] Arrayseparadas = pelisrecibidas.split(",");
        Arrays.sort(Arrayseparadas);
        for (int i = 0; i < Arrayseparadas.length; i++) {

            System.out.println(Arrayseparadas[i].toUpperCase());


        }
    }
    /*5.necesitamos un programa que reciba dos cadenas de texto y  que  cada una contenga dos películas separadas
    por una coma.

    El método debe retornar la que tenga mayor cantidad de caracteres.
    Debe generar un array de cuatro elementos.
    Debe guardar las cuatro películas en el array e imprimirlas por consola.


    1-  ingreso de datos
2- compararr las dos cadenas (ompareTo)  tienen que retornar la mayor
3- crear un array y guardar los cuatro elementos en el mismo usando split
4- imprimir el array
length()

    */
    public static String compararcadena() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dos peliculas");
        String pelicula1 = scanner.nextLine();
        String pelicula2 = scanner.nextLine();


        String[] pelicularecibidas = new String[4];
        String[] peliculasrecibidas = pelicula1.split(",");


        if (pelicula1.compareTo(pelicula2) == -1) {
            return pelicula2;
        }
        else if (pelicula1.compareTo(pelicula2) == 0){
                return "son iguales";

            }
                else{

                return pelicula1;

            }
        }


    }