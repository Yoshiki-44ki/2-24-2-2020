/*
 * Yoshiki Harada
 * 24/02/2020
 * this code asks users to enter a word and counts the number of words that are palindrome.
 */

package palindrome2.java;

/**
 *
 * @author yohar3320
 */
import javax.swing.*;
public class Palindrome2Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = JOptionPane.showInputDialog("type some words");
        String line= input.toLowerCase();//make all letters into lower case 
        String words [] = line.split(" ");//split the phrase into words
        int count = 1;//count the number of words, there must be more than a word(or null)
        for (int i =0; i<line.length()-1; i++){//some people might make a space in the end of the sentence
        //so, subtract by 1 
            if (" ".equals(Character.toString(line.charAt(i)))){//compare a character and space
            count=count+1;//count the number of spaces
        }
        }
        int flag=0; 
        for (int i =0; i<count; i++){
            boolean yes = false; //tells whether it is palindrome 
            char store [] = new char [words[i].length()];//use to store letters
        for (int n = 0; n<words[i].length(); n++ ){
             store[n]=words[i].charAt(n);//stores in an array in the order of the letters 
        }
        String check="";
        for (int n = 0; n<words[i].length(); n++ ){//make an array to output in the oppsite order 
        check = check+store[words[i].length()-1-n];
        }
        if (words[i].equals(check)){
        System.out.println("\nThis is a Palindrome:"+ words[i]);
        flag=flag+1;
        }
        }
        System.out.println("there are " + flag+ " palindrome(s)");
    
}}
