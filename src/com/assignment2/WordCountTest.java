package com.assignment2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCountTest {
	public static void main(String[] args) {
		WordCounting wc = new WordCounting();
		String sentence, word;
		StringTokenizer parser;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		sentence = input.nextLine();
		parser = new StringTokenizer(sentence);
		
		while (parser.hasMoreTokens()) {
			word = parser.nextToken();
			wc.worcCount(word);
		}
		
		wc.printList();
		
	}
}
