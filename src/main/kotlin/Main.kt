fun main(args: Array<String>) {


    println("Qual tipo de conta matemática você deseja realizar?\n" +
            "Soma -> digite 1\n" +
            "Subtração -> digite 2\n" +
            "Multiplicação -> digite 3\n" +
            "Divisão -> digite 4\n")
    var x = readLine()!!.toInt()


    if (x==1) {

        print("Informe valor 1 ")
        var soma1 = readLine()!!.toInt()
        println("Informe valor 2 ")
        var soma2 = readLine()!!.toInt()
        soma(soma1,soma2)
    }else if (x==2) {

        print("Informe valor 1 ")
        var subtr1 = readLine()!!.toInt()
            println("Informe valor 2 ")
        var subtr2 = readLine()!!.toInt()
    subtr(subtr1,subtr2)

    }else if (x==3) {
        print("Informe valor 1 ")
        var mult1 = readLine()!!.toInt()
        print("Informe valor 2 ")
        var mult2 = readLine()!!.toInt()
        mult(mult1,mult2)
    }else if(x==4){
        print("Informe valor 1 ")
        var div1 = readLine()!!.toInt()
        print("Informe valor 2 ")
        var div2 = readLine()!!.toInt()
        div(div1,div2)

    }else{

        println("INFORME UM VALOR DE 0 a 4")
    }

}


fun soma(num1: Int, num2: Int){
    val result = num1 + num2
    println("$num1 + $num2 = $result")
}

fun subtr(num1: Int, num2: Int){
    val result = num1 - num2
    println("$num1 - $num2 = $result")
}

fun mult(num1: Int, num2: Int){
    val result = num1 * num2
    println("$num1 x $num2 = $result")
}
fun div(num1: Int, num2: Int){
    val result = num1 / num2
    println("$num1 / $num2 = $result")
}
