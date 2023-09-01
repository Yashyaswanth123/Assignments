package com.training.basic;
import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class MaxiumoccuranceofLtters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        char[] letters = word.toCharArray();
        char maxLetter = findMaxOccurrenceLetter(letters);
        
        System.out.println("The most frequent letter is '" + maxLetter + "'.");
    }
    
    public static char findMaxOccurrenceLetter(char[] letters) {
        Map<Character, Integer> letterCount = new HashMap<>();
        
        for (char letter : letters) {
            if (Character.isLetter(letter)) {
                letter = Character.toLowerCase(letter);
                letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);
            }
        }
        
        int maxOccurrence = 0;
        char maxLetter = '\0';
        
        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            if (entry.getValue() > maxOccurrence) {
                maxOccurrence = entry.getValue();
                maxLetter = entry.getKey();
            }
        }
        
        return maxLetter;
    }




		

	}


