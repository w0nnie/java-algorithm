package 프로그래머스.level0.P120911;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("Bcad = abcd")
    void solution() {
        Assertions.assertThat(new Solution().solution("Bcad")).isEqualTo("abcd");
    }

    @Test
    @DisplayName("heLLo = ehllo")
    void solution2() {
        Assertions.assertThat(new Solution().solution("heLLo")).isEqualTo("ehllo");
    }

    @Test
    @DisplayName("Python = hnopty")
    void solution3() {
        Assertions.assertThat(new Solution().solution("Python")).isEqualTo("hnopty");
    }
}