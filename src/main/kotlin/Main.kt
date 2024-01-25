/*
Ejercicio 4.1¶

Crear una clase Rectángulo, con atributos base y altura. La clase debe disponer del constructor y los métodos para calcular el area y el perimetro.

Los atributos no se podrán modificar, aunque si consultar. Por último, tendrán que ser mayor que 0.

Opcionalmente se puede crear el método toString() para mostrar información sobre el rectángulo: override fun toString() = "". (Pulsa Ctrl+o)

En el programa principal, crear varios rectángulos. Mostarlos y mostrar por pantalla sus áreas y perímetros.*/


class Rectangle(private val base: Double, private val height: Double) {

    init {
        require(this.base > 0 && this.height > 0) { "La base y la altura deben ser mayores que 0." }
    }

    var aoe = 0.0
    private fun aoe(): Double {
        this.aoe = this.base * this.height
        return aoe
    }

    var perimeter = 0.0
    private fun perimeter(): Double {
        this.perimeter = 2 * (this.base + this.height)
        return perimeter
    }


    override fun toString() = "The rectangle class consists of two methods: aoe() and perimeter(). The first one works like -> base * height (my area is: ${this.aoe()}) / The second one -> 2(b + h) (my perimeter is: ${this.perimeter()})."
}

fun main() {

    val rectangle1 = Rectangle(10.0, 15.0)
    val rectangle2 = Rectangle(10.0, 95.0)
    val rectangle3 = Rectangle(20.0, 235.0)
    val rectangle4 = Rectangle(50.0, 35.0)
    val rectangle5 = Rectangle(100.0, 15.0)

    println(rectangle1.toString())
    println(rectangle2.toString())
    println(rectangle3.toString())
    println(rectangle4.toString())
    println(rectangle5.toString())


}