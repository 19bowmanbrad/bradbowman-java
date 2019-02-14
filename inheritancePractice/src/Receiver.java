public class Receiver extends FootballPlayer{
    private int myReceivingYards;

    public Receiver(int receivingYards, int gamesPlayed, int points, String team, String name, int number){
        super (gamesPlayed, points, team, name, number);
        myReceivingYards = receivingYards;
    }
    public String toString(){
        return "I catch the football";
    }
    public int receivingYardsPerGame(){
        return myReceivingYards/getMyGamesPlayed();
    }
    public int pointsPerGame(){
        return getMyPoints()/getMyGamesPlayed();
    }
    public int getMyReceivingYards(){
        return myReceivingYards;
    }
}
