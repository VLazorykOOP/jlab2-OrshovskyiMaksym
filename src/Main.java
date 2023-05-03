import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input name of goods: ");
        String goodsName = scan.nextLine();

        System.out.print("Input year of registration: ");
        int year = scan.nextInt();

        System.out.print("Input month of registration: ");
        int month = scan.nextInt();

        System.out.print("Input day of registration: ");
        int day = scan.nextInt();

        System.out.print("Input price: ");
        int price = scan.nextInt();

        System.out.print("Input count of goods: ");
        int countOfGoods = scan.nextInt();

        System.out.print("Input invoice number: ");
        int invoiceNumber = scan.nextInt();

        Goods goods = new Goods(goodsName, year, month, day, price, countOfGoods, invoiceNumber);
        System.out.println(goods);

        boolean wasChanged = false;

        System.out.println("Do you want to change the price?(Yes/No)");
        String str = scan.next();
        if(str.equalsIgnoreCase("Yes")){
            System.out.print("Input price: ");
            price = scan.nextInt();
            goods.chengPrice(price);
            wasChanged = true;
        }
        System.out.println("Do you want to change the count of goods?(Yes/No)");
        str = scan.next();
        if(str.equalsIgnoreCase("Yes")){
            System.out.print("Input count of goods: ");
            countOfGoods = scan.nextInt();
            goods.chengcountOfGoods(countOfGoods);
            wasChanged = true;
        }

        if(wasChanged){
            System.out.println(goods);
        }
        System.out.println(goods.calculateCostOfProduct());
    }
}
