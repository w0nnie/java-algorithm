import java.io.*;


/**
 * 가장 효율이 좋은 병합 정렬을 이용해 풀었다.
 * 기본적으로 재귀적으로 구현하기 떄문에
 * I/O utill들과 값을 담을 배열들을 static을 통해 전역으로 static 메모리에 올려주었다.
 * n의 길이를 가진 arr에 입력받은 값들을 넣어주고
 * divide 함수로 진입한다.
 * divide 함수는 병합정렬( 분할정복) 중 분할이다 말 그대로 분할이다.
 * 더 이상 분할 할수없을 때까지 분할을 진행하기 위해 left< right  이라는 조건문을 넣어준다.
 * ㅁㅁㅁㅁㅁㅁ 6개의 length 를 갖는 배열이라면
 * ㅁㅁㅁ ㅁㅁㅁ 으로 한번 분할될것이고
 * ㅁㅁ/ㅁ  ㅁㅁ/ㅁ 으로 다시 한번 분할
 * ㅁ/ㅁ ㅁ ㅁ/ㅁ ㅁ 으로 분할되게된다.
 * left는 자기자신이 속해있는 가장 작은index
 * right는 자기자신이 속해있는 가장 큰 index이다.
 * 당연히 left < right 보다 작을땐 분할 할것이 더 있다는 뜻이 된다.
 * 초기 진입시 divide를 좌측 우측 나눠서 분할하게되고
 * reverseConquer 통해 병합(정복)하게된다
 * 해당 메서드에서는 분할되었던 원소들을 각각을 비교해서 sorted라는 임시변수에 크기에 맞게 index를 통해 넣어주고
 * 마지막 for문을 통해 기존만들어놨던 arr 배열에 sorted 배열의 값들을 넣어준다
 * 총 3개의 while문이 있는데
 * 첫번째 while문에서는 좌측분할 배열의 시작index를 i값으로 끝값을 middle로 우측분할 배열은 시작값을 middle+1 끝깞을 right로 둔다
 * 둘중 하나라도 index의 범위가 끝 index를 넘어가게 되면 while문을 탈출하게된다
 * arr[i] 값과 arr[j]값중 누가 더 조건에 부합하는지 정한후 sorted 라는 임시배열에 넣어주고 index들을 증가 시켜준다
 * 해당 while문에서는 좌측이던 우측이던 한쪽 배열밖에 sorted에 들어갈수밖에없다
 * 그러므로 필요 한것이
 * 밑에 두 while문인데
 * 2번째 while같은 경우 좌측 3번째는 우측이다. 좌측과 우측 병합하는 과정에서 들어오지 못한 원소들은
 * 이미 그들도 정렬이 되어있기에 그냥 순차적으로 sorted배열에 넣어주면된다
 * 병합까지 끝이나면 print() bufferedWriter를 통해 wrtie하게된다
 * I/O 는 사용후 꼭 close하자
 */

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] arr;
    static int[] sorted;
    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        sorted = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        divide(0, arr.length - 1);
        print();
    }

    private static void print() throws IOException {
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void divide(int left, int right) {
        if (left < right) {

            int middle = (left + right) / 2;

            divide(left, middle); //왼쪽분할
            divide(middle + 1, right); //오른쪽분할
            reverseConquer(left, middle, right); //정복
        }
    }

    private static void reverseConquer(int left, int middle, int right) { // 내림차순
        int i = left;
        int j = middle + 1;
        int k = left;

        while (i <= middle && j <= right) {
            if (arr[i] > arr[j]) {
                sorted[k] = arr[i];
                k++;
                i++;
            }else{
                sorted[k] = arr[j];
                k++;
                j++;
            }
        }

        while (i <= middle) {
            sorted[k] = arr[i];
            k++;
            i++;
        }

        while (j <= right) {
            sorted[k] = arr[j];
            k++;
            j++;
        }

        for (int l = left; l <= right; l++) {
            arr[l] = sorted[l];
        }
    }
}
