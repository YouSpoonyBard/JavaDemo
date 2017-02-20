import java.util.Random;

/**
 * Created by mjl84 on 2/13/2017.
 */
public class Die {
    private int sides;
    private int value;

    public Die(int numSides){
            sides = numSides;
            rollDie();
        }

    public void rollDie(){
        Random rand = new Random();
        value = rand.nextInt(sides)+1;
    }

    public int getSides(){
        return sides;
    }
    public int getValue(){
        return value;
    }
}
