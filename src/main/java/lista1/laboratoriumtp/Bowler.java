package lista1.laboratoriumtp;
import java.text.DecimalFormat;
public class Bowler implements Player{

    String name;
    String team;
    int runsAllowed;
    int ballsBowled;
    int wickets;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Bowler(String name,String team, int runsAllowed, int ballsBowled, int wickets) {
        this.name = name;
        this.team = team;
        this.runsAllowed = runsAllowed;
        this.ballsBowled = ballsBowled;
        this.wickets = wickets;
    }

    public void printTeam() {
        System.out.println(this.name+" plays for "+this.team);     
    }
    
    public void printStats() {
        System.out.println(this.name+" bowls for a "+df.format(this.getBowlingAverage())+" average, while going at "+df.format(this.getEconomyRate())+" runs an over");
    }
    public double getBowlingAverage() {
        return 1.0*runsAllowed/wickets;
    }
    public double getEconomyRate() {
        return 6.0*runsAllowed/ballsBowled;
    }

}