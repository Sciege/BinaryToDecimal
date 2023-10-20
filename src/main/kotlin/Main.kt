fun main(args: Array<String>) {
    val number = readln().toLong()
    val decimal = binaryToDecimal(number)
    println("The binary is: '$number' and its decimal is $decimal")
}

fun binaryToDecimal(num: Long): Int {
    var num = num
    var remainder: Long
    var decimalNumber = 0
    var iteration = 0
        while (num.toInt()!=0) {
        remainder = num % 10
            num /= 10
            decimalNumber += (remainder * Math.pow(2.0,iteration.toDouble())).toInt()
            ++iteration
    }
    return decimalNumber
}