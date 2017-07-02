package com.rainist.ioextended


fun solve(combinedList: List<Long>): List<Long> {

    fun loop(acc: List<Long>, inputs: List<Long>): List<Long> {
        return if (inputs.isEmpty()) acc
        else inputs.first().let { loop(acc.plus(it), inputs.minus(it).minus(it * 4 / 3)) }
    }

    return loop(emptyList(), combinedList)
}
