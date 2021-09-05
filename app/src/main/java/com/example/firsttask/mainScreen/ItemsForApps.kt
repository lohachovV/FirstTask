package com.example.firsttask.mainScreen


class ItemsForApps {

    fun getListOfItems (): ArrayList<String> {
        /**    Is that construction correct?   */
        return listOf(Items.valueOf(String()).name) as ArrayList<String>
    }
}