import java.util.Scanner;

public class ChuyenTien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int select;
            do {
                showMenu();
                System.out.println("Nhap lua chon: ");
                select = input.nextInt();
                switch ( select){
                    case 1:
                        System.out.print("Nhap Tien: ");
                        double money =  input.nextDouble();
                        System.out.println("" + money +"VND " + " = "+ VNDToUSD(money) + "USD");
                        break;
                    case 2:
                        System.out.print("Nhap Tien: ");
                        double money1 =  input.nextDouble();
                        System.out.println("" + money1 +"USD " + " = "+ USDToVND(money1) + "VND");
                        break;
                }
            }while(select != 3);

    }
    public static void showMenu(){
        System.out.println("MENU");
        System.out.println("1.VND to USD");
        System.out.println("2.USD to VND");
        System.out.println("3.Exit");
    }
    public static double VNDToUSD( double money){
        return money * (1.0/23000);
    }
    public static double USDToVND( double money){
        return money * 23000;
    }

}
