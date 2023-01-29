import java.util.Scanner;

public class PigLatinTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence to translate to Pig Latin: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        for (String word : words) {
            String pigLatinWord = translateToPigLatin(word);
            System.out.print(pigLatinWord + " ");
        }
    }

    public static String translateToPigLatin(String word) {
        StringBuilder pigLatinWord = new StringBuilder();
        int i = 0;
        while (i < word.length() && !isVowel(word.charAt(i))) {
            pigLatinWord.append(word.charAt(i));
            i++;
        }
        pigLatinWord.append("ay");
        return pigLatinWord.toString();
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
