package DTO;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

public class Weather {


    private static Weather instance;
    protected static final String apiKey = "e5c4330a5c1149569ed114816242010";
    protected static final String city = "Moscow";
    public static final String BASE_URL = "https://api.weatherapi.com";
    private static WeatherAPI api;

    private static WeatherAPI init(){
        Gson gson = new GsonBuilder().setLenient().create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        WeatherAPI api = retrofit.create(WeatherAPI.class);
        return api;
    }


    public static WeatherAPI instance(){
        if(api == null){
            api = init();
        }
        return api;
    }



}
