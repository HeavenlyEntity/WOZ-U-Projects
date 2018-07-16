//×××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××
// 		Name: Alec Mingione
//		Prog: isSunny
//		Date: July 14, 2018
//×××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××
import java.util.Scanner;
//import java.Lang.String;

class isSunny

{
    public static void main(String args[])
    {
        boolean itsSunny = false;
		boolean atBeach = true;

		 if (itsSunny == true){
		      System.out.println("Wear sunglasses!");

		    	} else {
				 System.out.println("Don't wear sunglasses.");

			      } if (atBeach == true){
  				   System.out.println("Wear sunblock!");

				   } else {
   					   System.out.println("Don't Need Sunblock.");

				     } if ( itsSunny == false && atBeach == true) {
				     		System.out.println("Don't wear sunglasses & come back tomorrow.");

						} else if (itsSunny == false && atBeach == false){
							System.out.println("Don't wear sunglasses & don't go to the beach.");
					            }

      		  System.out.println();


		}
   }

