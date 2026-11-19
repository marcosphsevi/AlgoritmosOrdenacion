object GenerarDatos {
    val listaVehiculos: MutableList<String> = mutableListOf(
        "Motocicleta",
        "Camión",
        "Bicicleta",
        "Tren",
        "Avioneta",
        "Furgoneta",
        "Autobús",
        "Patinete eléctrico",
        "Helicóptero",
        "Velero",
        "Ambulancia",
        "Tractor",
        "Taxi",
        "Submarino",
        "Globo aerostático",
        "Coche deportivo",
        "Quad",
        "Caravana",
        "Monopatín",
        "Moto de agua",
        "Camión de bomberos",
        "Excavadora",
        "Tranvía",
        "Metro",
        "Yate",
        "Ferry",
        "Crucero",
        "Piragua",
        "Trineo",
        "Scooter",
        "Limusina",
        "Coche de policía",
        "Grúa",
        "Autocaravana",
        "Segway",
        "Cohete espacial",
        "Hidroavión",
        "Funicular",
        "Teleférico",
        "Carro de caballos",
        "Dron",
        "Minibús",
        "Pick-up",
        "Todoterreno",
        "Bicicleta eléctrica",
        "Buggy",
        "Ciclomotor",
        "Hovercraft"
    )

    fun obtenerCopiaVehiculos(): MutableList<String> = listaVehiculos.toMutableList()

    val listaNumeros: MutableList<Int> = (1..10000).shuffled().take(100).toMutableList()

    fun obtenerCopiaNumeros(): MutableList<Int> = listaNumeros.toMutableList()

}