package testingLang
fun countVowels(y : String): Int{
    var counter = 0
    for(i in y)
        if(i in listOf('a', 'e','i','o','u'))
            counter++
    return counter
}

fun main() {
    countVowels("1313edawda")
}
