import java.util.Scanner;

public class ArraysWithAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] people = new String[5];
        int[] age = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("What is your name and age?");
            people[i] = scan.next();
            age[i] = scan.nextInt();
            System.out.println("Hi! My name is " + people[i].toUpperCase() + " and I'm " + age[i] + " years old! ");
        }
        scan.close();
    }
}
