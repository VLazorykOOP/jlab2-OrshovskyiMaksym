import java.util.Date;
import java.util.GregorianCalendar;

public class Goods {
    private String goodsName;

    private Date date;

    private Integer price;

    private Integer countOfGoods;

    private Integer invoiceNumber;


    public Goods(String goodsName, int year, int month, int day ,int price,int countOfGoods,int invoiceNumber){
        this.goodsName = goodsName;
        date =  (new GregorianCalendar (year, month-1, day)).getTime ();
        this.price = price;
        this.countOfGoods = countOfGoods;
        this.invoiceNumber = invoiceNumber;
    }

    public String getGoodsName() {
        return goodsName;
    }


    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCountOfGoods() {
        return countOfGoods;
    }

    public void setCountOfGoods(Integer countOfGoods) {
        this.countOfGoods = countOfGoods;
    }

    public Integer getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Integer invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    @Override
    public String toString() {
        return "Info about goods\nName: " + goodsName + ", date of registration: " + date + ", price: " + price + ", count of goods: " + countOfGoods + ", invoice number: " + invoiceNumber;
    }

    public int calculateCostOfProduct(){
        return price * countOfGoods;
    }

    public void chengPrice(int price){
        this.price = this.price + price;
    }

    public void chengcountOfGoods(int countOfGoods){
        this.countOfGoods = this.countOfGoods + countOfGoods;
    }


}
