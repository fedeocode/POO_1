//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("  Esta es la clase 7" );

        //Escribir una función para calcular la cantidad de faltas disponibles de acuerdo a un porcentaje de asistencia y cantidad de encuentros determinado
        //¿Cuál es el resultado para una cursada de 23 encuentros que requiere un 75% de asistencia? ¿Y para el caso de este módulo?

      calcularfaltas(48,80);





    }
     public static Integer calcularfaltas(Integer encuentros,Integer porcentaje){

        Integer cantidadfaltas=encuentros-encuentros*porcentaje/100;

         System.out.println("  cantidad de faltas  "  +   cantidadfaltas);



return cantidadfaltas;





     }

}