import java.util.Scanner;

public class SafeInput
{
    /**
     * Use scanner to get an int from the console with no constraints
     *
     * @param pipe Scanner to ue fir cinsile input
     * @param prompt String prompt to tell the user what to input
     * @return an Int value
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            //prompt num [1-10]
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println(trash + " Is not a valid number");
            }

        }
        while(!done);

        return retVal;
    }

//======================================================================================================================
    /**
     * Get an integer value within a specified range of low-high
     *
     * @param pipe   Scanner to use for console input
     * @param prompt String that tells user what to input
     * @return an int value within the low - high range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            //prompt num [1-10]
            System.out.print("\n" + prompt);
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You entered \"" + retVal + "\"");
                    System.out.println("Enter a valid integer [" + low + "-" + high + "]");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a valid integer not \"" + trash + "\"");
            }


        }
        while(!done);

        return retVal;
    }
//======================================================================================================================
    /**
     * Use scanner to get a double from the console with no constraints
     *
     * @param pipe Scanner to ue fir cinsile input
     * @param prompt String prompt to tell the user what to input
     * @return a double value
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            //prompt num [1-10]
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println(trash + "You must enter a double not: " + trash);
            }

        }
        while(!done);

        return retVal;
    }
//======================================================================================================================
    /**
     * Get a double value within a specified range of low-high
     *
     * @param pipe Scanner to use for console input
     * @param prompt String that tells user what to input
     * @param low low value for the range [low to high]
     * @param high high value if the range
     * @return a double value within the low - high range
     */
    public static int getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            //prompt num [1-10]
            System.out.print("\n" + prompt);
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You entered \"" + retVal + "\"");
                    System.out.println("Enter a valid double [" + low + "-" + high + "]");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a valid double not \"" + trash + "\"");
            }

        }
        while(!done);

        return (int) retVal;
    }
//======================================================================================================================
    /**
     * get an arbitrary String of at least one character in length
     *
     * @param pipe Scanner to use for input
     * @param prompt Prompt msg for use about what to input
     * @return a String entered with at least 1 character
     */
    public static String getNonZeroLength(Scanner pipe, String prompt)
    {

        String retVal = "";
        boolean done = false;

        do
        {
            //prompt num [1-10]
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();
            if(retVal.length() > 0) // if the string has at least 1 character in it
            {
                done = true;
            }
            else
            {
                System.out.println("You must enter at least 1 character: ");
            }

        }
        while(!done);

        return retVal;

    }
    //======================================================================================================================

    /**
     * gets a string that matches a Regular Expression pattern like ###-##-#### \d{3}-\d{2}-|d{4}
     *
     * @param pipe Scanner to use for input
     * @param prompt String prompt to tell user what to input
     * @param pattern a regEx Pattern to use for the test
     * @return a String that matches the RegEx pattern
     */
    public static String getRegExString(Scanner pipe, String prompt, String pattern) {

        String retVal = "";
        boolean done = false;

        do {
            System.out.print(prompt + " " + pattern + ": ");
            retVal = pipe.nextLine();

            if (retVal.matches(pattern)) {
                done = true;
            } else {
                System.out.println("Enter a matching pattern not: " + retVal);
            }
            }while (!done) ;

            return retVal;

        }


//======================================================================================================================

    /**
     * get a y or an n and return true or false
     *
     * @param pipe scanner to use to get inpput
     * @param prompt String prompt
     * @return
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String respYN;
        boolean retVal = false;
        boolean done = false;
        do
        {
            System.out.print(prompt + "[Y/N]: ");
            respYN = pipe.nextLine();

            if(respYN.equalsIgnoreCase("Y"))
            {
                retVal = true;
                done = true;
            }
            else if(respYN.equalsIgnoreCase("N"))
            {
                retVal = false;
                done = true;
            }
            else
            {
                System.out.print("You must enter [Y/N]: ");
            }
        }
        while(!done);

        return retVal;

    }

//--------------------------------------------------------------------------------------------------------------------
    public static void prettyHeader(String msg)
    {
        int whiteSpace = (53 - msg.length()) / 2;

        for (int x = 0; x <= 59; x++)
        {
            System.out.print("*");
        }
        System.out.print("\n***");

        for (int x = 0; x <= whiteSpace; x++)
        {
            System.out.print(" ");
        }

        System.out.print(msg);

        for (int x = 0; x <= whiteSpace; x++)
        {
            System.out.print(" ");
        }

        System.out.println("***");

        for (int x = 0; x <= 59; x++)
        {
            System.out.print("*");
        }
    }

}