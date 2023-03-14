package 프로그래머스.level0.P120893;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    @DisplayName("cccCCC == CCCccc")
    void solution() {
        Assertions.assertThat(new Solution().solution("cccCCC")).isEqualTo("CCCccc");
    }


    @Test
    @DisplayName("abCdEfghIJ == ABcDeFGHij")
    void solution1() {
        Assertions.assertThat(new Solution().solution("abCdEfghIJ")).isEqualTo("ABcDeFGHij");
    }
}