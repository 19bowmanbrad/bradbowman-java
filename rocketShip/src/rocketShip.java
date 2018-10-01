public class rocketShip {
    public static void main(String[] args) {
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
        for (int i = 0; i < 2; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print("\\/");
            }
            System.out.println();
            for (int k = -1; k < i; k++) {
                System.out.print(".");
            }
            for (int j = 0; j > i; j--) {
                System.out.print("\\/");
            }


        }
    }
}
