public class rocketShip {
    public static void main(String[] args) {
        topSectionHalfOne();
        topMidSection();
        bottomMidSection();
    }


    public static void topMidSection() {
        for (int i = 0; i < 3; i++) {
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
            System.out.println();
        }
    }

    public static void bottomMidSection() {
        for (int i = 0; i < 3; i++) {
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
            System.out.println();
        }
    }
    public static void topSectionHalfOne(){
        for (int i = 0; i < 5; i++){
            for (int k = i; k < 4; k++){
                System.out.print(" ");
            }
            for (int j = -1; j < i; j++){
                System.out.print("/");
            }
            System.out.print("**");
            for (int j = -1; j < i; j++){
                System.out.print("\\");
            }
            for (int k = i; k < 4; k++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
