package day06_operators;

public class UpdatingVariables {
    public static void main(String[] args) {

        int n = 10;

        // reassign a new value
        n = 20;

        int a = 3;
        a = a + 4;// a + 4 -> 3 + 4 = 7 gets stores as the new value for a

        int b = 15;
        b += 9; // b = b + 9
        b += 1;

        int z = 10;
        z++;
        /*
        updating a number by 1:
              z = 11;
              or
              z = z + 1;
              or
              z += 1;
              or
              z++;
         */

        int java = 8;
        int testing = --java;

        System.out.println(java);
        System.out.println(testing);


    }
}