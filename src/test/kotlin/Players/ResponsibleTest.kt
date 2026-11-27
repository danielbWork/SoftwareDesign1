package Players

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ResponsibleTest {
    val char = Responsible()
    @Test
    fun `char is named Responsible`() {
        assertEquals("Responsible", char.getName())
    }

}