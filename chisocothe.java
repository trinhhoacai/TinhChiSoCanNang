import java.util.Scanner;

public class chisocothe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cannang,chieucao,bmi;
        System.out.println("cân nặng của bạn");
        cannang=scanner.nextDouble();//nhập cân nặng và gán giá trị
        System.out.println("chiều cao của bạn");
        chieucao=scanner.nextDouble();//nhập chiều cao và gán giá trị
        bmi=cannang/Math.pow(chieucao,2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");//tính chỉ só bmi

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "gầy");// hiển thị  nuế thỏa mãn điều kiện chỉ số < 18
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "bình thường");//hiển thị nuế thỏa mãn điều kiện chỉ số < 25
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "béo");// hiển thị nuế thỏa mãn điều kiện chỉ số <30
        else
            System.out.printf("%-20.2f%s", bmi, "béo phì");// hiển thị nuế thỏa mãn điều kiên



    }
}
