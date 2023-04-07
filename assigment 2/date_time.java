import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class date_time{
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter a date (dd/mm/yyyy): ");
        String dateInput = input.nextLine();

        
        System.out.print("Enter a time (hh:mm:ss or hh:mm:ss a): ");
        String timeInput = input.nextLine();

        
        String dateTimeInput = dateInput + " " + timeInput;

        
        DateFormat inputDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss ");
        Date date = inputDateFormat.parse(dateTimeInput);

        
        DateFormat outputDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
        DateFormat outputDateFormat2 = new SimpleDateFormat("MM/dd/yyyy");
        DateFormat outputDateFormat3 = new SimpleDateFormat("yyyy/MM/dd");

        DateFormat outputTimeFormat1 = new SimpleDateFormat("hh:mm:ss");
        DateFormat outputTimeFormat2 = new SimpleDateFormat("hh:mm:ss a");
        DateFormat outputTimeFormat3 = new SimpleDateFormat("hh:mm");

        DateFormat outputDateTimeFormat1 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        DateFormat outputDateTimeFormat2 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
        DateFormat outputDateTimeFormat3 = new SimpleDateFormat("yyyy/MM/dd hh:mm");

        
        System.out.println("Date: " + outputDateFormat1.format(date) + ", " + outputDateFormat2.format(date) + ", " + outputDateFormat3.format(date));
        System.out.println("Time: " + outputTimeFormat1.format(date) + ", " + outputTimeFormat2.format(date) + ", " + outputTimeFormat3.format(date));
        System.out.println("Date and Time: " + outputDateTimeFormat1.format(date) + ", " + outputDateTimeFormat2.format(date) + ", " + outputDateTimeFormat3.format(date));

        input.close();
    }
}

