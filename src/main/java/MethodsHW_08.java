public class MethodsHW_08 {

    public static String insertFrom (String s, int index, String ins){
        StringBuilder sb = new StringBuilder(s);
        sb.insert(index, ins);
        return sb.toString();
    }

    public static void printLastReverse1 (String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        String st = sb.toString();
        printCapitals(st);
    }

    public static void printLastReverse (String s) {
        String[] ar = s.split(" ");
        for (int i= ar.length-1; i>=0; i--){
            System.out.print(ar[i].charAt(ar[i].length()-1));
        }
        System.out.println();
    }


    public static void printCapitals(String s){
        String[] ar = s.split(" ");
        for (String st : ar) {
            System.out.print(st.charAt(0));
        }
        System.out.println();
    }
}
