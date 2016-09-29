package demo0914;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Meny {
    private static int val;    /*choice=val*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		do{
			System.out.println("[1] Val");
			System.out.println("[2] Val");
			System.out.println("[3] Val");
			System.out.println("[4] Val");
			System.out.println("Ange ett val");
			
			/*BufferedReader s = new BufferedReader (new InputStreamReader(System.in));
			val = Integer.parseInt(s.readLine()); */
			
			Scanner s = new Scanner((System.in));   /*tangentborde=system.in*/
			val = s.nextInt();
			
			
			switch(val) {
			case 1:
				System.out.println("Du har valt 1");
				break; 
			case 2:
				System.out.println("Du har valt 2");
				break; 
			case 3:
				System.out.println("Du har valt 3");
				break; 
			case 4:
			System.out.println("Programmet avslutas");
			s.close();
			break;
			default:
			System.out.println("Ogiltigt val!");
			}
		}while (val != 4);
					
	}

}
