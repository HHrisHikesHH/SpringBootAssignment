import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String url = "https://api.weatherbit.io/v2.0/history/subhourly?lat=35.775&lon=-78.638&start_date=2023-01-27&end_date=2023-01-28&tz=local&key=15859062a72c4dfcb8954ef27647e30a";
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

        HttpClient client = HttpClient.newBuilder().build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

//        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
