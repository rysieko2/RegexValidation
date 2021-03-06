package lab2_03_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpValidation {
    public static void main(String[] args) {
        checkIp();
    }

    private static void checkIp() {
        String ip_number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter address Ip: ");
        ip_number = scanner.nextLine();


        String zeroTo255 = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";

        String ip_regex
                = zeroTo255 + "\\." + zeroTo255 + "\\."
                + zeroTo255 + "\\." + zeroTo255;

        Pattern pattern = Pattern.compile(ip_regex);
        Matcher matcher = pattern.matcher(ip_number);

        if (matcher.matches()) {
            System.out.println("Address Ip: " + ip_number + "is true");

        } else {
            System.out.println("Address Ip: " + ip_number + " is false");
        }
    }
}

