/**
 * Created by alatel01 on 09/01/2018.
 */

fun main(args:Array<String>){
    //mutable structure use listOf for immutable structure
    val lst = mutableListOf(1,2,3, 6, "sss")
    lst.add(123)
    lst.swap(0,4)
    print(lst)
    //println(lst.javaClass)
}

fun <T> MutableList<T>.swap(index1:Int, index2:Int){
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}