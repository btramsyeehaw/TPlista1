package lista1.laboratoriumtp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.text.DecimalFormat;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static final DecimalFormat df = new DecimalFormat("0.00");
    @Test
    public void shouldAnswerWithTrue()
    {
        Batter test1 = new Batter("Liam Livingstone","Birmingham Phoenix",4967,3393,190, 18);
        Bowler test2 = new Bowler("Sam Curran","Oval Invincibles",3661,2574,136);
        assertEquals(df.format(test1.getStrikeRate()),"146,39");
        assertEquals(df.format(test1.getBattingAverage()),"28,88");
        assertEquals(df.format(test2.getBowlingAverage()),"26,92");
        assertEquals(df.format(test2.getEconomyRate()),"8,53");
    }
}
