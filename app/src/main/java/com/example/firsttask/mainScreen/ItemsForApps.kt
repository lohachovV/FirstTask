package com.example.firsttask.mainScreen

import com.example.firsttask.mainScreen.ObjectsForDickList.Dick

    fun fillTheListOfDick() : ArrayList<Dick> {

        var listOfDicks : MutableList<Dick> = ArrayList()
        for (i in 1..100){
            listOfDicks.add(Dick("Dick$i", "Pusy$i"))
        }
        return listOfDicks as ArrayList<Dick>
    }