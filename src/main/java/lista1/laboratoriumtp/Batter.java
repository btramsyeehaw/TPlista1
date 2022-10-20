package lista1.laboratoriumtp;

public class Batter implements Player{

    String name;
    String team;
    int runsScored;
    int ballsFaced;
    int innings;

    public Batter(String name,String team, int runsScored, int ballsFaced, int innings) {
        this.name = name;
        this.team = team;
        this.runsScored = runsScored;
        this.ballsFaced = ballsFaced;
        this.innings = innings;
    }

    public void printTeam() {
        System.out.println(this.name+" plays for "+this.team);     
    }
    public void printStats() {
        System.out.println(this.name+" hits for a "+Double.toString(this.getBattingAverage())+" average while striking at "+Double.toString(this.getStrikeRate()));
    }
    public Double getBattingAverage() {
        return 1.0*runsScored/innings;
    }
    public Double getStrikeRate() {
        return 100.0*runsScored/ballsFaced;
    }

}