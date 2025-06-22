package leetcode.`704`.`Binary-Search`

class Solution {
    fun binarySearch(nums: IntArray, target: Int, start: Int, end: Int): Int {
        if (start > end)
            return -1
        val middle = start + (end - start) / 2
        return if (target == nums[middle])
            middle
        else if (target < nums[middle])
            binarySearch(nums, target, start, middle - 1)
        else
            binarySearch(nums, target,middle + 1, end)
    }

    fun search(nums: IntArray, target: Int): Int {
        return binarySearch(nums, target, 0,  nums.size-1)
    }
}