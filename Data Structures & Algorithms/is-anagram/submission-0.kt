class Solution {
    fun isAnagram(s: String, t: String): Boolean {
          if (s.length != t.length) return false
         val countMap = mutableMapOf<Char, Int>()
        for(i in s){
            countMap[i] = countMap.getOrDefault(i,0)+1
        }
        for(i in t){
            countMap[i] = countMap.getOrDefault(i,0)-1
            if(countMap[i] ==0){
                countMap.remove(i)
            }
        }
        return countMap.isEmpty()
    }
}
