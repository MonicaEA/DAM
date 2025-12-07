public class SentenciaIf {

    public void examenAprobado (int nota) {

        System.out.println("Procedemos a evaluar si un examen esta OK: ");
        System.out.println("La nota que vamos a evaluar es: " + nota);
        if (nota > 0 && nota <= 10) {
            if (nota >= 5) {
                System.out.println("El examen esta aprobado");

            } else {
                System.out.println("El examen esta suspenso");

            }
            System.out.println("Terminando la evaluación del examen");
            System.out.println("Programa finalizado");
        }
    }
    public void notaExamen (int nota){
        //suspenso -> 0-4.99
        //aprobado -> 5-7.99
        //notable -> 8-8.99
        //sobresaliente ->9-9.99
        //MH ->10

    String resultadoExamen;
    if (nota>0 && nota<=10) {
        if (nota < 5) {
            resultadoExamen = "Suspenso";
            //no hace falta poner el 5 debajo porque ya se sabe que se cumple esa condicion
        } else if (nota < 8) {
            resultadoExamen = "Aprobado";
        } else if (nota < 9) {
            resultadoExamen = "Notable";
        } else if (nota < 10) {
            resultadoExamen = "Sobresaliente";
        } else {
            resultadoExamen = "Matrícula de honor";

        }
            }else {
        System.out.println("La nota no esta en la escala correcta");
    }

    }


}
