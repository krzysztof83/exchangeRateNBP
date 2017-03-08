package pl.NBP.exchangeRates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Professional on 2017-03-08.
 */
public class MidCurrencyValue {
    private Currency midCurrencyValue;

    //getter&Setter
    public Currency getMidCurrencyValue() {
        return midCurrencyValue;
    }
    public void setMidCurrencyValue(Currency midCurrencyValue) {
        this.midCurrencyValue = midCurrencyValue;
    }

    public MidCurrencyValue(String currencyCode) throws IOException {

        HttpURLConnection connection = getConnection(currencyCode);

        String jsonAsString = getString(connection);


        Currency currency = new Currency();

        currency.setAllFilds(jsonAsString);


        this.midCurrencyValue = currency;
    }

    //This method return String from connection API
    private String getString(HttpURLConnection connection) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder results = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            results.append(line);
        }
        connection.disconnect();
        return results.toString();
    }

    //This method connect to NBP api, paramet is short value code for example USD, EUR or CHF
    private HttpURLConnection getConnection(String currencyCode) throws IOException {
        URL myURL = new URL("http://api.nbp.pl/api/exchangerates/rates/A/"+currencyCode+"/");
        HttpURLConnection connection = (HttpURLConnection) myURL.openConnection();
        connection.setRequestMethod("GET");
        connection.setDoOutput(true);
        connection.connect();
        return connection;
    }

}
