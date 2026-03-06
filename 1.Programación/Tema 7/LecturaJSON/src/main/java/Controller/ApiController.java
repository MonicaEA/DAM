package Controller;

import Model.Equipo;
import Model.Liga;
import com.google.gson.Gson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiController {

    public void getAllLigas() throws IOException, InterruptedException {
        String url  = "https://www.thesportsdb.com/api/v1/json/123/all_leagues.php";

        // 1 .- abro cliente
        HttpClient client = null;
    try {

        Gson gson = new Gson();
        client = HttpClient.newHttpClient();

        // 2 . crea la peticion

        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        // 3.- Espera la respuesta

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String stringLigas = response.body();
        JSONObject jsonLigas = new JSONObject(stringLigas);
        System.out.println(jsonLigas);

        System.out.println(jsonLigas);

        JSONArray arrayLigas = jsonLigas.getJSONArray("leagues");

        for (int i = 0; i < arrayLigas.length(); i++) {
            JSONObject ligaJSON = arrayLigas.getJSONObject(i);
            Liga liga = gson.fromJson(ligaJSON.toString(), Liga.class);
            String idLiga = ligaJSON.getString("idLeague");
            String nombreLiga = ligaJSON.getString("strLeague");
            System.out.printf("%s - %s%n", liga.getIdLeague(),liga.getStrLeague());

        }




    } catch (IOException e){
        System.out.println("Error en la peticion HTTP");
    }finally {
        try{
            client.close();
        }catch (NullPointerException e){
            System.out.println("Error en el cerrado");
        }
    }
    }

    public void getAllClasificacion(int id) {
        String url = "https://www.thesportsdb.com/api/v1/json/123/lookuptable.php?l="+id;
        HttpClient client;

        try {
            Gson gson = new Gson();
            client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            JSONObject clasificacionJSON = new JSONObject(body);
            JSONArray clasificacionArray = clasificacionJSON.getJSONArray("table");
            for (int i = 0; i < clasificacionArray.length(); i++) {
                JSONObject equipoJSON = clasificacionArray.getJSONObject(i);
                Equipo equipo = gson.fromJson(equipoJSON.toString(), Equipo.class);
                System.out.printf("%s\t%s\t%s\t%s\t%s\t%s%n",
                        equipo.getIntRank(),
                        equipo.getStrTeam(),
                        equipo.getIntPoints(),
                        equipo.getIntWin(),
                        equipo.getIntLoss(),
                        equipo.getIntDraw());
            }
        } catch (Exception e) {
            System.out.println("Error en el proccesamiento de la peticion");
        }

    }

}
