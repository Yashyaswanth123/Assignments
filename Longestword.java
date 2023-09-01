package com.training.basic;

import java.util.Scanner;

public class Longestword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        String longestWord = findLongestWord(sentence);
        
        System.out.println("The longest word is: " + longestWord);
    }
    
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");  // Split the sentence into words
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        return longestWord;
    }






	}


