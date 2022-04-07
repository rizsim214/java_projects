import java.util.Scanner;

public class ArrayNamesDisplay{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] allStars = new String[5];

        System.out.println("Who are your Top 5 NBA Players?");

       for (int i = 0; i < allStars.length; i++) {
           allStars[i] = scanner.nextLine();
       }
       scanner.close();

       for (int i = 0; i < allStars.length; i++) {
           System.out.println(allStars[i].toUpperCase());
       }
    }
}