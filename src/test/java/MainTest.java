import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class MainTest {

    @Test
    @DisplayName("Test")
    void test() {
        Soul soul = new Soul();
        int result = soul.solution(1, 3);

        Assertions.assertThat(result).isEqualTo(4);
    }
}


class Soul {

    public int solution(int num1, int num2) {
        int ans = num1 + num2;
        return ans;
    }
}
