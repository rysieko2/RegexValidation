package lab2_03_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpValidation {
    public static void main(String[] args) {
        checkingIp();
    }

    private static void checkingIp() {
        String ip_number;
        Scanner odczyt = new Scanner(System.in);
        System.out.print("Podaj adres Ip: ");
        ip_number = odczyt.nextLine();


        String zeroTo255 = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";

        String ip_regex
                = zeroTo255 + "\\." + zeroTo255 + "\\."
                + zeroTo255 + "\\." + zeroTo255;

        Pattern pattern = Pattern.compile(ip_regex);
        Matcher matcher = pattern.matcher(ip_number);

        if (matcher.matches()) {
            System.out.println("Adres Ip: " + ip_number + " jest poprawny");

        } else {
            System.out.println("Adres Ip: " + ip_number + " jest niepoprawny");
        }
    }
}

