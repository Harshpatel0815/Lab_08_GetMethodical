import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String SSN = "";
        String mNumber = "";
        String menuChoice = "";

        SSN = SafeInput.getRegExString(in, "Enter SSN: ", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is " + SSN);

        mNumber = SafeInput.getRegExString(in, "Enter your M#: ", "(M|m)\\d{5}");
        System.out.println("Your M# is " + mNumber);

        menuChoice = SafeInput.getRegExString(in, "Open, Save, View, or Quit?: ", "[OoSsVvQq]");
        switch (menuChoice)
        {
            case "o": case "O":
            System.out.println("Open");
            break;
            case "s": case "S":
            System.out.println("Save");
            break;
            case "v": case "V":
            System.out.println("View");
            break;
            case "q": case "Q":
            System.out.println("Quit");
            break;
        }
    }
}