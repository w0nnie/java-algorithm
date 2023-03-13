package 프로그래머스.level0.P120806;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import 프로그래머스.level0.P120806.Solution;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("3 / 2 * 1000 = 1500")
    void solution() {
        Assertions.assertThat(new Solution().solution(3, 2)).isEqualTo(1500);
    }

    @Test
    @DisplayName("7 / 3 * 1000 = 2333")
    void solution2() {
        Assertions.assertThat(new Solution().solution(7, 3)).isEqualTo(2333);
    }

    @Test
    @DisplayName("1 / 16 * 1000 = 62")
    void solution3() {
        Assertions.assertThat(new Solution().solution(1, 16)).isEqualTo(62);
    }
}