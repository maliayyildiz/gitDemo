import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


    //hangi ayda oldugumuzu sor ve o yilin rakamsal degerini yazdir
    //    //or Ocak - > 01

    public class Class01 {
        public static void main(String[] args) {

            LocalDate tarih = LocalDate.now();

            int aySayisal = tarih.getMonthValue();

            String ayIsmi = tarih.getMonth().name();

            // Sayısal değeri iki basamaklı formatta yazdır
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM");
            String aySayisalFormatli = tarih.format(formatter);

            System.out.println("Bugünün ayı: " + ayIsmi);
            System.out.println("Ayın sayısal değeri: " + aySayisalFormatli);
        }
    }



