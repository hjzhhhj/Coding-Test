class Solution {
    fun solution(n: Int, t: Int): Int {
        var result = n
        for (i in 0 until t) {
            result *= 2
        }
        return result
    }
}
