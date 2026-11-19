class QuickSort<T : Comparable<T>>(override val lista: MutableList<T>) : Algoritmos<T> {

    override val nombre = "QuickSort"

    override fun ordenar() {
        quickSort(0, lista.size - 1)
    }

    private fun quickSort(inicio: Int, fin: Int) {
        if (inicio < fin) {
            val pos = particionar(inicio, fin)
            quickSort(inicio, pos - 1)
            quickSort(pos + 1, fin)
        }
    }

    private fun particionar(inicio: Int, fin: Int): Int {
        val pivote = lista[fin]
        var i = inicio - 1
        for (j in inicio until fin) {
            if (lista[j] < pivote) {
                i++
                val temp = lista[i]
                lista[i] = lista[j]
                lista[j] = temp
            }
        }
        val temp = lista[i + 1]
        lista[i + 1] = lista[fin]
        lista[fin] = temp
        return i + 1
    }
}