package day20_loops;

public class CountHi {
    public static void main(String[] args) {

        // counting how many times hi is in the String
        String s = "abhicdhelhilofrhiidayhi";

        // approach 1: while loop and delete the first occurrence each time
        int count = 0;

        while (s.contains("hi")){
            System.out.println(s);
            count++;
            s = s.replaceFirst("hi", "");  // replaces the first occurrence
        }
        System.out.println(count);

        // approach 2: for loop to check one index at a time, but when there is an h we will check another index

        String s2 = "abhicdhelhilofrhiidayhi";
        int count2 = 0;

        for (int i = 0; i < s2.length(); i++) {

            if (s2.charAt(i) == 'h' && s2.charAt(i + 1) == 'i') {
                count2++;
            }



        }
        System.out.println(count2);

        // approach3 using indexes to check every 2 characters

        String s3 = "abhicdhelhilofrhiidayhih";
        int count3 = 0;

        for (int i = 0; i < s3.length() - 1; i++) {

            if (s3.substring(i, i + 2).equals("hi")) {
                count3++;
            }

            System.out.println(count3);

            /*
                a b 0 1 --> sub(0, 2)
                b h 1 2 --> sub(1, 3)
                h i 2 3 --> sub(2, 4)



             */

        }

    }
}

/*
these check the same value

    if(s3.substring(i, i + 2).equals("hi")
 */






































































































































































































































































































