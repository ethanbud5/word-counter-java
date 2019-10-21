import java.io.File;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) throws Exception {
        File file = new File("romans8.txt");
        Scanner scanner = new Scanner(file);
        int wordCount = 0;
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
            wordCount = wordCount + line.split(" ").length;
        }
        System.out.println("Total words: " + wordCount);
    }
}
