/**
 * Lesson 6 Hands-On45 points
Directions
Now that you have learned about StringBuilder, Exception Handling, and File I/O, its time to put that knowledge to work. In this Hands-On exercise you will create a project which will require a string to be built using the StringBuilder class. Additionally, that string will be written to and read from a file. Please zip your project directory and upload when you are finished. This Hands-On will be graded, so be sure you complete all requirements.

You should leverage what you have learned about StringBuilder and loop iteration to create a string composed of the text in the array below. When copying the values from the array to the string builder, separate each element with a comma.

// array
String songs[] = {"Rock With You", "Smooth Criminal", "Wanna Be Startin' Something", "Thriller", "Beat It"};
You will demonstrate this project to your instructor or mentor, by running the program and reviewing both the output, and the code solution.

Step 2
Take the previously built StringBuilder object and write the data inside of a file called songs.txt. Add exception handling to the code to prevent errors from crashing the application. Errors should print the stack trace along with the message "Error when writing songs.txt".

Step 3
Verify that the StringBuilder object has been saved properly into the songs.txt file by reading the contents from the disk and printing it to the console.

Requirements
Comma Separated Values: Each element from the array to the string must be comma separated.
StringBuilder Elements from the array must not be stored in a String, but instead using StringBuilder.
File Etiquette: Files should be handled correctly when finished reading/writing.
Error Handling: Appropriate try-catch block should encapsulate the file operations that are prone to exceptions.
 */

/**
 * @author Alec Mingione
 * 
 *
 */

import java.io.FileReader;
import java.io.*;
import java.util.*;




public class HandsOn6 {

	/**
	 * 
	 */
	public HandsOn6() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileReader inputStream;
		FileWriter outputStream;
		BufferedReader reader;
		FileReader fileReader;
		FileWriter writer;
		String fileContentsRead = "";
		
	    String songs[] = { "Rock With You", "Smooth Criminal", "Wanna Be Startin' Something", "Thriller", "Beat It" };
	    StringBuilder sb = new StringBuilder();
	      if (songs.length == 0) {
	        throw new Exception ("EMPTY");
	      } else {
	        System.out.println("List import succeeded");
	      }
	       
	  
	    for(int i = 0; i < songs.length; i++){
	        
	        sb.append(songs[i]);
	        
	        sb.append(", ");
	    }
	  
	    System.out.println(sb);
		
		try {
			// open the file for writing
			writer = new FileWriter("songs.txt");
			
			// Progress handle
			
			String anim= "|/-\\";
	        for (int x =0 ; x < 100 ; x++) {
	            String data = "\r" + anim.charAt(x % anim.length()) + " " + x;
	            System.out.write(data.getBytes());
	            Thread.sleep(90);
	            
	            
	            
	        }
			// write the letter "a" inside of the file
			writer.write("\"Rock With You\", \"Smooth Criminal\", \"Wanna Be Startin' Something\", \"Thriller\", \"Beat It\" ");
			// close the file (finished writing)
			System.out.println();
			writer.close();
			
			// open the file for reading
			reader = new BufferedReader(new FileReader("songs.txt"));
			String line;
			while ((line = reader.readLine()) != null) {
				fileContentsRead = fileContentsRead + line;
			}
			// close the file (finished reading)
			reader.close();
			
		} catch(Exception e) {
			System.out.println("Error when writing songs.txt");
			e.printStackTrace();
		} finally {
			System.out.println(fileContentsRead);
		}

	}

}
