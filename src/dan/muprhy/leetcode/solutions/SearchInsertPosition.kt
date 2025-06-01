package dan.muprhy.leetcode.solutions

class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.size - 1
        var i = (r + l) / 2

        while (l <= r) {
            if (nums[i] == target) return i
            if (nums[i] > target) {
                r = i - 1
                i = (r + l) / 2
            } else {
                l = i + 1
                i = (r + l) / 2
            }
        }
        return r + 1
    }
}