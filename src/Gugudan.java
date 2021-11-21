import java.util.Scanner;

public class Gugudan {

    public static void main(String[] args) {
        System.out.println("출력하고 싶은 구구단의 단수(2~9)와 최대행수(1~)를 쉼표로 구분하여 입력하십시오 : ");
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(",");
        int baseNumber = Integer.parseInt(input[0].strip());
        int tableSize = Integer.parseInt(input[1].strip());
        MultipleOf multipleOfNumber = new MultipleOf(baseNumber, tableSize);
        multipleOfNumber.printMultiples();
    }
}
