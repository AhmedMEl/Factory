fun main() {
    val factory = VirusFactory()
    val virus = factory.findVirus(VirusType.CORONA_VIRUS)
    virus?.spread()
    virus?.mutate()


    val virus2 = factory.findVirus(VirusType.INFLUENZA)
    virus2?.spread()
    virus2?.mutate()
}
