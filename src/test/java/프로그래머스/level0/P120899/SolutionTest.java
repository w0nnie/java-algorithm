package 프로그래머스.level0.P120899;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("{1, 8, 3} = {8, 1}")
    void solution() {
        int[] array = {1, 8,3};
        int[] ans = {8, 1};
        Assertions.assertThat(new Solution().solution(array)).isEqualTo(ans);
    }


    @Test
    @DisplayName("{9, 10, 11, 8} = {11, 2}")
    void solution2() {
        int[] array = {9, 10, 11, 8};
        int[] ans = {11, 2};
        Assertions.assertThat(new Solution().solution(array)).isEqualTo(ans);
    }
}