package lista1.laboratoriumtp;

public class Batter implements Player{

    String name;
    String team;
    String country;
    Boolean isInternational;
    int runsScored;
    int ballsFaced;
    int innings;
    Double battingAverage = Math.round(100.0*this.runsScored/this.innings)/100.0;
    Double strikeRate = Math.round(10000.0*this.runsScored/this.ballsFaced)/100.0;

    public Batter(String name,String team, String country, boolean isInternational, int runsScored, int ballsFaced, int innings) {
        this.name = name;
        this.team = team;
        this.country = country;
        this.isInternational = isInternational;
        this.runsScored = runsScored;
        this.ballsFaced = ballsFaced;
        this.innings = innings;
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
        System.out.println(this.name+" hits for a "+Double.toString(battingAverage)+" average while striking at "+Double.toString(strikeRate));
    }
    public Double getBattingAverage() {
        return this.battingAverage;
    }
    public Double getStrikeRate() {
        return this.strikeRate;
    }

}