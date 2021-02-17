//import scanner
import java.util.Scanner;
public class mailMerge {

	public static void main(String[] args) {

//define scanner 
		Scanner in = new Scanner(System.in);
//string initialization(stating them)
		String text1 = "Dear <first name> <last name>,";
		String text2 = "Please confirm that your address is <housenumber> <street>";
		String text3 = "Your answer is <yORn>, Goodbye!"; 
//replacement prompts and print out prompts
		System.out.println("Please enter your first name: ");
		text1 = text1.replace("<first name>", in.nextLine()); 
		System.out.println("Please enter your last name: ");
		text1 = text1.replace("<last name>", in.nextLine());
		System.out.println("Please enter your house number: ");
		text2 = text2.replace("<housenumber>", in.nextLine());
		System.out.println("Please enter your street: "); 
		text2 = text2.replace("<street>", in.nextLine());
		System.out.println(text1);
		System.out.println(text2);
		System.out.println("It this address correct?: "); 
		text3 = text3.replace("<yORn>", in.nextLine());
		System.out.println(text3);
		
		
	}

}
