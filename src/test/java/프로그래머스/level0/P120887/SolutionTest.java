package 프로그래머스.level0.P120887;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("1, 13, 1 == 6")
    void solution() {
        Assertions.assertThat(new Solution().solution(1, 13, 1)).isEqualTo(6);
    }

    @Test
    @DisplayName("10, 50, 5 == 5")
    void solution2() {
        Assertions.assertThat(new Solution().solution(10, 50, 5)).isEqualTo(5);
    }

    @Test
    @DisplayName("3, 10, 2 == 0")
    void solution3() {
        Assertions.assertThat(new Solution().solution(3, 10, 2)).isEqualTo(0);
    }
}