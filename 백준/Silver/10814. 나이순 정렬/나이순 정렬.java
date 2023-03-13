import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int member = sc.nextInt();
        /**
         * 2차원 ArrayList 사용해봄
         */
        List<String>[] arr = new ArrayList[member];
        for (int i = 0; i < member; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < member; i++) {
            String age = sc.next();
            String name = sc.next();
            arr[i].add(age);
            arr[i].add(name);
        }

        /**
         * 2차원배열 sort
         */
        Arrays.sort(arr, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {

                return  Integer.parseInt(o1.get(0))-Integer.parseInt(o2.get(0));
            }
        });
        
        for (int i = 0; i < member; i++) {
            for (int j = 0; j < arr[i].size(); j++) {
                System.out.print(arr[i].get(j) + " ");
            }
            System.out.println();
        }
    }
}
