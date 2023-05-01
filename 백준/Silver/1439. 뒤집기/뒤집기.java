import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String[] arr0;
    static String[] arr1;

    public static void main(String[] args) throws IOException {
        String n = scanner.next();

        arr0 = new String[n.length()];
        arr1 = new String[n.length()];
        arr0 = n.split("1");
        arr1 = n.split("0");
        System.out.println(Math.min(Arrays.stream(arr0).filter(i -> !i.isEmpty()).count(), Arrays.stream(arr1).filter(i -> !i.isEmpty()).count()));
    }
}