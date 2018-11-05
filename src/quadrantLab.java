public class quadrantLab {

    public static void main(String[] args){
        String whichQuadrant = quadrant(0, 23.0);
        System.out.println(whichQuadrant);
    }
    public static String quadrant(double x, double y){
        if (0 < x && 0 < y){
            return "Quadrant One";
        } else if (0 > x && 0 < y){
            return "Quadrant Two";
        }else if (0 > x && 0 > y){
            return "Quadrant Three";
        } else if (0 < x && 0 > y) {
            return "Quadrant Four";
        }else{
            return "Quadrant Zero";
        }

    }
}
