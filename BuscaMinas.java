package code.bootcamp.example;

public class BuscaMinas {

    private static final int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};




    private static void print(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] board = {{'.','.','.','.'},
                {'.','*','.','.'},
                {'.','*','*','.'}};

        addHints(board);
        print(board);
    }
    public static void addHints(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (!isMine(board[i][j])) {
                    board[i][j] = Character.forDigit(numberOfMines(board, i, j), 10);
                }
            }
        }
    }

    public static boolean isValid(int x, int y, char[][] board) {
        return x >= 0 && x < board.length && y >= 0 && y < board[0].length;
    }

    public static boolean isMine(char data) {
        var dataValidation = data == '*';
        return dataValidation;
    }

    public static int numberOfMines(char[][] board, int x1, int y1){
        var count = 0;

        for (var k = 0; k < dx.length; ++k) {
            var nx = x1 + dx[k];
            var ny = y1 + dy[k];
            if (isValid(nx, ny, board)) {
                if(isMine(board[nx][ny])){
                    ++count;
                }
            }
        }
        return count;
    }
}





