package it.intre.push.weather

import it.intre.Display

class TemperatureDisplay(
    private val weatherData: WeatherData
): Observer, Display {
    private var temperature: Float = 0.0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        display()
    }

    override fun display() {
        println("Push TemperatureDisplay: $temperature")
    }

}
