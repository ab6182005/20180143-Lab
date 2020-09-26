public class ConcatTester {
	public static void main (String[] args) {
		String animal1 = "quick brown fox";
		String animal2 = "lazy dog";
		String article = "the";
		String action = "jumps over";
		
		System.out.println(article.concat(" quick brown fox").concat(" jumps over").concat(" the").concat(" lazy dog"));
	}
}
