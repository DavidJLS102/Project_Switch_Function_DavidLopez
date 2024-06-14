import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        printAnyString("hello, enter the options A,B,C");
        printAnyString("please type and option");
        String readingString=scanner.nextLine();
        switch (readingString.toLowerCase()){
            case "a":
                printAnyString("now you are program it is necessari two numbers");
                printAnyString("Typing the first number");

                int numberone = scanner.nextInt();
                printAnyString("Typing the second number");
                int numbertywo = scanner.nextInt();
                int sumResult=sumNumbers(numberone,numbertywo);
                printAnyString("the result os sum is: "+sumResult);
                break;
            case "b":
                printAnyString("the program return the text do dou enter");
                String impitString = scanner.nextLine();
                String  writtenstring=resultstring(impitString);
                printAnyString("your string is= "+writtenstring );
                break;
            case  "c":
                printAnyString("the program return the coseno of an enter");
                int betweencosine = scanner.nextInt();
                float writecos = (float) initialCos(betweencosine);
                printAnyString("your string is= "+ writecos );
                break;
        }
    }
    public static void printAnyString(String message){
        System.out.println(message);


    }
    public static int sumNumbers (int numberone, int numbertywo){
        int result = numberone+numbertywo;
        return result;

    }
    public static String resultstring (String impitString ){
        String resultstringfinal=(impitString);
        return resultstringfinal;
    }
    public static double initialCos (int betweencosine ){
        double result2= Math.cos(betweencosine);
        return result2;

    }


}

