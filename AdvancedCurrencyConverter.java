import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class AdvancedCurrencyConverter {
  public static void main(String[] args){

    String currencyType;
    double amount;
    
    Scanner objectScanner = new Scanner(System.in);

    System.out.println("Please Enter Convertion Currency!");
    currencyType = objectScanner.nextLine().toUpperCase();
    System.out.println("Please Enter The Amount In PHP");
    amount = objectScanner.nextDouble();
    objectScanner.close();

    String Result = CurrencyConverter( currencyType,  amount );

    System.out.println("Currency of " + amount + "PHP in " + currencyType.toUpperCase() + " is " + Result);
  }

  private static String CurrencyConverter(String type , Double amt) {

    NumberFormat formatUs = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat formatCAD = NumberFormat.getCurrencyInstance(Locale.CANADA);
    NumberFormat formatJPY = NumberFormat.getCurrencyInstance(Locale.JAPAN);

    switch(type){
      case "USD":
        double usdCurrency = 0.019;
        double usdResult = Math.round(calculateCurrency(usdCurrency , amt));
        return formatUs.format(usdResult);
      case "CAD":
        double cadCurrency = 0.024;
        double cadResult = Math.round(calculateCurrency(cadCurrency , amt));
        return formatCAD.format(cadResult);
      case "JPY": 
        double jpyCurrency = 2.41;
        double jpyResult = Math.round(calculateCurrency(jpyCurrency , amt));
        return formatJPY.format(jpyResult);
      default: 
        return "UNKNOWN CURRENCY DETECTED!";
    }

  }

  private static double calculateCurrency(Double curDouble, Double amtDouble){
    return curDouble * amtDouble;
  }
}
