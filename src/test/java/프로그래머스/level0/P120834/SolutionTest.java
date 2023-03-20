package 프로그래머스.level0.P120834;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("23 = 'cd'")
    void solution() {
        Assertions.assertThat(new Solution().solution(23)).isEqualTo("cd");
    }

    @Test
    @DisplayName("51 = 'fb'")
    void solution2() {
        Assertions.assertThat(new Solution().solution(51)).isEqualTo("fb");
    }

    @Test
    @DisplayName("100 = 'baa'")
    void solution3() {
        Assertions.assertThat(new Solution().solution(100)).isEqualTo("baa");
    }
}