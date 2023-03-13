package 프로그래머스.level0.P120804;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("10 * 20 = 200")
    void solution() {
        Assertions.assertThat(new Solution().solution(10, 20)).isEqualTo(200);
    }

    @Test
    @DisplayName("3 * 4 = 12")
    void solution2() {
        Assertions.assertThat(new Solution().solution(3, 4)).isEqualTo(12);
    }

    @Test
    @DisplayName("27 * 19 = 513")
    void solution3() {
        Assertions.assertThat(new Solution().solution(27, 19)).isEqualTo(513);
    }
}