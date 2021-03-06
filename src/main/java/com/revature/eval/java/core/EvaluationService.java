package com.revature.eval.java.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Arrays;  

public class EvaluationService {

	/**
	 * 1. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {
		char character;
		String result = "";
		for(int i = 0; i < phrase.length(); i++) {
			character = phrase.charAt(i);
			if(i == 0) {
				result = result + Character.toUpperCase(phrase.charAt(i));
			}
			if(character == ' ' ||character == '-') {
				result = result + Character.toUpperCase(phrase.charAt(i+1));
			}
		}
		
		
		return result;
	}
	/**
	 * 2. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) {
		char character;
		
		int score = 0;
		
		for(int i =0; i < string.length(); i++ ) {
			character = Character.toLowerCase(string.charAt(i));
			switch(character) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'l':
				case 'n':
				case 'r':
				case 's':
				case 't':
					score += 1;
					break;
				case 'd':
				case 'g':
					score += 2;
					break;
				case 'b':
				case 'c':
				case 'm':
				case 'p':
					score += 3;
					break;
				case 'f':
				case 'h':
				case 'v':
				case 'w':
				case 'y':
					score += 4;
					break;
				case 'k':
					score += 5;
					break;
				case 'j':
				case 'x':
					score += 8;
					break;
				case 'q':
				case 'z':
					score += 10;
					break;
				
			}
			
		}
		// TODO Write an implementation for this method declaration
		
		
		
		return score;
	}

	/**
	 * 3. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) {
		// TODO Write an implementation for this method declaration
		String phone_number = "";
		int starting_number = 0;
		if(string.charAt(0) == '1') { 
			starting_number = starting_number + 1;
		if(string.charAt(0) == '+') {
			starting_number = starting_number + 2;
		}
		}
		
		for(int i = starting_number; i < string.length(); i ++) {
			phone_number += string.charAt(i);
		}
		if(phone_number.length() >= 11) {
			throw new IllegalArgumentException();
		}
		
		return phone_number;
	}

	/**
	 * 4. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	public Map<String, Integer> wordCount(String string) {
		// TODO Write an implementation for this method declaration
		String[] 
		//while(string.length()>0) {
		int n = string.indexOf(' ');	
		String previousWord = string.substring(0, n-1);
		string = string.substring(n+1);
		String s1 ="";
		
		if(!(previousWord.equals(s1))) {
			
		}
		
		//}
		
		return null;
	}

	/**
	 * 5. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
		private List<T> sortedList;

		public int indexOf(T t) {
			// TODO Write an implementation for this method declaration
			int low = 0;
			int high = sortedList.size() - 1;
			int index = sortedList.size() -1;
			
			while (low <= high) {
				
				int mid = (low + high)/2;
				
				if (t.equals(sortedList.get(mid))) {
					index = sortedList.indexOf(t);
					break;
				}
				else if (mid > sortedList.indexOf(t)) {
					high = mid - 1;
				}
				else {
					low = mid + 1;
				}
				
			}
			return index;
		}

		public BinarySearch(List<T> sortedList) {
			super();
			this.sortedList = sortedList;
		}

		public List<T> getSortedList() {
			return sortedList;
		}

		public void setSortedList(List<T> sortedList) {
			this.sortedList = sortedList;
		}

	}

	/**
	 * 6. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */ 
	//boolean
	public boolean isArmstrongNumber(int input) {
		// TODO Write an implementation for this method declaration
		String result = Integer.toString(input);
		int original = input;
		int sum = 0;
		
		for(int i = 1; i <= result.length(); i ++) {
			int lastDigit = input%10;
			sum = (int) (sum + Math.pow(lastDigit, result.length()));
			input = (input - lastDigit)/10;
		 }
		if (sum == original) return true;
		else return false;
			
	}

	/**
	 * 7. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	public List<Long> calculatePrimeFactorsOf(long l) {
		// TODO Write an implementation for this method declaration
		List<Long> myList = new ArrayList<>();
		for( int i = 2; i <= l; i++) {
			while(l % i == 0) {
				myList.add((long)i);
				l = l/i;
			}
			
		}
			
		
		return myList;
	}


	/**
	 * 8-9. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	static class AtbashCipher {

		/**
		 * Question 8
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {
			
			
			// TODO Write an implementation for this method declaration
			return null;
		}

		/**
		 * Question 9
		 * 
		 * @param string
		 * @return
		 */
		public static String decode(String string) {
			// TODO Write an implementation for this method declaration
			return null;
		}
	}

	/**
	 * 10. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	public int solveWordProblem(String string) {
		// TODO Write an implementation for this method declaration
		string = string.substring(8, (string.indexOf('?')));	
		String[] arr = string.split(" ");
		List<String> myList = Arrays.asList(arr); 

		int answer = 0;		

		if(myList.get(1).equals("minus")) {
			answer = (Integer.parseInt(myList.get(0)) - Integer.parseInt(myList.get(2)));
		}
		else if(myList.get(1).equals("plus")) {
			answer = (Integer.parseInt(myList.get(0)) + Integer.parseInt(myList.get(2)));
		}
		else if(myList.get(1).equals("multiplied")) {
			answer = Integer.parseInt(myList.get(0)) * Integer.parseInt(myList.get(3));
		}
		else answer = Integer.parseInt(myList.get(0)) / Integer.parseInt(myList.get(3));
		return answer;

	}

}
