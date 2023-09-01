package Student;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String[] usernames= {"Yaswanth","Gopi","Kumar"};
		
		Scanner sc=new Scanner(System.in);
		
		String inputname=sc.next();
		
		boolean result=false;
		
		for(String username:usernames)
		{
			if(username.equals(inputname)) {
				result=true;
				break;
			}
		}
		
		if(result) {
			System.out.println("You are logged in");
		}
		else
		{
			System.out.println("Invalid username");
		}

	}
}
