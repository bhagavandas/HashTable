package com.bl.hashtables;

public class HashTableMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome to HashTable Program!");
		
			String str = "To be or not to be";

			HashTable hash = new HashTable(6);
			hash.countWords(str);

		

	}

}
