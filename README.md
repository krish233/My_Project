# My_Project
import java.util.*;
class NameException extends Exception
{
       NameException(String s)
       {
	super(s);
             // System.out.println("blank name");
       }
}
class Userexp2
{
       static void valid(String name)throws NameException
          {
                           if(name.length()<8||name.length()>15)
                           {
	          throw new NameException("Invalid");
                                    
                           }
                           else
                           {
                                 System.out.println("valid");    
                           }
            }
           public static void main(String args[])
           {
	Scanner s= new Scanner(System.in);
	String name = s.next();
                    Userexp2 obj = new Userexp2();
	try
	{
	obj.valid(name);
	}
                   catch(NameException z)
                    {
                              System.out.println(z);
                    }
                    finally
                    {
                              System.out.println("Thank you");
                    }
           }
}
