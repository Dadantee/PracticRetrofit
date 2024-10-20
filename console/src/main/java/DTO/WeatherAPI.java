package DTO;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;
import DTO.CurrentResponse;

public interface WeatherAPI {

    @GET("/v1/current.json")
    Call<CurrentResponse> current(@Query("key") String key,@Query("q") String query);


}
