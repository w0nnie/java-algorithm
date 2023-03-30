package 프로그래머스.level0.P120835;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("emergency = [3, 76, 24], result = [3, 1, 2]")
    void solution() {
        int[] emergency = {3, 76, 24};
        int[] result = {3, 1, 2};
        Assertions.assertThat(new Solution().solution(emergency)).isEqualTo(result);
    }

    @Test
    @DisplayName("emergency = [30, 10, 23, 6, 100], result = [2, 4, 3, 5, 1]")
    void solution2() {
        int[] emergency = {30, 10, 23, 6, 100};
        int[] result = {2, 4, 3, 5, 1};
        Assertions.assertThat(new Solution().solution(emergency)).isEqualTo(result);
    }

    @Test
    @DisplayName("emergency = [1, 2, 3, 4, 5, 6, 7], result = [7, 6, 5, 4, 3, 2, 1]")
    void solution3() {
        int[] emergency = {1, 2, 3, 4, 5, 6, 7};
        int[] result = {7, 6, 5, 4, 3, 2, 1};
        Assertions.assertThat(new Solution().solution(emergency)).isEqualTo(result);
    }
}