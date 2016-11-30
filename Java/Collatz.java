/**
 * Created by mrxuso on 30/11/2016.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Collatz numbers Class
 */
public class Collatz {

    private int mNumber = 13;
    private List<Integer> mCollatzSequence = new ArrayList<Integer>();

    /**
     * Public constructor that also gets the collatz sequence
     * @param number
     */
    public Collatz(int number){
        mNumber = number;
        collatzSequence();
    }

    /**
     * Gets next collatz number from the one given
     * @param number
     * @return Collatz number of n
     */
    private int nextCollatz(int n){
        if (n % 2 == 0){
            return n / 2;
        } else {
            return 3 * n + 1;
        }
    }

    /**
     * fills mCollatzSequence with all the Collatz numbers in the sequence
     */
    private void collatzSequence(){
        mCollatzSequence.add(mNumber);
        int i = 0;
        while (mCollatzSequence.get(i) > 1){
            mCollatzSequence.add(nextCollatz(mCollatzSequence.get(i)));
            i++;
        }
    }

    /**
     * Public getter
     * @return The Collatz Sequence
     */
    public List<Integer> getCollatzSequence() {
        return mCollatzSequence;
    }
}
