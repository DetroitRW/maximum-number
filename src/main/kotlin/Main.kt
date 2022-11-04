import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Введите число: ")
    var a = reader.nextInt()

    print("Введите число: ")
    var b = reader.nextInt()

    print("Введите число: ")
    var c = reader.nextInt()

    val result = if (a > b) {
        if (a > c) {
            a
        } else {
            c
        }
    } else {
        if (b > c) {
        b
        } else {
        c
        }

    }
    print(result)
}