package lista1.laboratoriumtp;

public class Bowler implements Player{

    String name;
    String team;
    String country;
    boolean isInternational;
    int runsAllowed;
    int ballsBowled;
    int wickets;
    Double bowlingAverage = Math.round(100.0*this.runsAllowed/this.wickets)/100.0;
    Double economyRate = Math.round(600.0*this.runsAllowed/this.ballsBowled)/100.0;

    public Bowler(String name,String team, String country, boolean isInternational, int runsAllowed, int ballsBowled, int wickets) {
        this.name = name;
        this.team = team;
        this.country = country;
        this.isInternational = isInternational;
        this.runsAllowed = runsAllowed;
        this.ballsBowled = ballsBowled;
        this.wickets = wickets;
    }

    public void printTeam() {
        if (this.isInternational) {
            System.out.println(this.name+" plays for "+this.country+" and "+this.team);
        }
        else {
            System.out.println(this.name+" plays for "+this.team);     
        }
    }
    public void printStats() {
        System.out.println(this.name+" bowls for a "+Double.toString(bowlingAverage)+" average, while going at "+Double.toString(economyRate)+" runs an over");
    }
    public double getBowlingAverage() {
        return this.bowlingAverage;
    }
    public double getEconomyRate() {
        return this.economyRate;
    }

}