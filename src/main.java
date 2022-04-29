
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int yil;
        boolean artik = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen Yılı Girin: ");
        yil = scanner.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0)
                    artik = true;
                else
                    artik = false;
            } else
                artik = true;
        } else
            artik = false;

        if (artik)
            System.out.println(yil + " artık yıldır.");
        else
            System.out.println(yil + " artık yıl değildir.");

    }
}
