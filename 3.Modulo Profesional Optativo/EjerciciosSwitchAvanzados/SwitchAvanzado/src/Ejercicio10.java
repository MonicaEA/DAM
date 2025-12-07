import java.util.Random;

public class Ejercicio10 {
    /***Objetivo:** Simular un sistema de seguimiento de pedidos con diferentes estados.
     **Requisitos:**

     1. Crea un enum `EstadoPedido` con: `PENDIENTE`, `PROCESANDO`, `ENVIADO`, `EN_TRANSITO`, `ENTREGADO`, `CANCELADO`.
     2. Crea un método `obtenerEstadoActual()` que devuelva aleatoriamente uno de estos estados.
     3. En el `main`, usa un `switch` para mostrar un mensaje detallado del estado.
     4. Indica el siguiente paso esperado para cada estado (excepto ENTREGADO y CANCELADO).*/


    public enum EstadoPedido {
        PENDIENTE, PROCESANDO, ENVIADO, EN_TRANSITO, ENTREGADO, CANCELADO

    }

    public EstadoPedido obtenerEstadoActual() {

        EstadoPedido[] estadoActual = EstadoPedido.values();
        int valorAleatorio = (int)(Math.random()*estadoActual.length);
        return estadoActual[valorAleatorio];
    }

    public void mostrarEstado(EstadoPedido estado){

        switch (estado){
            case PENDIENTE -> {
                System.out.println(estado);
            System.out.println("Pedido recibido correctamente.");
            System.out.println("Siguiente paso : Pendiente de procesar");
            }
            case PROCESANDO -> {
                System.out.println(estado);
            System.out.println("Gestionando pedido.");
            System.out.println("Siguiente paso : ENVIADO");
            }
            case ENVIADO -> {
                System.out.println(estado);
            System.out.println("Paquete enviado.");
            System.out.println("Siguiente paso : En transito");
            }
            case EN_TRANSITO -> {
                System.out.println(estado);
            System.out.println("Paquete en transito.");
            System.out.println("Siguiente paso : RECIBIDO");
            }
            case ENTREGADO -> {
                System.out.println(estado);
            }
            case CANCELADO -> {
                System.out.println(estado);
            }




        }




    }
}




