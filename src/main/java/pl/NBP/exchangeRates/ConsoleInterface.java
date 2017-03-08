package pl.NBP.exchangeRates;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Professional on 2017-03-08.
 */
public class ConsoleInterface {

    public void startInterface() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------------------------------");
        System.out.println("Program pobierajacy dane na temat aktualnych kursow walut");
        System.out.println("---------------------------------------------------------");
        System.out.println("Wybierz co chcesz zrobić: ");
        String wprowadzic = "1. Wprowadzic 3 znakowy kod waluty.";
        String zobaczyc = "2. Zobaczyc liste dostepnych walut. ";
        String zakoncz = "3. Zakonczyc. ";
        String[] menuChoiseTable = new String[3];
        menuChoiseTable[0] = wprowadzic;
        menuChoiseTable[1] = zobaczyc;
        menuChoiseTable[2] = zakoncz;
        System.out.println(wprowadzic);
        System.out.println(zobaczyc);
        System.out.println(zakoncz);
        int menuChoise = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        System.out.println("Wybrales:  " + menuChoiseTable[menuChoise - 1]);


        switch (menuChoise) {
            case 1:
                System.out.println();
                System.out.println("Wprowadz 3 znakowy kod waluty:...");
                String currencyCode = scanner.nextLine();
                currencyCode = currencyCode.toUpperCase();
                try {
                    String currencyTest = CurrencyEnum.valueOf(currencyCode).toString();
                } catch (IllegalArgumentException e) {
                    System.out.println("Wpisales bledny kod! Moze bedzie lepiej jesli wybierzesz opcje" +
                            " 2.Zobaczyc liste dostepnych walut. ");
                    ConsoleInterface consoleInterface = new ConsoleInterface();
                    consoleInterface.startInterface();
                    break;
                }
                System.out.println("Wyswietlam sredni kurs waluty: " + currencyCode +
                        ", nazwa waluty: " + CurrencyEnum.valueOf(currencyCode).getCurrencyName() +
                        ", kurs dla " + CurrencyEnum.valueOf(currencyCode).getAmountToExchange() +
                        " " + CurrencyEnum.valueOf(currencyCode));
                MidCurrencyValue midCurrencyValue = new MidCurrencyValue(currencyCode);
                Currency currency = midCurrencyValue.getMidCurrencyValue();
                System.out.println(currency.toString());
                ConsoleInterface consoleInterface= new ConsoleInterface();
                consoleInterface.startInterface();

                break;
            case 2:
                System.out.println(zobaczyc);
                CurrencyEnum[] currencyEnums=CurrencyEnum.values();
                for (int i = 0; i < currencyEnums.length; i++) {
                    System.out.println(currencyEnums[i]);
                }
                startInterface();
                break;
            case 3:
                System.out.println(zakoncz);
                break;
            default:
                break;
        }
    }

}
