import java.util.Scanner;
public class housepainting {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//variables 
int length = 0;
int width = 0;
int height = 0; 
double totalsides = 0; 
double sqfttotal = 0; 
int costpersqft = 0; 
double costtopaint = 0; 
int windows = 0; 
int windowslen = 0;
int windowswid= 0; 
int windowsqft = 0; 
int doors = 0;
int doorlen = 0;
int doorwid = 0;
System.out.println("Please enter the cost per sqft: ");
costpersqft = in.nextInt();
System.out.println("Please enter the length of the house: ");
length = in.nextInt();
System.out.println("Please enter the width of the house: ");
width = in.nextInt(); 
int normalsqft = (length * width)*2; 
System.out.println("Please enter the height of the house: ");
height = in.nextInt(); 
double peaksqft = ((length * width) + .5*(length * (height-width)))*2; 
totalsides = peaksqft + normalsqft; 
System.out.println("Please enter the number of windows: ");
windows = in.nextInt(); 
System.out.println("Please enter the length of a window: ");
windowslen = in.nextInt(); 
System.out.println("Please enter the width of a window: ");
windowswid = in.nextInt(); 
int sqftwindows = (windowslen * windowswid) * windows; 
System.out.println("please enter the number of doors: ");
doors = in.nextInt();
System.out.println("Please enter the length of a door: ");
doorlen = in.nextInt();
System.out.println("Please enter the width of a door: ");
doorwid = in.nextInt();
int sqftdoors = (doorlen * doorwid) * doors; 
sqfttotal = totalsides - (sqftwindows + sqftdoors); 
costtopaint = sqfttotal * costpersqft; 
System.out.println("The total sqft to paint is: " + sqfttotal); 
System.out.println("The costtopaint is: " + costtopaint); 


		

	}

}
