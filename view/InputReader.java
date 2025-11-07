package FlightTicketReservationSystem.view;

import java.util.Scanner;

public class InputReader {
    private static final Scanner sc = new Scanner(System.in);

    public String getString() {
        String input = sc.nextLine().trim();
        while (input.isEmpty()) {
            input = sc.nextLine().trim();
        }
        return input;
    }

    public int getInt() {
        while (true) {
            try {
                String line = sc.nextLine().trim();
                if (line.isEmpty()) continue;
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number:");
            }
        }
    }
}
