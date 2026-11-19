interface Algoritmos<T : Comparable<T>> {
    val nombre: String
    val lista: MutableList<T>

    fun ordenar()

    fun ejecutar() {
        println("[$nombre] Original: $lista")
        val t0 = System.nanoTime()
        ordenar()
        val t1 = System.nanoTime()
        println("[$nombre] Ordenada: $lista")
        println("[$nombre] Tiempo: ${t1 - t0} ns\n")
    }
}