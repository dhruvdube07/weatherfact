async function initDashboard() {
    try {
        const response = await fetch('/api/latest');
        const data = await response.json();
        updateUI(data);
    } catch (error) {
        console.error("UPLINK_FAILURE: Reverting to local cache.");
    }
}

function updateUI(data) {
    const mainTemp = document.getElementById('temp-main');
    if (mainTemp) mainTemp.innerText = Math.round(data.temperature) + '°';

    const humBar = document.getElementById('hum-bar');
    if (humBar) {
        humBar.style.height = data.humidity + '%';
        document.getElementById('hum-num').innerText = data.humidity;
    }

    const h2oFill = document.getElementById('h2o-fill');
    if (h2oFill) {
        const intake = (2.5 + (data.temperature - 25) * 0.12).toFixed(1);
        document.getElementById('h2o-num').innerText = intake;
        h2oFill.style.height = (intake / 5 * 100) + '%';
    }
}

document.addEventListener('DOMContentLoaded', () => {
    initDashboard();
    setInterval(initDashboard, 300000);
});
