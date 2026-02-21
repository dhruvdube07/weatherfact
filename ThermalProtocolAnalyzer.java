package com.weatherfact.engine;

public class ThermalProtocolAnalyzer {
    
    public enum StressLevel { OPTIMAL, ELEVATED, CRITICAL, EMERGENCY }

    public StressLevel evaluateThermalStress(double temp, double humidity) {
        if (temp > 35 && humidity > 80) return StressLevel.EMERGENCY;
        if (temp > 32 || humidity > 75) return StressLevel.CRITICAL;
        if (temp > 28) return StressLevel.ELEVATED;
        return StressLevel.OPTIMAL;
    }

    public double calculateCoolingRequirement(double temp, double albedo) {
        // Logic based on NASA-ECOSTRESS parameters
        double baseLine = 25.0;
        if (temp <= baseLine) return 0.0;
        
        double thermalDelta = temp - baseLine;
        double efficiencyFactor = albedo < 0.3 ? 1.5 : 1.0;
        
        return thermalDelta * efficiencyFactor * 4.2; // kW per household calculation
    }
}
