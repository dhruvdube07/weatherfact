# WeatherFact: Satellite Intelligence Terminal

A specialized weather monitoring system developed as a **Java Programming Group Project**. This application synchronizes real-time atmospheric data with a high-end "Glassmorphism" interface.

## 📡 Live Access
* **Official Website:** [weatherfact.ws](https://weatherfact.ws)
* **Lead Developer:** Solely published and maintained by **Dhruv Dubey**.
* **Host:** Exclusively available on GitHub and the dedicated web domain.

## 🛠 Tech Stack
* **Backend:** Java 17, Spring Boot 3.2.2 (Data Handling)
* **Frontend:** HTML5, CSS3 (Ultra-Glass UI), JavaScript (API Sync)
* **Data Sources:** Open-Meteo & OpenStreetMap

---

## 📘 Beginner's Guide: How it was Created
This project was built using a **Modular Architecture** to separate the "Brain" (Java) from the "Beauty" (CSS/HTML). 

1. **Environment Setup**: We used `build.gradle` to pull in the Spring Boot framework, which allows Java to act as a web server.
2. **The Data Model**: We created `WeatherData.java` to define exactly what information our system cares about (Temp, AQI, Humidity).
3. **The Logic Bridge**: The `WeatherController.java` was written to send this data from the computer's memory to the web browser.
4. **The Interface**: Three distinct HTML/CSS modules were merged to create a "Command Center" feel, using `app.js` to refresh the data every few minutes.

---

## 🧩 Component Breakdown (What does what?)
* **Satellite Uplink (Module 1)**: Uses Leaflet/MapLibre to render a satellite view of the user's current coordinates.
* **Thermal Protocol (Module 2)**: Processes raw temperature into "Health Data" like hydration requirements.
* **Local Intel (Module 3)**: A proximity scanner that highlights local ecological points of interest (e.g., Vasai-Virar Wetlands).
* **The "Glass" UI**: A custom CSS system using `backdrop-filter` to create the transparent, frosted-glass effect.

---

## ❓ Frequently Asked Questions (FAQ)

**Q: Why use Java for a weather website?**
**A:** Java provides a robust, type-safe backend. In a professional environment, Java would handle the heavy lifting—like database logging, user authentication, and complex thermal calculations—while the website just displays the results.

**Q: How does the "Hydration Logic" work?**
**A:** It’s a mathematical formula in the code that increases the recommended water intake (Liters) as the temperature rises above 25°C.

**Q: Is the map data live?**
**A:** Yes. It uses real-time GPS coordinates to center the satellite view and fetch the specific Air Quality Index (AQI) for that exact location.

**Q: Can this be run offline?**
**A:** The UI will load, but the "Uplink" requires an active internet connection to fetch live data from the weather satellites.

---

## 🚀 Deployment
1. Clone: `git clone https://github.com/dhruvdube07/weatherfact.git`
2. Run: `./gradlew bootRun`
3. View: `http://localhost:8080`
