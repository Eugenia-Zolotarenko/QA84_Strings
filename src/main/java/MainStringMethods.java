public class MainStringMethods {
    public static void main(String[] args) {
        String s ="Hello";

        System.out.println("contains = " + s.contains("l"));

        System.out.println("i = " + s.indexOf("l"));

        System.out.println("i = " + s.lastIndexOf('l'));

        System.out.println("is blank " +  "".isBlank());
        System.out.println("is empty " +  " ".isEmpty());

        String st = String.valueOf(12);
        System.out.println("count = " + findChar(s, 'l'));
        System.out.println("isPalindrom2e: " + isPalindrome("a    rosa   upal a  na lapu asora"));



    }

    public static boolean isPalindrome2 (String s) {
        String s1 = "";
        for (int i=s.length()-1; i>=0 ; i--){
            s1 += s.charAt(i);
        }

        if (s1.equals(s)) return true;
        else return false;
    }

    public static boolean isPalindrome(String s){
        s = s.replace(" ", "");

        for (int i = 0, j = s.length()-1; i < j; i++, j--){
            //if(s.charAt(i) == ' ') i++;
            //if(s.charAt(j) == ' ') j--;

            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (ci != cj)
                return false;
        }

        return true;
    }



    public static int findChar (String str, char sym) {
        int count = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == sym)
                count++;
        }
        return count;
    }
}
