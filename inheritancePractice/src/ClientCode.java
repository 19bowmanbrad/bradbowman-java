public class ClientCode {
    public static void main(String [] args){
        QuarterBack myQuarterBack = new QuarterBack(4321, 16, 210, "Packers", "Rodgers", 12);
        Receiver myReceiver = new Receiver(1234, 16, 72, "Packers", "Adams", 17);
        RunningBack myRunningBack = new RunningBack(1234, 16, 42, "Packers", "Jones", 33);

        System.out.println(myQuarterBack.toString());
        System.out.println(myQuarterBack.passingYardsPerGame() + " passing yards per game");
        System.out.println(myQuarterBack.pointsPerGame() + " points per game");

        System.out.println(myReceiver.toString());
        System.out.println(myReceiver.receivingYardsPerGame() + " receiving yards per game");
        System.out.println(myReceiver.pointsPerGame() + " points per game");

        System.out.println(myRunningBack.toString());
        System.out.println(myRunningBack.runningYardsPerGame() + " running yards per game");
        System.out.println(myRunningBack.pointsPerGame() + " points per game");


    }
}
