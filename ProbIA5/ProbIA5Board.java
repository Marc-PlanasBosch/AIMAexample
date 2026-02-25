package IA.ProbIA5;

/**
 * Created by bejar on 17/01/17.
 */
public class ProbIA5Board {
    /* Class independent from AIMA classes
       - It has to implement the state of the problem and its operators
     *

    /* State data structure
        vector with the parity of the coins (we can assume 0 = heads, 1 = tails
     */

    private int [] board;
    private static int [] solution;

    /* Constructor */
    public ProbIA5Board(int []init, int[] goal) {

        board = new int[init.length];
        solution = new int[init.length];

        for (int i = 0; i< init.length; i++) {
            board[i] = init[i];
            solution[i] = goal[i];
        }

    }

    /* vvvvv TO COMPLETE vvvvv */
    public void flip_it(int i){
        board[i] = 1 - board[i];
        board[(i + 1) % board.length] = 1 - board[(i + 1) % board.length];
    }

    /* Heuristic function */
    public double heuristic(){
        // compute the number of coins out of place respect to solution
        int heuristic = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i] != solution[i]) {
                heuristic++;
            }
        }
        return heuristic;
    }

     /* Goal test */
     public boolean is_goal(){
         // compute if board = solution
         for (int i = 0; i < board.length; i++) {
            if (board[i] != solution[i]) {
                return false;
            }
         }
         return true;
     }

     public ProbIA5Board(ProbIA5Board original) {
        // Creem un nou array amb la mateixa mida
        board = new int[original.board.length];
        
        // Copiem els valors un per un
        for (int i = 0; i < board.length; i++) {
            board[i] = original.board[i];
        }
        // Nota: solution és static, no cal copiar-la (és compartida)
    }
     /* auxiliary functions */

     // Some functions will be needed for creating a copy of the state

    /* ^^^^^ TO COMPLETE ^^^^^ */

}
