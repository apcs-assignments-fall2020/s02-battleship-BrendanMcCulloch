public class MyMain {
    // This method returns true/false if there 
    // was a boat the specified coordinates. This
    // method also prints out an appropriate message
    public static boolean hit(boolean[][] board, int row, int col) { 
        if (board[row][col] == true){
            System.out.println("There was a hit!");
            return true;
        }
        else{
            System.out.println("You missed a boat!");
            return false;
        }
    }


    // Places a boat onto the board
    // The top-left piece of the board is located at (row, col)
    // The remaining pieces are placed in the direction given
    // by the direction input
    public static boolean[][] placeBoat(boolean[][] board, String direction, int boatLength, int row, int col) { 
        if (direction.equals("down")){
            for (int l = 0; l < boatLength; l++){
                board[row + l][col] = true;
            }
        }
        else if (direction.equals("right")){
            for (int i = 0; i < boatlength; i++){
                board[row][col + i] = true;
            }
        }
        return board;
    }

    // Returns true if the every row in the 2D array
    // is in both alphabetical order and in order of 
    // increasing length
    // You may assume that all Strings are lowercase 
    public static boolean inOrder(String[][] words) { 
        String single[] = String new[words.length * words[0].length];
        for (int i = 0; i < words.length * words[0].length; i++){
            if (single.charAt(0)) > 
        }
        return false;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
