package 프로그래머스.level0.P120838;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName(".... . .-.. .-.. --- == hello")
    void solution() {
        Assertions.assertThat(new Solution().solution(".... . .-.. .-.. ---")).isEqualTo("hello");
    }


    @Test
    @DisplayName(".--. -.-- - .... --- -. == python")
    void solution2() {
        Assertions.assertThat(new Solution().solution(".--. -.-- - .... --- -.")).isEqualTo("python");
    }
}