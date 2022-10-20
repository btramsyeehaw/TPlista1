package lista1.laboratoriumtp;
import java.text.DecimalFormat;
public class Batter implements Player{

    String name;
    String team;
    int runsScored;
    int ballsFaced;
    int innings;
    int notouts;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Batter(String name,String team, int runsScored, int ballsFaced, int innings, int notouts) {
        this.name = name;
        this.team = team;
        this.runsScored = runsScored;
        this.ballsFaced = ballsFaced;
        this.innings = innings;
        this.notouts = notouts;
    }

    public void printTeam() {
        System.out.println(this.name+" plays for "+this.team);     
    }
    public void printStats() {
        System.out.println(this.name+" hits for a "+df.format(this.getBattingAverage())+" average while striking at "+df.format(this.getStrikeRate()));
    }
    public Double getBattingAverage() {
        if (innings-notouts>0) {
            return 1.0*runsScored/(innings-notouts);
        }
        else {
            return 0.0;
        }
    }
    public Double getStrikeRate() {
        if (ballsFaced>0) {
            return 100.0*runsScored/ballsFaced;
        }
        else {
            return 0.0;
        }
    }

}