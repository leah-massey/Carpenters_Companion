class CarpentersCompanion {
    fun calculateBoardsRequired(piece: Piece, boardLength: Int, boardWidth: Int): Int {
        var numberOfBoardsRequired = 0

        val boardsRequired: Int = Math.ceil(piece.length.toDouble() / boardLength).toInt()
        val leftoverFromBoardsRequired = piece.length % boardLength

        val fullboardsRequired = if ( leftoverFromBoardsRequired == 0  ) boardsRequired else (boardsRequired -1)

        if (piece.width <= boardWidth && piece.length <= boardLength) {
            numberOfBoardsRequired += 1
        } else {
            numberOfBoardsRequired += boardsRequired
        }

         return numberOfBoardsRequired
    }

}

data class Piece(val length: Int, val width: Int)