public class MainStringMethodsLesson10 {
    public static void main(String[] args) {
        String s = "hello";   //immutable;

        String s1 = s.toUpperCase();
        System.out.println(s);
        System.out.println(s1);


        System.out.println("replace: " + s.replace("ll","tl"));

        String str = "   hello  world    ";

        System.out.print("trim: " + str.trim());
        System.out.println("1");

        String s2 = str.replace("ll","tl");

        System.out.println("substring1: " + s2.substring(6));
        System.out.println("substring2: " + "abcdef".substring(1,4));

        //s1.substring(6);

        String s3 = "Hello course QA";

        String ar[] = s3.split(" ");
        for (String st: ar) {
            System.out.println(st);
        }

        String s4 = "hello world";
        char[] ar1 = s4.toCharArray();
        for (char sym: ar1){
            System.out.print(sym + " ");
        }
        System.out.println();

        System.out.println("equalsIgnoreCase: " + "BYE".equalsIgnoreCase("by"));
        System.out.println("equals: " + "bye".equals("bye"));

    }
}
