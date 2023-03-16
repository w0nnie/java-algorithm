package 프로그래머스.level0.P120845;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("box {1,1,1}, n = 1, result = 1")
    void solution() {
        int[] box = new int[]{1, 1, 1};
        Assertions.assertThat(new Solution().solution(box, 1)).isEqualTo(1);
    }

    @Test
    @DisplayName("box {10, 8, 6}, n = 3, result = 12")
    void solution2() {
        int[] box = new int[]{10, 8, 6};
        Assertions.assertThat(new Solution().solution(box, 3)).isEqualTo(12);
    }
}