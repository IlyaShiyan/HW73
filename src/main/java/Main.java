import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String sn = scanner.nextLine();
        Long tn = scanner.nextLong();

        System.out.printf("Пользователя зовут %s %s. Его номер телефона - %d ", n,sn,tn);
    }
}
