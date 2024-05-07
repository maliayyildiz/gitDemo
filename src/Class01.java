import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Class01 {

    //hangi ayda oldugumuzu sor ve o yin rakamsal degerini yazdir
    //or Ocak - > 01

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        String monthNumber = DateTimeFormatter.ofPattern("MM").format(currentDate);

        System.out.println("Mevcut ay: " + currentDate.getMonth());
        System.out.println("Mevcut ayın rakamsal değeri: " + monthNumber);
    }


}