package self.string_methods;

public class Main_2 {
    public static void main(String[] args) {
        /*String s1 = "       Salam              necesen?";
        System.out.println(s1.replace(" ", ""));

         */

        String s2 = "       Salam              necesen          neynirsen     ne var          ne yox?      ";
        String[] mass = s2.split(" ");
        String result = "";
        for (int i = 0 ; i<mass.length; i++){
            String elem = mass[i];

            if (!elem.isEmpty()){
                result+= elem+" ";
            }
        }
        result=result.trim();
        System.out.println(result);
    }
}
