import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        System.out.println("16進数を入力してください");
        int number = new java.util.Scanner(System.in).nextInt();

        if(number < 1){
            System.out.println(number);
        }
        else{
            int number2 = (0);
            // 割ったあまり

            List<Integer> Binarynumbers = new ArrayList<>();

            while(number2 < 1){

                number2 = number % 2;
                int number3 = number - 2;

                if(number3 < 1){
                    Binarynumbers.add(number3);
                }

            }
        }System.out.println();
         //BinarynumbersListをconsoleに出力

    }
}