package 프로그래머스.level0.P120864;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("my_string = aAb1B2cC34oOp result = 37")
    void solution() {
        Assertions.assertThat(new Solution().solution("aAb1B2cC34oOp")).isEqualTo(37);
    }

    @Test
    @DisplayName("my_string = 1a2b3c4d123Z result = 133")
    void solution2() {
        Assertions.assertThat(new Solution().solution("1a2b3c4d123Z")).isEqualTo(133);
    }
}