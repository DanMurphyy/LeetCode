package dan.muprhy.leetcode.solutions

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val resultMap: HashMap<Int, Int> = hashMapOf()

        for (i in nums.indices) {
            val res = target - nums[i]
            if (resultMap.containsKey(res)) {
                return intArrayOf(resultMap[res]!!, i)
            }
            resultMap[nums[i]] = i
        }
        return intArrayOf()
    }
}