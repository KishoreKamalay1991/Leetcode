package Thingstocheck;

public class CharacterCheck {

    public static void main(String[] args) {

        // Convert character to string
        char c = 'a';
        String s = Character.toString(c);

        // Convert character to Ascii digit
        char cx = 'a';
        System.out.println((int)cx);

        // Convert integer to respective char
        int i = 99;
        System.out.println((char)i);

       // Convert characxter array to String
        char[] carArray = {'a', 'b', 'c'};
        String res = new String(carArray);
        System.out.println(res);




    }
}
