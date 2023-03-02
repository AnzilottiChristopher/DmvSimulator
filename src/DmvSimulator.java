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
        for(int count = usersNumber; count < 100; count++)
        {
            System.out.println("Number: " + (count + 1) + " is next");
        }
    }
}
