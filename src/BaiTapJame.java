import java.util.Scanner;

public class Baitapjame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        double width = scanner.nextDouble();
        System.out.println("Nhập chiều rộng: ");
        double height = scanner.nextDouble();

        double S = width * height;
        System.out.println("Diện tích của hình chữ nhật là: "+ S);
    }
}
