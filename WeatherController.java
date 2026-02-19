package com.weatherfact;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class WeatherController {

    @GetMapping("/status")
    public Map<String, Object> getSystemStatus() {
        Map<String, Object> status = new HashMap<>();
        status.add("uplink", "ACTIVE");
        status.add("protocol", "THERMAL_V4");
        status.add("code", 200);
        return status;
    }

    @GetMapping("/latest")
    public WeatherData getLatestData() {
        return new WeatherData(
            "NALA SOPARA",
            27.0,
            27.0,
            60,
            12.5,
            42,
            "OPTIMAL"
        );
    }
}
