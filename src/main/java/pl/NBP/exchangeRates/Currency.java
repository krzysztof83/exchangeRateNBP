package pl.NBP.exchangeRates;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

/**
 * Created by Professional on 2017-03-08.
 */
public class Currency {
    private String table;
    private String currency;
    private String code;
    private Rates rates;

    public String getTable() {
        return table;
    }

    public Currency setAllFilds(String jsonAsString) {
        Configuration conf = Configuration.defaultConfiguration();
        this.code = JsonPath.using(conf).parse(jsonAsString).read("$['code']").toString();
        this.currency = JsonPath.using(conf).parse(jsonAsString).read("$['currency']").toString();
        this.table = JsonPath.using(conf).parse(jsonAsString).read("$['table']").toString();
        Rates rates = JsonPath.parse(jsonAsString).read("$.rates[0]", Rates.class);
        this.rates = rates;
        return this;
    }

    @Override
    public String toString() {
        String currencyInString="Sredni kurs: "+getCurrency()+" wynosi: "+getRates().getMid()+", kod waluty: "+getCode()+", dane z dnia: "+getRates().getEffectiveDate();
        return currencyInString;
    }

    public String getCurrency() {
        return currency;
    }


    public String getCode() {
        return code;
    }


    public Rates getRates() {
        return rates;
    }


}
