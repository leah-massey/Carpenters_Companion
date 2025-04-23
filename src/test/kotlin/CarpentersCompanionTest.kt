import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CarpentersCompanionTest() {
    @Test
    fun `given a required piece whose measurements are the same as a standard board, then only one board is required`() {
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

    @Test
    fun `given a required piece whose measurements are within the dims of a standard board, then only one board is required`() {
        val piece = Piece(length = 400, width = 40)
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

    @Test
    fun `given a required piece whose length is not within the dims of a standard board, then multiple boards are required`() {
        val piece = Piece(length = 600, width = 50)
        val boardLength = 500
        val boardWidth = 50
        val underTest = CarpentersCompanion()

        val expected = 2
        val actual = underTest.calculateBoardsRequired(
            piece = piece,
            boardLength = boardLength,
            boardWidth = boardWidth
        )

        assertEquals(expected, actual)
    }

    @Test
    fun `given a required piece whose width is that of a standard board but whose length is more than double the length of a standard board, then multiple boards are required`() {
        val piece = Piece(length = 1100, width = 50)
        val boardLength = 500
        val boardWidth = 50
        val underTest = CarpentersCompanion()

        val expected = 3
        val actual = underTest.calculateBoardsRequired(
            piece = piece,
            boardLength = boardLength,
            boardWidth = boardWidth
        )

        assertEquals(expected, actual)
    }



}