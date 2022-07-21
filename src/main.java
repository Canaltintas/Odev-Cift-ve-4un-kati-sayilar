import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int number,sum;
        sum=0;
        boolean isOdd=false;
        Scanner input =new Scanner(System.in);

        do {
            System.out.print("Bir Sayı Giriniz : ");
            number=input.nextInt();
            if (!(number % 2 ==0)){

                isOdd=true;
            }
            if ((number % 2 ==0) && (number %4 == 0)){
                sum +=number;
            }
        }while (!isOdd);

        System.out.println("Tek Sayıların Toplamı : "+sum);
    }
}
