public class SentenciaFor {


    public void sentenciaFor(){

        //sirve para indicar un rango de elementos, repite todo el cuerpo del bloque
        //para un rango que empieza en 0; termina en 5; con un incremento de 1 repite estas lineas

        // se estructura así : punto inicial;final;incrementa
        for (int i = 0; i <5; i++) {
            System.out.println("Iteración número: " + i);
        }
        System.out.println("Fin del bucle.");



        }

    public void tablaMultiplicarNumero(int numero){

        System.out.println("Procedemos a escribir la tabla de multiplicar del "+numero);
        //[0.10]
        for (int i = 0; i <11 ; i++) {

            System.out.printf("%d * %d = %d%n",i,numero,i*numero);

        }

    }

    public void todasLasTablas(){

        for (int i = 0; i < 10; i++) {

            System.out.println("Sanando la tabla del "+i);
            // empieza en 1 acaba en 10
            for (int j = 0; j < 11; j++) {
                // asi repite los numero hasta el ultimo en este caso 10

                System.out.printf("\t%d * %d = %d%n",j,i,i*j);

            }

        }
    }

    public void dibujarCuadrado() {
        for (int i = 0; i < 5; i++) { // Bucle de FILAS (i)
            for (int j = 0; j < 5; j++) { // Bucle de COLUMNAS (j)

                // Usamos OR (||) para dibujar el asterisco si estamos en CUALQUIERA de los 4 bordes
                if (i == 0 || i == 4 || j == 0 || j == 4) {
                    System.out.print("*"); // No salta de línea para seguir en la misma fila
                } else {
                    System.out.print(" "); // Si no es borde, dibuja un espacio en blanco
                }
            }
            // Salto de línea: ESTO es crucial. Debe ocurrir DESPUÉS de completar TODAS las columnas (j) de la fila actual (i).
            System.out.println();
        }
    }


    pub


    }







