

public class Operadores {

    public void operadoresAritmeticos() {

        //unarios
        int operandoUno = 5;
        // le suma uno al valor que ya tenía
        operandoUno++;
        operandoUno++;
        operandoUno++;
        operandoUno++;
        System.out.println("El valor de operando uno después de los incrementos es " + operandoUno);

        //decremento
        operandoUno--;
        operandoUno--;
        operandoUno--;
        System.out.println("El valor de operando uno después de los decrementos es " + operandoUno);
        // binarios -> suma (+), resta (-) , multiplicacion (*) , division (/)

        // reasigno nuevos valores
        operandoUno = 8;
        int operandoDos = 3;
        int suma = operandoUno + operandoDos;

        // haciendo asi no concatena y no sale 58 , sino la suma real , hay que ponerlo entre parentésis.
        System.out.println("El resultado de la suma es " + (operandoUno + operandoDos));
        int resta = operandoUno - operandoDos;
        System.out.println("El resultado de la resta es " + (operandoUno - operandoDos));
        /* como para dividir no saldría un número entero para pasar el int de manera momentanea a double tenemos que
        ponerlo como un entero delante de uno de los operandos */

        double division = (double) operandoUno / operandoDos;
        System.out.println("El resultado de la división es " + division);

        // Para calcular el resto de una division (modulo) se usa %
        //El modulo me vale para saber si un numero es par o impar.
        int modulo = operandoUno % operandoDos;
        System.out.println("El modulo de la división es " + modulo);

    }

    public void operadoresAsignacion() {

        int operadorUno = 10;
        int operadorDos = 6;
        operadorUno += 5; //operador uno guarda la suma de lo que valia operadorUno + lo que le digas
        operadorUno += 15;
        operadorUno += operadorDos;
        operadorUno -= operadorDos;
        operadorUno *= operadorDos;
        operadorUno %= 2;
        System.out.println("El valor de operadorUno es " + operadorUno);
    }

    public void operadoresComparacion() {
        int operandoUno = 10;
        int operandoDos = 20;
        boolean resultado = operandoUno > operandoDos;
        System.out.println("El resultado de la comparación es " + resultado);
        resultado = operandoUno < operandoDos;
        System.out.println("El resultado de la comparación es " + resultado);


    }

    public void operadoresLogicos() {

        int sueldo = 20000;
        int edad = 35;
        boolean conducir = true;
        // cuando quiere cobrar menos de 30000, tiene menos de 40 años y puede conducir
        boolean candidatoValido = sueldo < 30000 && edad < 40 && conducir;
        candidatoValido = sueldo < 20000 || edad < 25 || conducir;
        System.out.println("El candidato es valido: " + candidatoValido);


    }

    public void evaluarCandidato() {
        boolean resultado = sueldo < 20000 && edad < 40 && conducir;
        System.out.println("La evaluación del candidato es: " + resultado);
    }

    public void cambioTipos() {
        double numeroDecimal = 5.98;
        System.out.println((int) +numeroDecimal);

        int numeroEvaluar = 12345;
        String numeroEvaluarStr = String.valueOf(numeroEvaluar);

        

    }







}


