package self.string_methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int i = s.length();
        System.out.println(i);

        char c1 = s.charAt(2);
        System.out.println(c1);

        char c2 = s.charAt(s.length()-1);
        System.out.println(c2);

        String substring = s.substring(1,6);
        System.out.println(substring);

        boolean b1 = s.equals("Java Language");
        System.out.println(b1);

        boolean b2 = s.isEmpty();
        System.out.println("is empty:" +b2);

        boolean b3 = s.contains("ava");
        System.out.println(b3);

        boolean b4 = s.startsWith("Java");
        System.out.println(b4);

        boolean b5 = s.endsWith("e");
        System.out.println(b5);

        boolean b6 = s.equalsIgnoreCase("jaVa languAGE");
        System.out.println(b6);

        String t = s.trim();
        System.out.println(t);

        String ss = s.toLowerCase();
        System.out.println(ss);

        String sss = s.toUpperCase();
        System.out.println(ss);

        int ii = s.indexOf("va");
        System.out.println(ii);

        int iii = s.indexOf('s');
        System.out.println(iii);

        int lastIndexOf = s.lastIndexOf('a');
        System.out.println(lastIndexOf);

        String replace1 = s.replace("Java", "C#");
        System.out.println(replace1);

        String replace2 = s.replace('J', 'L');
        System.out.println(replace2);
    }
}
