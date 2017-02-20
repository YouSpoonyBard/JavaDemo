/**
 * Created by mjl84 on 2/13/2017.
 */
public class DieArgument {
    public static void main(String[] args) {
        final int SIX_SIDES = 6;
        final int TWENTY_SIDES = 20;

        Die sixDie = new Die(SIX_SIDES);
        Die twentyDie = new Die(TWENTY_SIDES);

        rollDie(sixDie);
        rollDie(twentyDie);
    }

    public static void rollDie(Die d) {
        System.out.println("Rolling a " + d.getSides() + " sided die.");

        d.rollDie();

        System.out.println("The die's value: " + d.getValue());
    }
}
