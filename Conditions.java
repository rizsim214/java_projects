import java.util.Scanner;

public class Conditions {
  public static void main(String[] args){
    byte limit, skips, count;

    Scanner objScanner = new Scanner(System.in);

    System.out.println("Input Your For Loop Limit");
    limit = objScanner.nextByte();
    System.out.println("Input ForLoop skips");
    skips = objScanner.nextByte();
    objScanner.close();

    System.out.println("Limit: " + limit);
    System.out.println("Skips: " + skips);
    System.out.println();
    for (count = 0; count <= limit; count += skips){
      System.out.println("Count: " + count);
    }
  }
}