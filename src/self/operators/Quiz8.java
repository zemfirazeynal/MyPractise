package self.operators;

public class Quiz8 {
    public static void main(String[] args)
    {
        int i = 0, j = 0;

        System.out.println(--i * i++ * ++j * j++); // -1 * (-1) * 1 * 1
    }
}
