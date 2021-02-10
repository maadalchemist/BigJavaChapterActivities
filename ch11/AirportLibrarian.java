import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.Math;

public class AirportLibrarian {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(System.in);
        Scanner airportsDat = new Scanner(new File("airports.dat"));
        airportsDat.useDelimiter("");
        String in = "";
        String city = "";
        String name = "";
        char c = '';

        System.out.println("Enter a city:");
        in = cin.next();

        int cycle = 1;
        while(airportsDat.hasNext()) {
            c = airportsDat.next();
            
        }
    }
}

// 7868     "Camp Bastion Airport"     "Camp Bastion"     "Afghanistan"     "OAZ"     "OAZI"     31.863800048799998     64.2246017456     2943     4.5     "N"     "Asia/Kabul"     "airport"     "OurAirports"
