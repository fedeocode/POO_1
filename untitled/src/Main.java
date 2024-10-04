//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empleado jose = new Empleado("jose", 31726563, 2233);
        EmpleadoLimpiezaGeneral mateo=new EmpleadoLimpiezaGeneral("mateo",43009876,3455);
        EmpleadoLimpieza miriam=new EmpleadoLimpieza("Miriam",34500321,3245);
        EmpleadoLavadorLavajilla martin=new EmpleadoLavadorLavajilla("martin",23094987,3495);
        mateo.realizarHorasExtras(4);
        mateo.calcularSueldoMes();
        EmpleadoLavadorLavajilla pablo=new EmpleadoLavadorLavajilla("Pablo",32456789,1254);
        pablo.calcularSueldoMes();
        pablo.descontarSueldo();
        pablo.romper(40,30.0);
        miriam.calcularSueldoMes();
        




    }
}