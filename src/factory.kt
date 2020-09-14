    interface Virus {
         fun mutate()
         fun spread(){
            println("spread Virus ...")
         }
    }

    class CoronaVirus: Virus {
      override fun mutate() {
        println("Mutating Corona virus")
      }
    }

    class InfluenzaVirus: Virus {
        override fun mutate() {
            println("Mutating Influenza Virus")
        }
    }

    class HIVVirus: Virus {
        override fun mutate() {
            println("Mutating HIV virus")
        }
    }
    enum class VirusType {
        CORONA_VIRUS,
        INFLUENZA,
        HIV
    }
    class VirusFactory {
        fun findVirus(search: VirusType): Virus? {
            return when(search) {
                VirusType.CORONA_VIRUS -> CoronaVirus()
                VirusType.INFLUENZA -> InfluenzaVirus()
                VirusType.HIV -> HIVVirus()
                else -> null
            }
        }
    }

