import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Crea una función que de acuerdo a la edad del
        //usuario( recibe fecha de nacimiento) y si tiene entrada indique
        //si puede o no asistir al evento, debe ser mayor.
        LocalDate fechadenacimiento=LocalDate.of(2024,7,6);

        System.out.println(ingresa(fechadenacimiento,true));

        cantidad_s("eL SOL SALE POR LAS MAÑANAS");


    }


    //  Escribi una funcion que reciba una cadena de texto y cuente la cantidad de "sss" .retorna la
    //    cantidad encontrada.





    public static int cantidad_s(String cantidads ) {

        int contador=0;

        for(int i=0; i<cantidads.length(); i++){

            if (cantidads.toLowerCase().charAt(i) =='s'){

               contador=contador+1;
                }



        }
        System.out.println("    cantidad de sss   "   +contador);
    return contador;


    }






    public static Boolean ingresa(LocalDate fechanacimiento, Boolean entrada){








         int edad=LocalDate.now().getYear()-fechanacimiento.getYear();
           if (entrada && edad>=18){

               return true;



           }
         else{

             return false;



           }




    }





}