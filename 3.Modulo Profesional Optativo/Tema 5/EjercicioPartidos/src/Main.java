import model.Equipo;
import model.Partido;

public class Main {

   Equipo equipo1 = new Equipo("Equipo 1");
   Equipo equipo2 = new Equipo("Equipo 2");
   Equipo equipo3 = new Equipo("Equipo 3");
   Equipo equipo4 = new Equipo("Equipo 4");


   Partido partido1 = new Partido(equipo1,0,3,equipo2);
   Partido partido2 = new Partido(equipo1,0,2,equipo3);
   Partido partido3 = new Partido(equipo4,equipo3);

}
