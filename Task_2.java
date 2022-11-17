import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Random rand = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static StringBuilder Word = new StringBuilder("_________________");
    public static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    public static void main (String[] args){
        int x = rand.nextInt(words.length-1);
        System.out.println("Угадайте загаданное слово:");
        String str = scanner.next();
        while (true){
            if(str.length() <= words[x].length()){
                int i = 0;
                for(char c : str.toCharArray()) {
                    if(words[x].charAt(i) == c){
                       Word.setCharAt(i, c);
                    }
                    i++;
                }
                System.out.println(Word);
                if(Word.toString().contains(words[x]))
                    break;
                System.out.println("Поробуйте ещё раз:");
                str = scanner.next();
            }else{
                int i = 0;
                for(char c : words[x].toCharArray()) {
                    if(str.charAt(i) == c){
                        Word.setCharAt(i, c);
                        i++;
                    }
                }
                System.out.println(Word);
                if(Word.toString().contains(words[x]))
                    break;
                System.out.println("Поробуйте ещё раз:");
                str = scanner.next();
            }
        }
        System.out.println("Слово угадано! " + words[x]);
    }

}
