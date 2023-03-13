package 프로그래머스.level0.P120814;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("7명 = 1판")
    void solution() {
        Assertions.assertThat(new Solution().solution(7)).isEqualTo(1);
    }

    @Test
    @DisplayName("1명 = 1판")
    void solution2() {
        Assertions.assertThat(new Solution().solution(1)).isEqualTo(1);
    }
    @Test
    @DisplayName("15명 = 3판")
    void solution3() {
        Assertions.assertThat(new Solution().solution(15)).isEqualTo(3);
    }
}