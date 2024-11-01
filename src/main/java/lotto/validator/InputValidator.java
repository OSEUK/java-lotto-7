package lotto.validator;

import lotto.constant.ConstantError;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

import static lotto.constant.ConstantError.*;
import static lotto.constant.ConstantPrice.DIVISIBLE_PRICE;

public class InputValidator {

    public static void isDivisible(int price){
        if (price % DIVISIBLE_PRICE == 0)
            return;

        throw new IllegalArgumentException(NOT_DIVISIBLE);
    }

    public static void winNumbersSize(List<Integer> numbers){
        if (numbers.size() != 6) throw new IllegalArgumentException(NOT_SIX_NUMBERS);
    }









}
