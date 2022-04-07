import java.util.Scanner;

public class AgeIdentifier {
  public static void main(String[] args){
    
    short age;

    Scanner objectScanner = new Scanner(System.in);
    System.out.println("Please Enter Your Age: ");
    age = objectScanner.nextShort();
    objectScanner.close();

    if(age < 18 && age > 0){
      System.out.println("You are a minor. No liqour for you!");
    }else if(age >= 18 && age < 60){
      System.out.println("You are already an adult. Get your S*** together!");
    }else if(age >= 60 && age < 120){
      System.out.println("You are a Senior Citizen. You have 20% discount on anything!");
    }else{
      System.out.println("You are beyond normal human lifespan, you must be immortal!");
    }
  }
}
