import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
public class AgeCalculation {

	public static void main(String[] args ) {
				   
	        LocalDate now= LocalDate.now();

	        String  pop = JOptionPane.showInputDialog("Enter your Birthdate (MM/DD/YYYY)");
	        int birthMonth =Integer.parseInt(pop.substring(0,2));
	        int dayofBirth= Integer.parseInt(pop.substring(3,5));
	        int yearofbirth=Integer.parseInt(pop.substring(6));
	        System.out.println("year " + yearofbirth + " day " + dayofBirth + "month " + birthMonth);

	        DateTimeFormatter dTf= DateTimeFormatter.ofPattern("MM/DD/YYYY");
	        String formatted = now.format(dTf); 
	        System.out.println("todays date is: " + formatted); 

	        int yearNow= Integer.parseInt(formatted.substring(6));
	        int dayNow = Integer.parseInt(formatted.substring(3,5));
	        int monthNow=Integer.parseInt(formatted.substring(0,2));
	        System.out.println("year " + yearNow + " day " + dayNow + "month " + monthNow); 

	        int ageofYears= yearNow-yearofbirth;
	        int agebyMonth= monthNow-birthMonth;
	        int AgeofDays=dayNow-dayofBirth;
	        if(monthNow<birthMonth) {
	        	
	        	agebyMonth=agebyMonth+12;
	        	--ageofYears;
	        	
	        }
	        
	        
	        
	        System.out.println("year " + ageofYears + " day " + AgeofDays + "month " + agebyMonth); 

	 JOptionPane.showMessageDialog(null, "Your are: "+ageofYears+ " years " + agebyMonth + " Months "
	               + " and "+ AgeofDays+ " days old");


	    }

	    }