import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        System.out.println("10進数を入力してください");
        int number = new java.util.Scanner(System.in).nextInt();

        List<Integer> LIST = new ArrayList<>();
        switch (number) {
            case 0, 1 -> LIST.add(number);
        }
        while(number>2){
            LIST.add(number % 2);
            
        }

        System.out.println(LIST);
    }
}