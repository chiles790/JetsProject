package com.skilldistillery.jet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import com.skilldistillery.jet.Jet;



public class JetApplication {

	static Scanner kb = new Scanner(System.in);

	
	public static void main(String[] args) {
		List<Jet> jets = new ArrayList<>();
		try ( BufferedReader bufIn = new BufferedReader(new FileReader("jets")) ) {
			String line = "";
			while ((line = bufIn.readLine()) != null) {
				String[] fields = line.split(",");
				Jet jet = new Jet(fields[0], Double.parseDouble(fields[1]), Double.parseDouble(fields[2]), Long.parseLong(fields[3]), Double.parseDouble(fields[4]));
				jets.add(jet); 
			}
		}
		catch (IOException e) {
			System.err.println(e);
		}
		int userInt;
		do {
		System.out.println("**********************************");
		System.out.println("*          Menu                  *");
		System.out.println("*  1. list fleet                 *");
		System.out.println("*  2. Fly all jets               *");
		System.out.println("*  3 View Fastest Jet            *");
		System.out.println("*  4. View jet with longest range*");
		System.out.println("*  5. Load all cargo jets        *");
		System.out.println("*  6. DogFight!                  *");
		System.out.println("*  7. Add a jet from Fleet       *");
		System.out.println("*  8. Remove a jet from Fleet    *");
		System.out.println("*  9. Quit                       *");
		System.out.println("**********************************");
		userInt = kb.nextInt();
		if( userInt == 1) {
			System.out.println(jets);
			System.out.println();
			System.out.println("Select another option");
		}
		if(userInt == 2) {
			System.out.println(jets + "\nFly all planes");
			
		}
		if(userInt == 3) {
			Jet jet = new Jet("f15", 1875, 3450, 27, 2);
			System.out.println(jet +"\nis the fastest plane in the fleet");
		}
		if(userInt == 4) {
			Jet jet = new Jet("c17", 517, 6456, 202, .74);
			System.out.println(jet + "\n is the jet with the longest range");
		}
		if(userInt == 5) {
			System.out.println("Cargo is being loaded");
			
		}
		if(userInt ==6) {
			System.out.println("Fight!");
		}
		if(userInt == 7) {
			Jet jet = new Jet("F22", 1500, 1600, 339, 2);
			System.out.println(jet);
		}
		if(userInt == 8) {
			System.out.println(jets);
		}
		if(userInt ==9 ) {
			System.out.println("Thanks for using this program");
			break;
		}
		
		} while(userInt != 9);
		

	}
	}


