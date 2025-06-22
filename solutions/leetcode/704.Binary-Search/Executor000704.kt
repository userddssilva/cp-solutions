package leetcode.`704`.`Binary-Search`

import utils.IExecutor
import java.io.File

object Executor000704 : IExecutor {
    override fun run() {
        val inputFile = File("../../solutions/leetcode/704.Binary-Search/input")
        inputFile.readLines().forEach { line ->
            val inputArgs = line.split(" ")
            val numbers = inputArgs[0].trim('[', ']').split(',').mapNotNull { it.toIntOrNull() }.toIntArray()
            val target = inputArgs[1].toInt()

            println("Numbers: $numbers, ${numbers::class}")
            println("Target: $target, ${target::class}")

            val answer = Solution().search(numbers, target)
            println("Answer: $answer")
        }
    }
}