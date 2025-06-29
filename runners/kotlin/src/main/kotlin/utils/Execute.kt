package utils

import executor.Executor000704
import executor.Executor000912

object Execute {
    fun run(problem: Problem) {
        when (problem) {
            Problem.P000001 -> {}
            Problem.P000002 -> {}
            Problem.P000003 -> {}
            Problem.P000035 -> {}
            Problem.P000704 -> call(Executor000704)
            Problem.P000912 -> call(Executor000912)
        }
    }

    private fun call(executor: IExecutor) {
        executor.run()
    }
}