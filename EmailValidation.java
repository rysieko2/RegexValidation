package lab2_03_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        checkingEmail();
    }

    private static void checkingEmail() {
        String ibanNumber;
        Scanner odczyt = new Scanner(System.in);
        System.out.print("Podaj adres e-mail: ");
        ibanNumber = odczyt.nextLine();

        String email_regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+" +
                "@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))";

        Pattern pattern = Pattern.compile(email_regex);
        Matcher matcher = pattern.matcher(ibanNumber);

        if (matcher.matches()) {
            System.out.println("Adres e-mail: " + ibanNumber + " jest poprawny");

        } else {
            System.out.println("Adres e-mail: " + ibanNumber + " jest niepoprawny");
        }
    }
}

