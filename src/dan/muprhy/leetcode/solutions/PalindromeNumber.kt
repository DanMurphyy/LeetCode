package dan.muprhy.leetcode.solutions

class PalindromeNumber {

    fun isPalindrome(x: Int): Boolean {

        if (x < 0 || (x % 10 == 0 && x != 0)) return false

        var num = x
        var rev = 0

        while (rev < num) {

            rev = rev * 10 + num % 10

            num /= 10
        }

        return num == rev || num == rev / 10
    }

}