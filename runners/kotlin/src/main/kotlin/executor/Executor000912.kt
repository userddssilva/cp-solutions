package executor

import leetcode.`912`.`Sort-an-Array`.Solution
import utils.IExecutor
import java.io.File

object Executor000912 : IExecutor {
    override fun run() {
        val inputFile = File("../../solutions/leetcode/912.Sort-an-Array/input")
        inputFile.readLines().forEach { line ->
            val numbers = line.trim('[', ']').split(',').mapNotNull { it.toIntOrNull() }.toIntArray()
            println("Input: $line")
            Solution().sortArray(numbers)
        }
    }
}