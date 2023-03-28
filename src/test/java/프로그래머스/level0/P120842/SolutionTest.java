package 프로그래머스.level0.P120842;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("[1, 2, 3, 4, 5, 6, 7, 8], 2 == [[1, 2], [3, 4], [5, 6], [7, 8]]")
    void solution() {
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int[][] result = {{1, 2}, {3,4}, {5,6}, {7,8}};
        Assertions.assertThat(new Solution().solution(num_list, 2)).isEqualTo(result);
    }

    @Test
    @DisplayName("[100, 95, 2, 4, 5, 6, 18, 33, 948], 3 == [[100, 95, 2], [4, 5, 6], [18, 33, 948]]")
    void solution2() {
        int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int[][] result = {{100, 95, 2}, {4, 5, 6}, {18, 33, 948}};
        Assertions.assertThat(new Solution().solution(num_list, 3)).isEqualTo(result);
    }
}