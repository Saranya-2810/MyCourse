package week1.day3;

public class ReverseEvenWords {
	public static void revEven(String str) {
		String[] words = str.split(" ");
		for(int i = 0; i < words.length;i++) {
			if(i % 2 !=0) {
				char[] characters = words[i].toCharArray();
				for(int j = characters.length-1; j >=0;j--) {
					System.out.print(characters[j] + " ");
				}
			}
			else {
				System.out.print(words[i] + " ");
			}
		}
	}
	public static void main(String[] args) {
		String str = "I am a software tester";
		revEven(str);

	}
}
