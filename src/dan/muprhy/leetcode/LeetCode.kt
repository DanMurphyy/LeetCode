package dan.muprhy.leetcode

import dan.muprhy.leetcode.solutions.TwoSum

fun main() {
    val solution = TwoSum()
    val result = solution.twoSum(intArrayOf(2, 7, 11, 15), 26)
    println("Indices: ${result.joinToString(", ")}")
}