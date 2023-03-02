import java.security.SecureRandom;
public class DmvSimulator 
{
    public static void main(String[] args) throws Exception 
    {
        //Welcom Message
        System.out.println("Welcome to the DMV! We will assign you a random number");
        System.out.println("Please wait until your number is called");
        
        //User's number
        SecureRandom randomNumber = new SecureRandom();
        int usersNumber = 1 + randomNumber.nextInt(100);
        System.out.println("Your Number is: " + usersNumber);
        Thread.sleep(1000);

        //Printing the numbers until we get to the user's
        for(int count = usersNumber; count < 100; count++)
        {
            System.out.println("Number: " + (count + 1) + " is next");
            Thread.sleep(150);
        }
        for(int count = 1; count <= usersNumber; count++)
        {
            System.out.println("Number: " + count + " is next");
            Thread.sleep(150);
        }
        
        //No PaperWork Message
        System.out.println("I'm sorry number " + usersNumber + " you do not have the required paperwork please come back with the paperwork!");
    }
}
