package 프로그래머스.level0.P120904;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("29183, 1 == 3")
    void solution() {
        Assertions.assertThat(new Solution().solution(29183, 1)).isEqualTo(3);
    }

    @Test
    @DisplayName("232443, 4 == 4")
    void solution2() {
        Assertions.assertThat(new Solution().solution(232443, 4)).isEqualTo(4);
    }

    @Test
    @DisplayName("123456, 7 == -1")
    void solution3() {
        Assertions.assertThat(new Solution().solution(123456, 7)).isEqualTo(-1);
    }
}