package Lesson3;
import java.io.IOException;
import java.util.*;

public class Main {
    static final String FILE_NAME1 = "C://JAVA/Java2Lesson3.txt";
    static final String FILE_NAME2 = "Java2Lesson3.txt";


    public static void main(String[] args) {
        // first homework item
        List<String> wordArray = new ArrayList<String>();
        wordArray = ArrayOperation.fillTheArray(wordArray);
        System.out.println(wordArray + "\n");
        ArrayOperation.printUniqueWords(wordArray);
        wordArray.clear();
        try {
            wordArray = ArrayOperation.fillTheArrayFromFile(wordArray, FILE_NAME2);
        } catch (IOException e) {
            System.out.println("Failed to fill array from file!\n");
        }
        try {
            wordArray = ArrayOperation.fillTheArrayFromFile(wordArray, FILE_NAME1);
        } catch (IOException e) {
            System.out.println("Failed to fill array from file!\n");
        }
        System.out.println(wordArray + "\n");
        ArrayOperation.printUniqueWords(wordArray);
        // second homework item
        Phonebook phonebook = new Phonebook();

        phonebook.add(2304578, "Сирмайс");
        phonebook.add(5678794, "Сирмайс");
        phonebook.add(3456783, "Турчан");
        phonebook.add(3456278, "Левагина");
        phonebook.add(9786053, "Путин");
        phonebook.add(6475893, "Турчан");

        phonebook.get("Турчан");
        phonebook.get("Сирмайс");
        phonebook.get("Путин");
        phonebook.get("Левагина");
    }
}