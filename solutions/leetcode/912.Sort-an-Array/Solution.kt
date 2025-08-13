                            package leetcode.`912`.`Sort-an-Array`

import leetcode.`912`.`Sort-an-Array`.sortalgorithm.QuickSort

class Solution {

    fun sortArray(nums: IntArray): IntArray {
        val sortedArray = QuickSort.sort(nums, 0, nums.size-1)
        printArray(sortedArray)
        return sortedArray
    }

    private fun printArray(array: IntArray) {
        print("Sorted array: [")
        array.indices.forEach {
            if (it != array.lastIndex) print("${array[it]},") else print("${array[it]}")
        }
        println("]")
    }
}