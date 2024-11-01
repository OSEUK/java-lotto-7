package lotto.controller;

import lotto.constant.ConstantError;
import lotto.domain.Money;
import lotto.service.PurchaseService;
import lotto.validator.InputValidator;
import lotto.view.Input;

import static lotto.constant.ConstantError.IS_NULL;
import static lotto.constant.ConstantError.NOT_NUMBER;
import static lotto.constant.ConstantPrice.*;

public class PurchaseController {
    private final PurchaseService purchaseService;

    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    public void purchase(){
        while(true) {
            try {
                Money purchaseMoney = new Money(parsePrice(Input.purchasePrice()));
                purchaseService.purchaseLotto(purchaseMoney.getAmount());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private int parsePrice(String input){
        try{
            return Integer.parseInt(input);
        } catch (NullPointerException e){
            throw new IllegalArgumentException(IS_NULL);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException(NOT_NUMBER);
        }
    }
}
