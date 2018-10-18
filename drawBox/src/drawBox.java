public class drawBox {
    public static void main(String []args) {
        drawBox(4,4,'-');
        drawBox(5, 8, '*');
    }
    public static void drawBox(int width, int height, char character){
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                System.out.print(character);
            }
            System.out.println();
        }
    }

}
