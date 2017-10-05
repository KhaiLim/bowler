
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Driver
{
    public static void main (String[] args)
    {
    String fullName;
    int score1, score2, score3;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("What is your name : " );
    fullName = keyboard.next();
    System.out.println("Enter 1st bowling score: ");
    score1 = keyboard.nextInt();
    System.out.println("Enter 2nd bowling score: ");
    score2 = keyboard.nextInt();
    System.out.println("Enter 3rd bowling score: ");
    score3 = keyboard.nextInt();
    
    bowler player1 = new bowler(fullName,score1,score2,score3);
    System.out.println(player1.toString());
    
    System.out.println("What is your name : " );
    fullName = keyboard.next();
    System.out.println("Enter 1st bowling score: ");
    score1 = keyboard.nextInt();
    System.out.println("Enter 2nd bowling score: ");
    score2 = keyboard.nextInt();
    System.out.println("Enter 3rd bowling score: ");
    score3 = keyboard.nextInt();
    
    bowler player2 = new bowler(fullName,score1,score2,score3);
    System.out.println(player2.toString());
    }
}
