package IA.ProbIA5;

import aima.search.framework.SuccessorFunction;
import aima.search.framework.Successor;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bejar on 17/01/17
 * COINS_PER_FLIP: 2 = volteja parelles consecutives (original)
 *                 4 = volteja grups de 4 consecutius
 */
public class ProbIA5SuccesorFunction implements SuccessorFunction{

    private final int coinsPerFlip;

    /** Per defecte 2 (comportament original) */
    public ProbIA5SuccesorFunction() {
        this(2);
    }

    /** @param coinsPerFlip nombre de monedes a voltejar per moviment (2 o 4) */
    public ProbIA5SuccesorFunction(int coinsPerFlip) {
        this.coinsPerFlip = coinsPerFlip;
    }

    public List getSuccessors(Object state){
        ArrayList retval = new ArrayList();
        ProbIA5Board board = (ProbIA5Board) state;

        for (int i = 0; i < board.getSize(); i++) {
            ProbIA5Board new_state = new ProbIA5Board(board);
            new_state.flip_consecutive(i, coinsPerFlip);
            retval.add(new Successor("flip " + i + " (" + coinsPerFlip + " coins)", new_state));
        }

        return retval;

    }

}
