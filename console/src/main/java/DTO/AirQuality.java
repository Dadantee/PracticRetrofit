package DTO;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AirQuality {
    private double co;
    private double no2;
    private double o3;
    private int so2;
    @SerializedName("pm2_5")
    private double pm25;
    private int pm10;
    @SerializedName("us-epa-index")
    private int usEpaIndex;
    @SerializedName("gb-defra-index")
    private int gbDefraIndex;
}
