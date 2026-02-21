package com.weatherfact.engine;

public class Main {
    public static void main(String[] args) {
        System.out.println("WeatherFact Terminal v4.0.0 [BOOTING]");
        
        GeospatialCalculator geo = new GeospatialCalculator();
        ThermalProtocolAnalyzer thermal = new ThermalProtocolAnalyzer();
        SectorIntelligenceOrchestrator sector = new SectorIntelligenceOrchestrator();

        // Simulate a real-world scan for Nala Sopara
        double currentLat = 19.4167;
        double currentLon = 72.8167;
        double targetLat = 19.3512;
        double targetLon = 72.8015;

        double dist = geo.calculateHaversine(currentLat, currentLon, targetLat, targetLon);
        ThermalProtocolAnalyzer.StressLevel level = thermal.evaluateThermalStress(27.0, 60.0);

        System.out.println("--- SYSTEM REPORT ---");
        System.out.println("Current Sector: Nala Sopara");
        System.out.printf("Distance to Core Restoration Zone: %.2f KM\n", dist);
        System.out.println("Thermal Protocol Status: " + level);
        
        sector.runDiagnostic();
    }
}
