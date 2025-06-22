package utils

import leetcode.`704`.`Binary-Search`.Executor000704

object Execute {
    fun run(problem: Problem) {
        when (problem) {
            Problem.P000001 -> {}
            Problem.P000002 -> {}
            Problem.P000003 -> {}
            Problem.P000035 -> {}
            Problem.P000704 -> call(Executor000704)
        }
    }

    private fun call(executor: IExecutor) {
        executor.run()
    }
}