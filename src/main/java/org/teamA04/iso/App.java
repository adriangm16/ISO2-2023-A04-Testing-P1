package org.teamA04.iso;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
            String name = Utils.readString("Enter the name");

            String lastName = Utils.readString("Enter the last name");

            String dobString = Utils.readString("Introduce your date of birth (YYYY-MM-DD):");

            Date dateOfBirth = parseDate(dobString); //Convert from string to date

            System.out.println("Enter your nationality(Spain, France, Italy, Portugal, United_Kingdom, Germany):");
            europeanCountries nationality = europeanCountries.valueOf(scanner.nextLine().toUpperCase());

            String education = Utils.readString("Enter your education");

            System.out.println("Do you have english certification? (true/false):");
            boolean englishCertification = scanner.nextBoolean();
            scanner.nextLine(); 

            String phoneNumber = Utils.readString("Enter your phone number");

            String email = Utils.readString("Enter your email");

           
            Persona person = new Persona(name, lastName, nationality,
                    education, englishCertification, phoneNumber, email,dateOfBirth);

            person.toString();
            
            System.out.println("Is of legal age: " + person.isLegal());
            System.out.println("Is European: " + person.isEuropean());

        } catch (Exception e) {
            System.out.println("Aa exception occurred creating object Persona " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    /*
     * Method for checking if the date is in the correct format
     */
    private static Date parseDate(String dateString) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.parse(dateString);
    }

}
