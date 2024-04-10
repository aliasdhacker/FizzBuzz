/**
 * Print from 1 to 100.
 * <p>
 * If you hit a 3, print FIZZ.
 * <p>
 * If you hit a 5, print BUZZ.
 * <p>
 * Numbers that are multiple of both 3 & 5, print FIZZ BUZZ
 */
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Hello FIZZBUZZ! v0000000.000000001z");
        System.out.println("----github.com/aliasdhacker/fizzbuzz");

        for (int index = 1; index < 101; index++) {
            if (index % 3 == 0) {
                System.out.print(String.valueOf("FIZZ"));
            }
            if (index % 5 == 0) {
                System.out.print(String.valueOf("BUZZ"));
            }

            if (index % 5 != 0 && index % 3 != 0)
                System.out.print( String.valueOf(index));
        }

    }
}