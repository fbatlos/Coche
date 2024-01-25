package Coche

import coche

fun main(){

    val coche1 = coche()
    coche1.setColor(null)
    coche1.setMarca("ReNOl")
    coche1.setModelo("777P")
    coche1.setNcaballos(60)
    coche1.setNpuertas(4)
    coche1.setMatricula("1234ADS")

    val coche2 = coche()
    coche2.setColor("Verde")
    coche2.setMarca("LOL")
    coche2.setModelo("SINSX")
    coche2.setNcaballos(600)
    coche2.setNpuertas(45)
    coche2.setMatricula("8869PAN")

    println(coche1.toString())
    println(coche2.toString())

    println("Se estan cambiando los colores.......(press enter)")
    readln()

    coche1.cambiarColor()
    coche2.cambiarColor()
    println(coche1.toString())
    println(coche2.toString())
}