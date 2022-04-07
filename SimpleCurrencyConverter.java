import java.util.Scanner;
public class SimpleCurrencyConverter {
  public static void main(String[] args){

    String currencyType;
    double currencyValue;
    double currencyResult;

    Scanner inputScanner = new Scanner(System.in);

    System.out.println("\n");
    System.out.println("<--------------Welcome To My Simple PHP Currency Converter---------------->");
    System.out.println("OPTIONS: ");
    System.out.println("CAD - Canadian Dollar");
    System.out.println("USD - US Dollar");
    System.out.println("JPY - Japanese Yen");
    System.out.println("<------------------------Fill The Requirements------------------------->");
    System.out.println("\n");
    
    System.out.println("What currency do you want to convert to?");
    currencyType = inputScanner.nextLine().toLowerCase();
    System.out.println("Please Enter The Ammount In PHP");
    currencyValue = inputScanner.nextDouble();
    inputScanner.close();

    switch(currencyType) {
      case "cad" :
        double cadCurrency = 0.024;
        currencyResult = Math.round(convertCurrency(currencyValue, cadCurrency));
        System.out.println("CURRENCY OF " + currencyValue + "PHP IN " + currencyType.toUpperCase() + " IS " + currencyResult);
        
        break;
      case "usd" :
        double usdCurrency = 0.019;
        currencyResult = Math.round(convertCurrency(currencyValue, usdCurrency));
        System.out.println("CURRENCY OF " + currencyValue + "PHP IN " + currencyType.toUpperCase()+ " IS " + currencyResult);
        break;
      case "jpy" :
        double jpyCurrency = 2.41;
        currencyResult = Math.round(convertCurrency(currencyValue, jpyCurrency));
        System.out.println("CURRENCY OF " + currencyValue + "PHP IN " + currencyType.toUpperCase()+ " IS " + currencyResult);
        break;
      default:
        System.out.println(currencyType.toUpperCase() +" IS AN UNKNOWN CURRENCY TYPE " );
    }
    
  }

  public static double convertCurrency(Double value , Double currency){
    return currency * value;
  } 
}
