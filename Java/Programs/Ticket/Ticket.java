//×××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××
// 		Name: Alec Mingione
//		Prog: Program 1
//		Date: July 14, 2018
//×××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××××
import java.util.Scanner;
//import java.Lang.String;

class Ticket

{
    public static void main(String args[])
    {
        String checkout;
        int total;
        int amountOfTier1;
        int amountOfTier2;
        int amountOfTier3;
        int age;
        double price;
        double totalAdminAmount;
		double childTicketAdmin;
		double generalTicketAdmin;
		double seniorTicketAdmin;
		int totalParticipants = amountOfTier1 + amountOfTier2 + amountOfTier3;
		String discounts;

		Scanner scan = new Scanner(System.in);


        System.out.println("Please enter number of 01-12 aged particapants \n   ");
        amountOfTier1= scan.nextInt();
		System.out.println("Please enter number of 13-64 aged particapants \n   ");
		amountOfTier2= scan.nextInt();
		System.out.println("Please enter number of 65+ aged particapants \n   ");
		amountOfTier3 = scan.nextInt();

		/* 	The if statement works I just changed the type of "if" statement

		if ( age > 65) {
			System.out.println("Pay 7$ ");

		} if ( discounts == "Student"||"student")
				System.out.println("Pay $8");

		  } if (age <= 12)
		     System.out.println("pay $8");

			} else { ("Pay $10")
		}
		Was going to add a age verifier using a for loop but I just want to move along with this lol
		*/




		childTicketAdmin = amountOfTier1 * 8; //Can also create a variable for the number to assign as the price of the tickets
		generalTicketAdmin= amountOfTier2 * 10;
		seniorTicketAdmin= amountOfTier3 * 7;

		totalAdminAmount= childTicketAdmin + generalTicketAdmin + seniorTicketAdmin ;


		System.out.println();
		        System.out.println("The number of Tickets for the following ages:");
		        System.out.println("\t" +amountOfTier1 + " ticket(s) for person(s) aged through 0-12");
		        System.out.println("\t" +amountOfTier2 + " ticket(s) for person(s) aged through 13-64");
        		System.out.println("\t" +amountOfTier3 + " ticket(s) for person(s) aged through 65+ or seniors \n");
				System.out.println("The price being $8 for " + amountOfTier1 + " ticket(s)");
				System.out.println("$10 for " + amountOfTier2 + " ticket(s)");
				System.out.println("Then $7 for " + amountOfTier3 + " ticket(s)");
				  System.out.println("Your total comes to $" + totalAdminAmount + " for today!");


			//System.out.println(amountOfTier1 (amountOfTier1 == 1) ? "ticket for person aged through 0-12" : " ticket(s) for person(s) aged through 0-12"));
				// This is one of those thigs where it will come back to me lol

				  //if (checkout == "y" || checkout == "Y"){
					  System.out.println("Enjoy your show!");
				//	 }  else {
						 System.out.println("Thank you for stopping bye!");
					//	 System.exit(0);
						//	}


        System.out.println();


	   }
   }

