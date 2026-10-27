
public class backtracking {

    public static void allSubsets(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        // choises
        // yes
        allSubsets(str, ans + str.charAt(i), i + 1);
        // no
        allSubsets(str, ans, i + 1);
    }

    public static void printCharGrid(char[][] board) {
        System.out.println("----------------------");
        for (char[] row : board) {
            for (char box : row) {
                System.out.print(box + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        int i = row - 1;
        while (i >= 0) {
            if (board[i][col] == 'Q') {
                return false;
            }
            i--;
        }
        int j = col - 1;
        i = row - 1;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j--;
        }
        j = col + 1;
        i = row - 1;
        while (i >= 0 && j < board.length) {
            if (board[i][j] == 'Q') {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

    public static void allPermutations(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // work
        // choises
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            String Str = str.substring(0, j) + str.substring(j + 1);
            allPermutations(Str, ans + ch);
        }
    }
    static int count = 0;

    public static void nQueens(char board[][], int row) {
        if (row == board.length) {
            printCharGrid(board);
            // count++;
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                nQueens(board, row + 1);
                board[row][i] = '#';
            }

        }
    }

    public static void totalWaysToReachEnd(char[][] grid, int row, int col) {
        //base
        if (row == 0 || col == 0) {
            return;
        }
        if (row == grid.length && col == grid[0].length) {
            count++;
            return;
        }
        //work
        if (row < grid.length) {
            totalWaysToReachEnd(grid, row + 1, col);

        }
        if (col < grid[0].length) {
            totalWaysToReachEnd(grid, row, col + 1);

        }
    }

    public static void printIntGrid(int grid[][]) {
        System.out.println("--------------------------");
        for (int[] row : grid) {
            for (int box : row) {
                System.out.print(box + " ");
            }
            System.out.println();
        }
    }

    public static void sudoku(int grid[][], int row, int col) {
        if (row == 9) {
            printIntGrid(grid);
            return;
        }
        //work
        if (grid[row][col] == 0) {
            for (int i = 1; i <= 9; i++) {
                boolean isSafe = true;
                for (int j = 0; j < 9; j++) {
                    if (grid[row][j] == i) {
                        isSafe = false;
                        break;
                    }
                }
                if (isSafe) {
                    for (int j = 0; j < 9; j++) {
                        if (grid[j][col] == i) {
                            isSafe = false;
                            break;
                        }
                    }
                    if (isSafe) {
                        grid[row][col] = i;
                        if (col < 8) {
                            sudoku(grid, row, col + 1);
                        } else {
                            sudoku(grid, row + 1, 0);
                        }

                        grid[row][col] = 0;
                    }
                }

            }
        } else {
            if (col < 8) {
                sudoku(grid, row, col + 1);
            } else {
                sudoku(grid, row + 1, 0);
            }
        }

    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        char board[][] = new char[n][m];
        int[][] sudoku = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };
        for (char[] row : board) {
            for (int i = 0; i < row.length; i++) {
                row[i] = '#';
                // System.out.println(box);
            }
        }
        // printBoard(board);
        sudoku(sudoku, 0, 0);
    }
}
