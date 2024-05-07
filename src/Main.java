public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //sadece a ve b degiskenini kullanarak degerlerin yerlerinidegistir
        //orn:  a= 5 b=3
        //sonc a=3 b =5

        int a = 5;
        int b = 3;
        int c=0;
        int d = 8;

        c=b;
        b=a;
        a=c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);
        System.out.println(d);


    }
}