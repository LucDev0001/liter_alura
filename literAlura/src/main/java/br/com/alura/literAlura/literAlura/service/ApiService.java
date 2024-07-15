
package br.com.alura.literAlura.literAlura.service;

import br.com.alura.literAlura.literAlura.model.Livro;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Service;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

@Service
public class ApiService {

    public List<Livro> fetchLivros(String nome) throws Exception {
        String API_URL = "https://gutendex.com/books/?search=" + nome.replace(" ", "%20");
        URL url = new URL(API_URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        InputStreamReader reader = new InputStreamReader(connection.getInputStream());

        JsonObject jsonObject = new Gson().fromJson(reader, JsonObject.class);
        List<Livro> livros = new Gson().fromJson(jsonObject.getAsJsonArray("results"), new TypeToken<List<Livro>>(){}.getType());
        reader.close();

        return livros;
    }
}
