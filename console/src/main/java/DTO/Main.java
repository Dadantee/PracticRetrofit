package DTO;

import retrofit2.Response;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import DTO.Weather;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Program Start");
        System.out.println("GET:/posts--------------------");

       Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter city id: ");
            String cityId = scanner.nextLine();

            Response<CurrentResponse> response = Weather.instance().current(Weather.apiKey, cityId).execute();
            if (response.isSuccessful()) {
                Current currentResponse = response.body().getCurrent();
                System.out.print("Temp = " + currentResponse.getTempC());
            } else
            {
                System.out.println("Error: " );
            }
        }
        }


    }

