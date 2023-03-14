package 프로그래머스.level0.P120892;

import org.assertj.core.api.AbstractStringAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("dfjardstddetckdaccccdegk,4  == attack")
    void solution() {
        Assertions.assertThat(new Solution().solution("dfjardstddetckdaccccdegk", 4)).isEqualTo("attack");
    }

    @Test
    @DisplayName("pfqallllabwaoclk,2  == fallback")
    void solutio2() {
        Assertions.assertThat(new Solution().solution("pfqallllabwaoclk", 2)).isEqualTo("fallback");
    }
}