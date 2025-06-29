package leetcode.`912`.`Sort-an-Array`

import utils.IExecutor
import java.io.File

object Executor000912 : IExecutor {
    override fun run() {
        val inputFile = File("../../solutions/leetcode/912.Sort-an-Array/input")
        inputFile.readLines().forEach { line ->
            println(line)
        }
    }
}