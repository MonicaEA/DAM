import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest1 {

    private final Calculadora ope = new Calculadora(); // Instancia de la clase Operaciones

    @Test
    public void testSumar() {
        // Prueba con números positivos
        int resultado = ope.Sumar(5, 3);
        assertEquals(8, resultado, "La suma de 5 + 3 debe ser 8");

        // Prueba con números negativos
        resultado = ope.Sumar(-5, -3);
        assertEquals(-8, resultado, "La suma de -5 + -3 debe ser -8");

        // Prueba con un positivo y un negativo
        resultado = ope.Sumar(5, -3);
        assertEquals(2, resultado, "La suma de 5 + -3 debe ser 2");

       resultado = ope.Sumar(2,4);
       assertEquals(6,resultado,"La suma de 2 + 4 debe ser 6 ");

    }

    @Test
    public void testRestar() {
        // Prueba con números positivos
        int resultado = ope.Restar(5, 3);
        assertEquals(2, resultado, "La resta de 5 - 3 debe ser 2");

        // Prueba con números negativos
        resultado = ope.Restar(-5, -3);
        assertEquals(-2, resultado, "La resta de -5 - -3 debe ser -2");

        // Prueba con un positivo y un negativo
        resultado = ope.Restar(5, -3);
        assertEquals(8, resultado, "La resta de 5 - -3 debe ser 8");
    }
}