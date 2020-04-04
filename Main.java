import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc;
        String s = "I love you so much.I want to marry you.";
        sc = new Scanner(s);
        //traversing all the tokens in the String
        while(sc.hasNext())             //hasNext method check if there is any more token in the list and returns true if there is more token otherwise false if there is no more token left and reached the last token
        {
            String token = sc.next();   //next() reads and returns tokens
            System.out.println(token);

        }
    }

}
