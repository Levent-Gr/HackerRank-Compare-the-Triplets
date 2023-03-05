fun main(args: Array<String>) {

    val a = arrayOf(5 ,6, 7)
    val b = arrayOf(3 ,6 ,10)

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}


fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {

    /*
    var alice = 0
    var bob = 0

    for (i in 0..2){
        if(a[i]>b[i]){
            alice++
        }else if(a[i]<b[i]){
            bob++
        }
    }
    */


    val alice = (0..2).count { a[it] > b[it] }
    val bob = (0..2).count { a[it] < b[it] }

    return arrayOf(alice, bob)
}