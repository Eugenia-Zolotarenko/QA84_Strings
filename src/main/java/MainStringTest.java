public class MainStringTest {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("hello");
        String s3 = "Hello";

        System.out.println(s1.length());
        System.out.println(s1.charAt(4));
        printStrColumn("Morgen!");
        printReverse("performance");
    }

    public static void printStrColumn(String s) {
        for (int i = 0; i < s.length(); i++ )
            System.out.println(s.charAt(i));
    }

    public static void printReverse (String s) {
        for (int i=s.length()-1; i>= 0; i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
