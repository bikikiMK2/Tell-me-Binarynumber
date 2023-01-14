import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        System.out.println("10進数を入力してください");
        int number = new java.util.Scanner(System.in).nextInt();

        List<Integer> LIST = new ArrayList<>();
        if(number==1||number==0){
            LIST.add(number);
        }
        else{
            while(number - (number%2) != 1){
                LIST.add(number%2);
                 number = number - (number%2);

                if(number == 1){
                    LIST.add(number);
                    number = 0;
                }

            }
        }
        System.out.println((LIST)+"2");
    }
}