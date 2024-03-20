package design.patterns.design.patterns.calculadora

class Calculadora {
    fun sumar(val1:Int, val2:Int): Int {
        return val1 + val2
    }

    fun restar(val1:Int, val2:Int): Int{
        return val1 - val2
    }

    fun mult(val1:Int, val2:Int): Int{
        return val1 * val2
    }

    fun dividir(val1:Int, val2:Int): Int{
        return val1 / val2
    }
}