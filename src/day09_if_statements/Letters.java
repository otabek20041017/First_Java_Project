package day09_if_statements;

public class Letters {

    public static void main(String[] args) {

        char letter =  'Z';

        if (letter >= 'A' && letter <= 'Z'){
            System.out.println(letter + " is an uppercase letter");

        }
        /*
        if (letter .= 'A' && letter <= 90){
            System.out.println(letter + " is an uppercase letter");
        }
         */

        if (letter >= 'a' && letter <= 'z') {
            System.out.println(letter + " is an lowercase letter");
        }

    }
}
