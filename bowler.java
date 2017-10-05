
/**
 * Write a description of class bowler here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class bowler
{
    
    private String name;
    private int score1, score2, score3, age;
    private double averageScore;
    
    
    public bowler()
    {
        name = null;
        score1 = score2 = score3 = 0;
    
    
    }
    
    public bowler(String n, int n1, int n2, int n3 )
    {
        name = n;
        if ( n1 >= 0 && n1 <= 300)
        {
            score1 = n1;
        }
        else
        {
            System.out.println("You entered 1st number is invalid");
            
        }
        if ( n2 >= 0 && n2 <= 300)
        {
            score2 = n2;
        }
        else
        {
            System.out.println("You entered 2nd number is invalid");
        
        }
        if (n3 >= 0 && n3 <= 300)
        {
            score3 = n3;
        }
        else
        {
            System.out.println("You entered 3rd number is invalid ");
        
        }
    
    }

    public double calcAverage()
    {
        averageScore = (score1 + score2 + score3 ) / 3.0;
        return averageScore;
    
    
    }
    
    public String getName()
    {
        return name;
    
    }
    
    public void setScoreOne(int n1)
    {
        score1 = n1;
    }
    
    public void setScoretwo(int n2)
    {
        score2 = n2;
    }
    
    public void setScoreThird(int n3)
    {
        score3 = n3;
    }
    
    public int getScoreOne()
    {
        return score1;
    
    }
    
    public int getScoretwo()
    {
        return score2;
     
    }
    public int getScorethird()
    {
        return score3;
    
    }
    
    public String toString()
    {
        return "Your name " + name + "\nFirst Score is " + score1
        + "\nSecond score is " + score2 + "\nThird score is " + score3
        + "\nAverage your Score is " + calcAverage();
    }
}
