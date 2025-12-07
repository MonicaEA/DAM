public class EjercicioLibre1 {
/*Ejercicio: Sistema de soporte técnico (muy similar al de pedidos)
Objetivo:
Simular un sistema de tickets de soporte con diferentes prioridades.
Requisitos:
Crea un enum PrioridadTicket con: BAJA, MEDIA, ALTA, CRITICA.
Crea un método obtenerPrioridadAleatoria() que devuelva aleatoriamente una de esas prioridades.
Crea un método mostrarInfoPrioridad(PrioridadTicket prioridad) que use un switch para:
Mostrar un mensaje explicando la prioridad.
Indicar el tiempo máximo recomendado de respuesta:
BAJA: 48 horas
MEDIA: 24 horas
ALTA: 4 horas
CRITICA: 1 hora    */

  public enum PrioridadTicket{
    BAJA,MEDIA,ALTA,CRITICA
  }

  public PrioridadTicket obtenerPrioridadAleatoria(){
      PrioridadTicket[] prioridadArray = PrioridadTicket.values();
      int prioridadAleatoria = (int)(Math.random()*prioridadArray.length);
      return prioridadArray[prioridadAleatoria];

  }

  public void mostrarInfoPrioridad(PrioridadTicket prioridad){

      switch (prioridad){
          case CRITICA -> System.out.println(prioridad+" .Tiempo máximo respuesta : 1 hora.");
          case ALTA -> System.out.println(prioridad+ " .Tiempo máximo respuesta : 4 horas.");
          case MEDIA -> System.out.println(prioridad+ " .Tiempo máximo respuesta : 24 horas.");
          case BAJA -> System.out.println(prioridad+ " .Tiempo máximo respuesta : 48 horas.");

      }



  }
}
