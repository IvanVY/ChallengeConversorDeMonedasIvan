import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMonedas {
    public Monedas consultarMonedas(String monedaActual, String monedaConvertir){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/1a5e16cb06b45bbffd2d116d/pair/" + monedaActual + "/" + monedaConvertir);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        }catch (Exception e){
            throw new RuntimeException("No se encontro la moneda deseada " + e.getMessage());
        }
    }
}
