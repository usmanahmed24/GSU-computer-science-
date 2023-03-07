public class NBAteam {

    public String teamName;
        public int numberofwin;
        public int numberofloss;
        public void winAgame() {
            numberofwin += 1;
        }
        public void loseAgame() {
            numberofwin += 1;
        }

    public void setNumberofwin(int n) {
            numberofwin = n;
    }

    public int getNumberofwin() {
            return numberofwin;
    }
    public String toString() {
            return ("team name:" + teamName + " number of wins: " + numberofwin + " number of losses: " + numberofloss);
    }


}


