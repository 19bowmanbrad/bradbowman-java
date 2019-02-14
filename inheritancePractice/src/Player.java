public class Player {
    private String myTeam;
    private String myName;
    private int myNumber;

    public Player (String team, String name, int number){
        myTeam = team;
        myName = name;
        myNumber = number;
    }
    public String getMyTeam(){
        return myTeam;
    }
    public String getMyName(){
        return myName;
    }
    public int getMyNumber(){
        return myNumber;
    }
}
