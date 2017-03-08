package pl.NBP.exchangeRates;

/**
 * Created by Professional on 2017-03-08.
 */
public class Rates {
    private String no;
    private String effectiveDate;
    private String mid;

    @Override
    public String toString() {
        return "Rates{" +
                "no='" + no + '\'' +
                ", effectiveDate='" + effectiveDate + '\'' +
                ", mid='" + mid + '\'' +
                '}';
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

}
