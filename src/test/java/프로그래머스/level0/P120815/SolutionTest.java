package 프로그래머스.level0.P120815;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("n = 6 , result = 1")
    void solution() {
        Assertions.assertThat(new Solution().solution(6)).isEqualTo(1);
    }

    @Test
    @DisplayName("n = 10 , result = 5")
    void solutio2() {
        Assertions.assertThat(new Solution().solution(10)).isEqualTo(5);
    }
}