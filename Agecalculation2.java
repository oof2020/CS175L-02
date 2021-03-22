import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.util.Calendar;
public class Agecalculation2 {

	private static int yearinBirth;

	public static void main(String[] args) {

String bdayStr = JOptionPane.showInputDialog("Enter your birthday (MM/DD/YYYY):");
String getYear = bdayStr.substring(6);
String getDay = bdayStr.substring(3,5);
String getMon = bdayStr.substring(0,2);
Object JOptionPane;
JOptionPane(null, "Year:" + getYear+ " Month:" + getMon+" Day: " + getDay);
int yearintBirth = Integer.parseInt(getYear);
int dayinBirth = Integer.parseInt(getDay);
int moninBirth = Integer.parseInt(getMon);
//do the same for the other two

String todayStr = javax.swing.JOptionPane.showInputDialog("Enter todays date (MM/DD/YYYY):");
String todaysYear = todayStr.substring(6);
String todaysDay = todayStr.substring(3,5);
String todaysMon = todayStr.substring(0,2);
JOptionPane(null, "Year:" + todaysYear+ "Month:" + todaysMon+ "Day:" + todaysDay);
int todayYear = Integer.parseInt(todaysYear);
int todayDay = Integer.parseInt(todaysDay);
int todayMonth = Integer.parseInt(todaysMon);

int yearinage = Math.subtractExact(todayYear, yearintBirth);
int yearinmon = Math.subtractExact(todayMonth, moninBirth);
int yearinday = Math.subtractExact(todayDay, dayinBirth);
//JOptionPane(null, "You are:" + yearinage + "years and:" + yearinmon + "months old" );

}

	private static void JOptionPane(Object object, String string) {
		
	}

}
