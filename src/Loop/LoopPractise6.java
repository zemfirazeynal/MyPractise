package Loop;

public class LoopPractise6 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i + "==");
        }

        for (int j = 0; j < 10; j++) {
            if (j == 3) {
                break;
            }
            System.out.println(j + "==");
        }
        System.out.println("For finished");

    }
}