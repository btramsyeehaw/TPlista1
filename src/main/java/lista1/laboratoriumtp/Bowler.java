package lista1.laboratoriumtp;

public class Bowler implements Player{

    String name;
    String team;
    int runsAllowed;
    int ballsBowled;
    int wickets;

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
        System.out.println(this.name+" bowls for a "+Double.toString(this.getBowlingAverage())+" average, while going at "+Double.toString(this.getEconomyRate())+" runs an over");
    }
    public double getBowlingAverage() {
        return runsAllowed/wickets;
    }
    public double getEconomyRate() {
        return 6*runsAllowed/ballsBowled;
    }

}