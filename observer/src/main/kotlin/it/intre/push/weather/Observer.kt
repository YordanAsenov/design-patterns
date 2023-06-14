package it.intre.push.weather

interface Observer {
    fun update(temperature: Float, humidity: Float, pressure: Float)
}
