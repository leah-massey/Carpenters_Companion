class CarpentersCompanion {
    var boardStore: List<Board> = mutableListOf()

    fun calculateBoardsRequired(piece: Piece, boardLength: Int, boardWidth: Int): Int {
        var numberOfBoardsAddedToUse: Int = 0


        val boardsRequiredForLength: Int = Math.ceil(piece.length.toDouble() / boardLength).toInt()
        val leftoverFromBoardsRequiredForLength = Board(length = piece.length % boardLength, width = boardWidth)

        val boardsRequiredForWidth: Int = Math.ceil(piece.width.toDouble() / boardWidth).toInt()
        val leftoverFromBoardsRequiredForWidth = Board( length = boardLength, width = piece.width % boardWidth)

        println(leftoverFromBoardsRequiredForWidth)


        // do I need this?
        val fullboardQuantRequired: Int =
            if ( leftoverFromBoardsRequiredForLength.length == 0  && leftoverFromBoardsRequiredForWidth.width == 0) {
            boardsRequiredForLength + boardsRequiredForWidth
        } else if (leftoverFromBoardsRequiredForLength.length == 0) {
            boardsRequiredForLength + (boardsRequiredForWidth - 1)
        } else  { //(leftoverFromBoardsRequiredForWidth.width == 0)
            boardsRequiredForWidth + (boardsRequiredForLength - 1)
        }

        if (leftoverFromBoardsRequiredForLength.length != 0) {
            boardStore += leftoverFromBoardsRequiredForLength
        }

        if (leftoverFromBoardsRequiredForWidth.width != 0 ) {
            boardStore += leftoverFromBoardsRequiredForWidth
        }







        if (piece.length > boardLength && piece.width > boardWidth) {
            numberOfBoardsAddedToUse += boardsRequiredForLength
            numberOfBoardsAddedToUse += boardsRequiredForWidth
        }
        else if (piece.length > boardLength) {
            numberOfBoardsAddedToUse += boardsRequiredForLength
        } else if (piece.width > boardWidth) {
            numberOfBoardsAddedToUse += boardsRequiredForWidth
        } else { // piece.width <= boardWidth && piece.length <= boardLength
            numberOfBoardsAddedToUse += 1
        }

         return numberOfBoardsAddedToUse
    }

}

data class Piece(val length: Int, val width: Int)
data class Board(val length: Int, val width: Int)
