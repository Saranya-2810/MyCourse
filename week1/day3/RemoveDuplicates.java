package week1.day3;

public class RemoveDuplicates {
	public static void  remDup(String str) {
		int count = 0;
		String [] words = str.split(" ");
		for(int i = 0; i < words.length; i ++) {
			for(int j = 0; j < words.length; j++) {
				if(words[i].equals(words[j])) {
					count++;
				}
			}
			if(count > 1) {
				words[i] = "";
			}
			count = 0;
		}
		System.out.println(String.join(" ",words));
	}
	public static void main(String[] args) {
		String str = "We learn java basics as part of java sessions in java week1";
		remDup(str);
		

	}
}
