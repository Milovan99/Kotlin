package Tipovi_podataka

class TypeInference(val vrednost:Any?){
    //Kotlin kompajler moze automatski da prepozna koja vrednost je dodeljena promenjivoj
    // i da na osnovu toga odredi njen tip

    val diploma = "Diplomirani inzinjer menadzmenta informacionih tehnologija"
    var prosek = 8.3

    fun typeInference(){
        var poruka = ""
        when (vrednost){
            is Int ->poruka="Vrednost je Integer"
            is Double -> poruka="Vrednost je Double"
            is String->poruka="Vrednost je String"
            else ->poruka="Vrednost je vanzemaljac"
        }
        println(poruka)
    }
}