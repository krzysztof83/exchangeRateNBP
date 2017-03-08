package pl.NBP.exchangeRates;

/**
 * Created by Professional on 2017-03-08.
 */
public enum CurrencyEnum {
    THB("bat (Tajlandia)","1"),
    USD("dolar amerykański","1"),
    AUD("dolar australijski","1"),
    HKD("dolar Hongkongu","1"),
    CAD("dolar kanadyjski","1"),
    NZD("dolar nowozelandzki","1"),
    SGD("dolar singapurski","1"),
    EUR("euro","1"),
    HUF("forint (Węgry)","100"),
    CHF("frank szwajcarski","1"),
    GBP("funt szterling","1"),
    UAH("hrywna (Ukraina)","1"),
    JPY("jen (Japonia)","100"),
    CZK("korona czeska","1"),
    DKK("korona duńska","1"),
    ISK("korona islandzka","100"),
    NOK("korona norweska","1"),
    SEK("korona szwedzka","1"),
    HRK("kuna (Chorwacja)","1"),
    RON("lej rumuński","1"),
    BGN("lew (Bułgaria)","1"),
    TRY("lira turecka","1"),
    ILS("nowy izraelski szekel","1"),
    CLP("peso chilijskie","100"),
    PHP("peso filipińskie","1"),
    MXN("peso meksykańskie","1"),
    ZAR("rand (Republika Południowej Afryki)","1"),
    BRL("real (Brazylia)","1"),
    MYR("ringgit (Malezja)","1"),
    RUB("rubel rosyjski","1"),
    IDR("rupia indonezyjska","10000"),
    INR("rupia indyjska","100"),
    KRW("won południowokoreański","100"),
    CNY("yuan renminbi (Chiny)","1"),
    XDR("SDR (MFW)","1");



    private final String currencyName;

    public String getCurrencyName() {
        return currencyName;
    }

    public String getAmountToExchange() {
        return amountToExchange;
    }

    private final String amountToExchange;

    CurrencyEnum(String name, String amountToExchange) {
        this.currencyName =name;
        this.amountToExchange=amountToExchange;
    }



}
