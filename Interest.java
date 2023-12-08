import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money = 0;
        int month = 0;
        double rate = 0;
        double total = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien gui: ");
        money = sc.nextDouble();
        System.out.println("Nhap so thang gui: ");
        month = sc.nextInt();
        System.out.println("Nhap lai suat theo nam(%): ");
        rate = sc.nextDouble();

        for (int i = 0; i < month; i++) {
            total += money*month*(rate/100)/12;
        }

        System.out.printf("So tien lai sau %d thang la: %.3f",month, total);

    }
}
