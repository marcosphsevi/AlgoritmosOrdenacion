class MergeSort<T : Comparable<T>>(override val lista: MutableList<T>) : Algoritmos<T> {

    override val nombre = "MergeSort"

    override fun ordenar() {
        mergeSort(0, lista.size - 1)
    }

    private fun mergeSort(inicio: Int, fin: Int) {
        if (inicio < fin) {
            val medio = (inicio + fin) / 2
            mergeSort(inicio, medio)
            mergeSort(medio + 1, fin)
            mezclar(inicio, medio, fin)
        }
    }

    private fun mezclar(inicio: Int, medio: Int, fin: Int) {
        val izquierda = lista.subList(inicio, medio + 1).toMutableList()
        val derecha = lista.subList(medio + 1, fin + 1).toMutableList()

        var i = 0
        var j = 0
        var k = inicio

        while (i < izquierda.size && j < derecha.size) {
            if (izquierda[i] <= derecha[j]) {
                lista[k] = izquierda[i]
                i++
            } else {
                lista[k] = derecha[j]
                j++
            }
            k++
        }
        while (i < izquierda.size) {
            lista[k] = izquierda[i]
            i++
            k++
        }
        while (j < derecha.size) {
            lista[k] = derecha[j]
            j++
            k++
        }
    }
}