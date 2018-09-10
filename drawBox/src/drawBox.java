public class drawBox {
    public static void main(String []args) {

        drawBox();
        drawBox();
        drawBox();
    }
    public static void drawTopBottom(){
        System.out.println("+---------+");
    }
    public static void drawSides(){
        System.out.println("|         |");
    }
    public static void drawBox(){
        drawTopBottom();
        drawSides();
        drawSides();
        drawTopBottom();
    }

}
