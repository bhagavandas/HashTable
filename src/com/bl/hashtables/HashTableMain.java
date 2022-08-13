package com.bl.hashtables;

public class HashTableMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome to HashTable Program!");
		
			//String str = "To be or not to be";
			
			String str1 = "Paranoids are not paranoid because "
					+ "they are paranoid but because they keep "
					+ "putting themselves deliberately into paranoid "
					+ "avoidable situations";
			

			HashTable hash = new HashTable();
			//hash.countWords(str);
			hash.countWords(str1);
			hash.remove("avoidable");

	

	}

}
