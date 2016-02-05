import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *Problem 7.	Days between Two Dates
 Write a program to calculate the difference between two dates in number of days.
 The dates are entered at two consecutive lines in format day-month-year.
 Days are in range [1…31]. Months are in range [1…12]. Years are in range [1900…2100].
 */
public class DaysBetweenTwoDays {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("d-MM-yyyy");
        String  startDate = scn.nextLine();
        String endDate = scn.nextLine();
         LocalDate firstDate = LocalDate.parse(startDate, formatter);
         LocalDate secondDate = LocalDate.parse(endDate, formatter);
        final long days = ChronoUnit.DAYS.between(firstDate, secondDate);
        System.out.println(days);

    }
}