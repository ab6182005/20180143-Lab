import java.util.*;

// An exploration of basic input and output.
class BasicIO {
	// Reads and processes string input.
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		// get first input
		System.out.print("Enter your name: ");
		String name = stdin.nextLine();
		
		// display output on console
		System.out.println("your name is " + name);
		
		//나이
		System.out.print("Enter yout age: ");
		String years = stdin.nextLine(); 
		System.out.println("your age is " + years);
		System.out.println("years * 365= " + 19*365);
		
		//키
		System.out.print("Enter your height: ");
		String height = stdin.nextLine();
		
		//오늘 날짜
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf(year + "년 " + month + "월 " + day + "일 현재 " 
		+ name + "(" + years + ")" + "의 키는 " + height + "cm 입니다.");
		
	} // method main
} // class BASIC_IO