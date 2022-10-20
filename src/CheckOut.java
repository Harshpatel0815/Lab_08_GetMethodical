

import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double totalPrice = 0;
        boolean done = false;

        do
        {
            itemPrice = SafeInput.getRangedDouble(in, "Enter price of item [0.50-9.99]: ", 0.50, 9.99);
            totalPrice = totalPrice + itemPrice;
            done = SafeInput.getYNConfirm(in, "Do you have another item? ");
        }while(done);

        System.out.print("Your total is: ");
        System.out.printf("%.2f", totalPrice);
        System.out.print("$ ");
    }
}