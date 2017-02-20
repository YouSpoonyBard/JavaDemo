import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

/**
 * Created by mjl84 on 1/30/2017.
 */
public class SoccerTeams {
    public static void main(String[] args) {
        final int MIN_PLAYERS = 9;
        final int MAX_PLAYERS = 15;
        int players;
        int teamSize;
        int teams;
        int leftOver;
        String input;


        input = JOptionPane.showInputDialog("Enter the number of players per team.");
        teamSize = Integer.parseInt(input);
        while(teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS){
            input = JOptionPane.showInputDialog("The number must" + " be at least "
                    + MIN_PLAYERS + " and no more than " + MAX_PLAYERS +
                    ". \n Enter " + " the number of players.");


            teamSize = Integer.parseInt(input);
        }

        input = JOptionPane.showInputDialog("Enter the available " + " number of players.");
        players = Integer.parseInt(input);
        while (players < 0){
            input = JOptionPane.showInputDialog("Enter 0 or" + "greater.");
            players = Integer.parseInt(input);
        }

        teams = players / teamSize;
        leftOver = players % teamSize;
        JOptionPane.showMessageDialog(null, "There will be " + teams + " teams with " + leftOver + " players left over.");

        System.exit(0);




    }
}
