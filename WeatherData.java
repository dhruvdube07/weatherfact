package com.weatherfact;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherData {
    private String location;
    private double temperature;
    private double feelsLike;
    private int humidity;
    private double windSpeed;
    private int aqi;
    private String status;
}
