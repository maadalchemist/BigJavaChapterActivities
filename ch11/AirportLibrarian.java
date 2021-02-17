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

        int position = 0;
        while(airportsDat.hasNext()) {
            temp = airportsDat.next();
            if (position == 0 && !temp.contains("OurAirports")) {
                System.out.println(temp);
                // city = temp;
                // System.out.println(city);
            }
            // else if (position == 2) {
            //     name = temp;
            //     System.out.println(name);
            //     // if (city.equalsIgnoreCase(in)) {   System.out.println(name);   }
            // }
            position ++;
            position = position % 13;
        }
    }
}

// [###],[NAME],[CITY],[COUNTRY],[IATA],[ICAO],[LATITUDE],[LONGITUDE],[ALTITUDE],[TIMEZONE],[DST],[Tz database time zone],[TYPE],[SOURCE]
