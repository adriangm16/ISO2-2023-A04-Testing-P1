package org.teamA04.iso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Utils {

	private static Scanner scanner = new Scanner(System.in);

    public static String readString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static Date readDate(String message) {
        System.out.print(message);
        String dateString = scanner.nextLine();

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy"); // Adjust format to dd-MM-yyyy
        try {
            return format.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use dd-MM-yyyy.");
            return null;
        }
    }
}
