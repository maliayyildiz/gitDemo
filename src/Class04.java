import java.util.Scanner;

public class Class04 {
    //kullanicinin adini soy adni memeleketini ayri ayri al ve tek satirda yazdir.
    //memeleket buyuk harfler yazilsin.
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        String lastName=scanner.next();
        String city=scanner.next().toUpperCase();
        System.out.println(name+" "+lastName+" ; "+city);
        System.out.println();

    }


}
