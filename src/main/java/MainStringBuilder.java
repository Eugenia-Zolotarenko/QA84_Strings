public class MainStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" world!");
        System.out.println("append: " + sb);

        sb.delete(2,6);
        System.out.println("delete: " + sb);

        sb.insert(2, "llo ");
        System.out.println("insert: " + sb);

        sb.insert(0, "Hi, ");
        System.out.println("insert: " + sb);

        sb.replace(0, 2, "Bye");
        System.out.println("replace: " + sb);

        sb.delete(2, sb.length());
        System.out.println("delete: " + sb);

        sb.reverse();
        System.out.println("reverse: " + sb);

        String st = "Hello course";
        System.out.println("String st: " + st);

        StringBuilder sbl = new StringBuilder(st);

        sbl.reverse();
        System.out.println("reverse sbl: " + sbl);

        st = sbl.toString();
        System.out.println("st: " + st);

        System.out.println("is Palindrome: " + isPalindrome("a rosa upala na lapu asora"));
    }

    public static boolean isPalindrome(String s) {

        //s = s.strip(); duplicate s.replace
       // s = s.toLowerCase();
        s = s.replace(" ", "");

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = sb.toString();

        return s.equalsIgnoreCase(rev);

    }
}


/*
sb -> "Hello"  mutable;

 */