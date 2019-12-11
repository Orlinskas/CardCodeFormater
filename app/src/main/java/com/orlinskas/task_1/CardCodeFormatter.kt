package com.orlinskas.task_1

import java.lang.StringBuilder

class CardCodeFormatter {

    fun format(inputText: String): String {
        val outputBuilder = StringBuilder()
        val inputArray = inputText.replace(" ", "").toCharArray()

        for((index, ch) in inputArray.withIndex()) {
            if(index % 4 == 0) {
                outputBuilder.append(" ")
            }
            outputBuilder.append(ch)
        }

        return outputBuilder.toString().trim()
    }
}