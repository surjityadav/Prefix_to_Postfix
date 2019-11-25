
import java.util.*;


public class Prefix_to_Postfix 
{
    static boolean isCharacter(char c)
    {
        return ((c >= 'a' && c <= 'z') || (c >='A' && c <='Z') || (c >= '0' && c <= '9'));
    }
    public static String postFix(String preFix)
    {
        Stack<String> s=new Stack<String>();
        String res1=new String("");
        int n=preFix.length();
        for(int i=n-1;i>=0;i--)
        {
            char c=preFix.charAt(i);
            if(isCharacter(c))
            {
                s.push(c+"");
            }
            else
            {
                String a=s.pop();
                String b=s.pop();
                res1=a+b+c;
                s.push(res1);
            }
        }
        return res1; 
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Prefix String:");
        String str=sc.next();
        System.out.println("String is convert into Postfix :");
        postFix(str);
        
    }
}
