package com.example.tyrekescottbirthdaycardapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.bdaycard_gen)

        button.setOnClickListener {
            callActivity()
            //callActivity1()
        }


        /*val datePicker = findViewById<DatePicker>(R.id.date_Picker)
        val today = Calendar.getInstance()
        datePicker.init(today.get(Calendar.YEAR), today.get(Calendar.MONTH),
            today.get(Calendar.DAY_OF_MONTH)

        ) { view, year, month, day ->
            val monthCal = month + 1
            val msg = "$day/$monthCal/$year"
            Toast.makeText(this@MainActivity, msg, Toast.LENGTH_SHORT).show()
        }*/





        /*val day = datePicker.dayOfMonth
        val month = datePicker.month + 1
        val year = datePicker.year*/

        val bdayInfo = arrayOf<String>('1'.toString(), '2'.toString(), '3'.toString())

        /*val bdayCard : Button = findViewById(R.id.bdaycard_gen)
        bdayCard.setOnClickListener {

            val intent = Intent(this@MainActivity,DisplayBirthdayCard::class.java)
            intent.putExtra("bdayInfo", bdayInfo)
            startActivity(intent)


            setContentView(R.layout.activity_display_birthday_card)
        }*/

        //var name = findViewById<EditText>(R.id.name)



    }

    /*private fun callActivity1() {
        val datePicker = findViewById<DatePicker>(R.id.date_Picker)
        val month = Calendar.getInstance()
        datePicker.init(month.get(Calendar.MONTH))

        val intent = Intent(this,DisplayBirthdayCard::class.java).also{
            it.putExtra("Month_message", month)
            startActivity(it)
        }


    }*/

    private fun callActivity() {
        val editText = findViewById<EditText>(R.id.bdayName)
        val name = editText.text.toString()

        val editMonth = findViewById<EditText>(R.id.getMonth)
        val month = editMonth.text.toString()

        val editDay = findViewById<EditText>(R.id.getDay)
        val day = editDay.text.toString()

        val editYear = findViewById<EditText>(R.id.getYear)
        val year = editYear.text.toString()

        val intent = Intent(this,DisplayBirthdayCard::class.java).also{
            it.putExtra("Name_message", name)
            it.putExtra("Month_message", month)
            it.putExtra("Day_message", day)
            it.putExtra("Year_message", year)
            startActivity(it)

        }

    }
}