import java.util.Arrays;

public class MethodsHomework2605 {
    public static void printCapitals(String s){
        s = s.strip();
        String[] ar = s.split(" ");

        for (int i = 0; i< ar.length; i++){

            if (ar[i].startsWith(String.valueOf(Character.toUpperCase(ar[i].charAt(0)))))
                System.out.print(ar[i].charAt(0));

//            if (ar[i].startsWith(Character.toString(ar[i].charAt(0)).toUpperCase()))  //Character.toString
//                System.out.print(ar[i].charAt(0));                                   //Convert char to String
        }                                                                             //because method to UpperCase can be
        System.out.println();                                                         //used only with Strings
    }


    public static void printLastReverse (String s) {
        s = s.strip();
        String[] ar = s.split(" ");
        for(int i = ar.length-1; i>=0; i--){
            StringBuilder sb = new StringBuilder(ar[i]);
            System.out.print(sb.reverse().charAt(0));
        }
        System.out.println();
    }

    /*
    3.
    public static void printLastReverse (String s) {
    }

    s-> "Hello Course QA 84"

    output -> "4Aeo";
     */


    public static String insertFrom (String s, int index, String ins){
        String sub1 = s.substring(0,index);
        String sub2 = s.substring(index);

        return String.join("", sub1, ins, sub2);
    }

    /*
    4. public static String insertFrom (string S, int index, String ins){
        }

    s-> "Hello world"

    ins-> "my "
    index -> 6

    result -> "Hello my world"
       */

/*
    public static void indexLonestSubstring(String s) {
        int count = 1, count1 = 0, index = 0;

        for (int i=0; i < s.length()-1; i++){
            index = i;
            if(s.charAt(i) != s.charAt(i+1))
                break;
                else count++;
            count1 = count;  //find length of the first repeated part
        }
        index = count1;
        count = 0;

        while (index<s.length()-1){
            for (int i = index; i< s.length()-1; i++){
                if(s.charAt(i) != s.charAt(i+1)){
                    index = i+1;
                    break;}
                else count++;
            }
            if (count > count1) {
            count1 = count;}
            index = count1-1;

        }

        System.out.println(count1);
    }

 */

}
