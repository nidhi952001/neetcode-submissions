class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        val freqMap = hashMapOf<Int, Int>()

        // Count frequency
        for (num in nums) {
            freqMap[num] = freqMap.getOrDefault(num, 0) + 1
        }

        // Bucket array
        val buckets = Array(nums.size + 1) { mutableListOf<Int>() }

        // Put numbers into buckets
        for ((num, freq) in freqMap) {
            buckets[freq].add(num)
        }

        val result = IntArray(k)
        var index = 0

        // Traverse from highest frequency
        for (i in buckets.size - 1 downTo 0) {

            if (buckets[i].isNotEmpty()) {

                for (num in buckets[i]) {

                    result[index] = num
                    index++

                    if (index == k) {
                        return result
                    }
                }
            }
        }

        return result
    }
}