package com.example.rockscissorspaper

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val choices = arrayOf("Камінь", "Ножиці", "Папір")

        val btnRock = findViewById<Button>(R.id.btnRock)
        val btnScissors = findViewById<Button>(R.id.btnScissors)
        val btnPaper = findViewById<Button>(R.id.btnPaper)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        val buttons = mapOf(
            btnRock to "Камінь",
            btnScissors to "Ножиці",
            btnPaper to "Папір"
        )

        buttons.forEach { (button, userChoice) ->
            button.setOnClickListener {
                val computerChoice = choices[Random.nextInt(choices.size)]
                val result = determineWinner(userChoice, computerChoice)
                tvResult.text = "Ваш вибір: $userChoice\nКомп'ютер: $computerChoice\nРезультат: $result"
            }
        }
    }

    private fun determineWinner(userChoice: String, computerChoice: String): String {
        return when {
            userChoice == computerChoice -> "Нічия!"
            (userChoice == "Камінь" && computerChoice == "Ножиці") ||
                    (userChoice == "Ножиці" && computerChoice == "Папір") ||
                    (userChoice == "Папір" && computerChoice == "Камінь") -> "Ви виграли!"
            else -> "Комп'ютер виграв!"
        }
    }
}
