package lotto.domain;

import lotto.constant.ConstantError;

import static lotto.constant.ConstantError.*;

public class Money {
    private static final int DIVISIBLE_PRICE = 1000;

    private int price;

    public Money(int price) {
        validate(price);
        this.price = price;
    }

    private void validate(int price){
        if (price % DIVISIBLE_PRICE == 0) return;

        throw new IllegalArgumentException(NOT_DIVISIBLE);
    }

    public int getAmount(){
        return price / DIVISIBLE_PRICE;
    }



}
