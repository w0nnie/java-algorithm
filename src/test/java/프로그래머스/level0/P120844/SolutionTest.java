package 프로그래머스.level0.P120844;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("[1, 2, 3], right == [3,1,2]")
    void solution() {
        int[] numbers = {1, 2, 3};
        int[] answer = {3, 1, 2};
        Assertions.assertThat(new Solution().solution(numbers, "right")).isEqualTo(answer);
    }

    @Test
    @DisplayName("[4, 455, 6, 4, -1, 45, 6], left == [455, 6, 4, -1, 45, 6, 4]")
    void solution2() {
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        int[] answer = {455, 6, 4, -1, 45, 6, 4};
        Assertions.assertThat(new Solution().solution(numbers, "left")).isEqualTo(answer);
    }
}