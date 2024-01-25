package Coche

import java.awt.Color
import java.util.*

class coche {
    private var color = ""
    fun getColor(): String {
        return this.color
    }
    fun setColor(color: String?) {
            if (color == null){
                this.color = "Blanco"
            }else{this.color = color}
        }

    private var marca = ""
    fun getMarca(): String {
        return this.marca
    }
    fun setMarca(marca: String) {
        this.marca = marca.lowercase().replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

    }

    private var modelo = ""
    fun setModelo(modelo: String) {
        this.modelo = modelo.lowercase().replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    }
    fun getModelo(): String {
        return this.modelo
    }
    private var Ncaballos = 0


    fun setNcaballos(Ncaballos: Int) {
     do {
         try {
             if (Ncaballos >= 70 && Ncaballos <= 700 ) {
                 this.Ncaballos=Ncaballos
                 break
             } else {
                 print("ERROR en el coche $marca $modelo\nLos caballos no pueden ser menores a 70 o mayores a 700.\nIntroduzca uno valido => ")
                 this.Ncaballos = readln().toInt()
             }
             if(this.Ncaballos >= 70 && this.Ncaballos<=700){break}
         } catch (_: NumberFormatException) {
             println("Dato no valido")
         }
     }while (true)
    }

    fun getNcaballos(): Int {
        return this.Ncaballos
    }
    private var Npuertas = 0

    fun setNpuertas(Npuertas: Int) {
        do {
            try {
                if (Npuertas >= 3 && Npuertas <= 5 ) {
                    this.Npuertas=Npuertas
                    break
                } else {
                    print("ERROR en el coche $marca $modelo\nLas puertas no pueden ser menores a 3 o mayores a 5.\nIntroduzca uno valido => ")
                    this.Npuertas = readln().toInt()
                }
                if(this.Npuertas >= 3 && this.Npuertas<=5){break}
            } catch (_: NumberFormatException) {
                println("Dato no valido")
            }
        }while (true)
    }

    fun getNpuertas():Int {
       return this.Npuertas
    }
    private var matricula = ""

    fun  setMatricula(matricula:String) {
        do {
            try {
                if (matricula.length == 7 ) {
                    this.matricula=matricula
                    break
                } else {
                    print("ERROR en el coche $marca $modelo\nLa matricula no puede tener un numero diferente a 7 caracteres.\nIntroduzca uno valido => ")
                    this.matricula = readln()
                }
                if(this.matricula.length == 7 ){break}
            } catch (_: Exception) {
                println("Dato no valido")
            }
        }while (true)
        this.matricula = matricula
    }

    fun getMatricula(): String {
        return this.matricula
    }

    fun cambiarColor(){
        val nums = 0..6
        val randomNum = nums.random()

        when (randomNum){
            0 -> this.color = "Rojo"
            1 -> this.color = "Azul"
            2 -> this.color = "Verde"
            3 -> this.color = "Negro"
            4 -> this.color = "Blanco"
            5 -> this.color = "Naranja"
            6 -> this.color = "Gris"
        }



    }
    override fun toString(): String {
        return "Tienes un $marca $modelo de color $color con $Npuertas puertas , $Ncaballos caballos y la matricula es $matricula"
    }
}