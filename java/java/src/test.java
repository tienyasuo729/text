import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Mời nhập số nguyên không âm dưới 1000 : ");
           number = Integer.parseInt(sc.next());
        } while (number >= 1000 || number < 0);
        if (number <= 10) {
            switch (number) {
                case 1:
                    System.out.println("Một");
                    break;
                case 2:
                    System.out.println("Hai");
                    break;
                case 3:
                    System.out.println("Ba");
                    break;
                case 4:
                    System.out.println("Bốn");
                    break;
                case 5:
                    System.out.println("Năm ");
                    break;
                case 6:
                    System.out.println("Sáu");
                    break;
                case 7:
                    System.out.println("Bảy");
                    break;
                case 8:
                    System.out.println("Tám");
                    break;
                case 9:
                    System.out.println("Chín");
                    break;
                case 10:
                    System.out.println("Mười");
                    break;
                default:
                    System.out.println("Không");
            }
        }else if (number < 100) {
            System.out.println("2 số");
        }else {
            System.out.println("3 số");
        }
        System.out.print("Số vừa nhập là : " + number);
    }
}
