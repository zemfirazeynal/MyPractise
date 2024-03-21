package bdc.string_methods;

public class Main {
    public static void main(String[] args) {
        String fullName = "Zemfira Zeynalli";
        String name = "Zemfira";
        String lastName = "    ZEYNalli   ";

        System.out.println("length: "+name.length());
        System.out.println("charAt(3): "+name.charAt(3));
        System.out.println("replace: "+fullName.replace('Z', 'S'));
        System.out.println("substring: "+fullName.substring(3,10)); // 3 daxil olmaqla 10-a kimi
        System.out.println("substring: "+fullName.substring(3));
        System.out.println("contains: "+name.contains("ira"));
        //System.out.println("contains: "+name.contains('r')); char olmaz
        System.out.println("startWith: "+name.startsWith("Zem"));;
        System.out.println("endsWith: "+name.endsWith("Zem"));
        System.out.println("trim: "+lastName.trim());
        System.out.println("toLowerCase: "+lastName.toLowerCase());
        System.out.println("toLowerCase: "+lastName.toUpperCase());
        System.out.println("indexOf: "+fullName.indexOf("Zem"));
        System.out.println("indexOf: "+fullName.indexOf('Z'));

        System.out.println("lastIndexOf: "+fullName.lastIndexOf('Z'));
        System.out.println("lastIindexOf: "+fullName.lastIndexOf("Ze"));


    }
}
