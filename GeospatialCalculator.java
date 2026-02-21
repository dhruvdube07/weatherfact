package com.weatherfact.engine;

import java.lang.Math;

public class GeospatialCalculator {
    private static final double EARTH_RADIUS_KM = 6371.0;

    public double calculateHaversine(double lat1, double lon1, double lat2, double lon2) {
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                   Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                   Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return EARTH_RADIUS_KM * c;
    }

    public String determineBearing(double lat1, double lon1, double lat2, double lon2) {
        double longitude1 = Math.toRadians(lon1);
        double longitude2 = Math.toRadians(lon2);
        double latitude1 = Math.toRadians(lat1);
        double latitude2 = Math.toRadians(lat2);

        double longDiff = longitude2 - longitude1;
        double y = Math.sin(longDiff) * Math.cos(latitude2);
        double x = Math.cos(latitude1) * Math.sin(latitude2) - Math.sin(latitude1) * Math.cos(latitude2) * Math.cos(longDiff);

        double resultDegree = (Math.toDegrees(Math.atan2(y, x)) + 360) % 360;
        return String.format("%.2f°", resultDegree);
    }
}
