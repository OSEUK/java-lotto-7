package lotto.view;

import lotto.domain.Lotto;
import lotto.repository.LottoRepository;

import java.util.stream.Collectors;

public class Output {
    public static void purchasedLottos(LottoRepository lottos){
        int amount = lottos.getAmount();
        System.out.println();
        System.out.println(amount + "개를 구매했습니다.");

        for (Lotto lotto : lottos.findAll()){
            String numbers = String.join(", ",
                    lotto.getNumbers().stream()
                            .map(String::valueOf)
                            .collect(Collectors.toList()));

            System.out.println("[" + numbers + "]");
        }
    }

}
