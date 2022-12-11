class deklarisanjePromenjivih(){
    //promenjive se u kotlinu definisu pomocu kljucnih reci val i var
    var godine = 22
    val ime = "Milovan"

    fun varIval(godine :Int){
        var deklaracija = deklarisanjePromenjivih()
        deklaracija.godine=godine
        // deklaracija.ime="Uros"  nije moguce zato sto je promenjiva ime nepromenjivog tipa zbog kljucne reci val
        println("Moje ime je ${deklaracija.ime} i mam ${deklaracija.godine} godina")
    }
}

