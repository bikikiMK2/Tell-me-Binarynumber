import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        System.out.println("10進数を入力してください");
        int number = new java.util.Scanner(System.in).nextInt();

        int number2;
        // あまりを入れておく変数
        int number3;
        //numberを2で割ったときの数値

        List<Integer> LIST = new ArrayList<>();

        while (number > 1) {

            number2 = number % 2;
            //numberを2で割ったときのあまり
             LIST.add(number2);
            number3 = number - number2;
            number = number3;

            if (number*2 < 1) {
                LIST.add(number3);
            }
            else if(number3*2 < 1){
                break;
            }

        }
        System.out.println(LIST);
        //BinarynumbersListをconsoleに出力
      }
    }