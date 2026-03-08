/*
 * @Title:    CelikEminTalhaAdvanceAccessControlSystem
 * @Purpose:  To practice Java loop and conditional statements.
 * @Author:   Celik Emin Talha
 * @Date:     11/13/2024
 * @Version:  1.0
 */

import java.util.Scanner;

public class CelikEminTalhaAdvanceAccessControlSystem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the employee security level (1-5): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Access Denied: Invalid security level.");
            return;
        }
        int securityLevel = scanner.nextInt();
        scanner.nextLine();

        if (securityLevel < 1 || securityLevel > 5) {
            System.out.println("Access Denied: Security level must be between 1 and 5.");
            return;
        }

        System.out.print("Enter the role (ADMIN, USER, GUEST): ");
        String role = scanner.nextLine().toUpperCase();

        if (!role.equals("ADMIN") && !role.equals("USER") && !role.equals("GUEST")) {
            System.out.println("Access Denied: Invalid role.");
            return;
        }


        System.out.print("Enter the time of day (0-23): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Access Denied: Invalid time format.");
            return;
        }
        int timeOfDay = scanner.nextInt();


        if (timeOfDay < 0 || timeOfDay > 23) {
            System.out.println("Access Denied: Time must be between 0 and 23.");
            return;
        }


        if (securityLevel == 5) {
            System.out.println("Access Granted");
        }
        else if (role.equals("ADMIN") && securityLevel >= 4) {
            System.out.println("Access Granted");
        }
        else if (role.equals("USER") && securityLevel >= 3 && timeOfDay >= 9 && timeOfDay <= 17) {

            System.out.println("Access Granted");
        }
        else if (role.equals("GUEST") && securityLevel >= 2 && timeOfDay >= 10 && timeOfDay <= 16) {

            System.out.println("Access Granted");
        }
        else {
            System.out.println("Access Denied");
        }

        scanner.close();
    }

}


