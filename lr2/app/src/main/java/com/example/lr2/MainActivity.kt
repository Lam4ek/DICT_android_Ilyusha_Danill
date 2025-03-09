package com.example.lr2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    fun checkEvenOdd(number: Int): String {
        return if (number % 2 == 0) "Even" else "Odd"
    }

    fun multiply(number: Int): Int {
        return if (number % 2 == 0) number * 4 else number * 5
    }

    fun makeNegative(number: Int): Int {
        return if (number > 0) -number else number
    }

    fun calculateAge(year: Int): Int {
        val currentYear = 2025
        return currentYear - year
    }

    fun findMinNumber(numbers: IntArray): Int {
        return numbers.minOrNull() ?: throw IllegalArgumentException("Array is empty")
    }

    fun findTwoLargestNumbers(numbers: List<Int>): List<Int> {
        val sortedNumbers = numbers.sortedDescending()
        return sortedNumbers.take(2)
    }

    fun countPositivesAndSumNegatives(numbers: IntArray?): IntArray {
        if (numbers.isNullOrEmpty()) return intArrayOf()

        val positiveCount = numbers.count { it > 0 }
        val negativeSum = numbers.filter { it < 0 }.sum()

        return intArrayOf(positiveCount, negativeSum)
    }

    fun countVowels(input: String): Int {
        val vowels = setOf('a', 'e', 'i', 'o', 'u', 'y')
        return input.count { it.toLowerCase() in vowels }
    }

    fun getMiddleCharacter(str: String): String {
        val length = str.length
        return if (length % 2 == 0) {
            str.substring(length / 2 - 1, length / 2 + 1)
        } else {
            str[length / 2].toString()
        }
    }

    fun generateMultiplicationTable(n: Int): List<List<Int>> {
        val table = mutableListOf<List<Int>>()
        for (i in 1..n) {
            val row = mutableListOf<Int>()
            for (j in 1..n) {
                row.add(i * j)
            }
            table.add(row)
        }
        return table
    }
}
