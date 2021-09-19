package com.example.firsttask.mainScreen.objectsForDickList

object ItemsForApp {
    fun getListOfDick(): List<Dick> {
        val listOfDicks: MutableList<Dick> = ArrayList()
        for (i in 1..100) {
            listOfDicks.add(Dick("Dick$i", "Pusy$i"))
        }
        return listOfDicks
    }

}