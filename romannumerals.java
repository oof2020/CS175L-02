import java.util.Scanner;

public class romannumerals {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int N;
   do { System.out.print("Introduce a number between 1 and 3999: ");
    while (N < 1 || N > 3999);
   System.out.println(N + "In romaon numerals ->" + convertToRomanNumerals(N));
   }
  } 
  
   //method to move roman numerals
   public static String convertToRomanNumerals(int number) {
	   int i, thousands, hundreds, tens, singles;
	   String roman = "";
	  
	//obtain the figure of each number 
	  thousands = number / 1000;
	  hundreds = number / 100 % 10;
	  tens = number / 10 % 10;
	  singles = number % 10;
	  
	//thousands
	  for (i = 1; i <= thousands; i++) {
		  roman = roman + "M";
	  }
	//hundreds
	  if (hundreds == 9) {
		  roman = roman + "CM";
	  } 
	  else if (hundreds >= 5) {
		  roman = roman + "D";
		  for (i = 6; i<= hundreds; i++) {
			  roman = roman + "C";
		  }
	//tens
	if (tens == 9) {
		roman = roman + "XC";
	}
	else if (tens >= 5) {
		roman = roman + "L";
				for (i = 6; i <= tens; i++) {
					roman = roman + "X";
				}
	}
   }
   
	//singles
	if (singles == 9) {
		roman = roman + "IX";
	}
	else if (singles >= 5) {
		roman = roman + "V";
		for (i = 6; i <= singles; i++) {
			roman = roman + "I";
		}
	}
		else if (singles == 4) {
			roman = roman + "IV";
		}
		else {
			for (i = 1; i <= singles; i++) {
				roman = roman + "I";
			}
		}
		return roman;
   }
}