package self.operators;

public class Quiz3 {
    public static void main(String[] args)
    {
        int i=0;

        i = i++ - --i + ++i - i--; // 0+ (=1) + 0 + 1  - 1 (=0)

        System.out.println(i); // 0

    }
}
