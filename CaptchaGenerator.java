import java.util.*;
public class CaptchaGenerator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1="",alpha="";
		//Random Captcha Generator
		int num=(int)(Math.random()*10);
		int alpha_num=(int)(Math.random()*10+16);  //random alphabet generation
		char x=(char)(97+alpha_num);
		s1=num+"";
		alpha=x+"";
		String captcha=s1+alpha;
		System.out.println(captcha);
		String input;
		System.out.println("Enter the above captcha ");
		input=sc.next();
			if(captcha.equals(input))
			{
				System.out.println("Successful !! ");
			}
			else 
			{
				System.out.println("Invalid !! ");
			}	
	}
}