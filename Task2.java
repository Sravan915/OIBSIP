import java.util.*;
public class Task2
{
   public static void main(String args[])
    {
        Random r=new Random();
        int R = r.nextInt(100);
        int K=10 , score=100;
        System.out.println("A number is generated randomly between 1 to 100.\n");
        int i;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < K; i++)
        {
            System.out.println("Guess the number:");
            int guess = sc.nextInt();
            if (R == guess)
            {
                System.out.println("Congratulations! You guessed the generated number.");
                System.out.println("Your guessing score is "+score+"%");
                break;
            }
            else if (guess<R)
            {
                score=score-10;
                System.out.println("Your number is less than generated number. Try again!");
            }
            else if (guess>R)
            {
                score=score-10;
                System.out.println("The number is greater than generated number. Try again!");
            }
        }
        if (i == K)
        {
            System.out.println("You have exhausted K trials.");
            System.out.println("The number was " + R);
        }
    }
}