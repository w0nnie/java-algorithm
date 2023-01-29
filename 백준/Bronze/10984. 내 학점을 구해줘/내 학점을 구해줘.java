import java.io.*;
import java.util.*;

public class Main{
    private static int testCase;
    private static int subCount;
    private static int credit;
    private static double grade;
    private static double totalGrade;
    private static int totalCredit;

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase ; i++) {
            subCount = Integer.parseInt(br.readLine());
            totalCredit = 0;
            totalGrade = 0;
            for (int j = 0; j < subCount ; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                credit = Integer.parseInt(st.nextToken());
                grade = Double.parseDouble(st.nextToken());
                totalGrade += grade * credit;
                totalCredit += credit;
            }
            System.out.println(totalCredit+ " " + Math.round(totalGrade/totalCredit*10)/10.0);
        }
    }
}
