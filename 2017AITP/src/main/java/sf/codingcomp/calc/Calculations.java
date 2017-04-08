package sf.codingcomp.calc;

import sf.codingcomp.exception.TooManyHoursException;

public class Calculations {

    private static final double MAX_SKILL = 4d;
    private static final double HOUR_RATE = 80;
    private double rate;
    private String sLevel;
    private int level;
    private char convert;

    public static double avgSkill( String levels ) {
    	sLevel = levels;
    	convert = sLevel.charAt(1);
    	level = Integer.parseInt(convert);
        return level;
    }

    public static double rate( double avgSkill ) {
    	rate = HOUR_RATE * (avgSkill / 4)
        return rate;
    }

    public static double productivity( int skillLevel ) {
        return 0;
    }

    public static double totalCost( double rate, int hoursWorked ) throws TooManyHoursException {
        return 0;
    }

    public static int hoursOfWorkCompleted( int hoursWorked, double availability, double productivity ) {
        return 0;
    }

}
