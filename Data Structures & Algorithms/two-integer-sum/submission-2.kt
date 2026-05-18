class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var m = mutableMapOf<Int,Int>()
        for(i in nums.indices){
            val com = target - nums[i]
            if(m.containsKey(com)){
                return intArrayOf(m[com]!!,i)
            }
            else{
                m.put(nums[i],i)
            }
        }
       
        return intArrayOf()
    }
}
