package org.launchcode.java.charactercount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Charactercounter {

    public static void main(String[] args) {

        //Takes user input
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter text: ");
        String text = in.nextLine();
        HashMap<Character, Integer> counts = new HashMap<>();
        //loop through the string one char at a time

        //this for loop is a potential solution, but lets mess around with a for each loop

//        for (int i = 0; i < text.length(); i++) {
//           char current = text.charAt(i) //get the character in the i position
//        }
//    }

        for (char c : text.toCharArray()) {
            //makes sure program doesn't allow numbers or special chars
            if(c >= 'a' && c <= 'z') { //This line works because single quotes makes Java read a and z as characters instead of strings
                //what to do when seeing c for the first time
                if (!counts.containsKey(c)) {
                    counts.put(c, 1);
                } else { //what to do when we've already seen c
                    int seen = counts.get(c);
                    counts.put(c, seen + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {            //iterate through the hashmap
            System.out.print(entry.getKey() + ": " + entry.getValue() + "\n");
        }
    }
}
