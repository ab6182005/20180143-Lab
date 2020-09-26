class LowerCaseTester {
	public static void main(String[] args) {
		
		String greeting = "Hello, World!";
		int n = greeting.length();
		String bigGreeting = greeting.toUpperCase();
		
		String testString = "This is a Test";
		String smallTestString = testString.toLowerCase();
		
		String bigTestString = smallTestString.toUpperCase();
		System.out.println(bigTestString);
		
	}
}

