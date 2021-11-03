package com.example.firsttask.mainScreen.objectsForDickList

object ItemsForApp {

    //    fun getListOfDick(): List<Dick> {
//        val listOfDicks: MutableList<Dick> = ArrayList()
//        for (i in 1..100) {
//            listOfDicks.add(Dick("Dick$i", "Pusy$i"))
//        }
//        return listOfDicks
//    }
    private val listOfDicks: MutableList<Dick> = ArrayList()
    private val dickObservers: MutableList<DicksObserver> = ArrayList()

    init {
        for (i in 1..100) {
            listOfDicks.add(Dick("Dick$i", "Pusy$i"))
        }
    }

    fun addDickObserver(observer: DicksObserver) {
        dickObservers.add(observer)
    }

    fun removeDickObserver(observer: DicksObserver) {
        dickObservers.remove(observer)
    }

    fun notifyObservers() {
        for (observer in dickObservers){
            observer.onDicksLoaded(listOfDicks)
        }
    }

}

interface DicksObserver {
    fun onDicksLoaded(items: List<Dick>)
}