import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        System.out.println("10進数を入力してください");
        int number = new java.util.Scanner(System.in).nextInt();

        List<Integer> LIST = new ArrayList<>();
        if(number == 1||number == 0){LIST.add(number);}
        else{
            while(number - (number%2) != 1){//numberが2になるまで

                if((number - 1) % 2 == 0){//もしnumberが奇数なら
                        LIST.add(number%2);
                        number = (number - number%2);
                }//奇数の処理

                if(number%2 == 0){//もしnumberが偶数なら
                    while(number/2 == 1) {//numberが2になったら
                        LIST.add(number/2);
                        if((number/2)%2 == 1){//14などの数値偶数にしてループに帰してやる
                            number = number/2;//奇数を追加
                            number = (number - (number%2));
                        }
                        number = number/2;
                        LIST.add(number%2);
                        number = (number - (number%2));
                    }
                    if(number == 2){
                        number = number / 2;
                        LIST.add(number);
                        break;
                    }
                }//偶数を奇数になるまで2で余りを出す
            }
        }
        if (number == 1) {LIST.add(number);} System.out.println((LIST)+"2");
    }
}