import java.util.Random;
public class NBA {
    public static void main(String[] args) {
        NBAteam Lakers = new NBAteam();
        NBAteam Heat = new NBAteam();
        double matchup = Math.random();
        for (int i = 0; i <= 3; i++){
            if (matchup > 0.5) {
                Lakers.loseAgame();
                Heat.winAgame();
            } else {
                Lakers.winAgame();
                Heat.loseAgame();
            }
        }
        NBAteam Warriors = new NBAteam();
        NBAteam Nets = new NBAteam();
        Warriors.teamName = "Warriors";
        Nets.teamName = "Nets";

        Random r = new Random();
        Warriors.numberofwin = r.nextInt(82) +1;
        Nets.numberofwin = r.nextInt(82)+ 1;
        Warriors.numberofloss = 82 - Warriors.numberofwin;
        Nets.numberofloss = 82 - Nets.numberofwin;
        System.out.println(Warriors.toString()); //Prints warriors record
        System.out.println(Nets.toString()); //Prints nets record
    }
}
