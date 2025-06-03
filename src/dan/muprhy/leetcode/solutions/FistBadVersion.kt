package dan.muprhy.leetcode.solutions

class FistBadVersion {
    fun firstBadVersion(n: Int): Int {
        var l = 1
        var r = n

        while (l <= r) {
            val mid = l + (r - l) / 2
            val isBad = isBadVersion(mid)
            if (!isBad) {
                l = mid + 1
            } else {
                r = mid - 1
            }
        }

        return l
    }

    private fun isBadVersion(mid: Int): Boolean {
        return mid >= 2
    }
}