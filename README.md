# WeatherFact: Satellite Intelligence Terminal

A specialized weather monitoring system developed as a **Java Programming Group Project**. This application synchronizes real-time atmospheric data with a high-end "Glassmorphism" interface.

## 🛠 Tech Stack
* **Backend:** Java 17, Spring Boot 3.2.2
* **Build Tool:** Gradle
* **Frontend:** HTML5, CSS3 (Ultra-Glass), JavaScript (ES6+)
* **APIs:** Open-Meteo (Thermal), OpenStreetMap (Geospatial)

## 📡 Core Modules
1. **SATELLITE_UPLINK**: Interactive map tracking and coordinate stamping.
2. **THERMAL_PROTOCOL_V4**: Advanced biometrics including Hydration Logic and Sweat Point analysis.
3. **LOCAL_INTEL**: Proximity scanning for ecological zones (Vasai-Virar Wetlands).

## 🚀 Deployment Instructions
1. Clone the repository:
   `git clone https://github.com/dhruvdube07/weatherfact.git`
2. Ensure Java 17 is installed.
3. Run the application via Gradle:
   `./gradlew bootRun`
4. Access the terminal at: `http://localhost:8080`

## 📊 Project Logic
The system uses a Java-based REST Controller (`WeatherController.java`) to serve processed data objects to the frontend, ensuring a decoupled and scalable architecture.
