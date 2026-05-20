class Solution {

    fun encode(strs: List<String>): String {
        val result = StringBuilder()
        for(i in strs){
            result.append(i.length).append("#").append(i)
        }
        return result.toString()
    }

    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()
        var i =0
        while(i<str.length-1){
            val hash = str.indexOf("#",i)
            val length = str.substring(i, hash).toInt()
           i = hash + 1 + length
            result.add(str.substring(hash+1,i))
        }
        return result
    }
}
