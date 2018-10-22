public class unit3Project {
    public static void main(String[]args){
        double cityDistance = distance(16 , 10 , 4 , 28);
        System.out.println("The distance between these two cities is " + cityDistance);
    }
    public static double distance(double x1, double y1, double x2, double y2){
        double xValues = Math.pow((x2 - x1), 2);
        double yValues =  Math.pow((y2 - y1), 2);
        return Math.sqrt((xValues + yValues));
    }

}
