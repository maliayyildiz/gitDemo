import java.util.Scanner;

public class Class04 {
    public static void main(String[] args) {

        //memeleket buyuk harfler yazilsin.
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan adını, soyadını ve memleketini al
        System.out.print("Adınızı girin: ");
        String ad = scanner.nextLine();

        System.out.print("Soyadınızı girin: ");
        String soyad = scanner.nextLine();

        System.out.print("Memleketinizi girin: ");
        String memleket = scanner.nextLine();

        // Büyük harflerle memleketi yazdır
        System.out.println("Adı: " + ad);
        System.out.println("Soyadı: " + soyad);
        System.out.println("Memleketi: " + memleket.toUpperCase());

        scanner.close();




    }

}
