package HomeWork4_4;

import java.util.Scanner;

public class TicTacToe {
    private String[][] board;
    private static final int ROWS = 3;
    private static final int COLUMNS = 3;
    private String regex = "\\s{3}";

    public TicTacToe() {
        board = new String[ROWS][COLUMNS];
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                board[i][j] = "   ";
            }
        }
    }

    public void setPlay(int i, int j, String player) {
        if (board[i][j].matches(regex)) {
            board[i][j] = " " + player + " ";
        }
    }

    public boolean isGameOver() {
        for (int i = 0; i < ROWS; i++) {
            if (!board[i][0].matches(regex) && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
                return true;
            }
        }

        for (int j = 0; j < COLUMNS; j++) {
            if (!board[0][j].matches(regex) && board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j])) {
                return true;
            }
        }

        if (!board[0][0].matches(regex) && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            return true;
        }

        return !board[0][2].matches(regex) && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]);
    }

    public String printBoard() {
        String strBoard = "";
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (j == COLUMNS - 1) {
                    strBoard += board[i][j];
                } else {
                    strBoard += board[i][j] + "|";
                }
            }
            if (i != ROWS - 1) {
                strBoard += "\n---+---+---\n";
            }
        }
        return strBoard;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        String player = "X";

        do {
            System.out.println(game.printBoard());
            System.out.println("Enter row for " + player + " or -1 to exit: ");
            int row = input.nextInt();
            if (row == -1) {
                break;
            }
            System.out.println("Enter column for " + player + ": ");
            int column = input.nextInt();
            game.setPlay(row, column, player);
            if (game.isGameOver()) {
                System.out.println(game.printBoard() + "\n" + player + " wins!");
                break;
            }
            player = player.equals("X") ? "O" : "X";
        } while (true);
        System.out.println("Goodbye!..");
    }
}