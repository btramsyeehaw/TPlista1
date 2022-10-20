package lista1.laboratoriumtp;

public class App 
{
    public static void main( String[] args )
    {
        Bowler jaspritBumrah = new Bowler("Jasprit Bumrah","Mumbai Indians","India",true,3380,2742,145);
        Batter josButtler = new Batter("Jos Buttler","Manchester Originals","England",true,2831,1891,81);

        jaspritBumrah.printTeam();
        jaspritBumrah.printStats();
        System.out.println(Integer.toString(jaspritBumrah.wickets)+" "+Double.toString(jaspritBumrah.getBowlingAverage()));
        
        josButtler.printTeam();
        josButtler.printStats();

    }
}
