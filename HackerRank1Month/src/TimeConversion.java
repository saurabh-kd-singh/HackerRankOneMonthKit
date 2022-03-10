import java.util.Scanner;
public class TimeConversion {

	public static void main(String[] args) {
		TimeConversion tc = new TimeConversion();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Time Format : hh:mm:ssAM  OR  hh:mm:ssPM ");
		System.out.print("Enter the Time : ");
		
		String s = sc.nextLine();
		
		tc.timeConversion(s);

	}
	
	public void timeConversion(String s) {
		
		String str = "" ;
        
        if(s.substring(0, 2).equals("12") && s.contains("AM")){
            str ="00";
            s = str + s.substring(2, s.length());
        }
        
        if(!s.substring(0, 2).equals("12") && s.contains("PM")){
            str = Integer.toString(Integer.parseInt(s.substring(0, 2))+12);
            s = str + s.substring(2, s.length());
        }
        
        System.out.println(s.substring(0, s.length()-2));
		
	}

}
