import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CarpentersCompanionTest() {
    @Test
    fun `given a required piece whose measurements are the same as a board, then only one board is required`() {
        val piece = Piece(length = 500, width = 50)
        val boardLength = 500
        val boardWidth = 50
        val underTest = CarpentersCompanion()

        val expected = 1
        val actual = underTest.calculateBoardsRequired(
            piece = piece,
            boardLength = boardLength,
            boardWidth = boardWidth
        )

        assertEquals(expected, actual)
    }
}