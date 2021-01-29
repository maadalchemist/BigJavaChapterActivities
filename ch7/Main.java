import java.util.Scanner;

public class Main {

  	private static String[] board = new String[9];
  	private static boolean isXTurn = true;
  	private static Scanner scanner = null;

  	public static void main(String[] args) {
    		clearConsole();
    		initilizeScanner();
    		initializeBoard();
    		outputInstructions();
    		while (!isGameOver()) {
      			getUserInput();
      			printBoard();
    		}
  	}

  	private static void initializeBoard() {
    		for (int i = 0; i < board.length; i++) {
    			   board[i] = " ";
    		}
  	}

  	private static void outputInstructions() {
    		System.out.println("\n\n---------------------------------------------------------------");
    		System.out.println("TIC TAC TOE: Enter the numbered square to occupy. X goes first.\n");
    		System.out.println("Square numbers:\n");
    		printReferenceBoard();
    		System.out.println("\n---------------------------------------------------------------\n\n");
  	}

  	private static boolean checkRowWin() {
    		for (int i = 0; i < board.length; i += 3) {
      			if (!board[i].equals(" ") && board[i].equals(board[i + 1]) && board[i].equals(board[i + 2])) {
        				return true;
      			}
    		}
    		return false;
  	}

  	private static boolean checkColumnWin() {
    		for (int i = 0; i < 3; i++) {
      			if (!board[i].equals(" ") && board[i].equals(board[i + 3]) && board[i].equals(board[i + 6])) {
        				return true;
      			}
    		}
    		return false;
  	}

  	private static boolean checkDiagonalWin() {
    		if (!board[0].equals(" ") && board[0].equals(board[4]) && board[0].equals(board[8]) || !board[2].equals(" ") && board[2].equals(board[4]) && board[2].equals(board[6])) {
      			return true;
    		}
    		return false;
  	}

  	private static boolean isGameOver() {
    		if (checkRowWin() || checkColumnWin() || checkDiagonalWin()) {
      			System.out.println("\n---------------------------------------------------------------\n");
      			printBoard();
      			if (isXTurn) {
        				System.out.print("\nPlayer O won the game!");
      			} else {
        				System.out.print("\nPlayer X won the game!");
      			}
      			System.out.println("\n---------------------------------------------------------------\n");
      			return true;
    		}
    		return false;
  	}

  	private static void getUserInput() {
    		try {
      			if (isXTurn) {
        				System.out.print("\nPlayer X, enter your square: ");
        				int playerInput = scanner.nextInt();
        				board[playerInput] = "X";
      			} else {
        				System.out.print("\nPlayer O, enter your square: ");
        				int playerInput = scanner.nextInt();
        				board[playerInput] = "O";
      			}
      			setTurn();
    		} catch (Exception e) {
      			e.printStackTrace();
    		}
  	}

  	private static void setTurn() {
    		if (isXTurn) {
      			isXTurn = false;
    		} else {
      			isXTurn = true;
    		}
  	}

  	private static void printBoard() {
    		for (int i = 0; i < board.length; i++) {
      			if ((i + 1) % 3 == 0) {
        				System.out.println(board[i]);
        				if (i != board.length - 1) {
          					System.out.println("-----");
        				}
      			} else {
        				System.out.print(board[i] + "|");
      			}
    		}
  	}

  	private static void printReferenceBoard() {
    		System.out.println("\t0|1|2");
    		System.out.println("\t-----");
    		System.out.println("\t3|4|5");
    		System.out.println("\t-----");
    		System.out.println("\t6|7|8");
  	}

  	private static void initilizeScanner() {
    		try {
      			scanner = new Scanner(System.in);
    		} catch (Exception e) {
      			e.printStackTrace();
    		}
  	}

  	private static void clearConsole() {
    		System.out.print("\u001b[2J");
    		System.out.flush();
  	}
}
