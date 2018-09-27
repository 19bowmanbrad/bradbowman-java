public class dollarAndSplatPractice {
    public static final int NUM_ROWS = 10;
    public static final int NUM_COLUMNS = 15;

    public static void main(String[] args) {
        printSplats();
        printDollar();
        printAmpersound();

    }

    public static void printSplats() {
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLUMNS; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printDollar() {
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLUMNS; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
    }

    public static void printAmpersound() {
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int j = 0; j < NUM_COLUMNS; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
