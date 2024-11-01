package lotto.controller;

import lotto.constant.ConstantError;
import lotto.domain.Lotto;
import lotto.domain.Winner;
import lotto.service.WinService;
import lotto.validator.InputValidator;
import lotto.view.Input;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;

import static lotto.constant.ConstantError.*;

public class WinController {
    private final WinService winService;

    public WinController(WinService winService) {
        this.winService = winService;
    }

    public Map<Winner, Integer> generateWinStatistics(){
        Lotto winLotto = inputWinLotto();
        int bonus = inputBonus();
    }

    private Lotto inputWinLotto(){
        while (true) {
            try {
                return parseWinLotto(Input.winNumbers());
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }

    private int inputBonus(Lotto lotto){
        while (true) {
            try {
                int num = parseBonus(Input.bonusNumber());

            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }


    private int parseBonus(String input){
        try{
            return Integer.parseInt(input);
        } catch (NullPointerException e){
            throw new IllegalArgumentException(IS_NULL);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException(NOT_NUMBER);
        }
    }


    private Lotto parseWinLotto(String input){
        return new Lotto(parseList(input));
    }

    private List<Integer> parseList(String input){
        try {
            return Arrays.stream(input.split(","))
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (NullPointerException e) {
            throw new IllegalArgumentException(IS_NULL);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(NOT_NUMBER);
        }
    }


}
