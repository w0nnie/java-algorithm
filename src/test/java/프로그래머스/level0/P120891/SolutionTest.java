package 프로그래머스.level0.P120891;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("3 = 1")
    void solution() {
        Assertions.assertThat(new Solution().solution(3)).isEqualTo(1);
    }

    @Test
    @DisplayName("29423 = 2")
    void solution2() {
        Assertions.assertThat(new Solution().solution(29423)).isEqualTo(2);
    }
}