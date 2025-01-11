package dan.muprhy.leetcode.solutions

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {

        val let = strs[0]

        let.forEachIndexed { i, l ->
            if (strs.any { it.length <= i || it[i] != l }) return let.substring(0, i)
        }
        return let

    }
}