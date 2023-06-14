package it.intre.pull.weather

interface Subject {
    fun registerObserver(o: Observer)
    fun removeObserver(o: Observer)
    fun notifyObservers()
}
