package 프로그래머스.level0.P120895;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("hello, num1=1, num2=2 == hlelo")
    void solution() {
        Assertions.assertThat(new Solution().solution("hello", 1, 2)).isEqualTo("hlelo");
    }

    @Test
    @DisplayName("I love you, num1 = 3, num2 = 6 == I l veoyou")
    void solution2() {
        Assertions.assertThat(new Solution().solution("I love you", 3, 6)).isEqualTo("I l veoyou");
    }
}