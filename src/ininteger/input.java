package ininteger;
import java.util.Scanner;
/**
 * @author Rawah Almesri Good manners are your beauty
 */
public class input
{
   /**
    * This method is static ask the user to enter interger value and then return
    * that value
    *
    * @param prompt
    * @return return only valiad integer input
    */
   public static int getInput (String prompt)
   {
      while (true) {
         System.out.println(prompt);
         try {
            Scanner scan = new Scanner(System.in);
            int value = scan.nextInt();
            return value;

         }
         catch (Exception a) {
            System.out.println("I ask for integer number please");
         }
      }
   }

}
