package it.intre.push.weather

interface Subject {
    fun registerObserver(o: Observer)
    fun removeObserver(o: Observer)
    fun notifyObservers()
}
