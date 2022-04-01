package com.example.tyrekescottbirthdaycardapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*

class DisplayBirthdayCard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_birthday_card)

        val bdayInfo = intent.getStringExtra("Name_message")

        val textView =findViewById<TextView>(R.id.bdayName).apply {
            text = bdayInfo
        }

        val bdayMonth = intent.getStringExtra("Month_message")

        val currbdayMth = bdayMonth!!.toInt()

        //var stone = " "

        /*if (bdayMonth == "01"){
            val textView =findViewById<TextView>(R.id.birthStone).apply {
                text = "Garnet"
            }
        }*/

        val stoneImg: ImageView = findViewById(R.id.StoneImg)

        val drawableResource1 = when (currbdayMth) {
            1 -> R.drawable.jan_birth_stone
            2 -> R.drawable.feb_birth_stone
            3 -> R.drawable.mar_birth_stone
            4 -> R.drawable.apr_birth_stone
            5 -> R.drawable.may_birth_stone
            6 -> R.drawable.june_birth_stone
            7 -> R.drawable.jul_birth_stone
            8 -> R.drawable.aug_birth_stone
            9 -> R.drawable.sep_birth_stone
            10 -> R.drawable.oct_birth_stone
            11 -> R.drawable.nov_birth_stone
            else -> R.drawable.dec_birth_stone
        }
        stoneImg.setImageResource(drawableResource1)

        val bdayYear = intent.getStringExtra("Year_message")
        val currentYear = 2022
        val curYear = bdayYear!!.toInt()
        val age = currentYear - curYear

        val textView1 =findViewById<TextView>(R.id.bdayAge).apply {
            text = age.toString()
        }

        val bdayDay = intent.getStringExtra("Day_message")

        val currbdayDay = bdayDay!!.toInt()



        if(curYear == 2022){
            val zodiac = "Tiger"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2010){
            val zodiac = "Tiger"
            val textView1 =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 1998){
            val zodiac = "Tiger"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 1986){
            val zodiac = "Tiger"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2023){
            val zodiac = "Rabbit"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2011){
            val zodiac = "Rabbit"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 1999){
            val zodiac = "Rabbit"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 1987){
            val zodiac = "Rabbit"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2024){
            val zodiac = "Dragon"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }


        if(curYear == 2012){
            val zodiac = "Dragon"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2000){
            val zodiac = "Dragon"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 1988){
            val zodiac = "Dragon"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2025){
            val zodiac = "Snake"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2013){
            val zodiac = "Snake"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2001){
            val zodiac = "Snake"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 1986){
            val zodiac = "Snake"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2026){
            val zodiac = "Horse"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2014){
            val zodiac = "Horse"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2002){
            val zodiac = "Horse"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 1990){
            val zodiac = "Horse"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2027){
            val zodiac = "Goat"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2015){
            val zodiac = "Goat"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2003){
            val zodiac = "Goat"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 1991){
            val zodiac = "Goat"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2028){
            val zodiac = "Monkey"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2016){
            val zodiac = "Monkey"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2004){
            val zodiac = "Monkey"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 1992){
            val zodiac = "Monkey"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2017){
            val zodiac = "Rooster"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2005){
            val zodiac = "Rooster"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 1993){
            val zodiac = "Rooster"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 1981){
            val zodiac = "Rooster"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2018){
            val zodiac = "Dog"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2006){
            val zodiac = "Dog"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 1994){
            val zodiac = "Dog"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 1982){
            val zodiac = "Dog"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2019){
            val zodiac = "Pig"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2007){
            val zodiac = "Pig"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 1995){
            val zodiac = "Pig"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 1983){
            val zodiac = "Pig"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2020){
            val zodiac = "Rat"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2008){
            val zodiac = "Rat"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 1996){
            val zodiac = "Rat"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 1984){
            val zodiac = "Rat"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2021){
            val zodiac = "Ox"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2021){
            val zodiac = "Ox"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 2009){
            val zodiac = "Ox"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 1997){
            val zodiac = "Ox"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

        if(curYear == 1985){
            val zodiac = "Ox"
            val textView =findViewById<TextView>(R.id.zodiactxt).apply {
                text = zodiac
            }
        }

    }
}


