import java.util.Arrays;

public class MethodsString_Homework_6 {
    public static void printCharIndex(String str, char sym) {
        for (int i =0; i < str.length(); i++){
            char current = str.charAt(i);
            if (current == sym)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int substringIndex(String s, String sub){
        return s.indexOf(sub);
    }

    public static void printSentenceReverse (String sentence){
        String[] ar = sentence.split(" ");
        for (int i = ar.length-1; i>=0; i--)
        System.out.println(ar[i]);
    }

 /*
    public static void printSentenceReverse1 (String s)

    sentence -> "Hello course QA 84"  ar-> ["Hello"]["course"]["QA"]["84"]
    output ->
    84
    QA
    course
    Hello

  */

    public static void printSentenceReverse1 (String sentence) {
        sentence = sentence.strip();

        String[] ar = sentence.split(" ");
        for (int i= ar.length-1; i >= 0; i--){
            MainStringTest.printReverse(ar[i]);
        }
    }

    /*public static void printSentenceReverse2 (String s)

    sentence -> "Hello course QA 84"

    48
    QA
    esruoc
    olleH

     */

    public static boolean isPalindrome(String str) {
        if (str == null)  //  || str.isBlanc()
            return false;
        str = str.strip();
        str = str.toLowerCase();
        str = str.replace(" ", "");  //replaceAll ("[^a-zA-Z0-9]", "");

        for (int i=0, j=str.length()-1; i<j; i++, j--){
            char ci =str.charAt(i);
            char cj = str.charAt(j);
            if(ci != cj)
                return false;
        }
        return true;
    }

    public static int getMaxCharIndex(String s){
        return 0;
    }
}

/*
Homework 26.05.2026
1. найти часть, которая самая длинная и найти индекс, с которой она начинается
 s-> "ccabbbdddda"


 2.
public static void printCapitals(String s){

    }


s-> "Hello Course QA 84 btr";

Output: "HCQ8"

3.
public static void printLastReverse (String s) {
}

s-> "Hello Course QA 84"

output -> "4Aeo";

4. public static String insertFrom (string S, int index, String ins){
}

s-> "Hello world"

ins-> "my "
index -> 6

result -> "Hello my world"
 */