package it.intre.push.weather

class WeatherData: Subject {
    private val observers = mutableListOf<Observer>()
    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f
    private var pressure: Float = 0.0f
    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        observers.forEach { it.update(temperature, humidity, pressure) }
    }

    fun updateMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        notifyObservers()
    }
}
