package dan.muprhy.leetcode.solutions

class ValidParentheses {
    fun isValid(s: String): Boolean {

        val symbols = ArrayDeque<Char>()

        for (symbol in s) {
            when (symbol) {
                '(', '{', '[' -> {
                    symbols.addFirst(symbol)
                }

                ')' -> if (symbols.removeFirstOrNull() != '(') return false
                '}' -> if (symbols.removeFirstOrNull() != '{') return false
                ']' -> if (symbols.removeFirstOrNull() != '[') return false
            }
        }
        return symbols.isEmpty()
    }
}