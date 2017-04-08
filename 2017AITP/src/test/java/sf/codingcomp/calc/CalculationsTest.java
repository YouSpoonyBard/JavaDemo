package sf.codingcomp.calc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculationsTest {

    @Test
    public void testAvgSkill() {
        assertEquals( 2.00, Calculations.avgSkill( "U1 D2 N3" ), 0);
        assertEquals( 2.33, Calculations.avgSkill( "U2 D2 N3" ), 0);
        assertEquals( 2.6, Calculations.avgSkill( "U4 D4 N2 R1 P2" ), 0);
        assertEquals( 1.67, Calculations.avgSkill( "U1 D1 N3" ), 0);
        assertEquals( 2.5, Calculations.avgSkill( "U1 D4" ), 0);
        assertEquals( 2.25, Calculations.avgSkill( "U3 D4 R1 P1" ), 0);
        
    }
    
    @Test
    public void testRateCalc() {
        assertEquals( 20.00, Calculations.rate( 1 ), 0 );
        assertEquals( 40.00, Calculations.rate( 2 ), 0 );
        assertEquals( 66.67, Calculations.rate( 10d / 3d ), 0 );
        assertEquals( 60.00, Calculations.rate( 3 ), 0 );
    }

    @Test
    public void testProductivityCalc() {
        assertEquals( .625, Calculations.productivity( 1 ), 0 );
        assertEquals( .75, Calculations.productivity( 2 ), 0 );
        assertEquals( .875, Calculations.productivity( 3 ), 0 );
        assertEquals( 1, Calculations.productivity( 4 ), 0 );
    }

    @Test
    public void testCostCalc() {
        assertEquals( 100.00, Calculations.totalCost( 20, 5 ), 0 );
        assertEquals( 402.20, Calculations.totalCost( 40.22, 10 ), 0 );
    }

    @Test
    public void testHoursCalc() {
        assertEquals( 10, Calculations.hoursOfWorkCompleted( 40, .5, .5 ) );
        assertEquals( 10, Calculations.hoursOfWorkCompleted( 16, 1, .625 ) );
        assertEquals( 11, Calculations.hoursOfWorkCompleted( 22, .75, .625 ) );
    }

}
