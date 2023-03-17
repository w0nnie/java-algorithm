package 프로그래머스.level0.P120850;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("hi12392 = [1, 2, 2, 3, 9]")
    void solution() {
        int[] ans = {1, 2, 2, 3, 9};
        Assertions.assertThat(new Solution().solution("hi12392")).isEqualTo(ans);
    }

    @Test
    @DisplayName("p2o4i8gj2 = [2, 2, 4, 8]")
    void solution2() {
        int[] ans = {2, 2, 4, 8};
        Assertions.assertThat(new Solution().solution("p2o4i8gj2")).isEqualTo(ans);
    }

    @Test
    @DisplayName("abcde0 = [0]")
    void solution3() {
        int[] ans = {0};
        Assertions.assertThat(new Solution().solution("abcde0")).isEqualTo(ans);
    }
}