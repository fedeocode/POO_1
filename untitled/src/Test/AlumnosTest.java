package Test;

import Entidad.Alumnos;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlumnosTest {


    static AlumnosTest alumnosTest = new alumnos(3, "fede", "ovejero");
    static Boolean nombreHabilitado = true;

    @BeforeAll
    static void inicio() {
        System.out.println("conectado base de datos");


    }


    @BeforeEach
    void setUp() {

        alumnos.setEdad(0);
    }

    @AfterEach
    void tearDown() {
        System.out.println("termino la prueba");


    }


    void Habiliatdo() {
        assertrue(nombreHabilitado);

    }

    private void assertrue(Boolean nombreHabilitado) {
    }


    @Test
     void getEdad() {
        assertEquals(alumnos.getmayorEdad, -1);


    }


    void pruebaEdad(Integer edad){
       alumnos.setEdad(edad);
       assertEquals(edad,alumnos.getEdad();

    }
@Tags("Prueba de Humo"){
}
ParameterizedTest
 @ValueSource(ints={1,19,-1})
  void setEdad(Integer edad)throws EdadInvalidaExeption
      alumnos.setEdad(edad);
aseertEquals(alumnos.getEdad()edad);


}

