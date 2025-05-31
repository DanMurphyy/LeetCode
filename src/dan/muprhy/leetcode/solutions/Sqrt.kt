package dan.muprhy.leetcode.solutions

import kotlin.math.floor

class Sqrt() {
    fun mySqrt(x: Int): Int {
        var l = 0
        var r = x
        var prvs = 0

        while (l <= r) {
            var mid = (l + r) / 2
            val square = mid.toLong() * mid

            if (square == x.toLong() || mid == prvs) {
                if (x == 1) {
                    return x
                }
                val rounded = floor((l + r).toDouble() / 2).toInt()
                return rounded
            } else if (square < x) {
                prvs = mid
                l = mid + 1

            } else {
                prvs = mid
                r = mid - 1

            }

        }

        val rounded = floor((l + r).toDouble() / 2).toInt()

        return rounded
    }
}