public class FootballPlayer extends Player {
    private int myGamesPlayed;
    private int myPoints;

    public FootballPlayer(int gamesPlayed, int points, String team, String name, int number) {
        super(team, name, number);
        myGamesPlayed = gamesPlayed;
        myPoints = points;
    }
    public int getMyGamesPlayed(){
        return myGamesPlayed;
    }
    public int getMyPoints(){
        return myPoints;
    }
}
