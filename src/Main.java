
public class Main {
    public static void main(String[] args) {

        //1.string

        String myBirthday;


        // 2.const

        final int NUM = 3;


        // 3."word" na String

        String word = " march ";
        //konkatenatsiya
        myBirthday = NUM + word;
        System.out.println("My birthday " + myBirthday);


        if (NUM < 0) {

            System.out.println(" You saved a negative number ");
        } else if (NUM > 0) {
            System.out.println("You saved a positive number ");
        } else {
            System.out.println("You saved 0 ");
        }


    }
}