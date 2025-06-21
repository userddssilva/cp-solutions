import leetcode.`2`.`Add-Two-Numbers`.ListNode

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    private var carry = 0
    private var TEN = 10
    private var ZERO = 0

    fun sumDigits(d1: Int?, d2: Int?): Int{
        var sum = d1!! + d2!! + carry
        var digit = sum % TEN
        carry = sum / TEN
        return digit
    }

    fun getDigitFromSum(n1: Int?, n2: Int?): Int {
        var digit = 0
        if (n1 != null && n2 != null){
            digit = sumDigits(n1, n2)
        } else if (n1 != null && n2 == null){
            digit = sumDigits(n1, ZERO)
        } else if (n1 == null && n2 != null) {
            digit = sumDigits(ZERO, n2)
        }
        return digit
    }

    fun runLinkedLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var l1 = l1
        var l2 = l2

        var currentListNode: ListNode? = ListNode(-1)
        var headListNode: ListNode? = currentListNode

        while(l1 != null || l2 != null) {
            var n1 = l1?.`val`
            var n2 = l2?.`val`
            println("N1: $n1, N2: $n2")
            var digit = getDigitFromSum(n1, n2)
            currentListNode?.next = ListNode(digit)
            currentListNode = currentListNode?.next
            l1 = l1?.next
            l2 = l2?.next
        }
        if (carry != ZERO)
            currentListNode?.next = ListNode(carry)
        return headListNode?.next
    }

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        return runLinkedLists(l1, l2)
    }
}
