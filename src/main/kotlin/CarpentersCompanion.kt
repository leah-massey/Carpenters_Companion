class CarpentersCompanion {
    fun calculateBoardsRequired(piece: Piece, boardLength: Int, boardWidth: Int): Int {
        var numberOfBoardsRequired = 0

        val boardsRequiredForLength: Int = Math.ceil(piece.length.toDouble() / boardLength).toInt()
        val leftoverFromBoardsRequiredForLength = piece.length % boardLength // this will have full width

        val boardsRequiredForWidth: Int = Math.ceil(piece.width.toDouble() / boardWidth).toInt()
        val leftoverFromBoardsRequiredForWidth = piece.width % boardWidth // this will have full board length

        val fullboardsRequired = if ( leftoverFromBoardsRequiredForLength == 0  ) boardsRequiredForLength else (boardsRequiredForLength -1)

        if (piece.width <= boardWidth && piece.length <= boardLength) {
            numberOfBoardsRequired += 1
        } else if (piece.length > boardLength) {
            numberOfBoardsRequired += boardsRequiredForLength
        } else {
            numberOfBoardsRequired += boardsRequiredForWidth
        }

         return numberOfBoardsRequired
    }

}

data class Piece(val length: Int, val width: Int)