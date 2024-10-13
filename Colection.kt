class Colection {
    fun ContohList() {
        println("== List ==")
        // List Read-Only
        val readOnlyAbjad = listOf("A", "B", "C")
        println(readOnlyAbjad)

        // List Mutable
        val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
        println(shape)

        // Menambahkan data ke dalam List Mutable
        shape.add("Circle")
        println(shape)

        shape.remove("Triangle")
        println(shape)

        println(shape.first())
        println(shape.last())
        println(shape.count())

        shape.removeAt(1)
        println(shape)

        // Mengubah data didalam List Mutable
        shape[0]= "Oval"
        println(shape)

        //List Read-Only
        val shapesLocked: List<String> = shape
        println(shapesLocked)

    }

    fun main() {
        ContohList()
    }
}