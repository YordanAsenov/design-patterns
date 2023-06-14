package it.intre.pull.weather

import it.intre.Display

class TemperatureDisplay(
    private val weatherData: WeatherData
): Observer, Display {
    private var temperature: Float = 0.0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        temperature = weatherData.getTemperature()
        display()
    }

    override fun display() {
        println("Pull TemperatureDisplay: $temperature")
    }

}
