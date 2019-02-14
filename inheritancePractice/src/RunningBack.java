public class RunningBack extends FootballPlayer{
    private int myRunningYards;

    public RunningBack(int runningYards, int gamesPlayed, int points, String team, String name, int number) {
        super(gamesPlayed, points, team, name, number);
        myRunningYards = runningYards;
    }
    public String toString(){
        return "I run the football";
    }
    public int runningYardsPerGame(){
        return myRunningYards/getMyGamesPlayed();
    }
    public int pointsPerGame(){
        return getMyPoints()/getMyGamesPlayed();
    }
    public int getMyRunningYards(){
        return myRunningYards;
    }
}
