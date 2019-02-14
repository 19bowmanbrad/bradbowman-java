public class QuarterBack extends FootballPlayer {
    private int myPassingYards;

    public QuarterBack(int passingYards, int gamesPlayed, int points, String team, String name, int number) {
        super (gamesPlayed, points, team, name, number);
        myPassingYards = passingYards;
    }
    public String toString(){
        return "I throw the football";
    }
    public int passingYardsPerGame(){
        return myPassingYards/getMyGamesPlayed();
    }
    public int pointsPerGame(){
        return getMyPoints()/getMyGamesPlayed();
    }
    public int getMyPassingYards(){
        return myPassingYards;
    }

}
