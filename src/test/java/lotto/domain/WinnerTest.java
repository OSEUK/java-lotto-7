package lotto.domain;

import lotto.constant.ConstantPrice;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnerTest {
    @Test
    void ENUM_값_저장_테스트(){
        Winner winner = Winner.FIRST;

        assertThat(winner.getPrice()).isEqualTo(ConstantPrice.FIRST_PRICE);
    }
}
