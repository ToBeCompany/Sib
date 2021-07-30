class FieldInteractor(){
    fun showFields(){
        print(Data.mapFieldCulture)
    }
    fun plantable(id:Int):Boolean{
        return Data.mapFieldCulture[id].second == Data.cultures[0]
    }
    fun chooseCulture(fieldId:Int, cultureId:Int){
        Data.mapFieldCulture[fieldId]=Data.fields[fieldId] to Data.cultures[cultureId]
    }
}