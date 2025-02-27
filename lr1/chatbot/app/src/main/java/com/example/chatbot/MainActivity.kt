package com.example.mychatbot

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.Scanner

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val thread = Thread {
            chatBot()
        }
        thread.start()
    }

    private fun chatBot() {
        val scanner = Scanner(System.`in`)

        println("Hello! My name is DICT_Bot.")
        print("Please, remind me your name. > ")
        val name = scanner.nextLine()
        println("What a great name you have, $name!")

        println("Let me guess your age.")
        println("Enter remainders of dividing your age by 3, 5 and 7.")
        print("> ")
        val remainder3 = scanner.nextInt()
        print("> ")
        val remainder5 = scanner.nextInt()
        print("> ")
        val remainder7 = scanner.nextInt()

        val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
        println("Your age is $age!")

        print("Now I will prove to you that I can count to any number you want. > ")
        val maxNumber = scanner.nextInt()
        for (i in 0..maxNumber) {
            println("$i!")
        }

        println("Let's test your programming knowledge.")
        val question = "Why do we use methods?"
        val options = arrayOf(
            "1. To repeat a statement multiple times.",
            "2. To decompose a program into several small subroutines.",
            "3. To determine the execution time of a program.",
            "4. To interrupt the execution of a program."
        )

        while (true) {
            println(question)
            options.forEach { println(it) }
            print("> ")
            val answer = scanner.nextInt()

            if (answer == 2) {
                break
            } else {
                println("Please, try again.")
            }
        }

        println("Congratulations, have a nice day!")
    }
}
