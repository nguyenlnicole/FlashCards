package src.main.Java;

import java.util.*;

public class Flashcards {

    private static Map<String, String> questions = new LinkedHashMap<>();

    static {
        questions.put("Do you know the code that compare arrays?", "Arrays.equals(array1, array2);");
        questions.put("Do you know the code to create an ArrayList?", "List<T> myList = new ArrayList<T>();");
        questions.put("Do you know the code to loop through a list?", "for(int i = 0; i <= myList.size(); i++) {\n" +
                "}");
        questions.put("Do you know the code to create a map?", "Map<K, V> myMap = new HashMap<K, V>();");
        questions.put("Do you know what a class is?", "A piece of code that acts as a blueprint or template for an object, including its state (instance variables) and behavior (methods)");
        questions.put("Do you know what a final class is?", "A class that can’t be inherited from");
        questions.put("Do you know what an abstract method is?", "A method that is declared without an implementation and requires all concrete (non-abstract) subclasses of its class to implement it");
        questions.put("Do you know what a final method is?", "A method that can’t be overridden");
        questions.put("Do you know the code for length of string?", "myString.length();");
        questions.put("Do you know the code to turn string into array?", "char[] myCharArray = myString.toCharArray();");
        questions.put("Do you know the code that checks to see if a map has a given key?", "myMap.containsKey(key);");
        questions.put("Do you know the code to loop through a map?", "for(Map.Entry<K, V> entry : myMap.entrySet()) {\n" +
                "K key = entry.getKey();\n" +
                "V value = entry.getValue();\n" +
                "}");
        questions.put("Do you know the code to return part of a string ?", "myString.subString(x, y);");
        questions.put("Do you know the code to Loop through the characters in a string?", "for(int i = 0; i <= myString.length; i++) {\n" +
                "// Access char by location:\n" +
                "myString.charAt(i)\n" +
                "}");
        questions.put("Do you know the code for joining strings in an array together?", "String[] myArray = {“str1”, “str2”, “str3”};\n" +
                "String myString = String.join(delimiter, myArray);");
        questions.put("Do you know what an object is?", "An entity in an application that is created from a class");
        questions.put("Do you know what a state is?", "An object’s properties (instance variables) and their values");
        questions.put("Do you know what a static method is?", "A method that belongs to the class itself, rather than its instances (objects)");
        questions.put("Do you know what a method override is?", "When a class provides a new implementation of a method from its superclass");
        questions.put("Do you know what a static property is?", "A property that belongs to the class itself, rather than its instances (objects)");

    }

    public static void main(String[] args) {
        displayBanner();

        Scanner scanner = new Scanner(System.in);
        String ans;

        List<String> questionList = new ArrayList<>(questions.keySet());
        Collections.shuffle(questionList);

        for (String question : questionList) {
            System.out.println(question + " (Y/N)");
            ans = scanner.nextLine().toUpperCase();
            if (ans.equals("N")) {
                System.out.println("The answer is '" + questions.get(question) + "'");
            } else {
                System.out.println("Great!");
            }
        }
    }

    private static void displayBanner() {
        System.out.println("-----------------------------------------");
        System.out.println("|              Flash Cards              |");
        System.out.println("-----------------------------------------");
    }
}

