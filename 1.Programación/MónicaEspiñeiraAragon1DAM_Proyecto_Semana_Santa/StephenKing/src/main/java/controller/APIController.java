package controller;
import com.google.gson.Gson;
import model.Libro;
import org.json.JSONArray;
import org.json.JSONObject;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class APIController {
    private Gson gson = new Gson();
    private HttpClient client = HttpClient.newHttpClient();

    public List<Libro> obtenerTodosLosLibros() {
        List<Libro> lista = new ArrayList<>();
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://stephen-king-api.onrender.com/api/books"))
                    .GET().build();
            String body = client.send(request, HttpResponse.BodyHandlers.ofString()).body();

            JSONObject root = new JSONObject(body);
            JSONArray data = root.getJSONArray("data");

            for (int i = 0; i < data.length(); i++) {
                lista.add(gson.fromJson(data.getJSONObject(i).toString(), Libro.class));
            }
        } catch (Exception e) {
            System.out.println("Error API: " + e.getMessage());
        }
        return lista;
    }

    public Libro obtenerLibroPorId(int id) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://stephen-king-api.onrender.com/api/book/" + id))
                    .GET().build();
            String body = client.send(request, HttpResponse.BodyHandlers.ofString()).body();

            JSONObject root = new JSONObject(body);
            return gson.fromJson(root.getJSONObject("data").toString(), Libro.class);
        } catch (Exception e) {
            return null;
        }
    }
}