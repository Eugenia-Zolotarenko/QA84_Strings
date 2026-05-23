public class MainStringMethodsHW5 {
    public static void main(String[] args) {

        System.out.print("index of symbol: ");
        printCharIndex("Hello world", 'l');
        System.out.println();

        printSentenceReverse1("Hello course QA");
        System.out.println();

        printSentenceReverse2("Hello course QA 84");
        System.out.println();

        System.out.println("Reversed String: " + printSentenceReverse3("Hello course QA 84"));
        System.out.println();

        System.out.println("substring index: " + substringIndex("abcdefdefdef", "def"));
    }


    public static void printCharIndex(String s, char sym) {

        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == sym) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void printSentenceReverse1(String s) {
        String[] ar = s.split(" ");
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.println(ar[i]);
        }
    }

    public static void printSentenceReverse2(String s) {
        String[] ar = s.split(" ");                  //create array of separated words

        StringBuilder[] sb = new StringBuilder[ar.length]; //create StringBuilder array sb with length of array ar

        for (int i=0; i< sb.length; i++){                  //initialize values of sb: the last value of ar
            sb[i] = new StringBuilder(ar[ar.length-1-i]);  //becomes the first value of sb
            System.out.println(sb[i].reverse());           //output reversed value of sb elements
        }
    }

    public static String printSentenceReverse3(String s) {  //method does the same as printSentenceReverse
        String[] ar = s.split(" ");                   //but returns result as a String
        String[] arRev = new String[ar.length];
        for (int i = ar.length - 1; i >= 0; i--) {
            arRev[ar.length - 1 - i] = ar[i];
        }
        return String.join(" ", arRev);
    }

    public static int substringIndex(String s, String sub) {
        int index = -1;

        for (int i = 0; i <= s.length()-sub.length(); i++){ // loop goes from index '0' to index 'length of s minus length of sub'
                                                            //because we need not go out from the string (stay within string)
            String sb = s.substring(i, sub.length()+i);     // extract from s substring with length of sub into sb

            if (sb.equals(sub)) {                       //compare the extracted substring sb with sub
                index = i;
                break;                               //if s contains sub more then one time, the method returns index
            }                                       // of the first substring. Without break the method returns index
        }                                           // of the last substring
        return index;
    }
}

