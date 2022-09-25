package experiment;

import java.util.Scanner;

/**
 * Various Console Utilities.
 */
class ConsoleUtils
{

    public static int promptForInt(String prompt)
    {
        Scanner input = new Scanner(System.in);

        System.out.print(prompt);

        while (!input.hasNextInt())
        {
            input.next();
            System.out.print(prompt);
        }

        return input.nextInt();
    }

    public static float promptForFloat(String prompt)
    {
        Scanner input = new Scanner(System.in);

        System.out.print(prompt);

        while (!input.hasNextFloat())
        {
            input.next();
            System.out.print(prompt);
        }

        return input.nextFloat();
    }
}
