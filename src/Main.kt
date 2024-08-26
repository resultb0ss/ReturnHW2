fun main() {
    val array = intArrayOf(1,123,0,32,-1,-234,-43,23,54,-56,-5)
    println(checkNum(array).toList())


}

fun checkNum(array: IntArray): IntArray{
    for (i in array.indices){
        if (array[i] <= 0){
            array[i] = array[i] + 1
        }
    }
    return array
}