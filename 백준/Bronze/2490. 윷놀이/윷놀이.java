import java.io.*;
import java.util.*;

public class Main {
    private static List<Integer> ansList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int count = 0;
            for (int j = 0; j < 4 ; j++) {
                int num = sc.nextInt();

                if(num == 0){
                    count ++;
                }
            }
            if(count == 0){
                System.out.println("E");
            }else if(count == 1 ){
                System.out.println("A");
            }else if(count == 2){
                System.out.println("B");
            }else if(count == 3){
                System.out.println("C");
            }else if(count == 4){
                System.out.println("D");
            }
        }

    }
}
