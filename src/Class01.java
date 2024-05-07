import java.util.Scanner;

public class Class01 {
    public static void main(String[] args) {
        //hangi ayda oldugumuzu sor ve o yin rakamsal degerini yazdir
        //or Ocak - > 01
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hangi aydayız? : ");
        String ay = scanner.nextLine();

        ay = ay.toLowerCase();

        int rakamDegeri = 0;

        switch (ay) {
            case "ocak":
                rakamDegeri = 1;
                break;
            case "şubat":
                rakamDegeri = 2;
                break;
            case "mart":
                rakamDegeri = 3;
                break;
            case "nisan":
                rakamDegeri = 4;
                break;
            case "mayıs":
                rakamDegeri = 5;
                break;
            case "haziran":
                rakamDegeri = 6;
                break;
            case "temmuz":
                rakamDegeri = 7;
                break;
            case "ağustos":
                rakamDegeri = 8;
                break;
            case "eylül":
                rakamDegeri = 9;
                break;
            case "ekim":
                rakamDegeri = 10;
                break;
            case "kasım":
                rakamDegeri = 11;
                break;
            case "aralık":
                rakamDegeri = 12;
                break;
            default:
                System.out.println("Geçersiz ay ismi girdiniz!");
        }

        System.out.println("Girdiğiniz ayın rakamsal değeri: " + rakamDegeri);
        System.out.println("1234");
    }

}
