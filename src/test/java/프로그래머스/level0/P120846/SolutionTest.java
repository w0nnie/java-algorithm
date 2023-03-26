package 프로그래머스.level0.P120846;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("N = 10 result = 5")
    void solution() {
        Assertions.assertThat(new Solution().solution(10)).isEqualTo(5);
    }

    @Test
    @DisplayName("N = 10 result = 5")
    void solution2() {
        Assertions.assertThat(new Solution().solution(15)).isEqualTo(8);
    }
}