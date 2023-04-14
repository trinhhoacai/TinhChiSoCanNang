import java.util.Scanner;

public class kiemtraso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int i;
        System.out.println("nhap so");// hien thi
        i= scanner.nextInt();// nhap gia tri
        if(i%2==0){
            System.out.println("so chan");// thoa man dieu kien i chia het cho 2 ko du se in ra so chan
        }
        else {
       System.out.println("so le");// khong thoa man dieu kien se in ra so le
    }
}}

