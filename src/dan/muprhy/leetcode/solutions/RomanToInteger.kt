package dan.muprhy.leetcode.solutions

class RomanToInteger {
    fun romanToInt(s: String): Int {

        val romToInt = mutableMapOf(
            'I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000
        )

        var result = 0
        var prvs = 0

        s.forEach {
            val cur = romToInt[it] ?: 0
            if (cur > prvs) result -= prvs * 2

            result += cur

            prvs = cur
        }

        return result
    }
}