object Data {
    var fields = mutableListOf<Field>(
        Field(0),
        Field(1)
    )
    var cultures = mutableListOf<Culture>(
        Culture(0, "ничего"),
        Culture(1, "кукуруза"),
        Culture(2, "горох")
    )
    var mapFieldCulture = mutableListOf(
        fields[0] to cultures[0],
        fields[1] to cultures[0]
    )
}