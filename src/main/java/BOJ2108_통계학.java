import java.io.*;
import java.util.*;
public class BOJ2108_통계학 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Double> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Double.parseDouble(br.readLine()));
        }

        list.sort(Comparator.naturalOrder());

        double middle = list.get(Math.round(N / 2));
        System.out.println(Math.round(list.stream().reduce(0.0D, Double::sum) / N));
        System.out.println((int) middle);
        float max = (float) list.stream().mapToDouble(x -> x).max().orElseThrow(NoSuchElementException::new);
        float min = (float) list.stream().mapToDouble(x -> x).min().orElseThrow(NoSuchElementException::new);
        System.out.println((int) findMode(list));
        System.out.println((int) (max - min));

    }

    private static double findMode(List<Double> list) {
        Map<Double, Integer> frequencyMap = new HashMap<>();

        for (Double num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int maxFrequency = Collections.max(frequencyMap.values());

        TreeSet<Double> modes = new TreeSet<>();
        for (Map.Entry<Double, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modes.add(entry.getKey());
            }
        }

        return modes.stream().skip(1).findFirst().orElse(modes.first());
    }
}
