package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.validator.InputValidator;

import static lotto.constant.ConstantInput.*;

public class Input {
    public static String purchasePrice(){
        System.out.println(INPUT_PURCHASE_PRICE);
        return Console.readLine();
    }

    public static String winNumbers(){
        System.out.println(INPUT_WIN_NUMBERS);
        return Console.readLine();
    }

    public static String bonusNumber(){
        System.out.println(INPUT_BONUS_NUMBER);
        return Console.readLine();
    }
}
