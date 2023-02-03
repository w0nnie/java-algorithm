
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 3
        int a[] = new int[n];

        for(int i =0; i< n; i++){
            a[i] = sc.nextInt();
        }
        int max = 0;
        int sum = 0;
        for(int i =0; i<a.length; i++){
            if( max < a[i]){
                max = a[i];
            }
            sum += a[i];
        }
        System.out.println(sum*100.0/max/n);
    }

}
