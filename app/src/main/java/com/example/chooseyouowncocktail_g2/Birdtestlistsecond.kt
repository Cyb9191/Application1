package com.example.chooseyouowncocktail_g2

import co.develhope.chooseyouowncocktail_g2.model.Birdtest
import java.util.*


object Birdtestlistsecond {

    private var birdTestSecond = listOf(
        Birdtest(
            "AAAAAAAAAAAAaahhhhhhhhhhhhhhhhhhhhhhh",
            "Jungles and steppa",
            "Russia,France and Portugal",
            R.drawable.ara,
            false

            ),
        Birdtest(
            "Duck hawk",
            "Open spaces but can reach 3600 meters in height",
            "All over the world",
            img = R.drawable.ara2,
            true


            ),
        Birdtest(
            "Australian pelican",
            "Humid area like large likes, rivers and swamp",
            "Central africa",
            img=R.drawable.eagle,
            false

        ),
        Birdtest(
            "Australian pelican",
            "Humid area like large likes, rivers and swamp",
            "Central africa",
            img=R.drawable.bluebird,
            false

        )
    )


    fun birdList(): List<Birdtest> {
        return(birdTestSecond)
    }





}