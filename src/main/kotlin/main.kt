fun main() {
    while (true){
        val fI = FieldInteractor()
        fI.showFields()
        when(readLine()){
            "0"-> {
                if (fI.plantable(0)){
                    print("Засеять культуру № ")
                    var cultureId = readLine()
                    fI.chooseCulture(0, cultureId!!.toInt())
                }
                else
                    print("Поле уже засеяно")
            }
            "1"->{}
        }
    }

}
/*    while (true){
        rep.showFields()
        when(readLine()!!){
            "0" ->{
                "AFAWFAWf"
                val a = 1
                if (fieldInteractor.plantable(a))
                "NICE"
            }
            "1"->{
                exitProcess(0)}
            else ->{}
        }
    }*/