package com.example.chooseyouowncocktail_g2

import co.develhope.chooseyouowncocktail_g2.model.Birdtest
import java.util.*


object Birdtestlist {

    private var birdTestFirst = listOf(
        Birdtest(
            "Violet-and-yellow macaw",
            "Jungles and steppa",
            "Russia,France and Portugal",
            R.drawable.macawtestadapter,
            false

        ),
        Birdtest(
            "Duck hawk",
            "Open spaces but can reach 3600 meters in height",
            "All over the world",
            img = R.drawable.falcontestadapter,
            true


        ),
        Birdtest(
            "Australian pelican",
            "Humid area like large likes, rivers and swamp",
            "Central africa",
            img=R.drawable.pelicantestadapter,
        false

        ),
        Birdtest(
                "Phoenix owl",
        "Humid area like large likes, rivers and swamp",
        "Central africa",
        img=R.drawable.littleowltestadapter,
        false

    )
    )


    fun birdList(): List<Birdtest> {
        return(birdTestFirst)
    }





}