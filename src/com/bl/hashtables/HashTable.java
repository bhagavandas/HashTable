package com.bl.hashtables;

public class HashTable {
	

	ListNode table[];

	public HashTable(int size) {
		// TODO Auto-generated constructor stub
		table = new ListNode[size];
	}


	public int hash(String key) {
		return Math.abs(key.hashCode()) % table.length;
	}

	public void insert(String key, int bucket) {
		table[bucket] = new ListNode(key);
	}

	public void put(String key) {
		int bucket = hash(key);

		if (table[bucket] == null) {
			ListNode newNode = new ListNode(key);
			table[bucket] = newNode;			
		}
		else {
			while(!table[bucket].key.equals(key)) {
				System.out.println("\n Searching for an empty or equal position for " + key);
				bucket = ++bucket % table.length;
				if (table[bucket] == null) {
					System.out.println(" Found an empty position at " + bucket);
					table[bucket] = new ListNode(key);
					return;
				}
			}
			
			table[bucket].count++;

		}
	}

	public void display() {
		
		for (ListNode currentNode : table) {
			if(currentNode == null)
				System.out.println(" null");
			else
				System.out.print(currentNode.key + ": " + currentNode.count);
		}
	}

	public void countWords(String str) {
		for( String word : str.split(" ")) {
			System.out.print(" word: " + word);
			put(word.toLowerCase());
		}
		display();
	}

}
