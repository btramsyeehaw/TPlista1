package lista1.laboratoriumtp;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner personalData = new Scanner(System.in);
        System.out.println("Enter the player's name ");
        String playerName = personalData.nextLine();
        System.out.println("Enter the player's club ");
        String playerClub = personalData.nextLine();
        System.out.println("Type bowler or batter to specify the player's role");
        String role = personalData.nextLine();
        if ("bowler".equals(role)) {
            System.out.println("Enter the runs allowed by "+playerName);
            int runsAllowed = personalData.nextInt();
            System.out.println("Enter the amount of balls bowled by "+playerName);
            int ballsBowled = personalData.nextInt();
            System.out.println("Enter the amount of wickets taken by "+playerName);
            int wickets = personalData.nextInt();
            Bowler bowler = new Bowler(playerName, playerClub, runsAllowed, ballsBowled, wickets);
            bowler.printTeam();
            bowler.printStats();
        }
        else if ("batter".equals(role)) {
            System.out.println("Enter the runs scored by "+playerName);
            int runsScored = personalData.nextInt();
            System.out.println("Enter the amount of balls faced by "+playerName);
            int ballsFaced = personalData.nextInt();
            System.out.println("Enter the amount of innings played by "+playerName);
            int innings = personalData.nextInt();
            Batter batter = new Batter(playerName, playerClub, runsScored, ballsFaced, innings);
            batter.printTeam();
            batter.printStats();
        }
        personalData.close();
    }
}
