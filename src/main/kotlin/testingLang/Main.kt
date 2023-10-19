package testingLang

import java.util.Scanner
import kotlin.math.max

fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")
    val int: Int; // неизмен
    int =3;
    //int  = 2; - сработает уже
    var int2: Int; // измен
    int2 = 5;
    int2 = 10;
    if(int2 > int){
        println("int2 > int")
    }
    else println("int2 < int")
    val max = if(int2 > int) int else int2

    when(int){
        10,4,5 -> print(10)
        3 -> print(3)
        //in (10 <= <= 30) -> print("in")
        else -> println("no")
    }
    while (int2 >0){
        int2--
        println(int2)
    }
    var string:String = """feauebfb
        |feas
        |fes
        |fef
        |efe
        |faes
    """
    for (char in string){
        println(char)

    }
    val array:Array<String> = arrayOf("dwad","dwadff","daw")
    val intArray:IntArray = IntArray(5,{3})
    array[1] = "hello"
    println(array)
    //newfun()
    newfun3()
    var i:String? = "dsad"
    i = null
    for (m in string){
        i = m?.toString()
        readLine()
    }
}
fun newfun() { // String это вывод
    var str = readLine()
    var c = str?.split(" ")?.map { it.toInt() }
    var k = c?.get(0)
    var x = c?.get(1)
    var y = c?.get(2)
    if (x != null && y != null && k!= null) {
        var counter = 0
        while ((maxOf(x, y) <= k) || (maxOf(x, y) - minOf(x, y)) <= 2) {
            if (x > y) x++ else y++
            counter++
        }
        println(if (counter == 0) 0 else counter-1)
    }
}

fun newfun2() {
    val (a,b,m,n) = readln().split(" ").map { it.toFloat() }
        if ((a >= m && b >= n) || (a >= n && b >= m)) println("YES") else println("NO")
}
fun newfun3() {
    val mapwithatgc = mutableMapOf("A" to 0, "T" to 0, "G" to 0, "C" to 0)
    val input = readln()

    input.forEach {
        val char = it.toString()
        if (mapwithatgc.containsKey(char)) {
            mapwithatgc[char] = mapwithatgc[char]!! + 1
        }
    }

    print(mapwithatgc["A"])
    print(" ")
    print(mapwithatgc["T"])
    print(" ")
    print(mapwithatgc["G"])
    print(" ")
    print(mapwithatgc["C"])

}



