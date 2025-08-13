package leetcode.`912`.`Sort-an-Array`.sortalgorithm

object QuickSort {

    /**
     * Quick sort algorithm
     * @param nums array list of int
     * @param low the initial value for array's begin
     * @param high the array's end, the initial value is the array's size
     */
    fun sort(nums: IntArray, low: Int, high: Int): IntArray {
        if (low < high) {
            val pivotIndex = partition(nums, low, high)
            sort(nums, low, pivotIndex - 1) // sort to the left
            sort(nums, pivotIndex + 1, high) // sort to the right
        }
        return nums
    }

    /**
     * Partition function for quick sort algorithm
     */
    private fun partition(nums: IntArray, low: Int, high: Int): Int {
        val pivot = nums[high]
        var i = low - 1
        for (j in low until high) {
            if (nums[j] <= pivot) {
                i = i + 1
                swap(nums, i, j)
            }
        }
        swap(nums, i+1, high)
        return i + 1
    }

    private fun swap(array: IntArray, i: Int, j: Int) {
        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }

    fun sort2(array: IntArray, low: Int, high: Int): IntArray {
        if (low < high) {
            val pivotIndex = partition2(array, low, high)
            sort2(array, low, pivotIndex - 1)
            sort(array, pivotIndex + 1, high)
        }
        return array
    }

    private fun partition2(array: IntArray, low: Int, high: Int): Int {
        val pivot = array[high]
        var i = low - 1
        for (j in low until high) {
            if (array[j] <= pivot) {
                i = i + 1
                swap2(array, i, j)
            }
        }
        swap2(array, i + 1, high)
        return i + 1
    }

    private fun swap2(array: IntArray, i: Int, j: Int) {
        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }
}