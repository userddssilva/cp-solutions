import leetcode.`2`.`Add-Two-Numbers`.ListNode

class Solution2 {
    private var carry = 0

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        // Handles edge cases: empty lists, different lengths, and final carry
        var l1 = l1
        var l2 = l2
        val dummy = ListNode(0)
        var current = dummy

        while (l1 != null || l2 != null || carry != 0) {
            val n1 = l1?.`val` ?: 0
            val n2 = l2?.`val` ?: 0
            val sum = n1 + n2 + carry
            carry = sum / 10
            current.next = ListNode(sum % 10)
            current = current.next!!

            l1 = l1?.next
            l2 = l2?.next
        }

        return dummy.next
    }
}
