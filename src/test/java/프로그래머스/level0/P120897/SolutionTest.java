package 프로그래머스.level0.P120897;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("n=24, [1, 2, 3, 4, 6, 8, 12, 24]")
    void solution() {
        int[] answer = {1, 2, 3, 4, 6, 8, 12, 24};
        Assertions.assertThat(new Solution().solution(24)).isEqualTo(answer);
    }

    @Test
    @DisplayName("n=29, [1, 29]")
    void solution2() {
        int[] answer = {1, 29};
        Assertions.assertThat(new Solution().solution(29)).isEqualTo(answer);
    }
}