import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập số tiền USD ");
        double USD = scanner.nextDouble();

        double VND = USD * 23000;

        System.out.println(USD + "$ ="+ VND + " VND");


    }
}
