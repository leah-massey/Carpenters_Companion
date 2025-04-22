class CarpentersCompanion {
    fun calculateBoardsRequired(piece: Piece, boardLength: Int, boardWidth: Int): Int {
        var numberOfBoardsRequired = 0

        if (piece.width <= boardWidth && piece.length <= boardLength) {
            numberOfBoardsRequired += 1
        }
         return numberOfBoardsRequired
    }
}

data class Piece(val length: Int, val width: Int)