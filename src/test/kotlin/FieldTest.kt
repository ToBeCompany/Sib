import org.junit.jupiter.api.Assertions.*

internal class FieldTest {

    val a = Field(1)

    @org.junit.jupiter.api.Test
    fun plant() {
        a.plantable()
        assert(1 == 1)
    }
}