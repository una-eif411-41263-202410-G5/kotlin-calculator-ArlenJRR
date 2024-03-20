package design.patterns.calculadora

import com.github.stefanbirkner.systemlambda.SystemLambda
import design.patterns.design.patterns.calculadora.Calculadora
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

class CalculadoraTest {
    private val standardOut = System.out
    private val outputStreamCaptor = ByteArrayOutputStream()

    @BeforeEach
    fun setUp() {
        System.setOut(PrintStream(outputStreamCaptor))
    }

    @AfterEach
    fun tearDown() {
        System.setOut(standardOut)
    }

    @Test
    fun `test different functions of the calculator`(){
        val output = SystemLambda.tapSystemOut {
            var calc = Calculadora()
            println(calc.sumar(1,3))
            println(calc.restar(5,4))
            println(calc.mult(3,5))
            println(calc.dividir(77,11))
        }

        assertEquals("4\r\n" + "1\r\n" + "15\r\n" + "7\r\n", output)
    }
}