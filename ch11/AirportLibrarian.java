import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.Math;

public class AirportLibrarian {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(System.in);
        Scanner airportsDat = new Scanner(new File("airports.dat"));
        airportsDat.useDelimiter(",");
        String in = "";
        String city = "";
        String name = "";
        String temp = "";
        char c = ' ';

        System.out.println("Enter a city:");
        in = cin.next();
        System.out.println("These airports are in that city:");

        int position = 0;
        while(airportsDat.hasNext()) {
            temp = airportsDat.next();
            if(temp.contains("\"")) {   temp = temp.substring(1,temp.length() - 1);   }
            if (position == 1) {
                name = temp;
                // System.out.print(name + ": ");
            } else if (position == 2) {
                city = temp;
                // System.out.println(city);
                if (city.equalsIgnoreCase(in)) {   System.out.println(name);   }
            }
            position ++;
            position = position % 14;
        }
    }
}

// [###],[NAME],[CITY],[COUNTRY],[IATA],[ICAO],[LATITUDE],[LONGITUDE],[ALTITUDE],[TIMEZONE],[DST],[Tz database time zone],[TYPE],[SOURCE]
