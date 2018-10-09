public class rocketShip {
    public static final int SIZE = 5;

    public static void main(String[] args) {
        topSectionHalfOne();
        connecter();
        topMidSection();
        bottomMidSection();
        connecter();
        bottomMidSection();
        topMidSection();
        connecter();
        topSectionHalfOne();
    }
    public static void connecter(){
        for(int i = 0; i < 1; i++){
            System.out.print("+");
            for (int j = 0; j < 6; j++){
                System.out.print("=*");
            }
            System.out.println("+");
        }
    }

    public static void topMidSection() {
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 2; j > i; j--) {
                System.out.print(".");
            }
            for (int k = -1; k < i; k++) {
                System.out.print("/\\");
            }
            for (int j = 2; j > i; j--) {
                System.out.print(".");
            }
            for (int j = 2; j > i; j--) {
                System.out.print(".");
            }
            for (int k = -1; k < i; k++) {
                System.out.print("/\\");
            }
            for (int j = 2; j > i; j--) {
                System.out.print(".");
            }
            System.out.println("|");
        }
    }

    public static void bottomMidSection() {
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int k = 0; k < i; k++) {
                System.out.print(".");
            }
            for (int j = 3; j > i; j--) {
                System.out.print("\\/");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(".");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(".");
            }
            for (int j = 3; j > i; j--) {
                System.out.print("\\/");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(".");
            }
            System.out.println("|");
        }
    }
    public static void topSectionHalfOne(){
        for (int i = 0; i < SIZE; i++){
            for (int k = i; k < SIZE; k++){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print("/");
            }
            System.out.print("**");
            for (int j = 0; j <= i; j++){
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
