package lotto.domain;

import lotto.constant.ConstantWinner;

import static lotto.constant.ConstantPrice.*;
import static lotto.constant.ConstantWinner.*;

public enum Winner {
    // enum 상수들
    FIRST(6, 0, FIRST_PRICE, FIRST_DESCRIPTION),
    SECOND(5, 1, SECOND_PRICE, SECOND_DESCRIPTION),
    THIRD(5, 0, THIRD_PRICE, THIRD_DESCRIPTION),
    FOURTH(4, 0, FOURTH_PRICE, FOURTH_DESCRIPTION),
    FIFTH(3, 0, FIFTH_PRICE, FIFTH_DESCRIPTION);

    private final int matchBalls;
    private final int matchBonusBall;
    private final int price;
    private final String description;

    Winner(int matchBalls, int matchBonusBall, int price, String description) {
        this.matchBalls = matchBalls;
        this.matchBonusBall = matchBonusBall;
        this.price = price;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
