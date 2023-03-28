package 프로그래머스.level0.P120886;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("olleh == hello")
    void solution() {
        Assertions.assertThat(new Solution().solution("olleh", "hello")).isEqualTo(1);
    }

    @Test
    @DisplayName("allpe != apple")
    void solution2() {
        Assertions.assertThat(new Solution().solution("allpe", "apple")).isEqualTo(0);
    }
}