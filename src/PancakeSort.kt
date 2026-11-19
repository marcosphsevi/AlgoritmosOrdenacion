class PancakeSort<T : Comparable<T>>(override val lista: MutableList<T>) : Algoritmos<T> {

    override val nombre = "PancakeSort"

    override fun ordenar() {
        for (tamano in lista.size downTo 2) {
            val posMax = indiceDelMayor(tamano)
            if (posMax != tamano - 1) {
                if (posMax != 0) {
                    voltear(posMax)
                }
                voltear(tamano - 1)
            }
        }
    }

    private fun indiceDelMayor(tamano: Int): Int {
        var posMax = 0
        for (i in 1 until tamano) {
            if (lista[i] > lista[posMax]) {
                posMax = i
            }
        }
        return posMax
    }

    private fun voltear(fin: Int) {
        var i = 0
        var j = fin
        while (i < j) {
            val temp = lista[i]
            lista[i] = lista[j]
            lista[j] = temp
            i++
            j--
        }
    }
}