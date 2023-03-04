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
        for(int count = usersNumber; count < 200; count++)
        {
            System.out.println("Number: " + (count + 1) + " is next");
            //Thread.sleep(150);
        }
        for(int count = 1; count <= usersNumber; count++)
        {
            System.out.println("Number: " + count + " is next");
            //Thread.sleep(150);
        }
        
        //No PaperWork Message
        SecureRandom miracleNumber = new SecureRandom();
        int miracle = 1 + miracleNumber.nextInt(100);
        System.out.println(miracle);
        
        switch (miracle) 
        {
            case 1:
                System.out.println("YO!" + usersNumber + "... \n You don't have the required paperwork!!! You stupid or something!!??! Come back with ALL of the REQUIRED paperwork... \n Now get out of my line");
                break;
        
            default:
                break;
        }
    }
}
