//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empleado jose = new Empleado("jose", 31726563, 2233);
        EmpleadoLimpiezaGeneral mateo=new EmpleadoLimpiezaGeneral("mateo",43009876,3455);

        EmpleadoLavadorLavajilla martin=new EmpleadoLavadorLavajilla("martin",23094987,3495);
        mateo.realizarHorasExtras(4);
        mateo.calcularSueldoMes();
        EmpleadoLavadorLavajilla pablo=new EmpleadoLavadorLavajilla("Pablo",32456789,1254);
        pablo.romper(40,30.0);
        pablo.calcularSueldoMes();

        //miriam pasa de sector
        EmpleadoLimpieza miriam=new EmpleadoLimpieza("Miriam",34500321,3245);
        miriam=new EmpleadoLimpiezaGeneral("miriam",29,49);
        ((EmpleadoLimpiezaGeneral)miriam).realizarHorasExtras(10);
        System.out.println("Miriam sueldo del mes");
        miriam.calcularSueldoMes();
        //Ahora esta en lavajillas
        miriam=new EmpleadoLavadorLavajilla("miriam",29,49);
        System.out.println("miriam sueldo mes en otro sector");
        ((EmpleadoLavadorLavajilla)miriam).romper(29,20.00);
        miriam.calcularSueldoMes();
        System.out.println("ubicacion de Objeto"+ miriam.hashCode());
        System.out.println("Registros iguales"+ miriam.equals(miriam));
        System.out.println("Sus datos"+ miriam.toString());






    }
}