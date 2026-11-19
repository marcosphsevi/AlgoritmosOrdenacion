fun main() {
    println("===== VEHÍCULOS =====")
    val algoritmosVehiculos: List<Algoritmos<String>> = listOf(
        QuickSort(GenerarDatos.obtenerCopiaVehiculos()),
        PancakeSort(GenerarDatos.obtenerCopiaVehiculos()),
        MergeSort(GenerarDatos.obtenerCopiaVehiculos())
    )

    for (algoritmo in algoritmosVehiculos) {
        algoritmo.ejecutar()
    }

    println("===== NÚMEROS =====")
    val algoritmosNumeros: List<Algoritmos<Int>> = listOf(
        QuickSort(GenerarDatos.obtenerCopiaNumeros()),
        PancakeSort(GenerarDatos.obtenerCopiaNumeros()),
        MergeSort(GenerarDatos.obtenerCopiaNumeros())
    )

    for (algoritmo in algoritmosNumeros) {
        algoritmo.ejecutar()
    }
}