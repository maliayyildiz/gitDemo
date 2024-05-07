import java.util.Scanner;

public class Class01 {
    //hangi ayda oldugumuzu sor ve o yin rakamsal degerini yazdir
    //or Ocak - > 01
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bulundugunuz ayi giriniz");
        String month = scanner.nextLine().toLowerCase();

        switch (month) {
            case "ocak":
                System.out.println("01");
                break;
            case "subat":
                System.out.println("02");
                break;
            case "mart":
                System.out.println("03");
                break;
            case "nisan":
                System.out.println("04");
                break;
            case "mayıs":
                System.out.println("05");
                break;
            case "haziran":
                System.out.println("06");
                break;
            case "temmuz":
                System.out.println("07");
                break;
            case "agustos":
                System.out.println("08");
                break;
            case "eylul":
                System.out.println("09");
                break;
            case "ekim":
                System.out.println("10");
                break;
            case "kasim":
                System.out.println("11");
                break;
            case "aralik":
                System.out.println("12");
                break;
            default:
                System.out.println("Gecersiz bir ay girdiniz");

                System.out.println("kdbksd");
        }
    }
}
