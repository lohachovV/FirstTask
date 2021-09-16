package com.example.firsttask.mainScreen

import com.example.firsttask.mainScreen.objectsForDickList.Dick

    fun fillTheListOfDick() : List<Dick> {
        val listOfDicks : MutableList<Dick> = ArrayList()
        for (i in 1..100){
            listOfDicks.add(Dick("Dick$i", "Pusy$i"))
        }
        return listOfDicks
    }