public class MainStringTasks {
    public static void main(String[] args) {
        printSentenceReverse("Hello course QA");

    }

    public static void printSentenceReverse(String s) {
        String[] ar = s.split(" ");
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }


}

    /* s-> "Hello course QA"
    output -> "OA course Hello";

     */

    /*
    public static void printSentenceReverse1 (String s)

    sentence -> "Hello course QA 84"
    output ->
    84
    QA
    course
    Hello

    public static void printSentenceReverse2 (String s)

    sentence -> "Hello course QA 84"

    48
    QA
    esruoc
    olleH


    public static boolean isPalindrome(String str)

    str -> "Level"
    output -> true


    public static boolean isPalindrome(String str)

    str -> "Name now one man"
    output -> true


     */

