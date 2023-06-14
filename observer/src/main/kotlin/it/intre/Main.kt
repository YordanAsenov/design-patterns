package it.intre
fun main() {
    println("Pull weather station: ")
    val pullWeatherData = it.intre.pull.weather.WeatherData()
    it.intre.pull.weather.TemperatureDisplay(pullWeatherData)
    pullWeatherData.updateMeasurements(80.0f, 65.0f, 30.4f)
    pullWeatherData.updateMeasurements(2.0f, 6.0f, 3.0f)

    println("Push weather station: ")
    val pushWeatherData = it.intre.push.weather.WeatherData()
    it.intre.push.weather.TemperatureDisplay(pushWeatherData)
    pushWeatherData.updateMeasurements(80.0f, 65.0f, 30.4f)
    pushWeatherData.updateMeasurements(2.0f, 6.0f, 3.0f)
}
