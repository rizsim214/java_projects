import java.util.Scanner;

public class ScannerProgram {
  public static void main(String[] args){

    String Product;
    Float Price;
    
    Scanner objectScanner = new Scanner(System.in);

    System.out.println("\n");
    System.out.println("Product's Name: ");
    Product = objectScanner.nextLine();
    
    System.out.println("What's the price? ");
    Price = objectScanner.nextFloat();
    objectScanner.close();

    System.out.println("The price of " + Product + " is " + Price + " Pesos" );
    System.out.println("\n");
    
  }
}
