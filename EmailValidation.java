package lab2_03_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        checkEmail();
    }

    private static void checkEmail() {
        String email_number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter address e-mail: ");
        email_number = scanner.nextLine();

        String email_regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+" +
                "@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))";

        Pattern pattern = Pattern.compile(email_regex);
        Matcher matcher = pattern.matcher(email_number);

        if (matcher.matches()) {
            System.out.println("Address e-mail: " + email_number + " is true");

        } else {
            System.out.println("Address e-mail: " + email_number + " is false");
        }
    }
}

