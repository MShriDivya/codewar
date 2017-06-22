import java.util.Scanner;
 
public class Camcase {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();
        String camcase = "";
        for(int i=0;i<input.length();i++)
        {
        char charc = input.charAt(i);
        camcase= camcase + Character.toUpperCase(charc);
 
        }
        System.out.println(camcase);
    }
}
