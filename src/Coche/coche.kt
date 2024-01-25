/**
 * Clase que representa un coche con diversas propiedades como color, marca, modelo,
 * número de caballos, número de puertas y matrícula.
 */
class coche {

    private var color = ""

    fun getColor(): String {
        return this.color
    }

    /**
     * Establece el color del coche. Si el color proporcionado es nulo, se establece
     * el color por defecto como "Blanco".
     * @param color el color del coche.
     */
    fun setColor(color: String?) {
        if (color == null || color == "Blanco") {
            this.color = cambiarColor().toString()
        } else {
            this.color = color
        }
    }

    private var marca = ""

    fun getMarca(): String {
        return this.marca
    }

    /**
     * Establece la marca del coche convirtiendo la primera letra a mayúscula.
     * @param marca la marca del coche.
     */
    fun setMarca(marca: String) {
        this.marca = marca.lowercase().replaceFirstChar {
            if (it.isLowerCase()) it.titlecase() else it.toString()
        }
    }


    private var modelo = ""

    /**
     * Establece el modelo del coche convirtiendo la primera letra a mayúscula.
     * @param modelo Cadena que representa el modelo del coche.
     */
    fun setModelo(modelo: String) {
        this.modelo = modelo.lowercase().replaceFirstChar {
            if (it.isLowerCase()) it.titlecase() else it.toString()
        }
    }

    fun getModelo(): String {
        return this.modelo
    }


    private var Ncaballos = 0

    /**
     * Establece el número de caballos del coche con validación.
     * Si el valor está fuera del rango permitido (70-700), solicita un valor válido al usuario.
     * @param Ncaballos Número de caballos del coche.
     */
    fun setNcaballos(Ncaballos: Int) {
        do {
            try {
                if (Ncaballos >= 70 && Ncaballos <= 700) {
                    this.Ncaballos = Ncaballos
                    break
                } else {
                    print("ERROR en el coche $marca $modelo\nLos caballos no pueden ser menores a 70 o mayores a 700.\nIntroduzca uno valido => ")
                    this.Ncaballos = readln().toInt()
                }
                if (this.Ncaballos >= 70 && this.Ncaballos <= 700) break
            } catch (_: NumberFormatException) {
                println("Dato no válido")
            }
        } while (true)
    }

    fun getNcaballos(): Int {
        return this.Ncaballos
    }


    private var Npuertas = 0

    /**
     * Establece el número de puertas del coche con validación.
     * Si el valor está fuera del rango permitido (3-5), solicita un valor valido al usuario.
     * @param Npuertas Numero de puertas del coche.
     */
    fun setNpuertas(Npuertas: Int) {
        do {
            try {
                if (Npuertas >= 3 && Npuertas <= 5) {
                    this.Npuertas = Npuertas
                    break
                } else {
                    print("ERROR en el coche $marca $modelo\nLas puertas no pueden ser menores a 3 o mayores a 5.\nIntroduzca uno válido => ")
                    this.Npuertas = readln().toInt()
                }
                if (this.Npuertas >= 3 && this.Npuertas <= 5) break
            } catch (_: NumberFormatException) {
                println("Dato no válido")
            }
        } while (true)
    }

    fun getNpuertas(): Int {
        return this.Npuertas
    }

    private var matricula = ""

    /**
     * La matrícula debe tener exactamente 7 caracteres.
     * Si no cumple con esta condición, solicita una matrícula válida al usuario.
     * @param matricula Matrícula del coche.
     */
    fun setMatricula(matricula: String) {
        do {
            try {
                if (matricula.length == 7) {
                    val primerosCuatro = matricula.substring(0,4).toInt()
                    val elresto = matricula.substring(5,7)
                    this.matricula = matricula
                    break
                } else {
                    print("ERROR en el coche $marca $modelo\nLa matrícula no puede tener un número diferente a 7 caracteres.\nIntroduzca uno válido => ")
                    this.matricula = readln()
                }
                if (this.matricula.length == 7) break
            } catch (_: Exception) {
                println("Dato no válido")
            }
        } while (true)
    }
    fun getMatricula(): String {
        return this.matricula
    }

    /**
     * Cambia el color del coche de manera aleatoria.
     */
    fun cambiarColor() {
        val nums = 0..6
        val randomNum = nums.random()

        when (randomNum) {
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

