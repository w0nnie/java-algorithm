package 프로그래머스.level0.P120839;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("2는 0")
    void solution() {
        Assertions.assertThat(new Solution().solution("2")).isEqualTo("0");
    }

    @Test
    @DisplayName("205는 052")
    void solution2() {
        Assertions.assertThat(new Solution().solution("205")).isEqualTo("052");
    }
}