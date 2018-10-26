public class unit3Project {
    public static void main(String[]args){
        double cityDistance = distance(16 , 10 , 4 , 28);
        System.out.println("The distance between these two cities is " + cityDistance);
        double distance1 = distance(16 , 10 , 4 , 28);
        double distance2 = distance(4, 28, 2, 8);
        double distance3 = distance(2, 8 , 10, 3);
        double tripDistance = totalDistance(distance1, distance2, distance3);
        System.out.println("The total trip distance between these three cities is " + tripDistance);
        double bothWays = roundTrip(tripDistance);
        System.out.println("The round trip distance between these three cities is " + bothWays);

    }
    public static double distance(double x1, double y1, double x2, double y2){
        double xValues = Math.pow((x2 - x1), 2);
        double yValues =  Math.pow((y2 - y1), 2);
        return Math.sqrt((xValues + yValues));
    }
    public static double totalDistance(double distance1, double distance2, double distance3){
        return (distance1 + distance2 + distance3);
    }
    public static double roundTrip(double oneWay){
        return (oneWay * 2);
    }

}
