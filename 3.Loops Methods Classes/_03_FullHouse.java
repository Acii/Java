package _03_LoopsMethodsClasses;

public class _03_FullHouse {

	public static void main(String[] args) {
		String[] str = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		long count = 0;
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				for (int j2 = 0; j2 < str.length; j2++) {
					for (int k = 0; k < str.length; k++) {
						for (int k2 = 0; k2 < str.length; k2++) {
							if((str[i] == str[j]) && (str[j] == str[j2])!= (str[k] == str[k2])&& str[k] != str[i]) {
								count++;
							}
						}	
					}
				}
			}
		}
		System.out.println(count);
}
}
